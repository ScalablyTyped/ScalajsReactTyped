package typingsJapgolly.highcharts.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSelectorButtonsEventsOptions extends StObject {
  
  /**
    * (Highstock, Gantt) Fires when clicking on the rangeSelector button. One
    * parameter, event, is passed to the function, containing common event
    * information. (see online documentation for example)
    *
    * Return false to stop default button's click action.
    */
  var click: js.UndefOr[RangeSelectorClickCallbackFunction] = js.undefined
}
object RangeSelectorButtonsEventsOptions {
  
  inline def apply(): RangeSelectorButtonsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSelectorButtonsEventsOptions]
  }
  
  extension [Self <: RangeSelectorButtonsEventsOptions](x: Self) {
    
    inline def setClick(value: (/* e */ Event, /* Return */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "click", js.Any.fromFunction2((t0: /* e */ Event, t1: /* Return */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
  }
}
