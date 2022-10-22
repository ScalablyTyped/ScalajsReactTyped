package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XServiceDisplayName
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers spell checking functionality. */
trait SpellChecker
  extends StObject
     with XSpellChecker
     with XLinguServiceEventBroadcaster
     with XInitialization
     with XComponent
     with XServiceDisplayName
object SpellChecker {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    dispose: Callback,
    getLocales: CallbackTo[SafeArray[Locale]],
    getServiceDisplayName: Locale => String,
    hasLocale: Locale => Boolean,
    initialize: SeqEquiv[Any] => Callback,
    isValid: (String, Locale, PropertyValues) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    spell: (String, Locale, PropertyValues) => XSpellAlternatives
  ): SpellChecker = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addLinguServiceEventListener = js.Any.fromFunction1(addLinguServiceEventListener), dispose = dispose.toJsFn, getLocales = getLocales.toJsFn, getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), hasLocale = js.Any.fromFunction1(hasLocale), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeLinguServiceEventListener = js.Any.fromFunction1(removeLinguServiceEventListener), spell = js.Any.fromFunction3(spell))
    __obj.asInstanceOf[SpellChecker]
  }
}
