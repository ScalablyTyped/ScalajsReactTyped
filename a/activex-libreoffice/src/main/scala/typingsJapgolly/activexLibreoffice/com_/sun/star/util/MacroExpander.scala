package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This meta service supports the {@link XMacroExpander} interface for expanding arbitrary macro expressions, i.e. substitude macro names. The purpose of
  * this service is to separate the use of macrofied strings, e.g. urls from the use of services.
  * @deprecated Deprecatedrather use the util::theMacroExpander singleton
  * @see BootstrapMacroExpander
  * @see theMacroExpander
  * @since OOo 1.1.2
  */
trait MacroExpander
  extends StObject
     with XMacroExpander
     with XComponent
object MacroExpander {
  
  inline def apply(
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    expandMacros: String => String,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): MacroExpander = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, expandMacros = js.Any.fromFunction1(expandMacros), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[MacroExpander]
  }
}
