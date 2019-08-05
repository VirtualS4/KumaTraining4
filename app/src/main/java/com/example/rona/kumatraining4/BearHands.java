package com.example.rona.kumatraining4;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog; import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
public class BearHands extends ArrayAdapter<Bear> {
    List<Bear> bearList;
    Context context;
    int resource;

    public BearHands(Context context, int resource, List<Bear> bearList) {
        super(context, resource, bearList);
        this.context = context;
        this.resource = resource;
        this.bearList = bearList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewTeam = view.findViewById(R.id.textViewTeam);
        Button buttonDelete = view.findViewById(R.id.buttonDelete);
        Bear bear = bearList.get(position);
        imageView.setImageDrawable(context.getResources().getDrawable(bear.getImage()));
        textViewName.setText(bear.getName());
        textViewTeam.setText(bear.getTeam());

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                removeBear(position);
            }
        });
                return view;
        }

        private void removeBear(final int position) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Are you sure you want to delete this?");
            builder.setPositiveButton("Yes", new
                    DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            bearList.remove(position);
                            notifyDataSetChanged();
                        }
                    });
            builder.setNegativeButton("No", new
                    DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                        }
                    });
            AlertDialog alertDialog = builder.create(); alertDialog.show();
        }
    }








