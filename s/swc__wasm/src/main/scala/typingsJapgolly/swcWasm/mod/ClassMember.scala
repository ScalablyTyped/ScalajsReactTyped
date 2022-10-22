package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.Constructor
  - typingsJapgolly.swcWasm.mod.ClassMethod
  - typingsJapgolly.swcWasm.mod.PrivateMethod
  - typingsJapgolly.swcWasm.mod.ClassProperty
  - typingsJapgolly.swcWasm.mod.PrivateProperty
  - typingsJapgolly.swcWasm.mod.TsIndexSignature
  - typingsJapgolly.swcWasm.mod.EmptyStatement
  - typingsJapgolly.swcWasm.mod.StaticBlock
*/
trait ClassMember extends StObject
object ClassMember {
  
  inline def ClassMethod(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PropertyName,
    kind: MethodKind,
    span: Span
  ): typingsJapgolly.swcWasm.mod.ClassMethod = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ClassMethod]
  }
  
  inline def ClassProperty(
    declare: Boolean,
    definite: Boolean,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PropertyName,
    readonly: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.ClassProperty = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], definite = definite.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.ClassProperty]
  }
  
  inline def Constructor(isOptional: Boolean, key: PropertyName, params: js.Array[TsParameterProperty | Param], span: Span): typingsJapgolly.swcWasm.mod.Constructor = {
    val __obj = js.Dynamic.literal(isOptional = isOptional.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Constructor")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Constructor]
  }
  
  inline def EmptyStatement(span: Span): typingsJapgolly.swcWasm.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.EmptyStatement]
  }
  
  inline def PrivateMethod(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PrivateName,
    kind: MethodKind,
    span: Span
  ): typingsJapgolly.swcWasm.mod.PrivateMethod = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateMethod")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.PrivateMethod]
  }
  
  inline def PrivateProperty(
    definite: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PrivateName,
    readonly: Boolean,
    span: Span
  ): typingsJapgolly.swcWasm.mod.PrivateProperty = {
    val __obj = js.Dynamic.literal(definite = definite.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateProperty")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.PrivateProperty]
  }
  
  inline def StaticBlock(body: BlockStatement, span: Span): typingsJapgolly.swcWasm.mod.StaticBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.StaticBlock]
  }
  
  inline def TsIndexSignature(params: js.Array[TsFnParameter], readonly: Boolean, span: Span, static: Boolean): typingsJapgolly.swcWasm.mod.TsIndexSignature = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexSignature")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsIndexSignature]
  }
}
