package com.mycompany.library.system.interfaces;

import com.mycompany.library.system.models.Users;
import java.util.List;

public interface DAOUsers {
    public void registrar(Users user) throws Exception;
    public void modificar(Users user) throws Exception;
    public void sancionar(Users user) throws Exception;
    public void eliminar(Users user) throws Exception;
    public List<Users> listar() throws Exception;
}
