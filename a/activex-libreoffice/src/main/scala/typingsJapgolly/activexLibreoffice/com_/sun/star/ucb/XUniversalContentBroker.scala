package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.0 */
trait XUniversalContentBroker
  extends StObject
     with XComponent
     with XContentProvider
     with XContentProviderManager
     with XContentIdentifierFactory
     with XCommandProcessor2
object XUniversalContentBroker {
  
  inline def apply(
    abort: Double => Callback,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    createCommandIdentifier: CallbackTo[Double],
    createContentIdentifier: String => XContentIdentifier,
    deregisterContentProvider: (XContentProvider, String) => Callback,
    dispose: Callback,
    execute: (Command, Double, XCommandEnvironment) => Any,
    queryContent: XContentIdentifier => XContent,
    queryContentProvider: String => XContentProvider,
    queryContentProviders: CallbackTo[SafeArray[ContentProviderInfo]],
    queryInterface: `type` => Any,
    registerContentProvider: (XContentProvider, String, Boolean) => XContentProvider,
    release: Callback,
    releaseCommandIdentifier: Double => Callback,
    removeEventListener: XEventListener => Callback
  ): XUniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1((t0: Double) => abort(t0).runNow()), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), compareContentIds = js.Any.fromFunction2(compareContentIds), createCommandIdentifier = createCommandIdentifier.toJsFn, createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterContentProvider = js.Any.fromFunction2((t0: XContentProvider, t1: String) => (deregisterContentProvider(t0, t1)).runNow()), dispose = dispose.toJsFn, execute = js.Any.fromFunction3(execute), queryContent = js.Any.fromFunction1(queryContent), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = queryContentProviders.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = release.toJsFn, releaseCommandIdentifier = js.Any.fromFunction1((t0: Double) => releaseCommandIdentifier(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XUniversalContentBroker]
  }
}
