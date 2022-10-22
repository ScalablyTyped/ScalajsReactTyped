package typingsJapgolly.validator

import typingsJapgolly.validator.mod.validator.IsAlphanumericOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsAlphanumericMod {
  
  @JSImport("validator/lib/isAlphanumeric", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string contains only letters and numbers.
    *
    * @param [locale] - AlphanumericLocale
    * @param [options] - IsAlphanumericOptions
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, locale: Unit, options: IsAlphanumericOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, locale: typingsJapgolly.validator.mod.validator.AlphanumericLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    str: String,
    locale: typingsJapgolly.validator.mod.validator.AlphanumericLocale,
    options: IsAlphanumericOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type AlphanumericLocale = typingsJapgolly.validator.mod.validator.AlphanumericLocale
}
