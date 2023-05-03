public class arrays {
    public static void main(String[] args){
        //Datatype[] variable_name = new datatype[size];
        int[] rol; // Here the Array is being declared
        rol = new int[5]; // Initialization: here is object is created in the memory
        // Indexing basically mean position of data in the array

        //  Array can written in two ways:

        String[] goodsubjects = new String[3];
        goodsubjects[0] = "Physics";
        goodsubjects[1] = "Mathematics";
        goodsubjects[3] =  "Chemistry";
        System.out.println(goodsubjects[1]);

        //Second way
        String[] badsubjects = {"Geography", "History", "Literature"};
        System.out.println(badsubjects[1]);






    }
}