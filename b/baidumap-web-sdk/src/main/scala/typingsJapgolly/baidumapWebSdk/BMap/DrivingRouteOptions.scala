package typingsJapgolly.baidumapWebSdk.BMap

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivingRouteOptions extends StObject {
  
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.undefined
  
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ DrivingRouteResult, Unit]] = js.undefined
  
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object DrivingRouteOptions {
  
  inline def apply(): DrivingRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrivingRouteOptions]
  }
  
  extension [Self <: DrivingRouteOptions](x: Self) {
    
    inline def setOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onInfoHtmlSet", js.Any.fromFunction2((t0: /* poi */ LocalResultPoi, t1: /* html */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def setOnInfoHtmlSetUndefined: Self = StObject.set(x, "onInfoHtmlSet", js.undefined)
    
    inline def setOnMarkersSet(value: /* pois */ js.Array[LocalResultPoi] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction1((t0: /* pois */ js.Array[LocalResultPoi]) => value(t0).runNow()))
    
    inline def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    inline def setOnPolylinesSet(value: /* routes */ js.Array[Route] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onPolylinesSet", js.Any.fromFunction1((t0: /* routes */ js.Array[Route]) => value(t0).runNow()))
    
    inline def setOnPolylinesSetUndefined: Self = StObject.set(x, "onPolylinesSet", js.undefined)
    
    inline def setOnResultsHtmlSet(value: /* container */ HTMLElement => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onResultsHtmlSet", js.Any.fromFunction1((t0: /* container */ HTMLElement) => value(t0).runNow()))
    
    inline def setOnResultsHtmlSetUndefined: Self = StObject.set(x, "onResultsHtmlSet", js.undefined)
    
    inline def setOnSearchComplete(value: /* results */ DrivingRouteResult => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1((t0: /* results */ DrivingRouteResult) => value(t0).runNow()))
    
    inline def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    inline def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
