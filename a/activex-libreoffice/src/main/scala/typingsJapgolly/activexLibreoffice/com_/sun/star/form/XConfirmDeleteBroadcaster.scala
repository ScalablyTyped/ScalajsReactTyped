package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of receiving an event for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteListener
  */
trait XConfirmDeleteBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * remembers the specified listener to receive an event for confirming deletions
    *
    * {@link XConfirmDeleteListener.confirmDelete()} is called before a deletion is performed. You may use the event to write your own confirmation
    * messages.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XConfirmDeleteListener
    */
  def addConfirmDeleteListener(aListener: XConfirmDeleteListener): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XConfirmDeleteListener
    */
  def removeConfirmDeleteListener(aListener: XConfirmDeleteListener): Unit
}
object XConfirmDeleteBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addConfirmDeleteListener: XConfirmDeleteListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeConfirmDeleteListener: XConfirmDeleteListener => Callback
  ): XConfirmDeleteBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addConfirmDeleteListener = js.Any.fromFunction1((t0: XConfirmDeleteListener) => addConfirmDeleteListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeConfirmDeleteListener = js.Any.fromFunction1((t0: XConfirmDeleteListener) => removeConfirmDeleteListener(t0).runNow()))
    __obj.asInstanceOf[XConfirmDeleteBroadcaster]
  }
  
  extension [Self <: XConfirmDeleteBroadcaster](x: Self) {
    
    inline def setAddConfirmDeleteListener(value: XConfirmDeleteListener => Callback): Self = StObject.set(x, "addConfirmDeleteListener", js.Any.fromFunction1((t0: XConfirmDeleteListener) => value(t0).runNow()))
    
    inline def setRemoveConfirmDeleteListener(value: XConfirmDeleteListener => Callback): Self = StObject.set(x, "removeConfirmDeleteListener", js.Any.fromFunction1((t0: XConfirmDeleteListener) => value(t0).runNow()))
  }
}
