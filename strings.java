public class strings {
    public static void main(String args[]) {

        // ye humne string ke kuch methods ko demonstrate karne ke liye likha hai
        String name = "Sumit Kumar";

        // ye wala method string ko print karega
        System.out.println(name);

        // ye wala method string ke length ko print karega
        System.out.println(name.length());

        // ye wala method se string uppercase me convert ho jayega aur print hoga
        System.out.println(name.toUpperCase());

        // ye wala method se string lowercase me convert ho jayega aur print hoga
        System.out.println(name.toLowerCase());

        // ye wala method batata hai ki string me koi specific character ya substring hai ya nahi
        System.out.println(name.substring(0, 5));

        // ye wala method string me se specific character ko replace karega aur print karega
        System.out.println(name.replace("Sumit", "John"));

        // isse pta chalta h ki kya ye char is letter string ke start me hai ya nahi
        System.out.println(name.startsWith("S"));

        // isse pta chalta h ki kya ye char is letter string ke end me hai ya nahi
        System.out.println(name.endsWith("r"));

        // ye wala method jo charAt h usse string ke specific index ka character print karega
        System.out.println(name.charAt(0));

        // ye jo indexOf wala method h usse string me se specific character ka index print karega
        System.out.println(name.indexOf("Kumar"));

        // concat method se hum string ko concatenate kar sakte h
        System.out.println(name.concat(" is a good boy"));

        // concatenation 
        String firstName = "Sumit";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // charAt
        for(int i = 0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }

        // compare
        String name1 = "Sumit";
        String name2 = "Kumar"; 

        // isse hum compare karenge ki dono strings same h ya nahi
        //1 string1 > string2 = 1 : or ye chae se decide hoga ki kon sa string bada h aur konsa chota h, na ki length ke hisab se

        //2 string1 < string2 = -1
        //3 string1 = string2 = 0

        if(name1.compareTo(name2) == 0){
            System.out.println("Both strings are equal");
        } else if(name1.compareTo(name2) > 0){
            System.out.println("string1 is greater than string2");
        } else {
            System.out.println("string1 is less than string2");
        } 

    }
}
