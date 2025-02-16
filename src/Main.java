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

        int bitString = 0; //Bits to convert to hex
        String hexArgument = ""; //Arguments represented with hex
        int convertedHex = 0;
        String hexReturn = ""; //Hex argument to print at end

        //J Format. j
        if(argArray.length == 2){
            bitString = 2; //000010
            hexArgument = argArray[1].substring(2);
            convertedHex = Integer.parseInt(hexArgument, 16);
            bitString = (bitString << 26) | convertedHex;

        }

        //Could be one line, but might be useful later
        hexReturn = String.format("%08x", bitString);
        System.out.println(hexReturn);
    }
}