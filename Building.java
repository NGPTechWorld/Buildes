public abstract class Building {
    int numberBuild;
    int numberFloor;
    float area;
    boolean islift;

    public Building(int numberBuild, int numberFloor, float area, boolean islift) {
        this.numberBuild = numberBuild;
        this.numberFloor = numberFloor;
        this.area = area;
        this.islift = islift;
    }



    public abstract void print();
}
