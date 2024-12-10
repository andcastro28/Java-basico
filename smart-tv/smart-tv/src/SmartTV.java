public class SmartTV{
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
            ligada=true;
            System.out.println("Smart TV ligada!");
    }
    
    public void desligar(){
            ligada=false;
            System.out.println("Smart TV desligada!");
    }
    
    public void aumentarVolume(){
        if(ligada && volume<100){
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Smart TV não está ligada ou já está no máximo de volume!");
        }
    }
    
    public void diminuirVolume(){
        if(ligada && volume>0){
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Smart TV não está ligada ou já está no mínimo de volume!");
        }
    }

    public void aumentarCanal(){
        if(ligada && canal<99){
            canal++;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Smart TV não está ligada ou já está no canal máximo!");
        }
    }
    
    public void diminuirCanal(){
        if(ligada && canal>1){
            canal--;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Smart TV não está ligada ou já está no canal mínimo!");
        }
    }
    
    public void trocarCanal(int canal){
        if(ligada){
            this.canal=canal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Smart TV não está ligada!");
        }
    }
    
    public void verificarStatus(){
        System.out.println("Status da Smart TV:");
        System.out.println("Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }


} 

