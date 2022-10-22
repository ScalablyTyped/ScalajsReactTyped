package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set a {@link Locale} to be used by the object. */
trait XLocalizable
  extends StObject
     with XInterface {
  
  /** @returns the locale, which is used by this object. */
  var Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the locale, which is used by this object. */
  def getLocale(): Locale
  
  /** sets the locale to be used by this object. */
  def setLocale(eLocale: Locale): Unit
}
object XLocalizable {
  
  inline def apply(
    Locale: Locale,
    acquire: Callback,
    getLocale: CallbackTo[Locale],
    queryInterface: `type` => Any,
    release: Callback,
    setLocale: Locale => Callback
  ): XLocalizable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLocale = getLocale.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()))
    __obj.asInstanceOf[XLocalizable]
  }
  
  extension [Self <: XLocalizable](x: Self) {
    
    inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setSetLocale(value: Locale => Callback): Self = StObject.set(x, "setLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
  }
}
