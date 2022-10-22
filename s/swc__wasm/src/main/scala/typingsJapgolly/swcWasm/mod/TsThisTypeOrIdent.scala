package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.TsThisType
  - typingsJapgolly.swcWasm.mod.Identifier
*/
trait TsThisTypeOrIdent extends StObject
object TsThisTypeOrIdent {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typingsJapgolly.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Identifier]
  }
  
  inline def TsThisType(span: Span): typingsJapgolly.swcWasm.mod.TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsThisType]
  }
}
