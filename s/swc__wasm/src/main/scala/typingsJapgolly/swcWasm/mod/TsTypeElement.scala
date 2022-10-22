package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.TsCallSignatureDeclaration
  - typingsJapgolly.swcWasm.mod.TsConstructSignatureDeclaration
  - typingsJapgolly.swcWasm.mod.TsPropertySignature
  - typingsJapgolly.swcWasm.mod.TsGetterSignature
  - typingsJapgolly.swcWasm.mod.TsSetterSignature
  - typingsJapgolly.swcWasm.mod.TsMethodSignature
  - typingsJapgolly.swcWasm.mod.TsIndexSignature
*/
trait TsTypeElement extends StObject
object TsTypeElement {
  
  inline def TsCallSignatureDeclaration(params: js.Array[TsFnParameter], span: Span): typingsJapgolly.swcWasm.mod.TsCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsCallSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsCallSignatureDeclaration]
  }
  
  inline def TsConstructSignatureDeclaration(params: js.Array[TsFnParameter], span: Span): typingsJapgolly.swcWasm.mod.TsConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsConstructSignatureDeclaration]
  }
  
  inline def TsGetterSignature(computed: Boolean, key: Expression, optional: Boolean, readonly: Boolean, span: Span): typingsJapgolly.swcWasm.mod.TsGetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsGetterSignature")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsGetterSignature]
  }
  
  inline def TsIndexSignature(params: js.Array[TsFnParameter], readonly: Boolean, span: Span, static: Boolean): typingsJapgolly.swcWasm.mod.TsIndexSignature = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexSignature")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsIndexSignature]
  }
  
  inline def TsMethodSignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.TsMethodSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMethodSignature")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsMethodSignature]
  }
  
  inline def TsPropertySignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    params: js.Array[TsFnParameter],
    readonly: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.TsPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsPropertySignature")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsPropertySignature]
  }
  
  inline def TsSetterSignature(
    computed: Boolean,
    key: Expression,
    optional: Boolean,
    param: TsFnParameter,
    readonly: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.TsSetterSignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsSetterSignature")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsSetterSignature]
  }
}
