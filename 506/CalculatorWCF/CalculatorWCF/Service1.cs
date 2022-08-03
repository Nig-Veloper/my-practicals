using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace CalculatorWCF
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class Service1 : IService1
    {
        public int add(int a, int b)
        {
            return (a + b);
        }

        public int div(int a, int b)
        {
            return (a / b);
        }


        public int mul(int a, int b)
        {
            return (a * b);
        }

        public int sq(int a)
        {
            return (a * a);
        }

        public int sub(int a, int b)
        {
            return (a - b);
        }
    }
}
