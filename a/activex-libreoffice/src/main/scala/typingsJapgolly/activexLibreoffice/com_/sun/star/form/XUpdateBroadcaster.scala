package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the broadcaster interface for sending "approveUpdate" and "updated" events.
  *
  * The component supporting this interface must do approval calls ( {@link XUpdateListener.approveUpdate()} ) immediately before the data is updated, and
  * notification calls ( {@link XUpdateListener.updated()} ) immediately afterwards.
  * @see XUpdateListener
  */
trait XUpdateBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive the events "approveUpdate" and "updated".
    * @param aListener the listener to add.
    * @see com.sun.star.form.XUpdateListener
    */
  def addUpdateListener(aListener: XUpdateListener): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XUpdateListener
    */
  def removeUpdateListener(aListener: XUpdateListener): Unit
}
object XUpdateBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addUpdateListener: XUpdateListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeUpdateListener: XUpdateListener => Callback
  ): XUpdateBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => addUpdateListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeUpdateListener = js.Any.fromFunction1((t0: XUpdateListener) => removeUpdateListener(t0).runNow()))
    __obj.asInstanceOf[XUpdateBroadcaster]
  }
  
  extension [Self <: XUpdateBroadcaster](x: Self) {
    
    inline def setAddUpdateListener(value: XUpdateListener => Callback): Self = StObject.set(x, "addUpdateListener", js.Any.fromFunction1((t0: XUpdateListener) => value(t0).runNow()))
    
    inline def setRemoveUpdateListener(value: XUpdateListener => Callback): Self = StObject.set(x, "removeUpdateListener", js.Any.fromFunction1((t0: XUpdateListener) => value(t0).runNow()))
  }
}
