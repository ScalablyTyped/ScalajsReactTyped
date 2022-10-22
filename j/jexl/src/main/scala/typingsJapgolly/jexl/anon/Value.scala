package typingsJapgolly.jexl.anon

import typingsJapgolly.jexl.astMod.Ast
import typingsJapgolly.jexl.jexlStrings.ArrayLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with Ast {
  
  var `type`: ArrayLiteral
  
  var value: js.Array[Ast]
}
object Value {
  
  inline def apply(value: js.Array[Ast]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayLiteral")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: ArrayLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Ast]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Ast*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
