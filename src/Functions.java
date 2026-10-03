public class Functions{
    public static int readInt(String prompt){
        while(true){
            String input = IO.readln(prompt).trim();

            if(input.isEmpty()){
                continue;
            }
            if(input.length() > 1){
                IO.println("Invalid input: must be single character");
                continue;
            }

            char c = input.charAt(0);

            if(!Character.isDigit(c)){
                IO.println("Invalid input: must be a number");
                continue;
            }

            return c-'0';
        }
    }
}
