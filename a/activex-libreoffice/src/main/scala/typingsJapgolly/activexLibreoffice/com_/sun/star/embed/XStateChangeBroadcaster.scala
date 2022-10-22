package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** broadcasts message in case embedded object object changes it's state. */
trait XStateChangeBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive events about states change */
  def addStateChangeListener(xListener: XStateChangeListener): Unit
  
  /** removes the specified listener */
  def removeStateChangeListener(xListener: XStateChangeListener): Unit
}
object XStateChangeBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addStateChangeListener: XStateChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeStateChangeListener: XStateChangeListener => Callback
  ): XStateChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addStateChangeListener = js.Any.fromFunction1((t0: XStateChangeListener) => addStateChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeStateChangeListener = js.Any.fromFunction1((t0: XStateChangeListener) => removeStateChangeListener(t0).runNow()))
    __obj.asInstanceOf[XStateChangeBroadcaster]
  }
  
  extension [Self <: XStateChangeBroadcaster](x: Self) {
    
    inline def setAddStateChangeListener(value: XStateChangeListener => Callback): Self = StObject.set(x, "addStateChangeListener", js.Any.fromFunction1((t0: XStateChangeListener) => value(t0).runNow()))
    
    inline def setRemoveStateChangeListener(value: XStateChangeListener => Callback): Self = StObject.set(x, "removeStateChangeListener", js.Any.fromFunction1((t0: XStateChangeListener) => value(t0).runNow()))
  }
}
