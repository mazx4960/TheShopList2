package com.example.theshoplist.SQL;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "ItemsDB")
public class Item {
    @PrimaryKey(autoGenerate = true)
    public int rowId;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "month")
    public String month;


    public Item(String name, String type, String month) {
        this.name = name;
        this.type = type;
        this.month = month;
    }


}
