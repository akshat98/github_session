package sudo.example.org.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Px;
import android.view.ContextThemeWrapper;
import android.view.View;

/**
 * Created by cr7 on 21/12/17.
 */

public class Graphics extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this));
    }

    static public class GraphicsView extends View{

        public GraphicsView(Context context){
            super(context);
        }
    }

    /*@Override
    protected void onDraw(Canvas canvas){

        Paint cPaint=new Paint();
        cPaint.setColor(Color.LTGRAY);
       Path circle=new Path();
        circle.addCircle(150,150,100, Path.Direction.CW);
        canvas.drawPath(circle,cPaint);
        canvas.drawTextOnPath("hi there",circle,0,30,cPaint);
    }*/
}
