/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function()
{
  
    var define=function(word){        
             
        $.ajax({
            url:"dictionary",
            data:{"word":word},
            datatype:'json',
            type: 'GET',
            success:function(json)
            {              
                var s;                
                var word=JSON.parse(json);
                s="<h1>"+word.name+"</h1><dl>"; 
                var defs=word.definitions;
                if (defs.length==0)
                {               
                    s="Word not found in Dictionary. Please check the spelling";
                } 
                else
                {
                for(var i=0;i<defs.length;i++)
                {
                    var j=i+1;
                    s+="<dt>"+j+ "("+defs[i].type +")"+"</dt>"
                    s+="<dd>"+defs[i].definition+"</dd>";
                }
                s+="</dl>";
            }
            
                $("#definition div").remove();
                $("#definition").append("<div>"+s+"</div>");               
            }
        });
    };
    var word;
    $("#btn").click(function()
    {        
         word=$("#word").val();
         define(word);
    });
    
});

