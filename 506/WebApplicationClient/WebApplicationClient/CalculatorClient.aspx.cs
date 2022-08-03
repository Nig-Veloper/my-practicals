using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplicationClient
{
    public partial class CalculatorClient : System.Web.UI.Page
    {
        WebApplicationClient.ServiceReference1.Service1Client client = new WebApplicationClient.ServiceReference1.Service1Client();
        int a, b;

        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            a = Convert.ToInt32(firstNumber.Text);
            b = Convert.ToInt32(secondNumber.Text);

            res.Text = Convert.ToString(client.sub(a, b));
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            a = Convert.ToInt32(firstNumber.Text);
            b = Convert.ToInt32(secondNumber.Text);

            res.Text = Convert.ToString(client.mul(a, b));
        }

        protected void Button4_Click(object sender, EventArgs e)
        {
            a = Convert.ToInt32(firstNumber.Text);
            b = Convert.ToInt32(secondNumber.Text);

            res.Text = Convert.ToString(client.div(a, b));
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            a = Convert.ToInt32(firstNumber.Text);
            b = Convert.ToInt32(secondNumber.Text);

            res.Text = Convert.ToString(client.add(a, b));

        }
    }
}