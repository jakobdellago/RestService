/**
 * Created by Kids on 5/29/2017.
 */
import javax.ws.rs.*;

@Path("socialNetwork")
public class socialNetwork {

    @GET
    @Produces("text/plain")
    public String Start(){
        return "Soziales Netzwerk:\n\n" +
                "Folgende Befehle sind moeglich:\n" +
                "Post: Postet etwas\n" +
                "Home: Deine Homeseite\n" +
                "{User}: {User}'s Profil\n";

    }

    @Path("Post")
    @GET
    @Produces("text/plain")
    public String User(){
        return "Dein Zeug wurde gepostet ";
    }

    @Path("Home")
    @GET
    @Produces("text/plain")
    public String Home(){
        return "Deine Posts: \n\n Noch NULL";
    }

    @Path("{user}")
    @GET
    @Produces("text/plain")
    public String Post(@PathParam("user") String user){
        return user + "'s Profil";
    }

    @Path("Freunde/{user}")
    @GET
    @Produces("application/json")
    public String Freunde(@PathParam("user") String user)
    {
        return user + "'s Freunde sind: {Hans}[Peter}{Georg}{Walter}";
    }



}
