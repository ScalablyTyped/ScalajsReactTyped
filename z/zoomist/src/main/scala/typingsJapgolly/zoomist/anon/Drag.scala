package typingsJapgolly.zoomist.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drag extends StObject {
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var drag: js.UndefOr[js.Function2[/* transform */ X, /* event */ Event, Unit]] = js.undefined
  
  var dragEnd: js.UndefOr[js.Function2[/* transform */ X, /* event */ Event, Unit]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function2[/* transform */ X, /* event */ Event, Unit]] = js.undefined
  
  var pinch: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var pinchEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var pinchStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var resize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var slide: js.UndefOr[js.Function2[/* value */ Double, /* event */ Event, Unit]] = js.undefined
  
  var slideEnd: js.UndefOr[js.Function2[/* value */ Double, /* event */ Event, Unit]] = js.undefined
  
  var slideStart: js.UndefOr[js.Function2[/* value */ Double, /* event */ Event, Unit]] = js.undefined
  
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var wheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.undefined
  
  var zoom: js.UndefOr[js.Function1[/* ratio */ Double, Unit]] = js.undefined
}
object Drag {
  
  inline def apply(): Drag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drag]
  }
  
  extension [Self <: Drag](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDrag(value: (/* transform */ X, /* event */ Event) => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction2((t0: /* transform */ X, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setDragEnd(value: (/* transform */ X, /* event */ Event) => Callback): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2((t0: /* transform */ X, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: (/* transform */ X, /* event */ Event) => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction2((t0: /* transform */ X, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setPinch(value: /* event */ Event => Callback): Self = StObject.set(x, "pinch", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setPinchEnd(value: /* event */ Event => Callback): Self = StObject.set(x, "pinchEnd", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setPinchEndUndefined: Self = StObject.set(x, "pinchEnd", js.undefined)
    
    inline def setPinchStart(value: /* event */ Event => Callback): Self = StObject.set(x, "pinchStart", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def setPinchStartUndefined: Self = StObject.set(x, "pinchStart", js.undefined)
    
    inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
    
    inline def setReady(value: Callback): Self = StObject.set(x, "ready", value.toJsFn)
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResize(value: Callback): Self = StObject.set(x, "resize", value.toJsFn)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setSlide(value: (/* value */ Double, /* event */ Event) => Callback): Self = StObject.set(x, "slide", js.Any.fromFunction2((t0: /* value */ Double, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setSlideEnd(value: (/* value */ Double, /* event */ Event) => Callback): Self = StObject.set(x, "slideEnd", js.Any.fromFunction2((t0: /* value */ Double, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setSlideEndUndefined: Self = StObject.set(x, "slideEnd", js.undefined)
    
    inline def setSlideStart(value: (/* value */ Double, /* event */ Event) => Callback): Self = StObject.set(x, "slideStart", js.Any.fromFunction2((t0: /* value */ Double, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setSlideStartUndefined: Self = StObject.set(x, "slideStart", js.undefined)
    
    inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWheel(value: /* event */ WheelEvent => Callback): Self = StObject.set(x, "wheel", js.Any.fromFunction1((t0: /* event */ WheelEvent) => value(t0).runNow()))
    
    inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    
    inline def setZoom(value: /* ratio */ Double => Callback): Self = StObject.set(x, "zoom", js.Any.fromFunction1((t0: /* ratio */ Double) => value(t0).runNow()))
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
