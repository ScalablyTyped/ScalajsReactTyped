package typingsJapgolly.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tengitsui.mod.Required
  - typingsJapgolly.tengitsui.mod.Validator
*/
trait ValidatorRule extends StObject
object ValidatorRule {
  
  inline def Required(required: Boolean): typingsJapgolly.tengitsui.mod.Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tengitsui.mod.Required]
  }
  
  inline def Validator(validator: Any => Boolean | String): typingsJapgolly.tengitsui.mod.Validator = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[typingsJapgolly.tengitsui.mod.Validator]
  }
}
