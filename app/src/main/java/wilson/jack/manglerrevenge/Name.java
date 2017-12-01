package wilson.jack.manglerrevenge;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Name {
    private Random mRandomizer;
    private List<String> mNiceNameList = Arrays.asList("Awesome", "TwoShoes", "Wilson", "Super", "Cool");
    private List<String> mRudeNameList = Arrays.asList("Bad", "Evil", "Silly", "Ugly", "Stupid");

    public Name(){
        mRandomizer = new Random();
    }

    public String getRudeName() {
        String random = mNiceNameList.get(mRandomizer.nextInt(mNiceNameList.size()));
        return random;
    }

    public String getNiceName() {
        String random = mRudeNameList.get(mRandomizer.nextInt(mRudeNameList.size()));
        return random;
    }
}
