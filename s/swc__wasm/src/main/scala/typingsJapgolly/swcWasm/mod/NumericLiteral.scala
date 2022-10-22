package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal
     with PropertyName
     with TsLiteral {
  
  var raw: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_NumericLiteral: typingsJapgolly.swcWasm.swcWasmStrings.NumericLiteral
  
  var value: Double
}
object NumericLiteral {
  
  inline def apply(span: Span, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[NumericLiteral]
  }
  
  extension [Self <: NumericLiteral](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
