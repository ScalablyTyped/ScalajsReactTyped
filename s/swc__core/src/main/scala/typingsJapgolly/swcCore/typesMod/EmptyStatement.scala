package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyStatement
  extends StObject
     with Node
     with HasSpan
     with ClassMember
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement: typingsJapgolly.swcCore.swcCoreStrings.EmptyStatement
}
object EmptyStatement {
  
  inline def apply(span: Span): EmptyStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[EmptyStatement]
  }
  
  extension [Self <: EmptyStatement](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
