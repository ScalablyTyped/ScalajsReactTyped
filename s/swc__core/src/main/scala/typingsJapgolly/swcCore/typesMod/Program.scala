package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.Module
  - typingsJapgolly.swcCore.typesMod.Script
*/
trait Program extends StObject
object Program {
  
  inline def Module(body: js.Array[ModuleItem], interpreter: String, span: Span): typingsJapgolly.swcCore.typesMod.Module = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Module")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Module]
  }
  
  inline def Script(body: js.Array[Statement], interpreter: String, span: Span): typingsJapgolly.swcCore.typesMod.Script = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Script")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Script]
  }
}
