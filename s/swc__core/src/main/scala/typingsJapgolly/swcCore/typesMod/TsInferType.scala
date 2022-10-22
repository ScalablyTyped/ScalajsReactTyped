package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsInferType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeParam: TsTypeParameter
  
  @JSName("type")
  var type_TsInferType: typingsJapgolly.swcCore.swcCoreStrings.TsInferType
}
object TsInferType {
  
  inline def apply(span: Span, typeParam: TsTypeParameter): TsInferType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInferType")
    __obj.asInstanceOf[TsInferType]
  }
  
  extension [Self <: TsInferType](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsInferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParam(value: TsTypeParameter): Self = StObject.set(x, "typeParam", value.asInstanceOf[js.Any])
  }
}
