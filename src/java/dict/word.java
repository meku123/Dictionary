/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict;

import java.util.List;

/**
 *
 * @author Michael
 */
public class word {
    
    String name;
    List<Definition> definitions;
    public word(String name,List<Definition> definitions)
    {
        this.name=name;
        this.definitions=definitions;
    }
    
}

class Definition
{
    String type;
    String definition;
    Definition(String type,String definition)
    {
        this.type=type;
        this.definition=definition;
    }
}
