package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to reset components to some default values.
  *
  * The semantics of **default value** depends on the providing service.
  */
trait XReset
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive events related to resetting the component.
    * @param aListener the listener to add.
    */
  def addResetListener(aListener: XResetListener): Unit
  
  /**
    * removes the specified listener
    * @param aListener the listener to remove
    */
  def removeResetListener(aListener: XResetListener): Unit
  
  /** resets a component to some default value. */
  def reset(): Unit
}
object XReset {
  
  inline def apply(
    acquire: Callback,
    addResetListener: XResetListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeResetListener: XResetListener => Callback,
    reset: Callback
  ): XReset = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addResetListener = js.Any.fromFunction1((t0: XResetListener) => addResetListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeResetListener = js.Any.fromFunction1((t0: XResetListener) => removeResetListener(t0).runNow()), reset = reset.toJsFn)
    __obj.asInstanceOf[XReset]
  }
  
  extension [Self <: XReset](x: Self) {
    
    inline def setAddResetListener(value: XResetListener => Callback): Self = StObject.set(x, "addResetListener", js.Any.fromFunction1((t0: XResetListener) => value(t0).runNow()))
    
    inline def setRemoveResetListener(value: XResetListener => Callback): Self = StObject.set(x, "removeResetListener", js.Any.fromFunction1((t0: XResetListener) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
