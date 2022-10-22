package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsRestType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsRestType: typingsJapgolly.swcCore.swcCoreStrings.TsRestType
}
object TsRestType {
  
  inline def apply(span: Span, typeAnnotation: TsType): TsRestType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsRestType")
    __obj.asInstanceOf[TsRestType]
  }
  
  extension [Self <: TsRestType](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
