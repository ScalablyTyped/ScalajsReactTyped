package typingsJapgolly.maplibreGl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Touch
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  val dblclick: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ ^, HandlerResult | scala.Unit]] = js.undefined
  
  def disable(): scala.Unit
  
  def enable(): scala.Unit
  
  def isActive(): Boolean
  
  def isEnabled(): Boolean
  
  val keydown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, HandlerResult | scala.Unit]] = js.undefined
  
  val keyup: js.UndefOr[js.Function1[/* e */ KeyboardEvent, HandlerResult | scala.Unit]] = js.undefined
  
  val mousedown: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ ^, HandlerResult | scala.Unit]] = js.undefined
  
  val mousemove: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ ^, HandlerResult | scala.Unit]] = js.undefined
  
  val mouseup: js.UndefOr[js.Function2[/* e */ MouseEvent, /* point */ ^, HandlerResult | scala.Unit]] = js.undefined
  
  val renderFrame: js.UndefOr[js.Function0[HandlerResult | scala.Unit]] = js.undefined
  
  def reset(): scala.Unit
  
  val touchcancel: js.UndefOr[
    js.Function3[
      /* e */ TouchEvent, 
      /* points */ js.Array[^], 
      /* mapTouches */ js.Array[Touch], 
      HandlerResult | scala.Unit
    ]
  ] = js.undefined
  
  val touchend: js.UndefOr[
    js.Function3[
      /* e */ TouchEvent, 
      /* points */ js.Array[^], 
      /* mapTouches */ js.Array[Touch], 
      HandlerResult | scala.Unit
    ]
  ] = js.undefined
  
  val touchmove: js.UndefOr[
    js.Function3[
      /* e */ TouchEvent, 
      /* points */ js.Array[^], 
      /* mapTouches */ js.Array[Touch], 
      HandlerResult | scala.Unit
    ]
  ] = js.undefined
  
  val touchstart: js.UndefOr[
    js.Function3[
      /* e */ TouchEvent, 
      /* points */ js.Array[^], 
      /* mapTouches */ js.Array[Touch], 
      HandlerResult | scala.Unit
    ]
  ] = js.undefined
  
  val wheel: js.UndefOr[js.Function2[/* e */ WheelEvent, /* point */ ^, HandlerResult | scala.Unit]] = js.undefined
}
object Handler {
  
  inline def apply(
    disable: japgolly.scalajs.react.Callback,
    enable: japgolly.scalajs.react.Callback,
    isActive: CallbackTo[Boolean],
    isEnabled: CallbackTo[Boolean],
    reset: japgolly.scalajs.react.Callback
  ): Handler = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, isActive = isActive.toJsFn, isEnabled = isEnabled.toJsFn, reset = reset.toJsFn)
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setDblclick(value: (/* e */ MouseEvent, /* point */ ^) => HandlerResult | scala.Unit): Self = StObject.set(x, "dblclick", js.Any.fromFunction2(value))
    
    inline def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
    
    inline def setDisable(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setKeydown(value: /* e */ KeyboardEvent => HandlerResult | scala.Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeyup(value: /* e */ KeyboardEvent => HandlerResult | scala.Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction1(value))
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setMousedown(value: (/* e */ MouseEvent, /* point */ ^) => HandlerResult | scala.Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction2(value))
    
    inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    inline def setMousemove(value: (/* e */ MouseEvent, /* point */ ^) => HandlerResult | scala.Unit): Self = StObject.set(x, "mousemove", js.Any.fromFunction2(value))
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseup(value: (/* e */ MouseEvent, /* point */ ^) => HandlerResult | scala.Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction2(value))
    
    inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    inline def setRenderFrame(value: CallbackTo[HandlerResult | scala.Unit]): Self = StObject.set(x, "renderFrame", value.toJsFn)
    
    inline def setRenderFrameUndefined: Self = StObject.set(x, "renderFrame", js.undefined)
    
    inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setTouchcancel(
      value: (/* e */ TouchEvent, /* points */ js.Array[^], /* mapTouches */ js.Array[Touch]) => HandlerResult | scala.Unit
    ): Self = StObject.set(x, "touchcancel", js.Any.fromFunction3(value))
    
    inline def setTouchcancelUndefined: Self = StObject.set(x, "touchcancel", js.undefined)
    
    inline def setTouchend(
      value: (/* e */ TouchEvent, /* points */ js.Array[^], /* mapTouches */ js.Array[Touch]) => HandlerResult | scala.Unit
    ): Self = StObject.set(x, "touchend", js.Any.fromFunction3(value))
    
    inline def setTouchendUndefined: Self = StObject.set(x, "touchend", js.undefined)
    
    inline def setTouchmove(
      value: (/* e */ TouchEvent, /* points */ js.Array[^], /* mapTouches */ js.Array[Touch]) => HandlerResult | scala.Unit
    ): Self = StObject.set(x, "touchmove", js.Any.fromFunction3(value))
    
    inline def setTouchmoveUndefined: Self = StObject.set(x, "touchmove", js.undefined)
    
    inline def setTouchstart(
      value: (/* e */ TouchEvent, /* points */ js.Array[^], /* mapTouches */ js.Array[Touch]) => HandlerResult | scala.Unit
    ): Self = StObject.set(x, "touchstart", js.Any.fromFunction3(value))
    
    inline def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
    
    inline def setWheel(value: (/* e */ WheelEvent, /* point */ ^) => HandlerResult | scala.Unit): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    
    inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
  }
}
