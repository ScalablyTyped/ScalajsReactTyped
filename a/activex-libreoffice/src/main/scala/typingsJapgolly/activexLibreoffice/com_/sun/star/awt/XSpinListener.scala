package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive spin events. */
trait XSpinListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the spin field is spun down. */
  def down(rEvent: SpinEvent): Unit
  
  /** is invoked when the spin field is set to the lower value. */
  def first(rEvent: SpinEvent): Unit
  
  /** is invoked when the spin field is set to the upper value. */
  def last(rEvent: SpinEvent): Unit
  
  /** is invoked when the spin field is spun up. */
  def up(rEvent: SpinEvent): Unit
}
object XSpinListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    down: SpinEvent => Callback,
    first: SpinEvent => Callback,
    last: SpinEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    up: SpinEvent => Callback
  ): XSpinListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), down = js.Any.fromFunction1((t0: SpinEvent) => down(t0).runNow()), first = js.Any.fromFunction1((t0: SpinEvent) => first(t0).runNow()), last = js.Any.fromFunction1((t0: SpinEvent) => last(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, up = js.Any.fromFunction1((t0: SpinEvent) => up(t0).runNow()))
    __obj.asInstanceOf[XSpinListener]
  }
  
  extension [Self <: XSpinListener](x: Self) {
    
    inline def setDown(value: SpinEvent => Callback): Self = StObject.set(x, "down", js.Any.fromFunction1((t0: SpinEvent) => value(t0).runNow()))
    
    inline def setFirst(value: SpinEvent => Callback): Self = StObject.set(x, "first", js.Any.fromFunction1((t0: SpinEvent) => value(t0).runNow()))
    
    inline def setLast(value: SpinEvent => Callback): Self = StObject.set(x, "last", js.Any.fromFunction1((t0: SpinEvent) => value(t0).runNow()))
    
    inline def setUp(value: SpinEvent => Callback): Self = StObject.set(x, "up", js.Any.fromFunction1((t0: SpinEvent) => value(t0).runNow()))
  }
}
