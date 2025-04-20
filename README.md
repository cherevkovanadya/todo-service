Выполненные задачи
1. Созданы миграции Liquibase для инициализации таблиц `user` и `task`.
2. Заполнена тестовыми данными через Liquibase (`data-changelog.yaml`):
![image](https://github.com/user-attachments/assets/26708b1c-8a06-4b30-ba81-83e3c35a80c1)
![image](https://github.com/user-attachments/assets/0b2c3480-78c2-43de-b47d-af70c9c9725d)
3. Реализованы CRUD-операции для задач:
  - Создание задачи (`POST /api/tasks`).
    ![image](https://github.com/user-attachments/assets/72c95fe8-6451-4103-8425-fa3d91d46eb0)
    ![image](https://github.com/user-attachments/assets/a6300fc4-1a28-466c-b1d0-35c2559e7484)
    ![image](https://github.com/user-attachments/assets/b485ef0f-615a-40ce-a60a-abc092021e82)
  - Получение задач пользователя (`GET /api/tasks/user/{userId}`).
    ![image](https://github.com/user-attachments/assets/d3c78525-2701-4e6e-9afd-2ea966424b87)
    ![image](https://github.com/user-attachments/assets/ee617f72-4158-4d8a-b2ed-7ca9e7cbb10d)
  - Редактирование задачи (`PUT /api/tasks/{taskId}`).
    ![image](https://github.com/user-attachments/assets/3862b6a0-b856-447b-9eb6-9bfd194b1687)
    ![image](https://github.com/user-attachments/assets/a8b9a5ee-1309-4a96-971f-83ef4a9e9852)
  - Удаление задачи (`DELETE /api/tasks/{taskId}`).
    ![image](https://github.com/user-attachments/assets/d820498e-5c81-45a8-9acf-b2042b3daa97)
    ![image](https://github.com/user-attachments/assets/1a5a187f-d2bd-4660-9418-56e0c43ecdcc)

