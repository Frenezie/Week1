using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Praktikum_17
{
    class DemoArray
    {
        public int[] IntArray;
        public DemoArray(int n)
        {
            IntArray = new int[n];
        }
        public DemoArray(DemoArray array)
        {
            IntArray = new int[array.Razm];
            for (int i = 0; i < array.Razm; i++)
            {
                IntArray[i] = array[i];
            }
        }
        public void Show()
        {
            foreach (int item in IntArray)
                Console.Write("{0} ", item);
        }
        public void Enter()
        {
            for (int i = 0; i < IntArray.Length; i++)
                IntArray[i] = int.Parse(Console.ReadLine());
        }
        public void SortMass()
        {
            int temp = 0;
            for (int j = 0; j < IntArray.Length - 1; j++)
            {
                for (int i = 0; i < IntArray.Length - 1; i++)
                {
                    if (IntArray[i] > IntArray[i + 1])
                    {
                        temp = IntArray[i + 1];
                        IntArray[i + 1] = IntArray[i];
                        IntArray[i] = temp;
                    }
                }
            }
        }
        public int Razm
        {
            get { return IntArray.Length; }
        }
        public int Umnogenie
        {
            set
            {
                for (int i = 0; i < IntArray.Length; i++)
                    IntArray[i] *= value;
            }
        }
        public int this[int i]
        {
            get
            {
                try
                {
                    return IntArray[i];
                }
                catch
                {
                    Console.WriteLine("Недопустимый индекс");
                    return 0;
                }
            }
            set
            {
                try
                {
                    IntArray[i] = value;
                }
                catch
                {
                    Console.WriteLine("Недопустимый индекс");
                }
            }
        }
        public static DemoArray operator ++(DemoArray x)
        {
            DemoArray temp = new DemoArray(x);
            for (int i = 0; i < x.Razm; i++)
            {
                temp[i] = x[i] + 1;
            }
            return temp;
        }
        public static DemoArray operator --(DemoArray x)
        {
            DemoArray temp = new DemoArray(x);
            for (int i = 0; i < x.Razm; i++)
            {
                temp[i] = x[i] - 1;
            }
            return temp;
        }
        public static DemoArray operator *(DemoArray x, int a)
        {
            DemoArray temp = new DemoArray(x);
            for (int i = 0; i < temp.Razm; i++)
            {
                temp[i] = x[i] * a;
            }
            return temp;
        }
        public static bool operator !(DemoArray x)
        {
            int count = 0;
            DemoArray temp = new DemoArray(x);
            for (int i = 0; i < temp.Razm - 1; i++)
            {
                if (temp[i] < temp[i + 1])
                {
                    count++;
                }
            }
            if (count == temp.Razm - 1)
                return false;
            else
                return true;
        }
        public static implicit operator int[](DemoArray a)
        {
            int[] temp = new int[a.Razm];
            for (int i = 0; i < a.Razm; i++)
            {
                temp[i] = a[i];
            }
            return temp;
        }
        public static implicit operator DemoArray(int[] a)
        {
            return new DemoArray(a);
        }
    }
    class Program
    {
        static void Print(int[] a)
        {
            for (int i = 0; i < a.Length; i++)
                Console.Write("{0} ", a[i]);
            Console.WriteLine();
        }
        static void Main(string[] args)
        {
            Console.WriteLine("Введите размерность массива:");
            int k = int.Parse(Console.ReadLine());
            DemoArray array = new DemoArray(k);
            Console.WriteLine("Введите элементы массива:");
            array.Enter();
            array.SortMass();
            Console.WriteLine("Отсортированный массив:");
            array.Show();
            Console.WriteLine();
            Console.WriteLine("Введите индекс элемента:");
            int i = int.Parse(Console.ReadLine());
            Console.Write("DemoArray [{0}] = ", i);
            array[i - 1] = int.Parse(Console.ReadLine());
            Console.WriteLine("Изменённый массив:");
            array.Show();
            Console.WriteLine();
            Console.WriteLine("Декремент:");
            ++array;
            array.Show();
            int r = array.Razm;
            Console.WriteLine();
            Console.WriteLine("Размерность массива:");
            Console.WriteLine(r);
            Console.WriteLine("Умноженный массив:");
            array.Umnogenie = 3;
            array.Show();
            Console.WriteLine();
            Console.WriteLine("Инкремент:");
            --array;
            array.Show();
            Console.WriteLine();
            if (!array)
                Console.WriteLine("Элементы массива не упорядочены по возрастанию");
            else
                Console.WriteLine("Элементы массива упорядочены по возрастанию");
            Console.Write("Введите число: ");
            int a = int.Parse(Console.ReadLine());
            DemoArray demo = new DemoArray(array * a);
            Console.WriteLine("Массив, все элементы которого умножены на {0}:", a);
            demo.Show();
            int[] mas1 = demo;
            int[] mas2 = demo;
            DemoArray demo1 = mas1;
            DemoArray demo2 = (DemoArray)mas2;
            mas1[2] = 100;
            mas2[2] = 200;
            demo1[2] = 300;
            demo2[2] = 400;
            Console.Write("Класс-массив demo: ");
            demo.Show();
        }
    }
}
