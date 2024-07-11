#HomeWork #1 22.01

- Встановити Java, засоби розробника, IDE
- Створити проєкт за Maven архетипом quickstart
- Налаштувати Git, опублікувати репозиторій
![image](https://github.com/AntonDegt/Java/assets/108671823/8f34dbce-5822-4e74-8157-8f8ef3c88041)



# HomeWork #2 24.01
Реалізувати відображення файлів поточної директорії за зразком команди ls / dir



# HomeWork #3 26.01
JSON телефонний каталог
- При старті програма виводить наявні записи (ПІБ - телефон) та пропонує додати новий запис (з консолі)
- Після введення дані додаються до файлу і наступний запуск
- Покаже їх у складі інших записів.
<a href="https://github.com/AntonDegt/Java/blob/master/src/main/java/step/learning/FileIO.java">**ФАЙЛ**</a>




# HomeWork #4 29.01
Реалізувати сутність <a href="https://github.com/AntonDegt/Java/blob/master/src/main/java/step/learning/oop/Journal.java">"Журнал"</a> (номер, назва)
- Додати до каталогу "ArgC & ArgV" номер 123
- переконатись у виведенні всього каталогу
- перевірка номера на додатність


Реалізувати сутність <a href="https://github.com/AntonDegt/Java/blob/master/src/main/java/step/learning/oop/Map.java">"Мапа"</a> (назва, масштаб[1:100000, 1:20000])
- Додати до каталогу мапу "Одеська область" з масштабом 1:50000
- переконатись у виведенні всього каталогу
- перевірка масштабу на кратність 1000






# HomeWork #5 31.01
- Оголосити класи <a href="https://github.com/AntonDegt/Java/blob/master/src/main/java/step/learning/oop/OldMap.java">OldMap</a> (OldNewspaper) з анотацією @Used, переконатись, що вона також потрапляє у відповідний цикл.
- Створити метод, який виводить лише нові видання (старі не виводяться)



# HomeWork #6 02.02
Засобами багатопоточності реалізувати задачу формування pandigital числа _(число складається з усіх цифр від 1 до 9)._ Порядок цифр - довільний.


Кожну цифру має додавати окремий потік, після додавання виводить проміжний результат.


<a href="https://github.com/AntonDegt/Java/blob/99c822f37ef4d48150603d8d76a34f54a238b76d/src/main/java/step/learning/async/MultiThread.java#L70">**ФАЙЛ**</a> 



# HomeWork #7 05.02
Виконати попереднє Д.З. (pandigital) з використанням засобів багатозадачності.
<a href="https://github.com/AntonDegt/Java/blob/fff74f125d03bf96d9410c5aa31ff8d19a00f514/src/main/java/step/learning/async/MultiTask.java#L47">**ФАЙЛ**</a>



# HomeWork #8 07.02
IoC: Зробити додаткові реалізації сервісу CodeGenerator
- з розділенням груп цифр (після кожної четвертої цифри іде "-")
- з цифро-символьними елементами у верхньому реєстрі (W3KL7)
<a href="https://github.com/AntonDegt/Java/blob/master/src/main/java/step/learning/services/rnd">**ФАЙЛ**</a>


# HomeWork #9 09.02
Написати процедуру додавання до таблиці колонки зі значенням UUID() - повний формат.
Модифікувати процедури додавання та виведення даних з урахуванням появи нової колонки.
