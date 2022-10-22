package typingsJapgolly.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.joi.anon.Error[TSchema]
  - typingsJapgolly.joi.anon.Value
*/
trait ValidationResult[TSchema] extends StObject
object ValidationResult {
  
  inline def Error[TSchema](error: Unit, value: TSchema): typingsJapgolly.joi.anon.Error[TSchema] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.joi.anon.Error[TSchema]]
  }
  
  inline def Value(error: ValidationError, value: Unit): typingsJapgolly.joi.anon.Value = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.joi.anon.Value]
  }
}
