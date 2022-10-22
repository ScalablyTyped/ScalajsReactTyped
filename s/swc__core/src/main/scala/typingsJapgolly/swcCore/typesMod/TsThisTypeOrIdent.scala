package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.TsThisType
  - typingsJapgolly.swcCore.typesMod.Identifier
*/
trait TsThisTypeOrIdent extends StObject
object TsThisTypeOrIdent {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Identifier]
  }
  
  inline def TsThisType(span: Span): typingsJapgolly.swcCore.typesMod.TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsThisType]
  }
}
