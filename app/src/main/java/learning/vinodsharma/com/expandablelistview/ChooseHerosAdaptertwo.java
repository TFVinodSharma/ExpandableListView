package learning.vinodsharma.com.expandablelistview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/*
public class ChooseHerosAdaptertwo {
}
*/
public class ChooseHerosAdaptertwo extends RecyclerView.Adapter<ChooseHerosAdaptertwo.MyViewHolder> {


    private  int logos[];

    public  ChooseHerosAdaptertwo(int[] logos)
    {

        this.logos = logos;

    }

    @NonNull
    @Override
    public ChooseHerosAdaptertwo.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.shiffo, viewGroup, false);
        MyViewHolder imageviewHolder= new MyViewHolder(view);
        return imageviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChooseHerosAdaptertwo.MyViewHolder myViewHolder, int position) {
        int imageid=logos[position];
        myViewHolder.BadgesImageView.setImageResource(imageid);
    }

    @Override
    public int getItemCount() {
        return logos.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView BadgesImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            BadgesImageView=itemView.findViewById(R.id.myImageView);
        }
    }
}
