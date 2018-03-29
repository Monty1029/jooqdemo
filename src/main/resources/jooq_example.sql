DROP TABLE IF EXISTS album_song, album, song;

CREATE TABLE album (
  id             INT          NOT NULL PRIMARY KEY,
  year           INT          NOT NULL
);

CREATE TABLE song (
  id             INT          NOT NULL PRIMARY KEY,
  title          VARCHAR(100) NOT NULL
);

CREATE TABLE album_song (
  album_id      INT          NOT NULL,
  song_id       INT          NOT NULL,

  PRIMARY KEY (album_id, song_id),
  CONSTRAINT fk_as_album     FOREIGN KEY (album_id)  REFERENCES album (id)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_as_song      FOREIGN KEY (song_id)   REFERENCES song  (id)
);

INSERT INTO album VALUES
  (1, 2018),
  (2, 2017),
  (3, 2016);

INSERT INTO song VALUES
  (1, 'Song1'),
  (2, 'Song2'),
  (3, 'Song3');

INSERT INTO album_song VALUES (1, 1), (1, 3), (2, 1);