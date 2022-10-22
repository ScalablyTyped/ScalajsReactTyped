package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link LinguServiceManager} service to implement.
  * @since LibreOffice 4.0
  */
trait XLinguServiceManager2
  extends StObject
     with XLinguServiceManager
     with XAvailableLocales
     with XComponent
object XLinguServiceManager2 {
  
  inline def apply(
    Hyphenator: XHyphenator,
    SpellChecker: XSpellChecker,
    Thesaurus: XThesaurus,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addLinguServiceManagerListener: XEventListener => Boolean,
    dispose: Callback,
    getAvailableLocales: String => SafeArray[Locale],
    getAvailableServices: (String, Locale) => SafeArray[String],
    getConfiguredServices: (String, Locale) => SafeArray[String],
    getHyphenator: CallbackTo[XHyphenator],
    getSpellChecker: CallbackTo[XSpellChecker],
    getThesaurus: CallbackTo[XThesaurus],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeLinguServiceManagerListener: XEventListener => Boolean,
    setConfiguredServices: (String, Locale, SeqEquiv[String]) => Callback
  ): XLinguServiceManager2 = {
    val __obj = js.Dynamic.literal(Hyphenator = Hyphenator.asInstanceOf[js.Any], SpellChecker = SpellChecker.asInstanceOf[js.Any], Thesaurus = Thesaurus.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addLinguServiceManagerListener = js.Any.fromFunction1(addLinguServiceManagerListener), dispose = dispose.toJsFn, getAvailableLocales = js.Any.fromFunction1(getAvailableLocales), getAvailableServices = js.Any.fromFunction2(getAvailableServices), getConfiguredServices = js.Any.fromFunction2(getConfiguredServices), getHyphenator = getHyphenator.toJsFn, getSpellChecker = getSpellChecker.toJsFn, getThesaurus = getThesaurus.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeLinguServiceManagerListener = js.Any.fromFunction1(removeLinguServiceManagerListener), setConfiguredServices = js.Any.fromFunction3((t0: String, t1: Locale, t2: SeqEquiv[String]) => (setConfiguredServices(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XLinguServiceManager2]
  }
}
