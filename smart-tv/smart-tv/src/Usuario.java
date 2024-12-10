public class Usuario{
    public static void main(String[] args) throws Exception {
        System.out.println("Usando um objeto TV");
        SmartTV tv = new SmartTV();
        System.out.println("TV ligada="+tv.ligada);
        System.out.println("TV Canal="+tv.canal);
        System.out.println("TV Volume="+tv.volume);

        tv.ligar();
        System.out.println("TV ligada="+tv.ligada);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        tv.diminuirVolume();
        tv.trocarCanal(33);

        tv.verificarStatus();
        

    }
}
