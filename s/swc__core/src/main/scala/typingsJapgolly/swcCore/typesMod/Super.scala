package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_Super: typingsJapgolly.swcCore.swcCoreStrings.Super
}
object Super {
  
  inline def apply(span: Span): Super = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super]
  }
  
  extension [Self <: Super](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
