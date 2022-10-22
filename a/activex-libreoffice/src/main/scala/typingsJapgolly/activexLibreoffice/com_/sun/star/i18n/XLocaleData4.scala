package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData3} this provides an additional method to return a sequence of date acceptance patterns for a locale.
  * @since LibreOffice 3.6
  */
trait XLocaleData4
  extends StObject
     with XLocaleData3 {
  
  /**
    * returns a sequence of date acceptance patterns for a locale
    *
    * Patterns with input combinations that are accepted as incomplete date input, such as **M/D** or **D.M.**
    */
  def getDateAcceptancePatterns(aLocale: Locale): SafeArray[String]
}
object XLocaleData4 {
  
  inline def apply(
    AllInstalledLocaleNames: SafeArray[Locale],
    acquire: Callback,
    getAllCalendars: Locale => SafeArray[Calendar],
    getAllCalendars2: Locale => SafeArray[Calendar2],
    getAllCurrencies: Locale => SafeArray[Currency],
    getAllCurrencies2: Locale => SafeArray[Currency2],
    getAllFormats: Locale => SafeArray[FormatElement],
    getAllInstalledLocaleNames: CallbackTo[SafeArray[Locale]],
    getCollationOptions: Locale => SafeArray[String],
    getCollatorImplementations: Locale => SafeArray[Implementation],
    getDateAcceptancePatterns: Locale => SafeArray[String],
    getForbiddenCharacters: Locale => ForbiddenCharacters,
    getLanguageCountryInfo: Locale => LanguageCountryInfo,
    getLocaleItem: Locale => LocaleDataItem,
    getReservedWord: Locale => SafeArray[String],
    getSearchOptions: Locale => SafeArray[String],
    getTransliterations: Locale => SafeArray[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XLocaleData4 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCalendars2 = js.Any.fromFunction1(getAllCalendars2), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllCurrencies2 = js.Any.fromFunction1(getAllCurrencies2), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = getAllInstalledLocaleNames.toJsFn, getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getDateAcceptancePatterns = js.Any.fromFunction1(getDateAcceptancePatterns), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLocaleData4]
  }
  
  extension [Self <: XLocaleData4](x: Self) {
    
    inline def setGetDateAcceptancePatterns(value: Locale => SafeArray[String]): Self = StObject.set(x, "getDateAcceptancePatterns", js.Any.fromFunction1(value))
  }
}
