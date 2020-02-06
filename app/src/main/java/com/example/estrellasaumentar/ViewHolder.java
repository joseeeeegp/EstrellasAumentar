package com.example.estrellasaumentar;
import android.view.View;
import android.widget.RatingBar;

class ViewHolder {
    RatingBar estrellas=null;
    ViewHolder(View base) {
        this.estrellas=(RatingBar)base.findViewById(R.id.estrellitas);
    }
}