package typingsJapgolly.bmapgl.BMapGL

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusLineSearchOptions extends StObject {
  
  var onBusLineHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onBusListHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onGetBusLineComplete: js.UndefOr[js.Function1[/* rs */ BusLine, Unit]] = js.undefined
  
  var onGetBusListComplete: js.UndefOr[js.Function1[/* rs */ BusListResult, Unit]] = js.undefined
  
  var onMarkersSet: js.UndefOr[js.Function1[/* sts */ js.Array[Marker], Unit]] = js.undefined
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* ply */ Polyline, Unit]] = js.undefined
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object BusLineSearchOptions {
  
  inline def apply(): BusLineSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusLineSearchOptions]
  }
  
  extension [Self <: BusLineSearchOptions](x: Self) {
    
    inline def setOnBusLineHtmlSet(value: /* container */ HTMLElement => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onBusLineHtmlSet", js.Any.fromFunction1((t0: /* container */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnBusLineHtmlSetUndefined: Self = StObject.set(x, "onBusLineHtmlSet", js.undefined)
    
    inline def setOnBusListHtmlSet(value: /* container */ HTMLElement => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onBusListHtmlSet", js.Any.fromFunction1((t0: /* container */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnBusListHtmlSetUndefined: Self = StObject.set(x, "onBusListHtmlSet", js.undefined)
    
    inline def setOnGetBusLineComplete(value: /* rs */ BusLine => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onGetBusLineComplete", js.Any.fromFunction1((t0: /* rs */ BusLine) => value(t0).runNow()))
    
    inline def setOnGetBusLineCompleteUndefined: Self = StObject.set(x, "onGetBusLineComplete", js.undefined)
    
    inline def setOnGetBusListComplete(value: /* rs */ BusListResult => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onGetBusListComplete", js.Any.fromFunction1((t0: /* rs */ BusListResult) => value(t0).runNow()))
    
    inline def setOnGetBusListCompleteUndefined: Self = StObject.set(x, "onGetBusListComplete", js.undefined)
    
    inline def setOnMarkersSet(value: /* sts */ js.Array[Marker] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction1((t0: /* sts */ js.Array[Marker]) => value(t0).runNow()))
    
    inline def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    inline def setOnPolylinesSet(value: /* ply */ Polyline => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onPolylinesSet", js.Any.fromFunction1((t0: /* ply */ Polyline) => value(t0).runNow()))
    
    inline def setOnPolylinesSetUndefined: Self = StObject.set(x, "onPolylinesSet", js.undefined)
    
    inline def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
