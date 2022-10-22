package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var argument: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_ReturnStatement: typingsJapgolly.swcCore.swcCoreStrings.ReturnStatement
}
object ReturnStatement {
  
  inline def apply(span: Span): ReturnStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement]
  }
  
  extension [Self <: ReturnStatement](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
