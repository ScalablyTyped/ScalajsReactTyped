package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of {@link SAXEventKeeper} Status Change Listener.
  *
  * This interface is used to receive the {@link SAXEventKeeper} status change notification.
  */
trait XSAXEventKeeperStatusChangeListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving blocking state.
    * @param isBlocking `true` if the {@link SAXEventKeeper} is entering blocking state, `false` otherwise
    */
  def blockingStatusChanged(isBlocking: Boolean): Unit
  
  /**
    * Notifies the {@link SAXEventKeeper} 's buffer is empty/not empty
    * @param isBufferEmpty `true` if the {@link SAXEventKeeper} has no buffer at all; `false` otherwise.
    */
  def bufferStatusChanged(isBufferEmpty: Boolean): Unit
  
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving collecting state.
    * @param isInsideCollectedElement `true` if the {@link SAXEventKeeper} is collecting some element, `false` otherwise
    */
  def collectionStatusChanged(isInsideCollectedElement: Boolean): Unit
}
object XSAXEventKeeperStatusChangeListener {
  
  inline def apply(
    acquire: Callback,
    blockingStatusChanged: Boolean => Callback,
    bufferStatusChanged: Boolean => Callback,
    collectionStatusChanged: Boolean => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XSAXEventKeeperStatusChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, blockingStatusChanged = js.Any.fromFunction1((t0: Boolean) => blockingStatusChanged(t0).runNow()), bufferStatusChanged = js.Any.fromFunction1((t0: Boolean) => bufferStatusChanged(t0).runNow()), collectionStatusChanged = js.Any.fromFunction1((t0: Boolean) => collectionStatusChanged(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeListener]
  }
  
  extension [Self <: XSAXEventKeeperStatusChangeListener](x: Self) {
    
    inline def setBlockingStatusChanged(value: Boolean => Callback): Self = StObject.set(x, "blockingStatusChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setBufferStatusChanged(value: Boolean => Callback): Self = StObject.set(x, "bufferStatusChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setCollectionStatusChanged(value: Boolean => Callback): Self = StObject.set(x, "collectionStatusChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
