public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setBluetooth(true)
                .setWifi(true)
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(8)
                .setStorage(256)
                .build();

        System.out.println("Gaming PC:");
        gamingPC.showConfig();

        System.out.println("\nOffice PC:");
        officePC.showConfig();
    }
}