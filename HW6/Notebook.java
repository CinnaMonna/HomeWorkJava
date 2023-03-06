public class Notebook {
    String ram;
    String hdd;
    String os;
    String color;
    
    public Notebook(String ram, String hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;

    }

    @Override
    public String toString() {
        return String.format("%s / %s / %s / %s", ram, hdd, os, color);
    }

    public void printDetail() {
        System.out.println(String.format("Объем ОЗУ: %s\nОбъем жесткого диска: %s\nОперационная система: %s\nЦвет: %s\n",
                            ram, hdd, os, color));
    }

    public String getRam() {
        return ram;
    }
    public String getHdd() {
        return hdd;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }
    
}
