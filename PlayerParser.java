public class PlayerParser{
    public static PlayerEntity parseNewPlayer(String lineToParse){
        String[] words = lineToParse.split("/");
        PlayerEntity returnobj = null;
        char ch = lineToParse.charAt(0);
        ch = Character.toUpperCase(ch);
        if( ch == 'F'){
            boolean isr = false;
            if(words[6].equals("Range")){
                isr = true;
            }
            Fighter fa = new Fighter(Double.parseDouble(words[1]), words[2], Integer.parseInt(words[3]), Integer.parseInt(words[4]), words[5], isr);
            returnobj = fa;
        }
        else{
            Mage ma = new Mage(Double.parseDouble(words[1]), words[2], Integer.parseInt(words[3]), Integer.parseInt(words[4]), words[5], Double.parseDouble(words[6]));
            returnobj = ma;
        }
        return returnobj;
    }
}
