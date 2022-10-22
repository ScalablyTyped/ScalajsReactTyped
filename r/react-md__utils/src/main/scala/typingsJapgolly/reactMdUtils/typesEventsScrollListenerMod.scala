package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.Event
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsScrollListenerMod {
  
  @JSImport("@react-md/utils/types/events/ScrollListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  /* Inlined std.Omit<@react-md/utils.@react-md/utils/types/events/useScrollListener.ScrollListenerHookOptions, 'enabled'> */
  trait ScrollListenerProps extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var onScroll: EventListener
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object ScrollListenerProps {
    
    inline def apply(onScroll: /* evt */ Event => Callback): ScrollListenerProps = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1((t0: /* evt */ Event) => onScroll(t0).runNow()))
      __obj.asInstanceOf[ScrollListenerProps]
    }
    
    extension [Self <: ScrollListenerProps](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setOnScroll(value: /* evt */ Event => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
