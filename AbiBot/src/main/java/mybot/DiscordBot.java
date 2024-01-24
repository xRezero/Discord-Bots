package mybot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;



public class DiscordBot {

        public static void main(String[] args) throws Exception{

            String prifix = "!";
            String status = "ich Bin Da!!!";

            JDA jda = JDABuilder.createDefault("MTE5OTYyOTI5NjQyNDE5ODIwNQ.GF84WO.8FClL2_fHom7UFhOExGJEfASPVgswrnlalqf9w")
                    .build()
                    .awaitReady();

            jda.getPresence().setActivity(Activity.playing(status));


    }

}
