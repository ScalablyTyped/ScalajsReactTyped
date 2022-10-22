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
  * Derived from {@link com.sun.star.i18n.XLocaleData2} this provides an additional method to return a sequence of all {@link com.sun.star.i18n.Calendar2}
  * elements available for that locale.
  * @since LibreOffice 3.5
  */
trait XLocaleData3
  extends StObject
     with XLocaleData2 {
  
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars2(aLocale: Locale): SafeArray[Calendar2]
}
object XLocaleData3 {
  
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
    getForbiddenCharacters: Locale => ForbiddenCharacters,
    getLanguageCountryInfo: Locale => LanguageCountryInfo,
    getLocaleItem: Locale => LocaleDataItem,
    getReservedWord: Locale => SafeArray[String],
    getSearchOptions: Locale => SafeArray[String],
    getTransliterations: Locale => SafeArray[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XLocaleData3 = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCalendars2 = js.Any.fromFunction1(getAllCalendars2), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllCurrencies2 = js.Any.fromFunction1(getAllCurrencies2), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = getAllInstalledLocaleNames.toJsFn, getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLocaleData3]
  }
  
  extension [Self <: XLocaleData3](x: Self) {
    
    inline def setGetAllCalendars2(value: Locale => SafeArray[Calendar2]): Self = StObject.set(x, "getAllCalendars2", js.Any.fromFunction1(value))
  }
}
