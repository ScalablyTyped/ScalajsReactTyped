package typingsJapgolly.flot.jquery.flot

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hooks extends StObject {
  
  var bindEvents: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]
  ] = js.undefined
  
  var draw: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.undefined
  
  var drawBackground: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.undefined
  
  var drawOverlay: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]
  ] = js.undefined
  
  var drawSeries: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
    ]
  ] = js.undefined
  
  var processDatapoints: js.UndefOr[
    js.Array[
      js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
    ]
  ] = js.undefined
  
  var processOffset: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]] = js.undefined
  
  var processOptions: js.UndefOr[js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]] = js.undefined
  
  var processRawData: js.UndefOr[
    js.Array[
      js.Function4[
        /* plot */ plot, 
        /* series */ dataSeries, 
        /* data */ js.Array[Any], 
        /* datapoints */ datapoints, 
        Unit
      ]
    ]
  ] = js.undefined
  
  var shutdown: js.UndefOr[
    js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]
  ] = js.undefined
}
object hooks {
  
  inline def apply(): hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hooks]
  }
  
  extension [Self <: hooks](x: Self) {
    
    inline def setBindEvents(value: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]): Self = StObject.set(x, "bindEvents", value.asInstanceOf[js.Any])
    
    inline def setBindEventsUndefined: Self = StObject.set(x, "bindEvents", js.undefined)
    
    inline def setBindEventsVarargs(value: (js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit])*): Self = StObject.set(x, "bindEvents", js.Array(value*))
    
    inline def setDraw(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
    
    inline def setDrawBackground(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = StObject.set(x, "drawBackground", value.asInstanceOf[js.Any])
    
    inline def setDrawBackgroundUndefined: Self = StObject.set(x, "drawBackground", js.undefined)
    
    inline def setDrawBackgroundVarargs(value: (js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit])*): Self = StObject.set(x, "drawBackground", js.Array(value*))
    
    inline def setDrawOverlay(value: js.Array[js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit]]): Self = StObject.set(x, "drawOverlay", value.asInstanceOf[js.Any])
    
    inline def setDrawOverlayUndefined: Self = StObject.set(x, "drawOverlay", js.undefined)
    
    inline def setDrawOverlayVarargs(value: (js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit])*): Self = StObject.set(x, "drawOverlay", js.Array(value*))
    
    inline def setDrawSeries(
      value: js.Array[
          js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit]
        ]
    ): Self = StObject.set(x, "drawSeries", value.asInstanceOf[js.Any])
    
    inline def setDrawSeriesUndefined: Self = StObject.set(x, "drawSeries", js.undefined)
    
    inline def setDrawSeriesVarargs(
      value: (js.Function3[/* plot */ plot, /* context */ CanvasRenderingContext2D, /* series */ dataSeries, Unit])*
    ): Self = StObject.set(x, "drawSeries", js.Array(value*))
    
    inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    inline def setDrawVarargs(value: (js.Function2[/* plot */ plot, /* context */ CanvasRenderingContext2D, Unit])*): Self = StObject.set(x, "draw", js.Array(value*))
    
    inline def setProcessDatapoints(
      value: js.Array[
          js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit]
        ]
    ): Self = StObject.set(x, "processDatapoints", value.asInstanceOf[js.Any])
    
    inline def setProcessDatapointsUndefined: Self = StObject.set(x, "processDatapoints", js.undefined)
    
    inline def setProcessDatapointsVarargs(
      value: (js.Function3[/* plot */ plot, /* series */ dataSeries, /* datapoints */ datapoints, Unit])*
    ): Self = StObject.set(x, "processDatapoints", js.Array(value*))
    
    inline def setProcessOffset(value: js.Array[js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit]]): Self = StObject.set(x, "processOffset", value.asInstanceOf[js.Any])
    
    inline def setProcessOffsetUndefined: Self = StObject.set(x, "processOffset", js.undefined)
    
    inline def setProcessOffsetVarargs(value: (js.Function2[/* plot */ plot, /* offset */ canvasPoint, Unit])*): Self = StObject.set(x, "processOffset", js.Array(value*))
    
    inline def setProcessOptions(value: js.Array[js.Function2[/* plot */ plot, /* options */ plotOptions, Unit]]): Self = StObject.set(x, "processOptions", value.asInstanceOf[js.Any])
    
    inline def setProcessOptionsUndefined: Self = StObject.set(x, "processOptions", js.undefined)
    
    inline def setProcessOptionsVarargs(value: (js.Function2[/* plot */ plot, /* options */ plotOptions, Unit])*): Self = StObject.set(x, "processOptions", js.Array(value*))
    
    inline def setProcessRawData(
      value: js.Array[
          js.Function4[
            /* plot */ plot, 
            /* series */ dataSeries, 
            /* data */ js.Array[Any], 
            /* datapoints */ datapoints, 
            Unit
          ]
        ]
    ): Self = StObject.set(x, "processRawData", value.asInstanceOf[js.Any])
    
    inline def setProcessRawDataUndefined: Self = StObject.set(x, "processRawData", js.undefined)
    
    inline def setProcessRawDataVarargs(
      value: (js.Function4[
          /* plot */ plot, 
          /* series */ dataSeries, 
          /* data */ js.Array[Any], 
          /* datapoints */ datapoints, 
          Unit
        ])*
    ): Self = StObject.set(x, "processRawData", js.Array(value*))
    
    inline def setShutdown(value: js.Array[js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit]]): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setShutdownUndefined: Self = StObject.set(x, "shutdown", js.undefined)
    
    inline def setShutdownVarargs(value: (js.Function2[/* plot */ plot, /* eventHolder */ JQuery[HTMLElement], Unit])*): Self = StObject.set(x, "shutdown", js.Array(value*))
  }
}
