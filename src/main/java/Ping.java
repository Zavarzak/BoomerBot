import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Ping extends ModuleBase {
    public Ping(MessageReceivedEvent event) {
        super(event);
    }

    public void process() {
        channel.sendMessage("Pong " + event.getJDA().getPing()).queue();
    }
}
