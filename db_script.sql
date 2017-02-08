CREATE TABLE `user` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `apellido` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci$$;


INSERT INTO user
VALUES (12345678, 'Juan', 'Aaa', 'juan.a@gmail.com', 'juanpass');
INSERT INTO user
VALUES (12345666, 'Ana', 'Bbb', 'ana.b@gmail.com', 'anapass');
INSERT INTO user
VALUES (12345644, 'Ivan', 'Ccc', 'ivan.c@gmail.com', 'ivanpass');