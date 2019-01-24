import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Help extends ModuleBase {
    public Help(MessageReceivedEvent event) {
        super(event);
    }

    public void process() {
        channel.sendMessage("List of available commands:\n!ping\n!help").queue();
    }
}
