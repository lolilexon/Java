import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

//1. Класс "Человек"
//Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.
/*
public class Main {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.age = 20;
        bob.name = "Bob";
        bob.gender = "Male";
        bob.OutpuInfo();
        bob.AgeUpper();
        bob.ChangeName("Ross");
    }
}

class Person {
    String name;
    int age;
    String gender;
    
    void OutpuInfo() {
        System.out.printf("\nAge: "+age);
    }
    
    void AgeUpper() {
        System.out.printf("\nName: "+name+"\nAge: "+(age+5)+"\nGender: "+gender);
    }
    void ChangeName(String newName){
        name = newName;
        System.out.printf("\nName: "+name);
    }
}

//2. Наследование: Класс "Работник" и "Менеджер"
//Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager,
//который наследует от Worker и добавляет поле для подчиненных сотрудников.
        
class Worker extends Person {
    int salary;
}

class Manager extends Worker {
String[] slaves;
}
*/
//3. Полиморфизм: Животные
//Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс.
//Продемонстрируйте полиморфизм на примере массива животных.
/*
interface Animal {
public void makeSound();
}

class Dog implements Animal {
@Override
public void makeSound(){
    System.out.printf("\nWuf-wuf");
    }
}

class Cat implements Animal {
@Override
public void makeSound(){
    System.out.printf("\nMyau");
    }
}

class Cow implements Animal {
@Override
public void makeSound(){
    System.out.printf("\nMuuuuu");
    }
}

 */
//4. Абстрактный класс "Транспорт"
//Создайте абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
/*
abstract class Transport{
public abstract void move();
}

class Car extends Transport{
     public void move() {
       System.out.println("Машина газует!");
    }
}

class Bike extends Transport{
     public void move() {
       System.out.println("Мотоцикл газует!");
    }
}
 */
//5. Класс "Книга" и "Библиотека"
//Создайте класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг,
//поиска по автору и году публикации.
/* 
class Book {
    public String title;
    public String author;
    public int year;
    
}
class Library {
    private List<Book> books
    public void CreateBook(String tit, String auth, int ye) {
        Book book1 = new Book();
        book1.title = tit;
        book1.author = auth;
        book1.year = ye;
    }
}

public class Main {
    public static void main(String[] args) {
        CreateBook("Эффект люцифера","Author",2010);
    }
}
*/
//6. Инкапсуляция: Банк Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств.
//Обеспечьте инкапсуляцию для безопасности данных счета.
/*
class BankAccount {
    int accountNumber;
    int balance;
    
    void popolnenie(int dengi){
        this.balance += dengi;
    }
    void snatie(int dengi){
        this.balance -= dengi;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.balance = 100;
        acc1.popolnenie(100);
        acc1.snatie(50);
        System.out.println(acc1.balance);
    }
}
*/

//7. Счетчик объектовСоздайте класс Counter, который хранит количество созданных объектов данного класса.
//Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.
/*
class Counter {
    private static int count = 0;
    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}
*/
//8. Площадь фигур
//Создайте абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.
/*
abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
*/
//9. Наследование: Животные и их движения
//Создайте класс Animal с методом move(). Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() (рыба плавает, птица летает, собака бегает).
/*
class Animal {
    public void move() {
        System.out.println("Животное двигается");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Рыба плавает");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Птица летает");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Собака бегает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal bird = new Bird();
        Animal dog = new Dog();

        fish.move();
        bird.move();
        dog.move();
    }
}

*/
//10. Работа с коллекциями: Университет
//Создайте класс Student с полями name, group, grade. Создайте класс University, который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.
/*

class Student {
    private String name;
    private String group;
    private double grade;

    public Student(String name, String group, double grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Группа: " + group + ", Оценка: " + grade;
    }
}

class University {
    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Реализуем собственную сортировку по имени (Bubble Sort)
    public void sortByName() {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    // Меняем местами
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    // Фильтрация студентов по минимальной оценке
    public List<Student> filterByGrade(double minGrade) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() >= minGrade) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University();

        university.addStudent(new Student("Иван Иванов", "Группа 1", 4));
        university.addStudent(new Student("Анна Петрова", "Группа 2", 3));
        university.addStudent(new Student("Сергей Смирнов", "Группа 1", 5));
        university.addStudent(new Student("Мария Сидорова", "Группа 3", 4));

        System.out.println("Студенты до сортировки:");
        university.printStudents();

        university.sortByName();
        System.out.println("\nСтуденты после сортировки по имени:");
        university.printStudents();

        System.out.println("\nСтуденты с оценкой >= 4:");
        List<Student> goodStudents = university.filterByGrade(4.0);
        for (Student student : goodStudents) {
            System.out.println(student);
        }
    }
}

*/
//11. Класс "Магазин"
//Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.
/*

// Класс Product с полями name, price и quantity
class Product {
    private String name;
    private double price;
    private int quantity;

    // Конструктор для инициализации полей
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Метод для установки нового количества
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Метод для красивого вывода информации о продукте
    @Override
    public String toString() {
        return "Продукт: " + name + ", Цена: " + price + ", Количество: " + quantity;
    }
}

// Класс Store, содержащий список продуктов и методы для работы с ним
class Store {
    private List<Product> products;

    // Конструктор для инициализации списка продуктов
    public Store() {
        products = new ArrayList<>();
    }

    // Метод для добавления продукта в список
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для удаления продукта по имени
    public boolean removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }

    // Метод для поиска продукта по имени
    public Product findProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    // Метод для вывода всех продуктов
    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем магазин
        Store store = new Store();

        // Добавляем продукты
        store.addProduct(new Product("Яблоки", 50.0, 100));
        store.addProduct(new Product("Хлеб", 20.0, 200));
        store.addProduct(new Product("Молоко", 60.0, 150));

        // Вывод всех продуктов
        System.out.println("Все продукты в магазине:");
        store.printProducts();

        // Поиск продукта
        String searchName = "Хлеб";
        Product foundProduct = store.findProduct(searchName);
        if (foundProduct != null) {
            System.out.println("\nНайденный продукт:");
            System.out.println(foundProduct);
        } else {
            System.out.println("\nПродукт с именем '" + searchName + "' не найден.");
        }

        // Удаление продукта
        String removeName = "Яблоки";
        boolean removed = store.removeProduct(removeName);
        if (removed) {
            System.out.println("\nПродукт '" + removeName + "' был удален.");
        } else {
            System.out.println("\nНе удалось удалить продукт '" + removeName + "'.");
        }

        // Вывод всех продуктов после удаления
        System.out.println("\nПродукты после удаления:");
        store.printProducts();
    }
}
*/

//12. Интерфейс "Платежная система"
//Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.
/*

interface PaymentSystem {
    void pay(double amount);

    void refund(double amount);
}

class CreditCard implements PaymentSystem {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Платеж по кредитной карте (" + cardNumber + "): " + amount + " руб.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат средств на кредитную карту (" + cardNumber + "): " + amount + " руб.");
    }
}

class PayPal implements PaymentSystem {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Платеж через PayPal (" + email + "): " + amount + " руб.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат средств через PayPal (" + email + "): " + amount + " руб.");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentSystem creditCard = new CreditCard("1234-5678-9876-5432");
        PaymentSystem payPal = new PayPal("user@example.com");

        creditCard.pay(1000.0);
        creditCard.refund(200.0);

        payPal.pay(1500.0);
        payPal.refund(300.0);
    }
}

*/
//13. Генерация уникальных идентификаторов
//Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.
/*
class UniqueID {
    private static int counter = 0;

    private int id;

    public UniqueID() {
        this.id = generateID();
    }

    private static int generateID() {
        return ++counter;
    }

    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Object ID: " + id;
    }
}

public class Main {
    public static void main(String[] args) {
        UniqueID obj1 = new UniqueID();
        UniqueID obj2 = new UniqueID();
        UniqueID obj3 = new UniqueID();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
 */

//14. Класс "Точка" и "Прямоугольник"
//Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.
/*
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getArea() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }

    @Override
    public String toString() {
        return "Верхняя левая точка " + topLeft + " и нижняя правая точка " + bottomRight;
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(5, 1);

        Rectangle rectangle = new Rectangle(p1, p2);

        System.out.println(rectangle);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
*/

//16. Перегрузка операторов: Матрица
//Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
/*
class Matrix {
    private int[][] data;
    private int rows;
    private int cols;

    public Matrix(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера для сложения.");
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы для умножения.");
        }

        int[][] result = new int[this.rows][other.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] data1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] data2 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        int[][] data3 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix matrix3 = new Matrix(data3);

        System.out.println("Сложение матриц:");
        Matrix sumMatrix = matrix1.add(matrix2);
        sumMatrix.display();

        System.out.println("\nУмножение матриц:");
        Matrix productMatrix = matrix1.multiply(matrix3);
        productMatrix.display();
    }
}
*/

//17. Создание игры с использованием ООП
//Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.
/*
class Weapon {
    private String name;
    private double damage;
    private String ability;

    public Weapon(String name, double damage, String ability) {
        this.name = name;
        this.damage = damage;
        this.ability = ability;
    }

    public double getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return name + " (Урон: " + damage + ")";
    }
}

class Character {
    protected String name;
    protected double health;
    protected Weapon weapon;
    protected String effect = "None";
    protected boolean protect = false;
    protected int count;
    protected Random random = new Random();

    public Character(String name, double health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Character target) {
        if (effect.equals("Stan") && count > 0) {
            System.out.println(name + " оглушен и не может атаковать!");
            count--;
            return;
        }
        
        System.out.println(name + " атакует " + target.name + " с помощью " + weapon.getName() + "!");
        target.takeDamage(weapon.getDamage());
    }

    public void UseAbility(Character target) {
        if (effect.equals("Bleedeng") && count != 0) {
            health -= 10;
            System.out.println(name + " получил 10 урона от кровотечения. Осталось здоровья: " + health);
            count--;
        }

        if (effect.equals("Miss") && count != 0) {
            count--;
            System.out.println(name + " подвержен эффекту временной слепоты и имеет 30% шанс промахнуться.");
            if (random.nextInt(3) > 1) {
                System.out.println(name + " промахивается.");
                return;
            }
        }

        System.out.println(name + " использует способность " + weapon.getAbility() + " против " + target.name);
        if (weapon.getAbility().equals("Оглушение")) {
            target.Stan();
        } else if (weapon.getAbility().equals("Кровотечение")) {
            target.Bleedeng();
        } else if (weapon.getAbility().equals("Ослепляющий клинок")) {
            target.BlindingSword();
        }
    }

    public void Stan() {
        this.effect = "Stan";
        System.out.println(name + " оглушен!");
        count = 2;
    }

    public void Bleedeng() {
        this.effect = "Bleedeng";
        count = 3;
        System.out.println(name + " начинает страдать от кровотечения!");
    }

    public void BlindingSword() {
        this.effect = "Miss";
        count = 3;
        System.out.println(name + " использует Ослепляющий клинок! Следующие 3 атаки могут промахнуться.");
    }

    public void protection() {
        this.protect = true;
        System.out.println(name + " использует защиту!");
    }

    public void takeDamage(double damage) {
        if (effect.equals("Bleedeng") && count > 0) {
            health -= 10;
            System.out.println(name + " получил 10 урона от кровотечения. Осталось здоровья: " + health);
            count--;
        }

        if (effect.equals("Miss") && count > 0) {
            count--;
            if (random.nextInt(3) > 1) {
                System.out.println(name + " промахивается.");
                return;
            }
        }

        if (effect.equals("Stan") && count > 0) {
            count--;
            return;
        }

        if (!protect) {
            health -= damage;
            if (health <= 0) {
                health = 0;
                System.out.println(name + " был побежден.");
            } else {
                System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
            }
        } else {
            health -= damage / 2;
            if (health <= 0) {
                health = 0;
                System.out.println(name + " был побежден.");
            } else {
                System.out.println(name + " получил " + (damage / 2) + " урона. Осталось здоровья: " + health);
            }
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public double getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name + " (Здоровье: " + health + ", Оружие: " + weapon + ")";
    }
}

class Player extends Character {
    private int healingPotions;

    public Player(String name, double health, Weapon weapon) {
        super(name, health, weapon);
        this.healingPotions = 3;
    }

    public void heal() {
        if (healingPotions > 0) {
            health += 20;
            healingPotions--;
            System.out.println(name + " использовал лечебное зелье. Здоровье восстановлено до " + health + ". Осталось зелий: " + healingPotions);
        } else {
            System.out.println("У " + name + " нет лечебных зелий.");
        }
    }
}

class Enemy extends Character {
    
    public Enemy(String name, double health, Weapon weapon) {
        super(name, health, weapon);
    }

    public void randomAction(Character target) {
        int action = random.nextInt(4);
        switch (action) {
            case 0:
                attack(target);
                break;
            case 1:
                protection();
                break;
            case 2:
                UseAbility(target);
                break;
            default:
                System.out.println(name + " ничего не делает.");
                break;
        }
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Weapon sword = new Weapon("Меч", 15, "Ослепляющий клинок");
        Weapon axe = new Weapon("Топор", 20, "Оглушение");
        Weapon claws = new Weapon("Когти", 10, "Кровотечение");

        Player player = new Player("Герой", 100, axe);
        Enemy enemy = new Enemy("Монстр", 200, claws);

        System.out.println("Игра начинается! " + player + " против " + enemy);
        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Атаковать");
            System.out.println("2. Блок");
            System.out.println("3. Применить умение оружия");
            System.out.println("4. Использовать лечебное зелье");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attack(enemy);
                    break;
                case 2:
                    player.protection();
                    break;
                case 3:
                    player.UseAbility(enemy);
                    break;
                case 4:
                    player.heal();
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    continue;
            }

            // Если враг жив, он делает случайное действие
            if (enemy.isAlive()) {
                enemy.randomAction(player);
            }
        }

        // Выводим результат игры
        if (player.isAlive()) {
            System.out.println("Поздравляем! " + player.name + " победил!");
        } else {
            System.out.println(player.name + " был побежден.");
        }

        scanner.close();
    }
}
*/
//18. Автоматизированная система заказов
//Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
/*
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Заказ: " + products + ", общая стоимость: $" + getTotalPrice();
    }
}

class Customer {
    private String name;
    private List<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public void showOrderHistory() {
        System.out.println("История заказов для клиента: " + name);
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

    @Override
    public String toString() {
        return "Клиент: " + name + ", количество заказов: " + orderHistory.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Ноутбук", 1000);
        Product product2 = new Product("Смартфон", 500);
        Product product3 = new Product("Наушники", 100);

        Customer customer = new Customer("Алексей");

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(product3);

        customer.addOrder(order1);
        customer.addOrder(order2);

        customer.showOrderHistory();

        System.out.println(customer);
    }
}
*/

//19. Наследование: Электроника
//Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.
/*
class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println(brand + " включен.");
    }

    public void turnOff() {
        System.out.println(brand + " выключен.");
    }
}

class Smartphone extends Device {

    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println(brand + " делает фотографию.");
    }
}

class Laptop extends Device {

    public Laptop(String brand) {
        super(brand);
    }

    public void compileCode() {
        System.out.println(brand + " компилирует код.");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple");
        Laptop laptop = new Laptop("Lenova");

        smartphone.turnOn();
        laptop.turnOn();

        smartphone.takePhoto();
        laptop.compileCode();

        smartphone.turnOff();
        laptop.turnOff();
    }
}
*/

//20. Игра "Крестики-нолики"
//Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.
/*

class Player {
    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == '-';
    }

    public void makeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayer = player1;
    }

    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 'Крестики-нолики' началась!");
        board.displayBoard();

        while (true) {
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), ваш ход!");
            int row, col;
            while (true) {
                System.out.print("Введите номер строки (0-2): ");
                row = scanner.nextInt();
                System.out.print("Введите номер столбца (0-2): ");
                col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board.isCellEmpty(row, col)) {
                    break;
                } else {
                    System.out.println("Неверный ход! Попробуйте снова.");
                }
            }

            board.makeMove(row, col, currentPlayer.getSymbol());
            board.displayBoard();

            if (board.checkWin(currentPlayer.getSymbol())) {
                System.out.println("Поздравляем, " + currentPlayer.getName() + "! Вы победили!");
                break;
            }

            if (board.isFull()) {
                System.out.println("Ничья! Поле заполнено.");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Игрок 1", 'X');
        Player player2 = new Player("Игрок 2", 'O');

        Game game = new Game(player1, player2);
        game.start();
    }
}
*/
