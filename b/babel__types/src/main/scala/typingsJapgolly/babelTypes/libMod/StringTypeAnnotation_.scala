package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.StringTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType
     with Node {
  
  @JSName("type")
  var type_StringTypeAnnotation_ : StringTypeAnnotation
}
object StringTypeAnnotation_ {
  
  inline def apply(): StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[StringTypeAnnotation_]
  }
  
  extension [Self <: StringTypeAnnotation_](x: Self) {
    
    inline def setType(value: StringTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
