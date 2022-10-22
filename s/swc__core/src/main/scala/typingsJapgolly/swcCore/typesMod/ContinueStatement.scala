package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var label: js.UndefOr[Identifier] = js.undefined
  
  @JSName("type")
  var type_ContinueStatement: typingsJapgolly.swcCore.swcCoreStrings.ContinueStatement
}
object ContinueStatement {
  
  inline def apply(span: Span): ContinueStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement]
  }
  
  extension [Self <: ContinueStatement](x: Self) {
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
