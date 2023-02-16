package transport;

public enum BusCapacity {
    busEspeciallySmall(null, 10),

    busSmall(null,25),

    busAverage(25,50),

    busBig(50,80),

    busExtraLarge(80,120);

    private Integer minCapacity;
    private Integer maxCapacity;

    BusCapacity(Integer minCapacity, Integer maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }


    @Override
    public String toString() {
        if(minCapacity==null){
            return "Вместимость до " + maxCapacity +
                    ", верхняя границ вместимоси ";
        }
        return "Вместимость от " + minCapacity +
                ", до "+ maxCapacity ;
    }

}
