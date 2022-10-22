package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrInputName extends StObject {
  
  var attr: Acdfunctioncontroloutput
  
  var input: js.Array[String]
  
  var name: String
  
  var op: String
}
object AttrInputName {
  
  inline def apply(attr: Acdfunctioncontroloutput, input: js.Array[String], name: String, op: String): AttrInputName = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrInputName]
  }
  
  extension [Self <: AttrInputName](x: Self) {
    
    inline def setAttr(value: Acdfunctioncontroloutput): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
