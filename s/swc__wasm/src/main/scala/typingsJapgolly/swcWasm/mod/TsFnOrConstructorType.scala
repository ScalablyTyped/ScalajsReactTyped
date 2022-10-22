package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.TsFunctionType
  - typingsJapgolly.swcWasm.mod.TsConstructorType
*/
trait TsFnOrConstructorType
  extends StObject
     with TsType
object TsFnOrConstructorType {
  
  inline def TsConstructorType(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typingsJapgolly.swcWasm.mod.TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsConstructorType]
  }
  
  inline def TsFunctionType(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typingsJapgolly.swcWasm.mod.TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsFunctionType]
  }
}
