package wilson.jack.manglerrevenge;

import java.util.List;
import java.util.Random;

public class NameViewModel {
    private Random mRandomizer;
    private Name mName;

    public NameViewModel(String name) {
        mRandomizer = new Random();
        mName = new Name(name);
    }

    public String getNiceName(){
        List<String> mNameList = mName.getNiceNameList();
        String random = mNameList.get(mRandomizer.nextInt(mNameList.size()));
        return mName.getFirstName() + " " + random;
    }

    public String getRudeName(){
        List<String> mNameList = mName.getRudeNameList();
        String random = mNameList.get(mRandomizer.nextInt(mNameList.size()));
        return mName.getFirstName() + " " + random;
    }
}
