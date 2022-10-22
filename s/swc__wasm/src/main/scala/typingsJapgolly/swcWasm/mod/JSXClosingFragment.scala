package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingFragment
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_JSXClosingFragment: typingsJapgolly.swcWasm.swcWasmStrings.JSXClosingFragment
}
object JSXClosingFragment {
  
  inline def apply(span: Span): JSXClosingFragment = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[JSXClosingFragment]
  }
  
  extension [Self <: JSXClosingFragment](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
