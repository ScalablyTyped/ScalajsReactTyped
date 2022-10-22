package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive adjustment events. */
trait XAdjustmentListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the adjustment has changed. */
  def adjustmentValueChanged(rEvent: AdjustmentEvent): Unit
}
object XAdjustmentListener {
  
  inline def apply(
    acquire: Callback,
    adjustmentValueChanged: AdjustmentEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAdjustmentListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, adjustmentValueChanged = js.Any.fromFunction1((t0: AdjustmentEvent) => adjustmentValueChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAdjustmentListener]
  }
  
  extension [Self <: XAdjustmentListener](x: Self) {
    
    inline def setAdjustmentValueChanged(value: AdjustmentEvent => Callback): Self = StObject.set(x, "adjustmentValueChanged", js.Any.fromFunction1((t0: AdjustmentEvent) => value(t0).runNow()))
  }
}
