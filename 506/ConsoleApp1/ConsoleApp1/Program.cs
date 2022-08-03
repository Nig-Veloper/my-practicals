using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            ConsoleApp1.ServiceReference1.Service1Client client = new ServiceReference1.Service1Client();

            Console.WriteLine("Enter two numbers");
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());

            int addd = client.add(a, b);
            int sub = client.sub(a, b);
            int mul = client.mul(a, b);
            int div = client.div(a, b);

            Console.WriteLine("Add :"+ addd.ToString());
            Console.WriteLine("Sub :"+ sub);
            Console.WriteLine("Mul :"+mul);
            Console.WriteLine("Div :"+div);

            Console.Read();
        }
    }
}
