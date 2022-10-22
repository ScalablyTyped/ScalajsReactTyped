package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Verify Result Broadcaster.
  *
  * This interface is used to manipulate signature verify result listener.
  */
trait XSignatureVerifyResultBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new signature verify result listener.
    *
    * When the signature is verified, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureVerifyResultListener(listener: XSignatureVerifyResultListener): Unit
  
  /**
    * Removes a signature verify result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureVerifyResultListener(listener: XSignatureVerifyResultListener): Unit
}
object XSignatureVerifyResultBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addSignatureVerifyResultListener: XSignatureVerifyResultListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSignatureVerifyResultListener: XSignatureVerifyResultListener => Callback
  ): XSignatureVerifyResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSignatureVerifyResultListener = js.Any.fromFunction1((t0: XSignatureVerifyResultListener) => addSignatureVerifyResultListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSignatureVerifyResultListener = js.Any.fromFunction1((t0: XSignatureVerifyResultListener) => removeSignatureVerifyResultListener(t0).runNow()))
    __obj.asInstanceOf[XSignatureVerifyResultBroadcaster]
  }
  
  extension [Self <: XSignatureVerifyResultBroadcaster](x: Self) {
    
    inline def setAddSignatureVerifyResultListener(value: XSignatureVerifyResultListener => Callback): Self = StObject.set(x, "addSignatureVerifyResultListener", js.Any.fromFunction1((t0: XSignatureVerifyResultListener) => value(t0).runNow()))
    
    inline def setRemoveSignatureVerifyResultListener(value: XSignatureVerifyResultListener => Callback): Self = StObject.set(x, "removeSignatureVerifyResultListener", js.Any.fromFunction1((t0: XSignatureVerifyResultListener) => value(t0).runNow()))
  }
}
