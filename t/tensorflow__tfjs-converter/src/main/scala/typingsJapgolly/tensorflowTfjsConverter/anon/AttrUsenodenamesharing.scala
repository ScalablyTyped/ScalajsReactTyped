package typingsJapgolly.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrUsenodenamesharing extends StObject {
  
  var attr: Usenodenamesharing
  
  var input: js.Array[String]
  
  var name: String
  
  var op: String
}
object AttrUsenodenamesharing {
  
  inline def apply(attr: Usenodenamesharing, input: js.Array[String], name: String, op: String): AttrUsenodenamesharing = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrUsenodenamesharing]
  }
  
  extension [Self <: AttrUsenodenamesharing](x: Self) {
    
    inline def setAttr(value: Usenodenamesharing): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
