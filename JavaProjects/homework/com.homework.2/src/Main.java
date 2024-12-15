import java.util.Arrays;

public class Main {
    //<editor-fold desc="task1">
    class Human
    {
        protected String Name;
        protected int Age;

        public void Work() {
            System.out.print("I do my work");
        }
    }

    class Builder extends Human
    {
        private String Specialization;

        public void Work() {
            System.out.print("I build the:" + Specialization);
        }
    }

    class Sailor extends Human
    {
        private String ShipName;

        public void Work() {
            System.out.print("I sail on: " + ShipName);
        }
    }

    class Pilot extends Human
    {
        private String AircraftModel;

        public void Work() {
            System.out.print("I fly on: " + AircraftModel);
        }
    }
    //</editor-fold>

    //<editor-fold desc="task2">
    class Animal {
        protected String Name;
        protected int Strenght;
        protected int Speed;

        public void MakeSound() {
            System.out.println("...");
        }
    }

    class Tiger extends Animal {
        Tiger() {
            Name = "Tigra";
            Strenght = 4;
            Speed = 8;
        }

        public void MakeSound() {
            System.out.println("Rrrrrr");
        }
    }

    class Kangaroo extends Animal {
        Kangaroo() {
            Name = "Kengur";
            Strenght = 6;
            Speed = 5;
        }

        public void MakeSound() {
            System.out.println("Sproink!");
        }
    }

    class Crocodile extends Animal {
        Crocodile() {
            Name = "Krokodebil";
            Strenght = 9;
            Speed = 2;
        }

        public void MakeSound() {
            System.out.println("A chyo za zvuk to?");
        }
    }

    class Fox extends Animal {
        Fox() {
            Name = "GOD";
            Strenght = 100;
            Speed = 100;
        }

        public void MakeSound() {
            System.out.println("What does the Fox say?!");
        }
    }
    //</editor-fold>

    //<editor-fold desc="task3">
    public class Money {
        private int Dollars;
        private int Cents;

        public Money(int dollars, int cents) {
            Dollars = dollars;
            Cents = cents;
            normalize();
        }

        private void normalize() {
            if (Cents >= 100) {
                Dollars += Cents / 100;
                Cents %= 100;
            }
            else if (Cents < 0) {
                Cents *= -1;
                Dollars -= Cents / 100;
                Cents %= 100;
                if (Cents > 0) {
                    Cents = 100 - Cents;
                }
            }
        }

        public void SetDollars(int dollars) {
            Dollars = dollars;
            normalize();
        }

        public void SetCents(int cents) {
            Cents = cents;
            normalize();
        }

        public void Display() {
            System.out.println(Dollars + " Dollars " + Cents + " Cents");
        }
    }

    public class Product {
        private String Name;
        private Money Price;

        public Product(String name, Money price) {
            Name = name;
            Price = price;
        }

        public void DecreasePrice(Money amount) {
            Price.Dollars -= amount.Dollars;
            Price.Cents -= amount.Cents;
            Price.normalize();
        }

        public void DisplayInfo() {
            System.out.println("Product: " + Name);
            System.out.print("Price: ");
            Price.Display();
        }
    }
    //</editor-fold>

    //<editor-fold desc="task4">
    public class Device {
        protected String Name;
        protected String Description;

        public Device(String name, String description) {
            Name = name;
            Description = description;
        }

        public void MakeSound() {
            System.out.println("Sound");
        }

        public void Show() {
            System.out.println("Device name: " + Name);
        }

        public void Describe() {
            System.out.println("Description: " + Description);
        }
    }

    public class Kettle extends Device {
        public Kettle() {
            super("Chainik", "Boil the water!");
        }

        public void MakeSound() {
            System.out.println("Shhhhhhh boilp...");
        }
    }

    public class Microwave extends Device {
        public Microwave() {
            super("Mobilovolnovka ili zhe gadzhet budushego №8!", "Pochemu banan stal zhele!?");
        }

        public void MakeSound() {
            System.out.println("*white noise*");
        }
    }

    public class Car extends Device {
        public Car() {
            super("AE-86", "JA MASHINA!!!");
        }

        public void MakeSound() {
            System.out.println("DEJA VU!!!");
        }
    }

    public class Steamship extends Device {
        public Steamship() {
            super("AAAAAAAA NINAJU", "A JA RYBA!!!");
        }

        public void MakeSound() {
            System.out.println("ne DEJA VU!!!");
        }
    }
    //</editor-fold>

    //<editor-fold desc="task5">
    public class MusicalInstrument {
        protected String Name;
        protected String Description;

        public MusicalInstrument(String name, String description) {
            Name = name;
            Description = description;
        }

        public void MakeSound() {
            System.out.println("Sound");
        }

        public void Show() {
            System.out.println("Musical Instument name: " + Name);
        }

        public void Describe() {
            System.out.println("Description: " + Description);
        }

        public void History() {
            System.out.println("History");
        }
    }

    public class Violin extends MusicalInstrument {
        public Violin() {
            super("Skripka", "Pipets Grustna!");
        }

        public void MakeSound() {
            System.out.println("Grustnaya musika...");
        }

        public void History() {
            System.out.println("Kogdato davno...");
        }
    }

    public class Trombon extends MusicalInstrument {
        public Trombon() {
            super("Trombon", "Ninaju!");
        }

        public void MakeSound() {
            System.out.println("Kakayato musika...");
        }

        public void History() {
            System.out.println("4 naroda zhili v mire...");
        }
    }

    public class Ukulele extends MusicalInstrument {
        public Ukulele() {
            super("Ukukukulelele", "Sup iz 1 ryby - ucha, iz 5... UCHACHACHACHAHCA");
        }

        public void MakeSound() {
            System.out.println("Veselaya musika...");
        }

        public void History() {
            System.out.println("no vse izmenilos...");
        }
    }

    public class Violinchele extends MusicalInstrument {
        public Violinchele() {
            super("Da v dushe ne chaju kak nazvat", "!");
        }

        public void MakeSound() {
            System.out.println("Grustnaya musika...");
        }

        public void History() {
            System.out.println("kogda narod ognya razvyazal vojnu...");
        }
    }
    //</editor-fold>

    //<editor-fold desc="task6-7">
    interface IMath {
        int Max();
        int Min();
        float Avg();
    }

    interface ISort {
        void SortAsc();
        void SortDesc();
    }

    public class Array implements IMath, ISort {
        private int[] Array;

        public Array(int[] array) {
            Array = array;
        }

        public int Max() {
            int Max = Array[0];
            for (int i = 1; i < Array.length; i++) {
                if (Array[i] > Max) {
                    Max = Array[i];
                }
            }
            return Max;
        }

        public int Min() {
            int Min = Array[0];
            for (int i = 1; i < Array.length; i++) {
                if (Array[i] < Min) {
                    Min = Array[i];
                }
            }
            return Min;
        }

        public float Avg() {
            int Sum = 0;
            for (int num : Array) {
                Sum += num;
            }
            return (float) Sum / Array.length;
        }

        public void SortAsc() {
            Arrays.sort(Array);
        }

        public void SortDesc() {
            Arrays.sort(Array);
            for (int i = 0; i < Array.length / 2; i++) {
                int temp = Array[i];
                Array[i] = Array[Array.length - i - 1];
                Array[Array.length - i - 1] = temp;
            }
        }
    }
    //</editor-fold>
    public static void main(String[] args) {
    }
}