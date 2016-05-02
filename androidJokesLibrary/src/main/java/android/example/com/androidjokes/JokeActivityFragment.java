package android.example.com.androidjokes;

        import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    private static String LOG_TAG = JokeActivityFragment.class.getSimpleName();

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeActivity.TAG_JOKE);
        TextView jokeTextView = (TextView) rootView.findViewById(R.id.joke_textView);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
        return rootView;
    }
}
