package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Offers information about which languages are supported by the object.
  *
  * This interface has to be implemented by {@link com.sun.star.linguistic2.SpellChecker} , {@link com.sun.star.linguistic2.Hyphenator} and {@link
  * com.sun.star.linguistic2.Thesaurus} implementations in order to be queried for the languages they can use.
  * @see com.sun.star.lang.Locale
  * @see com.sun.star.uno.XInterface
  */
trait XSupportedLocales
  extends StObject
     with XInterface {
  
  /** @returns the sequence of all supported languages. */
  val Locales: SafeArray[Locale]
  
  /** @returns the sequence of all supported languages. */
  def getLocales(): SafeArray[Locale]
  
  /**
    * @param aLocale specifies the language being checked for support by the object.
    * @returns `TRUE` if the language is supported, otherwise `FALSE` .
    */
  def hasLocale(aLocale: Locale): Boolean
}
object XSupportedLocales {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: Callback,
    getLocales: CallbackTo[SafeArray[Locale]],
    hasLocale: Locale => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XSupportedLocales = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLocales = getLocales.toJsFn, hasLocale = js.Any.fromFunction1(hasLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSupportedLocales]
  }
  
  extension [Self <: XSupportedLocales](x: Self) {
    
    inline def setGetLocales(value: CallbackTo[SafeArray[Locale]]): Self = StObject.set(x, "getLocales", value.toJsFn)
    
    inline def setHasLocale(value: Locale => Boolean): Self = StObject.set(x, "hasLocale", js.Any.fromFunction1(value))
    
    inline def setLocales(value: SafeArray[Locale]): Self = StObject.set(x, "Locales", value.asInstanceOf[js.Any])
  }
}
