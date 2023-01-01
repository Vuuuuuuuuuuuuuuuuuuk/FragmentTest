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

public class Frag1 extends Fragment implements View.OnClickListener {
  TextView tvOut;
  Button ba, bb;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.frag1, container, false);
  }

  @Override
  public void onStart() {
    super.onStart();

    tvOut = getActivity().findViewById(R.id.tvOut);

    ba = getActivity().findViewById(R.id.ba);
    bb = getActivity().findViewById(R.id.bb);

    ba.setOnClickListener(this);
    bb.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()){
      case R.id.ba:
        tvOut.setText(tvOut.getText().toString()+"a");
        break;
      case R.id.bb:
        tvOut.setText(tvOut.getText().toString()+"b");
        break;
    }
  }
}
