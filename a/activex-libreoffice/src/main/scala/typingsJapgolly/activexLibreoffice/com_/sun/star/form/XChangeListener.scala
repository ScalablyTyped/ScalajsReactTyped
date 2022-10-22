package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the listener interface for receiving notifications about data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the description of the service
  * broadcasting the change.
  * @see XChangeBroadcaster
  */
trait XChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when the data of a component has been changed.
    * @param rEvent A descriptor specifying the source of the event.
    */
  def changed(rEvent: EventObject): Unit
}
object XChangeListener {
  
  inline def apply(
    acquire: Callback,
    changed: EventObject => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, changed = js.Any.fromFunction1((t0: EventObject) => changed(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChangeListener]
  }
  
  extension [Self <: XChangeListener](x: Self) {
    
    inline def setChanged(value: EventObject => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
