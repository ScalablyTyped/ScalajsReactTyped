package typingsJapgolly.activexLibreoffice.com_.sun.star.bridge

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.connection.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link BridgeFactory} service to implement.
  * @since LibreOffice 4.0
  */
trait XBridgeFactory2
  extends StObject
     with XBridgeFactory
     with XComponent
object XBridgeFactory2 {
  
  inline def apply(
    ExistingBridges: SafeArray[XBridge],
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    createBridge: (String, String, XConnection, XInstanceProvider) => XBridge,
    dispose: Callback,
    getBridge: String => XBridge,
    getExistingBridges: CallbackTo[SafeArray[XBridge]],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XBridgeFactory2 = {
    val __obj = js.Dynamic.literal(ExistingBridges = ExistingBridges.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createBridge = js.Any.fromFunction4(createBridge), dispose = dispose.toJsFn, getBridge = js.Any.fromFunction1(getBridge), getExistingBridges = getExistingBridges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XBridgeFactory2]
  }
}
