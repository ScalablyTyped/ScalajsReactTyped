package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Macro expander expanding using rtl bootstrap notation.
  *
  * For details, have a look at [http://udk.openoffice.org/common/man/concept/micro_deployment.html#misc]{@link
  * url="http://udk.openoffice.org/common/man/concept/micro_deployment.html#misc"}
  *
  * The service can be instantiated via arguments giving an ini/rc file url. Otherwise it will read from an uno.ini/unorc file next to the cppuhelper
  * library.
  * @see theMacroExpander
  * @since OOo 1.1.2
  */
trait BootstrapMacroExpander
  extends StObject
     with MacroExpander
     with XInitialization
object BootstrapMacroExpander {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    expandMacros: String => String,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): BootstrapMacroExpander = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, expandMacros = js.Any.fromFunction1(expandMacros), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[BootstrapMacroExpander]
  }
}
