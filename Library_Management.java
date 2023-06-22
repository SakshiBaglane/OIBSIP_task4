//Digital Library Management

/**********************************************
*Programmer              	: Sakshi Baglane
*Program name           	: Libraray_Management.java
*Task Number                : 05
************************************************/

import java.util.Scanner;

public class Library_Management 
{

    public static void main(String[] args) 
    {
        char r;
        do {

            System.out.println("\n\n =============Libraray_Management System=========== \n");
            System.out.println(" press 1 to add book");
            System.out.println(" press 2 to issue book");
            System.out.println(" press 3 to return a book");
            System.out.println(" press 4 to print complete issue details ");
            System.out.println(" press 5 Exit ");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("\n Enter any Number \n ");
            int a = obj1.nextInt();
            switch (a) 
            {
                case 1:
                    library aa = new library();
                    aa.add();
                    break;

                case 2:
                    library bb = new library();
                    bb.issue();
                    break;

                case 3:
                    library cc = new library();
                    cc.ret();
                    break;

                case 4:
                    library issue = new library();
                    issue.detail();
                    break;

                case 5:
                    library add = new library();
                    add.exit();
                    break;

                default:
                    System.out.println("invalid number");
            }

            System.out.println("\n you want to select next option Y/N \n");
            r = obj1.next().charAt(0);
        } 
        while (r == 'y' || r == 'Y');
        if (r == 'n' || r == 'N') 
        {
            library z = new library();
            z.exit();
        }

    }

}

class library 
{
    static String Name, date, b;
    static int a, c;

    void add() 
    {

        System.out.println("\n Enter Book Name, Price and Book_No \n");
        Scanner obj2 = new Scanner(System.in);
        String Name = obj2.nextLine();
        float Price = obj2.nextInt();
        int Book_No = obj2.nextInt();
        System.out.println(" \n Your details is \n " + Name + "  " + Price + "  " + Book_No);

    }

    void issue() 
    {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book Name");
        Name = obj3.nextLine();
        System.out.println("Book_id");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Issue Date");
        b = obj3.nextLine();
        System.out.println("Total Book Issued");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.println("Return Book Date");
        date = obj3.nextLine();
    }

    int getid() 
    {
        return a;
    }

    void ret() 
    {
        System.out.println("\n Enter Book_name & Book_id \n");
        Scanner obj4 = new Scanner(System.in);
        Name = obj4.nextLine();
        int book_id = obj4.nextInt();
        if (a == book_id) 
        {

            System.out.println("All Deatils");
            System.out.println("Book Name ::" + library.Name);
            System.out.println("Book_id ::" + library.a);
            System.out.println("Issue Date ::" + library.b);
            System.out.println("Total Book Issued ::" + library.c);
            System.out.println("Return Date ::" + library.date);
            System.out.println("\n You have Returned the Book \n");
        }

        else 
        {
            System.out.println("Wrong Id" + "\n" + "Please Enter Correct Id");
        }
    }

    void detail() 
    {
        System.out.println("Book Name :: " + library.Name);
        System.out.println("Book_id :: " + library.a);
        System.out.println("Issue Date :: " + library.b);
        System.out.println("Total Book Issued:: " + library.c);
        System.out.println("Return Date :: " + library.date);
    }

    void exit() 
    {
        System.exit(0);
    }
}
