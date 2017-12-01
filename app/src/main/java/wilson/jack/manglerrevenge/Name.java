package wilson.jack.manglerrevenge;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Name {
    private String firstName;
    private List<String> mNiceNameList = Arrays.asList("Awesome", "TwoShoes", "Wilson", "Super", "Cool");
    private List<String> mRudeNameList = Arrays.asList("Bad", "Evil", "Silly", "Ugly", "Stupid");

    public Name(String name){
        firstName = name;
    }

    public List<String> getNiceNameList() {
        return mNiceNameList;
    }

    public List<String> getRudeNameList() {
        return mRudeNameList;
    }

    public String getFirstName() {
        return firstName;
    }
}
