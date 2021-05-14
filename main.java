/** Isaac Angle
 * This program will read in a php file and parse the data.
 * After that the program will split the file into tokens and variables and then
 * write out what the tokens are, in english, and what the variables are.
 * all in all, there will be two files that are written out, one will hold the tokens and the other will hold the variables
 * 05/13/2021 CSCD 420
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {

    //the list of variables contained in the php code
    private static List<String> variables = new ArrayList<>();

    public static void main(String[] args){
        run();
    }

    private static List<String> readFile(){ return null; }

    /**
     *
     * @return a temporary hashmap containing php tokens
     */
    private static HashMap<String, String> initializeTokenMap(){
        HashMap<String,String> temp = new HashMap<>();

        temp.put("(","openparen");
        temp.put(")","closedparen");
        temp.put("{","opencurly");
        temp.put("}","closedcurly");
        temp.put("[","openbracket");
        temp.put("]","closebracket");
        temp.put("->","skinnyarrow");
        temp.put("=>","fatarrow");
        temp.put(";","semicolon");
        temp.put(":","colon");
        temp.put("","doublequote");
        temp.put("'","singlequote");

        temp.put("for","for");
        temp.put("endfor","endfor");
        temp.put("foreach","foreach");
        temp.put("as","as");
        temp.put("do","do");
        temp.put("while","while");
        temp.put("endwhile","endwhile");
        temp.put("break","break");
        temp.put("continue","continue");
        temp.put("=","assign");

        temp.put("==","relop");
        temp.put("<","relop");
        temp.put(">","relop");
        temp.put("!=","relop");
        temp.put("<=","relop");
        temp.put(">=","relop");
        temp.put("<=>","relop");
        temp.put("===","relop");
        temp.put("!==","relop");

        temp.put("+","arithop");
        temp.put("-","arithop");
        temp.put("*","arithop");
        temp.put("/","arithop");
        temp.put("%","arithop");
        temp.put("++","arithop");
        temp.put("--","arithop");

        temp.put("+=","arithassign");
        temp.put("-=","arithassign");
        temp.put("*=","arithassign");
        temp.put("/=","arithassign");
        temp.put("%=","arithassign");

        temp.put("&&","logicalop");
        temp.put("and","logicalop");
        temp.put("||","logicalop");
        temp.put("or","logicalop");
        temp.put("xor","logicalop");
        temp.put("!","logicalop");

        return temp;
    }

    /**
     *
     * @return a temporary hashmap that is filled with php attributes
     */
    private static HashMap<String,String> initializeAttributeMap(){
        HashMap<String,String> temp = new HashMap<>();

        temp.put("==","EQ");
        temp.put("<","LT");
        temp.put(">","GT");
        temp.put("!=","NE");
        temp.put("<=","Le");
        temp.put(">=","GE");
        temp.put("<=>","VADER");
        temp.put("===","IDENTICAL");
        temp.put("!==","NOTIDENTICAL");
        temp.put("+","ADD");
        temp.put("-","SUB");
        temp.put("*","MUL");
        temp.put("/","DIV");
        temp.put("%","MOD");
        temp.put("++","AUTOADD");
        temp.put("--","AUTOSUB");
        temp.put("+=","ADD");
        temp.put("-=","SUB");
        temp.put("*=","MUL");
        temp.put("/=","DIV");
        temp.put("%=","MOD");
        temp.put("&&","AND");
        temp.put("and","AND");
        temp.put("||","OR");
        temp.put("or","OR");
        temp.put("xor","XOR");
        temp.put("!","NOT");

        return temp;
    }

    /**
     * the method that runs the program
     */
    private static void run(){

        HashMap tokens = initializeTokenMap();

        HashMap attributes = initializeAttributeMap();

        variables.add("$hello");
        variables.add("$setup");
        variables.add("$cool");

        for(int i = 0; i < variables.size(); i++){
            System.out.println("<" + variables.get(i) + " " + i + ">");
        }
    }

}
