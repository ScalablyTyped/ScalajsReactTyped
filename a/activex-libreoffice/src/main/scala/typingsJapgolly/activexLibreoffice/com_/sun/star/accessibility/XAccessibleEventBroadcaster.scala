package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register listeners which are called whenever an accessibility event (see {@link AccessibleEventObject} ) occurs.
  * @see AccessibleEventObject
  * @see XAccessibleEventListener
  * @since OOo 1.1.2
  */
trait XAccessibleEventBroadcaster
  extends StObject
     with XInterface {
  
  /** registers the given {@link XAccessibleEventListener} . */
  def addAccessibleEventListener(xListener: XAccessibleEventListener): Unit
  
  /** unregisters the given {@link XAccessibleEventListener} . */
  def removeAccessibleEventListener(xListener: XAccessibleEventListener): Unit
}
object XAccessibleEventBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addAccessibleEventListener: XAccessibleEventListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeAccessibleEventListener: XAccessibleEventListener => Callback
  ): XAccessibleEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addAccessibleEventListener = js.Any.fromFunction1((t0: XAccessibleEventListener) => addAccessibleEventListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAccessibleEventListener = js.Any.fromFunction1((t0: XAccessibleEventListener) => removeAccessibleEventListener(t0).runNow()))
    __obj.asInstanceOf[XAccessibleEventBroadcaster]
  }
  
  extension [Self <: XAccessibleEventBroadcaster](x: Self) {
    
    inline def setAddAccessibleEventListener(value: XAccessibleEventListener => Callback): Self = StObject.set(x, "addAccessibleEventListener", js.Any.fromFunction1((t0: XAccessibleEventListener) => value(t0).runNow()))
    
    inline def setRemoveAccessibleEventListener(value: XAccessibleEventListener => Callback): Self = StObject.set(x, "removeAccessibleEventListener", js.Any.fromFunction1((t0: XAccessibleEventListener) => value(t0).runNow()))
  }
}
