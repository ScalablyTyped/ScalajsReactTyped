package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.Identifier
  - typingsJapgolly.swcCore.typesMod.StringLiteral
*/
trait TsEnumMemberId extends StObject
object TsEnumMemberId {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Identifier]
  }
  
  inline def StringLiteral(span: Span, value: String): typingsJapgolly.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.StringLiteral]
  }
}
