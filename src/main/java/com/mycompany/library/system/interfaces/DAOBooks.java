package com.mycompany.library.system.interfaces;

import com.mycompany.library.system.models.Books;
import java.util.List;

public interface DAOBooks {
    public void registrar(Books user) throws Exception;
    public void modificar(Books user) throws Exception;
    public void sancionar(Books user) throws Exception;
    public void eliminar(Books user) throws Exception;
    public List<Books> listar() throws Exception;    
}
