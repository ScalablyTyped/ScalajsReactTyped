package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.TsEntityName
  - typingsJapgolly.swcWasm.mod.TsExternalModuleReference
*/
trait TsModuleReference extends StObject
object TsModuleReference {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Identifier]
  }
  
  inline def TsExternalModuleReference(expression: StringLiteral, span: Span): typingsJapgolly.swcWasm.mod.TsExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExternalModuleReference")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsExternalModuleReference]
  }
  
  inline def TsQualifiedName(left: TsEntityName, right: Identifier): typingsJapgolly.swcWasm.mod.TsQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsQualifiedName")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsQualifiedName]
  }
}
