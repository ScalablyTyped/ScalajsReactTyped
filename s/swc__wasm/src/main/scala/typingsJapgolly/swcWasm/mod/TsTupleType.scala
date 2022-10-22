package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTupleType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var elemTypes: js.Array[TsTupleElement]
  
  @JSName("type")
  var type_TsTupleType: typingsJapgolly.swcWasm.swcWasmStrings.TsTupleType
}
object TsTupleType {
  
  inline def apply(elemTypes: js.Array[TsTupleElement], span: Span): TsTupleType = {
    val __obj = js.Dynamic.literal(elemTypes = elemTypes.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTupleType")
    __obj.asInstanceOf[TsTupleType]
  }
  
  extension [Self <: TsTupleType](x: Self) {
    
    inline def setElemTypes(value: js.Array[TsTupleElement]): Self = StObject.set(x, "elemTypes", value.asInstanceOf[js.Any])
    
    inline def setElemTypesVarargs(value: TsTupleElement*): Self = StObject.set(x, "elemTypes", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.TsTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
