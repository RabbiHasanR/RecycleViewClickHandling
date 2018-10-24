package com.example.diu.recyclerviewclickhandling;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

public class ColorUtils {

    /**
     * This method returns the appropriate shade of green to form the gradient
     * seen in the list, based off of the order in which the
     * {@link com.example.diu.recyclerviewclickhandling.NumberAdapter.NumberViewHolder}
     * instance was created.
     *
     * This method is used to show how ViewHolders are recycled in a RecyclerView.
     * At first, the colors will form a nice, consistent gradient. As the
     * RecyclerView is scrolled, the
     * {@link com.example.diu.recyclerviewclickhandling.NumberAdapter.NumberViewHolder}'s will be
     * recycled and the list will no longer appear as a consistent gradient.
     *
     * @param context     Context for getting colors
     * @param instanceNum Order in which the calling ViewHolder was created
     *
     * @return A shade of green based off of when the calling ViewHolder
     * was created.
     */
    public static int getViewHolderBackgroundColorFromInstance(Context context, int instanceNum) {
        switch (instanceNum) {
            case 0:
                return ContextCompat.getColor(context, R.color.material50Green);
            case 1:
                return ContextCompat.getColor(context, R.color.material100Green);
            case 2:
                return ContextCompat.getColor(context, R.color.material150Green);
            case 3:
                return ContextCompat.getColor(context, R.color.material200Green);
            case 4:
                return ContextCompat.getColor(context, R.color.material250Green);
            case 5:
                return ContextCompat.getColor(context, R.color.material300Green);
            case 6:
                return ContextCompat.getColor(context, R.color.material350Green);
            case 7:
                return ContextCompat.getColor(context, R.color.material400Green);
            case 8:
                return ContextCompat.getColor(context, R.color.material450Green);
            case 9:
                return ContextCompat.getColor(context, R.color.material500Green);
            case 10:
                return ContextCompat.getColor(context, R.color.material550Green);
            case 11:
                return ContextCompat.getColor(context, R.color.material600Green);
            case 12:
                return ContextCompat.getColor(context, R.color.material650Green);
            case 13:
                return ContextCompat.getColor(context, R.color.material700Green);
            case 14:
                return ContextCompat.getColor(context, R.color.material750Green);
            case 15:
                return ContextCompat.getColor(context, R.color.material800Green);
            case 16:
                return ContextCompat.getColor(context, R.color.material850Green);
            case 17:
                return ContextCompat.getColor(context, R.color.material900Green);

            default:
                return Color.WHITE;
        }
    }
}
