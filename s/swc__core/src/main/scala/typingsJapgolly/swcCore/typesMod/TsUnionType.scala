package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsUnionType
  extends StObject
     with Node
     with HasSpan
     with TsUnionOrIntersectionType {
  
  @JSName("type")
  var type_TsUnionType: typingsJapgolly.swcCore.swcCoreStrings.TsUnionType
  
  var types: js.Array[TsType]
}
object TsUnionType {
  
  inline def apply(span: Span, types: js.Array[TsType]): TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[TsUnionType]
  }
  
  extension [Self <: TsUnionType](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TsType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TsType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
