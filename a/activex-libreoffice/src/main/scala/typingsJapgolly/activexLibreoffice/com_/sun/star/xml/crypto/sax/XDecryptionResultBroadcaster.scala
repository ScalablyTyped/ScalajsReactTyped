package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Decryption Result Broadcaster.
  *
  * This interface is used to manipulate decryption result listener.
  */
trait XDecryptionResultBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new decryption result listener.
    *
    * When the decryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addDecryptionResultListener(listener: XDecryptionResultListener): Unit
  
  /**
    * Removes a decryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeDecryptionResultListener(listener: XDecryptionResultListener): Unit
}
object XDecryptionResultBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addDecryptionResultListener: XDecryptionResultListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeDecryptionResultListener: XDecryptionResultListener => Callback
  ): XDecryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addDecryptionResultListener = js.Any.fromFunction1((t0: XDecryptionResultListener) => addDecryptionResultListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDecryptionResultListener = js.Any.fromFunction1((t0: XDecryptionResultListener) => removeDecryptionResultListener(t0).runNow()))
    __obj.asInstanceOf[XDecryptionResultBroadcaster]
  }
  
  extension [Self <: XDecryptionResultBroadcaster](x: Self) {
    
    inline def setAddDecryptionResultListener(value: XDecryptionResultListener => Callback): Self = StObject.set(x, "addDecryptionResultListener", js.Any.fromFunction1((t0: XDecryptionResultListener) => value(t0).runNow()))
    
    inline def setRemoveDecryptionResultListener(value: XDecryptionResultListener => Callback): Self = StObject.set(x, "removeDecryptionResultListener", js.Any.fromFunction1((t0: XDecryptionResultListener) => value(t0).runNow()))
  }
}
