package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  @JSName("type")
  var type_ThisExpression: typingsJapgolly.swcCore.swcCoreStrings.ThisExpression
}
object ThisExpression {
  
  inline def apply(span: Span): ThisExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression]
  }
  
  extension [Self <: ThisExpression](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
