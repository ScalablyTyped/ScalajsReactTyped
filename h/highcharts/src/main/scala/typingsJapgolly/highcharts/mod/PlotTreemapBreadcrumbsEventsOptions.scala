package typingsJapgolly.highcharts.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapBreadcrumbsEventsOptions extends StObject {
  
  /**
    * (Highcharts) Fires when clicking on the breadcrumbs button. Two arguments
    * are passed to the function. First breadcrumb button as an SVG element.
    * Second is the breadcrumbs class, containing reference to the chart,
    * series etc. (see online documentation for example)
    *
    * Return false to stop default buttons click action.
    */
  var click: js.UndefOr[BreadcrumbsClickCallbackFunction] = js.undefined
}
object PlotTreemapBreadcrumbsEventsOptions {
  
  inline def apply(): PlotTreemapBreadcrumbsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapBreadcrumbsEventsOptions]
  }
  
  extension [Self <: PlotTreemapBreadcrumbsEventsOptions](x: Self) {
    
    inline def setClick(value: (/* event */ Event, /* options */ BreadcrumbOptions, /* e */ Event) => Callback): Self = StObject.set(x, "click", js.Any.fromFunction3((t0: /* event */ Event, t1: /* options */ BreadcrumbOptions, t2: /* e */ Event) => (value(t0, t1, t2)).runNow()))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
  }
}
