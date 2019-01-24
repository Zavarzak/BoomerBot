import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;

public class main {
    public static void main(String[] args) throws Exception {
        try{
            JDA api = new JDABuilder(AccountType.BOT).setToken("NTM3ODc5Njc0OTA3NTI1MTIy.DysBmA.COT5L7Kbuz-kAz8sCv7RixfDo04").build();
            api.addEventListener(new CommandHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
