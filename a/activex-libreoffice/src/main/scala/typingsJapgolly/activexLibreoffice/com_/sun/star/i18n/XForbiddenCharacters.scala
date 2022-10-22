package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to forbidden character settings in a document.
  *
  * In some languages, particular characters are not allowed to be placed at the beginning or at the end of a text line.
  */
trait XForbiddenCharacters
  extends StObject
     with XInterface {
  
  /** returns the forbidden characters for a given locale. */
  def getForbiddenCharacters(aLocale: Locale): ForbiddenCharacters
  
  /** determines if forbidden characters are set for a given locale. */
  def hasForbiddenCharacters(aLocale: Locale): Boolean
  
  /** removes the setting of forbidden characters for a given locale. */
  def removeForbiddenCharacters(aLocale: Locale): Unit
  
  /** sets the forbidden characters for a given Locale. */
  def setForbiddenCharacters(aLocale: Locale, aForbiddenCharacters: ForbiddenCharacters): Unit
}
object XForbiddenCharacters {
  
  inline def apply(
    acquire: Callback,
    getForbiddenCharacters: Locale => ForbiddenCharacters,
    hasForbiddenCharacters: Locale => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeForbiddenCharacters: Locale => Callback,
    setForbiddenCharacters: (Locale, ForbiddenCharacters) => Callback
  ): XForbiddenCharacters = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), hasForbiddenCharacters = js.Any.fromFunction1(hasForbiddenCharacters), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeForbiddenCharacters = js.Any.fromFunction1((t0: Locale) => removeForbiddenCharacters(t0).runNow()), setForbiddenCharacters = js.Any.fromFunction2((t0: Locale, t1: ForbiddenCharacters) => (setForbiddenCharacters(t0, t1)).runNow()))
    __obj.asInstanceOf[XForbiddenCharacters]
  }
  
  extension [Self <: XForbiddenCharacters](x: Self) {
    
    inline def setGetForbiddenCharacters(value: Locale => ForbiddenCharacters): Self = StObject.set(x, "getForbiddenCharacters", js.Any.fromFunction1(value))
    
    inline def setHasForbiddenCharacters(value: Locale => Boolean): Self = StObject.set(x, "hasForbiddenCharacters", js.Any.fromFunction1(value))
    
    inline def setRemoveForbiddenCharacters(value: Locale => Callback): Self = StObject.set(x, "removeForbiddenCharacters", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
    
    inline def setSetForbiddenCharacters(value: (Locale, ForbiddenCharacters) => Callback): Self = StObject.set(x, "setForbiddenCharacters", js.Any.fromFunction2((t0: Locale, t1: ForbiddenCharacters) => (value(t0, t1)).runNow()))
  }
}
