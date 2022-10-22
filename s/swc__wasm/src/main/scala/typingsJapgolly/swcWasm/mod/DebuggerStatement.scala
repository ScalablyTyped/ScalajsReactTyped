package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement: typingsJapgolly.swcWasm.swcWasmStrings.DebuggerStatement
}
object DebuggerStatement {
  
  inline def apply(span: Span): DebuggerStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[DebuggerStatement]
  }
  
  extension [Self <: DebuggerStatement](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
