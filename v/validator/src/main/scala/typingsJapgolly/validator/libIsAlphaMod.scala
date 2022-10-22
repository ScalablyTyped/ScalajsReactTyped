package typingsJapgolly.validator

import typingsJapgolly.validator.mod.validator.IsAlphaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsAlphaMod {
  
  @JSImport("validator/lib/isAlpha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    * @param [options] - IsAlphaOptions
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, locale: Unit, options: IsAlphaOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, locale: typingsJapgolly.validator.mod.validator.AlphaLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, locale: typingsJapgolly.validator.mod.validator.AlphaLocale, options: IsAlphaOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type AlphaLocale = typingsJapgolly.validator.mod.validator.AlphaLocale
}
