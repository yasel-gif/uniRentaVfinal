-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-07-2020 a las 17:59:14
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `unirenta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alojamiento`
--
-- Creación: 06-07-2020 a las 04:15:01
-- Última actualización: 08-07-2020 a las 11:25:32
--

CREATE TABLE `alojamiento` (
  `id_alojamiento` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `entidad` varchar(50) NOT NULL,
  `municipio` varchar(50) NOT NULL,
  `cp` varchar(10) NOT NULL,
  `dir` varchar(200) NOT NULL,
  `numHabs` int(50) NOT NULL,
  `costo` int(50) NOT NULL,
  `servicios` varchar(200) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `detalles` varchar(200) NOT NULL,
  `puntaje` int(11) DEFAULT NULL,
  `arrendador_id` int(50) NOT NULL,
  `disponibilidad` varchar(2) NOT NULL,
  `imagen` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `alojamiento`:
--   `arrendador_id`
--       `arrendador` -> `id_arrendador`
--

--
-- Volcado de datos para la tabla `alojamiento`
--

INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(3, 'Casa blanca', 'chiapas', 'tuxtla', '68123', 'av pinos', 2, 3000, 'dsedasda', 'departamento', 'ninguno', 5, 3, 'no', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(4, 'casa azul', 'chiapas', 'tuxtla', '12345', 'calle buegambilias #2', 3, 3500, 'Luz, agua caliente', 'casa', 'ninguno', 6, 3, 'no', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(19, 'depa verde', 'morelos', 'san miguel', '31245', 'waeqe', 2, 2562, 'internet', 'departamento', 'ninguno', 7, 10, 'no', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(21, 'casa de las flores', 'queretaro', 'santa lucia queretaro', '54512', 'cambio23322', 2, 2500, 'interner,luz', 'departamento', 'ninguno', 3, 10, 'no', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(22, 'cuartojardines', 'oaxaca', 'xoxocotlan', '23468', 'calle robles #3', 1, 1323, 'internet, agua caliente', 'cuarto', 'ninguno', 2, 10, 'si', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(31, 'casa san mateo', 'oaxaca', 'huajuapan', '45425', 'calle juarez #102', 2, 2545, 'luz, internet.', 'departamento', 'ninguno', 1, 10, 'si', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(32, 'casa azul', 'sinaloa', 'san rafael', '45312', 'tulipanes #7', 5, 4500, 'cable, telefono, internet.', 'casa', 'ninguno', 10, 10, 'si', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(33, 'casa de espantos', 'guadalajara', 'guadalajara', '34586', 'guerrero #35', 4, 4300, 'luz, agua caliente', 'casa', 'no', 4, 10, 'no', '');
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(36, 'departamento blanco', 'monterrey', 'las lomas', '45414', 'laureles #101', 2, 4550, 'amueblado', 'departamento', 'ninguno', 8, 10, 'si', 0x433a5c55736572735c35323935335c50696374757265735c63617361312e6a7067);
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(37, 'Cuarto jardines', 'morelia', 'san mateo', '25489', 'av. lazaro cardenas #35', 1, 1000, 'agua, internet, luz. ', 'cuarto', 'Cuarto color blanco, espacioso.', 4, 9, 'si', 0x433a5c55736572735c35323935335c50696374757265735c63617361382e6a7067);
INSERT INTO `alojamiento` (`id_alojamiento`, `titulo`, `entidad`, `municipio`, `cp`, `dir`, `numHabs`, `costo`, `servicios`, `tipo`, `detalles`, `puntaje`, `arrendador_id`, `disponibilidad`, `imagen`) VALUES(38, 'casa guanajuato', 'guanajuato', 'san marcos', '54896', 'av. camino real $3', 3, 6000, 'telefono, luz, agua caliente, internet.', 'casa', 'color beige.', 8, 9, 'si', 0x433a5c55736572735c35323935335c50696374757265735c63617361322e6a7067);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arrendador`
--
-- Creación: 05-07-2020 a las 22:59:54
-- Última actualización: 08-07-2020 a las 15:19:29
--

CREATE TABLE `arrendador` (
  `id_arrendador` int(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `numIde` varchar(30) NOT NULL,
  `entidad` varchar(50) NOT NULL,
  `Municipio` varchar(50) NOT NULL,
  `cp` varchar(5) NOT NULL,
  `dir` varchar(100) NOT NULL,
  `descrip` varchar(200) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `contra` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `arrendador`:
--

--
-- Volcado de datos para la tabla `arrendador`
--

INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(1, 'jaime', 'mundo', '1997-12-10', '1234567', 'oaxaca', 'juxtlahuaca', '69000', 'reforma #2', 'hola soy mundo', 'Masculino', '9531234758', 'jaime@gmail.com', 'mundo');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(2, 'Brenda', 'Vazquez', '1997-10-09', '123456789', 'Jalisco', 'Guadalajara', '69000', 'Emiliano zapata', 'askjdksajd', 'Femenino', '9531586332', 'brenda@gmail.com', 'yasel');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(3, 'Juan Jose', 'Gutierrez', '1999-01-01', '1234567', 'guerrero', 'santa lucia', '68000', 'Emiliano zapata #2', 'casa color verde con negro', 'Masculino', '954561478', 'juan@gmail.com', 'passjuan');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(4, 'aldo', 'mendez', '2001-08-29', '54561', 'sonora', 'san geronimo', '98745', 'hjkl', 'asdfghjk', 'Masculino', '9815456465', 'aldo@gmail.com', 'passaldo');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(5, 'asasd', 'sada', '1998-10-10', '6566546123', 'tampico', 'san sebastian', '45664', 'aSdfghj', 'sdfghjk', 'Femenino', '951654614', 'asd@gmail.com', 'passasd');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(6, 'Brenda', 'Vazquez', '1997-10-09', '123456789', 'jailisco', 'guadalajara', '65001', 'emiliano zapata #2', 'casa color verde', 'Femenino', '9531586332', 'brenda98@gmail.com', 'passbrenda');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(7, 'pedro', 'ortiz', '1995-01-01', '123456789', 'nuevo leon', 'santa cruz', '67521', 'emiliano zapata #2', 'casa color verde', 'Masculino', '9564891235', 'pedro@gmail.com', 'passpedro');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(8, 'yasel', 'gomez', '1997-10-10', '1234569875224', 'Jalisco', 'Guadalajara', '69000', 'av. de los robles', 'holaa!', 'Femenino', '9531586332', 'yasel@gmail.com', '1234');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(9, 'jimena', 'martinez', '2000-10-01', '5646512456895624', 'guanajuato', 'san marcos', '51655', 'av. juarez #2', 'casa color verde', 'Femenino', '954-156-1425', 'jimena@gmail.com', 'asdfghjkl');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(10, 'juan', 'gutierrez', '2000-10-10', '5465465', 'guanajuato', 'san andres', '65465', 'col. del bosque, calle sauces #101', 'casa color azul', 'Masculino', '546528452', 'juang@gmail.com', '123456789');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(11, 'luz', 'juarez', '0199-10-12', '14564132', 'oaxaca', 'huajuapan', '12345', 'emiliano zapata', 'casa azul', 'femenino', '9511478558', 'luz@gmail.com', '12345678');
INSERT INTO `arrendador` (`id_arrendador`, `nombre`, `apellido`, `fecha`, `numIde`, `entidad`, `Municipio`, `cp`, `dir`, `descrip`, `genero`, `telefono`, `correo`, `contra`) VALUES(12, 'pedro', 'paramo', '2000-11-19', '456132165', 'cdmx', 'tlanepantla', '67000', 'dasdasd', 'casa amarilla', 'masculino', '9511475885', 'pedrop@gmail.com', '789654321');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--
-- Creación: 08-07-2020 a las 15:44:54
-- Última actualización: 08-07-2020 a las 15:57:27
--

CREATE TABLE `estudiante` (
  `id_estudiante` int(11) NOT NULL,
  `nombre` varchar(70) NOT NULL,
  `apellido` varchar(70) NOT NULL,
  `fecha` date NOT NULL,
  `escuela` varchar(100) NOT NULL,
  `genero` varchar(10) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `contra` varchar(30) NOT NULL,
  `codigo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `estudiante`:
--

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id_estudiante`, `nombre`, `apellido`, `fecha`, `escuela`, `genero`, `telefono`, `correo`, `contra`, `codigo`) VALUES(4, 'ana', 'paula', '1995-10-28', 'Cbtis 123', 'femenino', '9511234567', 'anap@gmail.com', 'ana123', 'vr615hu53q');
INSERT INTO `estudiante` (`id_estudiante`, `nombre`, `apellido`, `fecha`, `escuela`, `genero`, `telefono`, `correo`, `contra`, `codigo`) VALUES(5, 'jose', 'alvarez', '1991-10-14', 'UNAM', 'masculino', '9511478524', 'jose@gmail.com', 'jose456', '');
INSERT INTO `estudiante` (`id_estudiante`, `nombre`, `apellido`, `fecha`, `escuela`, `genero`, `telefono`, `correo`, `contra`, `codigo`) VALUES(6, 'jasjjas', 'asd', '2000-10-01', 'sdasd', 'asda', '9541245874', 'asd', '123', NULL);
INSERT INTO `estudiante` (`id_estudiante`, `nombre`, `apellido`, `fecha`, `escuela`, `genero`, `telefono`, `correo`, `contra`, `codigo`) VALUES(7, 'asd', 'asd', '1995-10-01', 'jashdjad', 'asdasd', '95412512', 'asd', 'asd', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservacion`
--
-- Creación: 08-07-2020 a las 09:52:02
-- Última actualización: 08-07-2020 a las 11:18:24
--

CREATE TABLE `reservacion` (
  `id_reservacion` int(50) NOT NULL,
  `al_id` int(50) NOT NULL,
  `est_id` int(50) NOT NULL,
  `numero_targeta` varchar(16) NOT NULL,
  `titular_targeta` varchar(100) NOT NULL,
  `fecha_vencimiento` varchar(7) NOT NULL,
  `codigo_seguridad` varchar(3) NOT NULL,
  `codigo_reservacion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- RELACIONES PARA LA TABLA `reservacion`:
--   `est_id`
--       `estudiante` -> `id_estudiante`
--   `al_id`
--       `alojamiento` -> `id_alojamiento`
--

--
-- Volcado de datos para la tabla `reservacion`
--

INSERT INTO `reservacion` (`id_reservacion`, `al_id`, `est_id`, `numero_targeta`, `titular_targeta`, `fecha_vencimiento`, `codigo_seguridad`, `codigo_reservacion`) VALUES(10, 19, 4, '1234567887654321', 'ana paula', '10-2022', '195', 'vr615hu53q');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`id_alojamiento`),
  ADD KEY `persona_id` (`arrendador_id`);

--
-- Indices de la tabla `arrendador`
--
ALTER TABLE `arrendador`
  ADD PRIMARY KEY (`id_arrendador`),
  ADD KEY `id_persona` (`id_arrendador`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`id_estudiante`);

--
-- Indices de la tabla `reservacion`
--
ALTER TABLE `reservacion`
  ADD PRIMARY KEY (`id_reservacion`),
  ADD KEY `al_id` (`al_id`),
  ADD KEY `est_id` (`est_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `id_alojamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `arrendador`
--
ALTER TABLE `arrendador`
  MODIFY `id_arrendador` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `id_estudiante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `reservacion`
--
ALTER TABLE `reservacion`
  MODIFY `id_reservacion` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD CONSTRAINT `alojamiento_ibfk_1` FOREIGN KEY (`arrendador_id`) REFERENCES `arrendador` (`id_arrendador`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `reservacion`
--
ALTER TABLE `reservacion`
  ADD CONSTRAINT `reservacion_ibfk_2` FOREIGN KEY (`est_id`) REFERENCES `estudiante` (`id_estudiante`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reservacion_ibfk_3` FOREIGN KEY (`al_id`) REFERENCES `alojamiento` (`id_alojamiento`) ON UPDATE CASCADE;


--
-- Metadatos
--
USE `phpmyadmin`;

--
-- Metadatos para la tabla alojamiento
--

--
-- Volcado de datos para la tabla `pma__table_uiprefs`
--

INSERT INTO `pma__table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES('root', 'unirenta', 'alojamiento', '{\"CREATE_TIME\":\"2020-07-05 18:09:12\"}', '2020-07-06 00:14:09');

--
-- Metadatos para la tabla arrendador
--

--
-- Metadatos para la tabla estudiante
--

--
-- Metadatos para la tabla reservacion
--

--
-- Metadatos para la base de datos unirenta
--
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
