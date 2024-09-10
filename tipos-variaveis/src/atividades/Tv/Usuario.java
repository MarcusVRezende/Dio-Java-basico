package atividades.Tv;

public class Usuario {

    public static void main (String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.err.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(9);
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
    
    }
}
