package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when an embedded object changes it's state. */
trait XStateChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * is called just before the object changes state.
    *
    * Actually the listener can try to complain about state changing, but it is up to object to decide whether the state change can be prevented. Anyway the
    * possibility to complain must be used very carefully.
    * @param aEvent specifies the object that is going to change own state
    * @param nOldState specifies the old state of the object
    * @param nNewState specifies the new state of the object
    * @throws com::sun::star::embed::WrongStateException the state change is unexpected by listener
    */
  def changingState(aEvent: EventObject, nOldState: Double, nNewState: Double): Unit
  
  /**
    * is called after the object has changed state.
    * @param aEvent specifies the object that has changed own state
    * @param nOldState specifies the old state of the object
    * @param nNewState specifies the new state of the object
    */
  def stateChanged(aEvent: EventObject, nOldState: Double, nNewState: Double): Unit
}
object XStateChangeListener {
  
  inline def apply(
    acquire: Callback,
    changingState: (EventObject, Double, Double) => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    stateChanged: (EventObject, Double, Double) => Callback
  ): XStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changingState = js.Any.fromFunction3((t0: EventObject, t1: Double, t2: Double) => (changingState(t0, t1, t2)).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stateChanged = js.Any.fromFunction3((t0: EventObject, t1: Double, t2: Double) => (stateChanged(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XStateChangeListener]
  }
  
  extension [Self <: XStateChangeListener](x: Self) {
    
    inline def setChangingState(value: (EventObject, Double, Double) => Callback): Self = StObject.set(x, "changingState", js.Any.fromFunction3((t0: EventObject, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setStateChanged(value: (EventObject, Double, Double) => Callback): Self = StObject.set(x, "stateChanged", js.Any.fromFunction3((t0: EventObject, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
