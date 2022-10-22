package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsArrayType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var elemType: TsType
  
  @JSName("type")
  var type_TsArrayType: typingsJapgolly.swcCore.swcCoreStrings.TsArrayType
}
object TsArrayType {
  
  inline def apply(elemType: TsType, span: Span): TsArrayType = {
    val __obj = js.Dynamic.literal(elemType = elemType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsArrayType")
    __obj.asInstanceOf[TsArrayType]
  }
  
  extension [Self <: TsArrayType](x: Self) {
    
    inline def setElemType(value: TsType): Self = StObject.set(x, "elemType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
