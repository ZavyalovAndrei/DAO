USE netology;

insert customers (name, surname, age, phone_number, city)
values
    ('Yan', 'Fedorov', 37, '9643675', 'Moscow'),
         ('Alexey', 'Uzenjuk', 28, '7852323', 'Moscow'),
         ('Damiano', 'David', 23, '8856337', 'Roma'),
         ('Anessa', 'Lippa', 27, '45236856', 'Los-Angeles'),
         ('Vladimir', 'Kotlyarov', 34, '1120568', 'Moscow'),
         ('Billie', 'Eilish Pirate Baird O\'Connell', 22, '6687993', 'New-York'),
         ('Alexey', 'Kortnev', 55, '7852526', 'Moscow'),
         ('Alexandr', 'Ivanov', 54, '8371557', 'Moscow'),
         ('Alexey', 'Gorshnev', 46, '5632489', 'Saint-Petersburg'),
         ('Dmitry', 'Spirin', 47, '8756930', 'Moscow'),
         ('Alexey', 'Nikonov', 46, '8721546', 'Vyborg');

insert orders (date, product_name, amount, customer_id)
values ('2022-09-05 10:22:11', 'Bluetooth receiver Ugreen', 1, 7),
       ('2022-09-05 12:46:52', 'Notebook Xiaomi RedmiBook Pro 14"', 1, 4),
       ('2022-09-05 16:18:14', 'Lenovo Tab P11 Pro TB-J706L', 2, 11),
       ('2022-09-05 17:01:36', 'SD card Sandisk 128ГБ SDSDXDK-128G-GN4IN UHS-II U3', 6, 1),
       ('2022-09-05 17:30:17', 'Telephone Xiaomi Redmi 10C NFC 4/64', 1, 8),
       ('2022-09-06 09:08:33', 'Video camera Sony y ILME-FX3', 1, 5),
       ('2022-09-06 13:45:10', 'Wireless headphones Marshall Minor III', 1, 10),
       ('2022-09-07 09:03:31', 'Wi-fi repeater Xiaomi Mi Wi-Fi Range Extender Pro CN', 1, 3),
       ('2022-09-07 11:34:26', 'Telephone Apple iPhone 14 Pro Max 128', 1, 2),
       ('2022-09-07 13:04:56', 'Keyboard Xiaomi MIIIW', 9, 6),
       ('2022-09-07 14:09:03', 'Notebook MSI GF63 10SC-635XRU', 1, 9),
       ('2022-09-08 10:16:28', 'Wi-fi router TP-LINK Archer C80', 2, 3),
       ('2022-09-08 11:37:02', 'Sony PlayStation 5 825Gb', 1, 11),
       ('2022-09-08 16:59:29', 'Computer  GANSOR-158348', 1, 5),
       ('2022-09-09 09:25:45', 'Monitor Samsung Odyssey G5 C34G55TWWI', 1, 9),
       ('2022-09-09 11:44:54', 'Clock Samsung Galaxy Watch4 Classic', 1, 8),
       ('2022-09-09 15:09:16', 'Video card GIGABYTE AORUS GeForce RTX 3080 Ti', 1, 4),
       ('2022-09-09 15:45:37', 'PC power supply Dell PS-2112-2D-LF', 1, 6);

