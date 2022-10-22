package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read access to a static or dynamically changing {@link ContentResultSet} .
  *
  * For example, a {@link DynamicResultSet} is returned from the open-command executed by an {@link XCommandProcessor} of the service {@link Content} .
  */
trait CachedDynamicResultSet
  extends StObject
     with XDynamicResultSet
     with XSourceInitialization
object CachedDynamicResultSet {
  
  inline def apply(
    Capabilities: Double,
    StaticResultSet: XResultSet,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    connectToCache: XDynamicResultSet => Callback,
    dispose: Callback,
    getCapabilities: CallbackTo[Double],
    getStaticResultSet: CallbackTo[XResultSet],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setListener: XDynamicResultSetListener => Callback,
    setSource: XInterface => Callback
  ): CachedDynamicResultSet = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], StaticResultSet = StaticResultSet.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), connectToCache = js.Any.fromFunction1((t0: XDynamicResultSet) => connectToCache(t0).runNow()), dispose = dispose.toJsFn, getCapabilities = getCapabilities.toJsFn, getStaticResultSet = getStaticResultSet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setListener = js.Any.fromFunction1((t0: XDynamicResultSetListener) => setListener(t0).runNow()), setSource = js.Any.fromFunction1((t0: XInterface) => setSource(t0).runNow()))
    __obj.asInstanceOf[CachedDynamicResultSet]
  }
}
