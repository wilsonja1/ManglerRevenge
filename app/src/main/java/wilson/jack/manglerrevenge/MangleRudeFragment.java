package wilson.jack.manglerrevenge;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wilson.jack.manglerrevenge.databinding.RudeFragmentBinding;

public class MangleRudeFragment extends Fragment {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String pass = getArguments().getString("firstName");

        RudeFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.rude_fragment, container, false);
        binding.setViewModel(new NameViewModel(pass));
        return binding.getRoot();
    }
}
