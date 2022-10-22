package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.TsEntityName
  - typingsJapgolly.swcCore.typesMod.TsExternalModuleReference
*/
trait TsModuleReference extends StObject
object TsModuleReference {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Identifier]
  }
  
  inline def TsExternalModuleReference(expression: StringLiteral, span: Span): typingsJapgolly.swcCore.typesMod.TsExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExternalModuleReference")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsExternalModuleReference]
  }
  
  inline def TsQualifiedName(left: TsEntityName, right: Identifier): typingsJapgolly.swcCore.typesMod.TsQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsQualifiedName")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsQualifiedName]
  }
}
