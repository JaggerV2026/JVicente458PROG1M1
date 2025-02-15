//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Commenting this out for testing purposes
        //String MipsArguments = args[0];
        //Test argument
        String mipsArguments = "add $t2, $s6, $s4";
        String regex = "[\s]";
        String commasRemoved = mipsArguments.replace(",", "");
        String[] argArray = commasRemoved.split(regex);
        
    }
}