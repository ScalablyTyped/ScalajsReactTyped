package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** retrieves the list of available languages. */
trait XAvailableLocales
  extends StObject
     with XInterface {
  
  /**
    * retrieve the list of supported languages (Locales).
    * @param aServiceName the name of the service to get the list of available Locales for.
    * @returns the list of locales supported by the whole of all registered implementations of that service. The sequence will be empty if there is no such lang
    * @see com.sun.star.linguistic2.XSupportedLocales
    */
  def getAvailableLocales(aServiceName: String): SafeArray[Locale]
}
object XAvailableLocales {
  
  inline def apply(
    acquire: Callback,
    getAvailableLocales: String => SafeArray[Locale],
    queryInterface: `type` => Any,
    release: Callback
  ): XAvailableLocales = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAvailableLocales]
  }
  
  extension [Self <: XAvailableLocales](x: Self) {
    
    inline def setGetAvailableLocales(value: String => SafeArray[Locale]): Self = StObject.set(x, "getAvailableLocales", js.Any.fromFunction1(value))
  }
}
