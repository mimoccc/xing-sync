package com.gurkensalat.android.xingsync.oauth;

import android.app.Fragment;

import com.googlecode.androidannotations.annotations.EFragment;
import com.gurkensalat.android.xingsync.R;

@EFragment(R.layout.fragment_oauth_secrets)
public class OAuthSecretsFragment extends Fragment
{
	// public OAuthSecretsFragment()
	// {
	// // Each Fragment needs and empty public constructor
	// }

	// @Override
	// public View onCreateView(LayoutInflater inflater, ViewGroup container,
	// Bundle savedInstanceState)
	// {
	// // Let's androidannotations handle view creation
	// return null;
	// }

	public void setText(String item)
	{
		// TextView view = (TextView)
		// getView().findViewById(R.id.oauth_token_secret);
		// view.setText(item);
	}
}
