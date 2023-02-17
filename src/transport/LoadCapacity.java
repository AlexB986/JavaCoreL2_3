package transport;

public enum LoadCapacity {
    N1(null,3.5f),
    N2(3.5f,12f),
    N3(12f,null);
    private Float minWeight;
    private Float maxWeight;
    LoadCapacity(Float minWeight,Float maxWeight){
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    @Override
    public String toString() {
        if(minWeight==null){
            return "Грузоподъемность до " + maxWeight +
                    ", верхняя границ грузоподъемности ";
        }
        return "Грузоподъемности более " + minWeight +
                ", нижняя границ грузоподъемности ";
    }
}
