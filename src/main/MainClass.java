package main;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import main.model.Gender;
import main.model.Personne;
import com.fasterxml.jackson.databind.ObjectMapper;





public class MainClass {
    public static void main(String[] args) throws JsonProcessingException {
        Personne personne
                = new Personne(
                        1L,
                "Arar",
                "Taha"
                ,24,
                "Cite 987 Lots",
                Gender.MALE,
                "06543234567");

        /**
         * Convert object into String Json file
         * **/
        Gson gson= new Gson();
        String json = gson.toJson(personne);
        System.out.println(json);
        System.out.println("------------------------------");
        /**
         * Convert Json file into Object
         * **/
        Personne p1 = gson.fromJson(json, Personne.class);
        System.out.println(p1);

        System.out.println("___*****___ Now with Jackson__******____");
        ObjectMapper objectMapper= new ObjectMapper();
        /**
         * Convert object into String Json file
         * **/

        String jsonOne = objectMapper.writeValueAsString(personne);
        System.out.println(jsonOne);
        System.out.println("------------------------------");
        /**
         * Convert Json file into Object
         * **/
        Personne p2 = objectMapper.readValue(jsonOne, Personne.class);
        System.out.println(p2);


    }
}
