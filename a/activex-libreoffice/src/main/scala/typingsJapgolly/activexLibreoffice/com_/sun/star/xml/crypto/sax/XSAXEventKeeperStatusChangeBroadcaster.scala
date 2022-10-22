package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of {@link SAXEventKeeper} Status Change Broadcaster.
  *
  * This interface is used to manipulate {@link SAXEventKeeper} status change listener.
  */
trait XSAXEventKeeperStatusChangeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new status change listener.
    *
    * When the {@link SAXEventKeeper} 's status changes, the listener will receive a notification.
    * @param listener the listener to be added
    */
  def addSAXEventKeeperStatusChangeListener(listener: XSAXEventKeeperStatusChangeListener): Unit
  
  /**
    * Removes a status change listener.
    *
    * After a listener is removed, no status change notification will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSAXEventKeeperStatusChangeListener(listener: XSAXEventKeeperStatusChangeListener): Unit
}
object XSAXEventKeeperStatusChangeBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Callback
  ): XSAXEventKeeperStatusChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSAXEventKeeperStatusChangeListener = js.Any.fromFunction1((t0: XSAXEventKeeperStatusChangeListener) => addSAXEventKeeperStatusChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSAXEventKeeperStatusChangeListener = js.Any.fromFunction1((t0: XSAXEventKeeperStatusChangeListener) => removeSAXEventKeeperStatusChangeListener(t0).runNow()))
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeBroadcaster]
  }
  
  extension [Self <: XSAXEventKeeperStatusChangeBroadcaster](x: Self) {
    
    inline def setAddSAXEventKeeperStatusChangeListener(value: XSAXEventKeeperStatusChangeListener => Callback): Self = StObject.set(x, "addSAXEventKeeperStatusChangeListener", js.Any.fromFunction1((t0: XSAXEventKeeperStatusChangeListener) => value(t0).runNow()))
    
    inline def setRemoveSAXEventKeeperStatusChangeListener(value: XSAXEventKeeperStatusChangeListener => Callback): Self = StObject.set(x, "removeSAXEventKeeperStatusChangeListener", js.Any.fromFunction1((t0: XSAXEventKeeperStatusChangeListener) => value(t0).runNow()))
  }
}
