package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.BindingIdentifier
  - typingsJapgolly.swcCore.typesMod.AssignmentPattern
*/
trait TsParameterPropertyParameter extends StObject
object TsParameterPropertyParameter {
  
  inline def AssignmentPattern(left: Pattern, right: Expression, span: Span): typingsJapgolly.swcCore.typesMod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.AssignmentPattern]
  }
  
  inline def BindingIdentifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcCore.typesMod.BindingIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.BindingIdentifier]
  }
}
