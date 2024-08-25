# Приложение по учету финансов
## Запуск приложения
1) нужно запустить Jetty, например, через команду
`mvn jetty:run`
2) перейти в браузере на localhost:9000
3) ввести пароль "123456" и нажать на Login
## Использование приложения
Приложение состоит из нескольких сервлетов, которые позволяют хранить какие-либо доходы или расходы.
Вывод доходов/расходов происходит следующим образом:
- `localhost:9000/summary/` хранит в себе список всех доходов/расходов, а также оставшиеся средства;
- `localhost:9000/details/` хранит в себе только список всех доходов/расходов.

Для добавления дохода:
- `localhost:9000/incomes/add?доход1=значение_дохода1&доход2=значение_дохода2.../`  
Пример добавления дохода:
- `localhost:9000/incomes/add?work=100/` добавит доход "work(100)"  

Для добавления расхода:
- `localhost:9000/expenses/add?расход1=значение_расхода1&расход2=значение_расхода2.../`  
Пример добавления расхода:
- `localhost:9000/expenses/add?oil=10&eggs=20/` добавит расходы "oil(10) и eggs(20)"