package uebungen.kapitel8;

public class FalscheParameter extends Exception{

    public FalscheParameter(boolean ledersitz, String farbe){
        super("Die Parameterkombination Ledersitze "+ledersitz+" und Farbe "+farbe+" ist ungültig!");
    }
}
