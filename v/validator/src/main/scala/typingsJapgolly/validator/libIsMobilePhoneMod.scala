package typingsJapgolly.validator

import typingsJapgolly.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsMobilePhoneMod {
  
  @JSImport("validator/lib/isMobilePhone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a mobile phone number.
    *
    * @param [locale] - MobilePhoneLocale(s)
    * @param [options] - Options
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, locale: js.Array[typingsJapgolly.validator.mod.validator.MobilePhoneLocale]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    str: String,
    locale: js.Array[typingsJapgolly.validator.mod.validator.MobilePhoneLocale],
    options: typingsJapgolly.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, locale: Unit, options: typingsJapgolly.validator.mod.validator.IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(str: String, locale: typingsJapgolly.validator.mod.validator.MobilePhoneLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    str: String,
    locale: typingsJapgolly.validator.mod.validator.MobilePhoneLocale,
    options: typingsJapgolly.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def default_any(str: String, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default_any(str: String, locale: any, options: typingsJapgolly.validator.mod.validator.IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type IsMobilePhoneOptions = typingsJapgolly.validator.mod.validator.IsMobilePhoneOptions
  
  type MobilePhoneLocale = typingsJapgolly.validator.mod.validator.MobilePhoneLocale
}
