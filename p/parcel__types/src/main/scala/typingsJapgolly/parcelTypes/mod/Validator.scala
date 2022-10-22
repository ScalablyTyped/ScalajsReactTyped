package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelTypes.anon.Assets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.mod.DedicatedThreadValidator
  - typingsJapgolly.parcelTypes.mod.MultiThreadValidator
*/
trait Validator extends StObject
object Validator {
  
  inline def DedicatedThreadValidator(validateAll: Assets => Async[js.Array[js.UndefOr[ValidateResult | Null]]]): typingsJapgolly.parcelTypes.mod.DedicatedThreadValidator = {
    val __obj = js.Dynamic.literal(validateAll = js.Any.fromFunction1(validateAll))
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.DedicatedThreadValidator]
  }
  
  inline def MultiThreadValidator(validate: typingsJapgolly.parcelTypes.anon.Asset => Async[ValidateResult | Unit]): typingsJapgolly.parcelTypes.mod.MultiThreadValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.mod.MultiThreadValidator]
  }
}
