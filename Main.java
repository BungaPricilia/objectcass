package JavaFundamentall;
class Hewan{
    public void suara(){
        System.out.println("Hewan dapat mengeluarkan suara");
    }
}

public class Main extends Hewan{
    @Override
    public void suara (){
        System.out.println("Meringkik");
    }
    
    public static void main(String [] args){
        Main Kuda = new Main();
        Kuda.suara();
        
    }
    
}
