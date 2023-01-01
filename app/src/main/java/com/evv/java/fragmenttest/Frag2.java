package com.evv.java.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment implements View.OnClickListener {
  TextView tvOut;
  Button bc;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.frag2, container, false);
  }

  @Override
  public void onStart() {
    super.onStart();

    tvOut = getActivity().findViewById(R.id.tvOut);

    bc = getActivity().findViewById(R.id.bc);

    bc.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()){
      case R.id.bc:
        tvOut.setText(tvOut.getText().toString()+"ccc");
        break;
    }
  }
}
