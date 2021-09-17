public class CommandLineSum {


    public static void main(String[] args) {
        int add = 10;
        System.out.println("Addition of commandline argument");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
            add = add + Integer.parseInt(args[i]);
        }
        System.out.println("Sum :" + add);
    }}
