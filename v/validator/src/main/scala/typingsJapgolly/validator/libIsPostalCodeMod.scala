package typingsJapgolly.validator

import typingsJapgolly.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsPostalCodeMod {
  
  @JSImport("validator/lib/isPostalCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a postal code
    *
    * @param locale - PostalCodeLocale
    */
  inline def default(str: String, locale: typingsJapgolly.validator.mod.validator.PostalCodeLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def default_any(str: String, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type PostalCodeLocale = typingsJapgolly.validator.mod.validator.PostalCodeLocale
}
