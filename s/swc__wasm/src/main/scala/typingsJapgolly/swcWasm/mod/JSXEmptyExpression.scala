package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.swcWasm.mod.JSXExpression because Already inherited */ trait JSXEmptyExpression
  extends StObject
     with Node
     with HasSpan
     with Expression {
  
  @JSName("type")
  var type_JSXEmptyExpression: typingsJapgolly.swcWasm.swcWasmStrings.JSXEmptyExpression
}
object JSXEmptyExpression {
  
  inline def apply(span: Span): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[JSXEmptyExpression]
  }
  
  extension [Self <: JSXEmptyExpression](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
