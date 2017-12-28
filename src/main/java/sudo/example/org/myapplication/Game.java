package sudo.example.org.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by cr7 on 22/12/17.
 */

public class Game extends Activity{

    private static final String TAG="Sudoku";

    private static final String KEY_DIFFICULTY="sudo.example.org.difficulty";
    private static final int DIFFICULTY_EASY=0;
    private static final int DIFFICULTY_MEDIUM=1;
    private static final int DIFFICULTY_HARD=2;

    private int puzzle[];

    private PuzzleView puzzleView;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");

        int diff = getIntent().getIntExtra(KEY_DIFFICULTY,DIFFICULTY_EASY);
        puzzle=getPuzzle(diff);
        puzzleView.requestFocus();
    }
}
