public class Hospital extends Building{
    String name;
    int numberBed;
    int numberSection;

    public Hospital(int numberBuild, int numberFloor, float area, boolean islift,String name, int numberBed, int numberSection) {
        super(numberBuild, numberFloor, area, islift);
        this.name=name;
        this.numberBed = numberBed;
        this.numberSection = numberSection;
    }

    public void print() {
        System.out.println("Number Build: "+numberBuild);
        System.out.println("Number Floor: "+numberFloor);
        System.out.println("area: "+area);
        if(islift)
            System.out.println("is found lift");
        else
            System.out.println("is not found lift");
        System.out.println("name hospital:"+name);
        System.out.println("numberBed:"+numberBed);
        System.out.println("numberSection:"+numberSection);
    }
}
