package com.sparta.rp.jdbc;

public interface SQLQueries {
    String SELECT_ALL = "Select * from public.user_db ORDER BY id ASC";
    String  INSERT_INTO_DB = "INSERT INTO public.user_db (id, name, email) VALUES (?,?,?)";
    String  UPDATE_NAME = "UPDATE public.user_db SET name = ? , email = ?  WHERE id = ?";
    String DELETE_USER = "DELETE FROM public.user_db WHERE id = ?";
}
