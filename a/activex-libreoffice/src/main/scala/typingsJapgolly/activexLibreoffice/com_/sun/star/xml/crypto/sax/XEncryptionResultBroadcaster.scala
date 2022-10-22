package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Encryption Result Broadcaster.
  *
  * This interface is used to manipulate encryption result listener.
  */
trait XEncryptionResultBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new encryption result listener.
    *
    * When the encryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addEncryptionResultListener(listener: XEncryptionResultListener): Unit
  
  /**
    * Removes an encryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeEncryptionResultListener(listener: XEncryptionResultListener): Unit
}
object XEncryptionResultBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addEncryptionResultListener: XEncryptionResultListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEncryptionResultListener: XEncryptionResultListener => Callback
  ): XEncryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEncryptionResultListener = js.Any.fromFunction1((t0: XEncryptionResultListener) => addEncryptionResultListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEncryptionResultListener = js.Any.fromFunction1((t0: XEncryptionResultListener) => removeEncryptionResultListener(t0).runNow()))
    __obj.asInstanceOf[XEncryptionResultBroadcaster]
  }
  
  extension [Self <: XEncryptionResultBroadcaster](x: Self) {
    
    inline def setAddEncryptionResultListener(value: XEncryptionResultListener => Callback): Self = StObject.set(x, "addEncryptionResultListener", js.Any.fromFunction1((t0: XEncryptionResultListener) => value(t0).runNow()))
    
    inline def setRemoveEncryptionResultListener(value: XEncryptionResultListener => Callback): Self = StObject.set(x, "removeEncryptionResultListener", js.Any.fromFunction1((t0: XEncryptionResultListener) => value(t0).runNow()))
  }
}
