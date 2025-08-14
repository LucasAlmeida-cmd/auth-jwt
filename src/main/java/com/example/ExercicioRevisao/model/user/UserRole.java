package com.example.ExercicioRevisao.model.user;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    @Override
    public String toString() {
        return name(); // Retorna "ADMIN" ou "USER"
    }
}
