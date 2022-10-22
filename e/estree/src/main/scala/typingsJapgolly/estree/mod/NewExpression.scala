package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewExpression
  extends StObject
     with BaseCallExpression
     with CallExpression {
  
  @JSName("type")
  var type_NewExpression: typingsJapgolly.estree.estreeStrings.NewExpression
}
object NewExpression {
  
  inline def apply(arguments: js.Array[Expression | SpreadElement], callee: Expression | Super): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[NewExpression]
  }
  
  extension [Self <: NewExpression](x: Self) {
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
