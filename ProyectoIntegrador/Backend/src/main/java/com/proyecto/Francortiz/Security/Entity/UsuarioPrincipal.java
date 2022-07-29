/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.Francortiz.Security.Entity;

import java.util.Collection;

/**
 *
 * @author tony
 */



public class UsuarioPrincipal implements UserDeils {
private String nombre;
private String nombreUsuario;
private String email;
private String password;
private Collection<? extends GrantedAuthority> authorities;
}
