public class Lamp {
    private boolean isOn;

    public Lamp(){
        this.isOn = false;
    }

    public void toggleLamp(){
        if (this.isOn == false){
            this.isOn = true;
            System.out.println("The lamp is now ON");

        }else{
            this.isOn = false;
            System.out.print("The lamp is now OFF");
        }
    }

    public boolean gteIsOn(){
        return this.isOn;
    }


}
