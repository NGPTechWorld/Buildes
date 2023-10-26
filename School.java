public class School extends Building{
    String name;
    int numberCalsses;

    public School(int numberBuild, int numberFloor, float area, boolean islift, String name, int numberCalsses) {
        super(numberBuild, numberFloor, area, islift);
        this.name = name;
        this.numberCalsses = numberCalsses;
    }

    @Override
    public void print() {
        System.out.println("Number Build: "+numberBuild);
        System.out.println("Number Floor: "+numberFloor);
        System.out.println("area: "+area);
        if(islift)
            System.out.println("is found lift");
        else
            System.out.println("is not found lift");
        System.out.println("Name:"+name);
        System.out.println("number Classes:"+numberCalsses);
    }
}
