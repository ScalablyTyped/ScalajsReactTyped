package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateName
  extends StObject
     with ExpressionBase
     with Expression {
  
  var id: Identifier
  
  @JSName("type")
  var type_PrivateName: typingsJapgolly.swcWasm.swcWasmStrings.PrivateName
}
object PrivateName {
  
  inline def apply(id: Identifier, span: Span): PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[PrivateName]
  }
  
  extension [Self <: PrivateName](x: Self) {
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.PrivateName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
