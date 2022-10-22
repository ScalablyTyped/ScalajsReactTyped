package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsGetterSignature
  extends StObject
     with Node
     with HasSpan
     with TsTypeElement {
  
  var computed: Boolean
  
  var key: Expression
  
  var optional: Boolean
  
  var readonly: Boolean
  
  var typeAnnotation: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  @JSName("type")
  var type_TsGetterSignature: typingsJapgolly.swcCore.swcCoreStrings.TsGetterSignature
}
object TsGetterSignature {
  
  inline def apply(computed: Boolean, key: Expression, optional: Boolean, readonly: Boolean, span: Span): TsGetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsGetterSignature")
    __obj.asInstanceOf[TsGetterSignature]
  }
  
  extension [Self <: TsGetterSignature](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsGetterSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
