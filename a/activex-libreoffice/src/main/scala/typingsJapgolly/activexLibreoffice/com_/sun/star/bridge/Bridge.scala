package typingsJapgolly.activexLibreoffice.com_.sun.star.bridge

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This meta service allows the bridgefactory service to instantiate an interprocess bridge using a certain transfer protocol.
  *
  * Components, that support a certain protocol, must have at least two service names:
  *
  * {@link com.sun.star.bridge.Bridge}arbitrary-module-path.ProtocolnameBridge
  *
  * The protocol name should be written as common servicenames, first letter is a capital letter, the rest in small letters postfixed by {@link Bridge}
  * (e.g.: `com.sun.star.bridge.UrpBridge` would be correct servicename for the "urp" protocol). However, the protocol names are compared case
  * insensitive. If there exist two services supporting the same protocol, it is arbitrary which one is chosen, so this should be omitted.
  */
trait Bridge
  extends StObject
     with XInitialization
     with XBridge
     with XComponent
object Bridge {
  
  inline def apply(
    Description: String,
    Name: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getDescription: CallbackTo[String],
    getInstance: String => XInterface,
    getName: CallbackTo[String],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): Bridge = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getDescription = getDescription.toJsFn, getInstance = js.Any.fromFunction1(getInstance), getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[Bridge]
  }
}
