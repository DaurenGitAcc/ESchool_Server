# ESchool_Server

1 Установка jdk

1.1 Переходим по ссылку https://jdk.java.net/19/ и устанавливаем zip архив для windows

1.2 Разархивируем в удобную папку

1.3 Переходим в Переменные среды

1.3.1 Добавляем перемунную по под названием JAVA_HOME и указываем путь 'ваш_путь'/openjdk-19.0.2

1.3.2 Добавляем в переменную PATH указанный путь 'ваш_путь'/openjdk-19.0.2/bin


2 Установка Apache Maven

2.1 Переходим по ссылку https://maven.apache.org/download.cgi и устанавливаем apache-maven-3.9.1-bin.zip

2.2 Разархивируем в удобную папку

2.3 Переходим в Переменные среды

2.3.1 Добавляем перемунную по под названием M2_HOME и указываем путь 'ваш_путь'/apache-maven-3.9.1

2.3.2 Добавляем в переменную PATH указанный путь 'ваш_путь'/apache-maven-3.9.1/bin


3 Установка Node js

3.1 Переходим по ссылку https://nodejs.org/en/download и устанавливаем Windows Installer (.msi) 64-bit

3.2 Запускаем установщик (добавлять путь в переменные среды не нужно)


4 Скачиваем серверную часть с Github

4.1 Создаем папку и открываем по ней Git Bash

4.1.1 Вводим команду git clone https://github.com/DaurenGitAcc/ESchool_Server.git


5 Скачиваем клиентскую часть с Github

5.1 Создаем папку и открываем по ней Git Bash

5.1.1 Вводим команду git clone https://github.com/DaurenGitAcc/ESchool_client.git


6 Запуск сервера

6.1 Переходим в папку с серверной частью

6.2 Запускаем команду для сборки проекта mvn install

6.3 Запускаем сервер командой java -jar target/ESchool-0.0.1-SNAPSHOT.jar


7 Запуск клиент

7.1 Переходим в папку с клиентской частью

7.2 Устанавливаем необходимые пакеты командой npm install

7.3 Запускаем клиент командой npm run dev 


Клиент автоматический запуститься на 8081 порту


Первым откроется страница авторизации

Логин - admin

Пароль - qweqwe

На главной странице "/","/students" - список школьников

Можно нажать кнопку "Добавить" и откроет форма для добавления школьника

Кнопка "Выйти" отвечает соответсвенно за выход

На главной странице можно нажать кнопку "Подробнее" и посмотреть информацию про соответсвующего школьника, там же кнопка удалить из списка


