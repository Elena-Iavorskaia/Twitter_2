import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import javax.net.ssl.SSLEngineResult;
import java.util.List;

public class Twitter {
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cf = new ConfigurationBuilder();
        cf.setDebugEnabled(true)
                .setOAuthConsumerKey("uX5rvWOiUtSu5dKLQ0Icu3PZ1")
                .setOAuthConsumerSecret("GJNoXDCszA7ao5WYUCbsRSa2q0hboFE3gwjvgiJ4bBvBolr6z8")
                .setOAuthAccessToken(	"999928299269869568-DGP5zvggpdNkWs09ESO5LbNtR83xlvt")
                .setOAuthAccessTokenSecret("ct1RJ0HvE22J8v10NLdptIgQSuPuFwV7bClMre3tYkhTu");

        TwitterFactory tf = new TwitterFactory(cf.build());
        twitter4j.Twitter twitter = tf.getInstance();
        List<Status> status = twitter.getHomeTimeline();
for (Status st: status){

    System.out.println(st.getUser().getName()+"---------"+st.getText());
}

    }
}
