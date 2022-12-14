package ru.samsung.itschool.mdev.roomvsfragment.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task")
    Flowable<List<Task>> getAll();

    @Insert
    void insert(Task t);

    @Delete
    void delete(Task t);

    @Update
    void update(Task t);

}