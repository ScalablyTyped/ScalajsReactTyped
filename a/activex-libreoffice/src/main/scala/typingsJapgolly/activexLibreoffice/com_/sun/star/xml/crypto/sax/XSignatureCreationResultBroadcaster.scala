package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Creation Result Broadcaster.
  *
  * This interface is used to manipulate signature creation result listener.
  */
trait XSignatureCreationResultBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new signature creation result listener.
    *
    * When the signature is created, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureCreationResultListener(listener: XSignatureCreationResultListener): Unit
  
  /**
    * Removes a signature creation result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureCreationResultListener(listener: XSignatureCreationResultListener): Unit
}
object XSignatureCreationResultBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addSignatureCreationResultListener: XSignatureCreationResultListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSignatureCreationResultListener: XSignatureCreationResultListener => Callback
  ): XSignatureCreationResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSignatureCreationResultListener = js.Any.fromFunction1((t0: XSignatureCreationResultListener) => addSignatureCreationResultListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSignatureCreationResultListener = js.Any.fromFunction1((t0: XSignatureCreationResultListener) => removeSignatureCreationResultListener(t0).runNow()))
    __obj.asInstanceOf[XSignatureCreationResultBroadcaster]
  }
  
  extension [Self <: XSignatureCreationResultBroadcaster](x: Self) {
    
    inline def setAddSignatureCreationResultListener(value: XSignatureCreationResultListener => Callback): Self = StObject.set(x, "addSignatureCreationResultListener", js.Any.fromFunction1((t0: XSignatureCreationResultListener) => value(t0).runNow()))
    
    inline def setRemoveSignatureCreationResultListener(value: XSignatureCreationResultListener => Callback): Self = StObject.set(x, "removeSignatureCreationResultListener", js.Any.fromFunction1((t0: XSignatureCreationResultListener) => value(t0).runNow()))
  }
}
