//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
       //Register Dictionary
        Dictionary<String, Integer> registerDict = new Hashtable<>();
        registerDict.put("$zero", 0);
        registerDict.put("$at", 1);
        registerDict.put("$v0", 2);
        registerDict.put("$v1", 3);
        registerDict.put("$a0", 4);
        registerDict.put("$a1", 5);
        registerDict.put("$a2", 6);
        registerDict.put("$a3", 7);
        registerDict.put("$t0", 8);
        registerDict.put("$t1", 9);
        registerDict.put("$t2", 10);
        registerDict.put("$t3", 11);
        registerDict.put("$t4", 12);
        registerDict.put("$t5", 13);
        registerDict.put("$t6", 14);
        registerDict.put("$t7", 15);
        registerDict.put("$s0", 16);
        registerDict.put("$s1", 17);
        registerDict.put("$s2", 18);
        registerDict.put("$s3", 19);
        registerDict.put("$s4", 20);
        registerDict.put("$s5", 21);
        registerDict.put("$s6", 22);
        registerDict.put("$s7", 23);
        registerDict.put("$t8", 24);
        registerDict.put("$t9", 25);
        registerDict.put("$k0", 26);
        registerDict.put("$k1", 27);
        registerDict.put("$gp", 28);
        registerDict.put("$sp", 29);
        registerDict.put("$fp", 30);
        registerDict.put("$ra", 31);

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