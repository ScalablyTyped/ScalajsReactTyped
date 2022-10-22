package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to notify listeners of data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the service description of the
  * providing service.
  * @see XChangeListener
  */
trait XChangeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive the "changed" event.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XChangeListener
    */
  def addChangeListener(aListener: XChangeListener): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XChangeListener
    */
  def removeChangeListener(aListener: XChangeListener): Unit
}
object XChangeBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addChangeListener: XChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChangeListener: XChangeListener => Callback
  ): XChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addChangeListener = js.Any.fromFunction1((t0: XChangeListener) => addChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangeListener = js.Any.fromFunction1((t0: XChangeListener) => removeChangeListener(t0).runNow()))
    __obj.asInstanceOf[XChangeBroadcaster]
  }
  
  extension [Self <: XChangeBroadcaster](x: Self) {
    
    inline def setAddChangeListener(value: XChangeListener => Callback): Self = StObject.set(x, "addChangeListener", js.Any.fromFunction1((t0: XChangeListener) => value(t0).runNow()))
    
    inline def setRemoveChangeListener(value: XChangeListener => Callback): Self = StObject.set(x, "removeChangeListener", js.Any.fromFunction1((t0: XChangeListener) => value(t0).runNow()))
  }
}
