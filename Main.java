import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number Building: ");
        int n=in.nextInt();
        ArrayList<Building>buildings=new ArrayList<Building>();

          for (int i = 0; i < n; i++) {

            System.out.print("Choose h:Hospital,s:School: ");
            char ch=in.next().charAt(0);
            if(ch=='h'){
                System.out.println("Enter numberBuild,numberFloor,area,islift(true,false),numberBed,numberSection");
                buildings.add(new Hospital(in.nextInt(),in.nextInt(),in.nextFloat(),in.nextBoolean(),in.next(),in.nextInt(),in.nextInt()));
            }else if(ch=='s'){
                System.out.println("Enter numberBuild,numberFloor,area,islift(true,false),name,numberClasses");
                buildings.add(new School(in.nextInt(),in.nextInt(),in.nextFloat(),in.nextBoolean(),in.next(),in.nextInt()));
            }
        }
        for (int i = 0; i < n; i++) {
            buildings.get(i).print();
        }
        buildings.remove(0);
























/*
        System.out.print("Enter Number Person: ");
        int n=in.nextInt();
        Person persons[]=new Person[n];
       for (int i=0;i<n;i++){
           System.out.print("Choose s:Students,e:Employee: ");
           char ch=in.next().charAt(0);
           if(ch=='s'){
               System.out.println("Enter name,gender,date(day,month,year),Unvirsity,Collage,Debartment: ");
               persons[i]=new Student(in.next(),in.next(),Date.input(),in.next(),in.next(), in.next());
           }else if(ch=='e'){
               System.out.println("Enter name,gender,date(day,month,year),dateStart,salary: ");
               persons[i]=new Employee(in.next(),in.next(),Date.input(),Date.input(), in.nextInt());
           }
       }
       for (int i=0;i<n;i++){
           persons[i].print();
       }
*/
    }}