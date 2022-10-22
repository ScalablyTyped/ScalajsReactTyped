package typingsJapgolly.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression
  extends StObject
     with Expression
     with CoreExpression {
  
  var elements: js.Array[Expression]
  
  @JSName("type")
  var type_ArrayExpression: typingsJapgolly.jsep.jsepStrings.ArrayExpression
}
object ArrayExpression {
  
  inline def apply(elements: js.Array[Expression]): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[ArrayExpression]
  }
  
  extension [Self <: ArrayExpression](x: Self) {
    
    inline def setElements(value: js.Array[Expression]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: Expression*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.jsep.jsepStrings.ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
