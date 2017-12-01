package wilson.jack.manglerrevenge;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wilson.jack.manglerrevenge.databinding.NiceFragmentBinding;

public class MangleNiceFragment extends Fragment {

        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            //View v = inflater.inflate(R.layout.nice_fragment, container, false);
            //return v;
            String pass = getArguments().getString("firstName");

            NiceFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.nice_fragment, container, false);
            binding.setViewModel(new NameViewModel(pass));
            return binding.getRoot();
        }
}
