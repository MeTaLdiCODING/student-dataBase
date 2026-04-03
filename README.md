# Student Database

Консольное приложение для управления базой данных студентов.  
Мой первый пет-проект на Java.

## О проекте

Это простая система управления студентами с использованием **слойной архитектуры**.  
Приложение позволяет добавлять, искать и удалять студентов по данным паспорта.

Проект разработан с целью отработки навыков ООП, работы с коллекциями, Stream API и разделения ответственности по слоям.

## Возможности

- Добавление нового студента
- Поиск студента по серии и номеру паспорта
- Удаление студента по паспортным данным
- Валидация серии (4 символа) и номера паспорта (6 символов)
- In-memory хранилище данных (HashMap)

## Технологии и инструменты

- **Java 17+**
- **Gradle**
- **Lombok**
- Stream API
- Консольный интерфейс (Scanner)

Структура проекта
textsrc/main/java/ru/dataBase/student/
├── Main.java
├── controller/
│   └── StudentController.java
├── service/
│   ├── StudentService.java
│   └── impl/
│       └── StudentServiceImpl.java
├── view/
│   └── StudentView.java
├── dto/
├── model/
│   ├── Student.java
│   ├── Passport.java
│   └── Faculty.java
├── database/
│   └── Database.java
└── util/
    └── DateUtils.java 

    
## Архитектура проекта

Проект построен по классической многослойной архитектуре:

- **view** - пользовательский интерфейс (консоль)
- **controller** - обработка запросов и базовая валидация
- **service** - бизнес-логика
- **dto** - объекты для передачи данных (Data Transfer Objects)
- **model** - бизнес-сущности
- **database** - in-memory база данных
- **util** - вспомогательные утилиты

### Схема бизнес-сущностей

<img width="619" height="310" alt="image" src="https://github.com/user-attachments/assets/cfa1901a-ea38-434b-bbfa-f1c0d8134b3e" />


> *Student* связан с *Passport* и *Faculty*. Паспортные данные используются как уникальный ключ.


Планы по развитию проекта

Добавить операцию обновления данных студента (Update)
Сохранение и загрузка данных из JSON-файла
Улучшенная валидация (email, телефон, дата рождения)
Переход на Spring Boot + реальная база данных (H2 или PostgreSQL)
Добавление тестов (JUnit)


## Как запустить проект

### 1. Клонирование репозитория,Запуск
```bash
  git clone https://github.com/MeTaLdiCODING/student-dataBase.git
  cd student-dataBase
 ./gradlew run
