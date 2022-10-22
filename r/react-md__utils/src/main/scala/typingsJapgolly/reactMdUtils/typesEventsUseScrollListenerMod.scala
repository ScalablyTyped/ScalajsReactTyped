package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsUseScrollListenerMod {
  
  @JSImport("@react-md/utils/types/events/useScrollListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useScrollListener(hasOncePassiveSignalCaptureEnabledOnScroll: ScrollListenerHookOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(hasOncePassiveSignalCaptureEnabledOnScroll.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ScrollListenerHookOptions
    extends StObject
       with AddEventListenerOptions {
    
    /** @defaultValue `true` */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The event handler that will be fired when the page scrolls or if any child
      * element scrolls when the {@link capture} option is `true`.
      */
    var onScroll: EventListener
  }
  object ScrollListenerHookOptions {
    
    inline def apply(onScroll: /* evt */ Event => Callback): ScrollListenerHookOptions = {
      val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1((t0: /* evt */ Event) => onScroll(t0).runNow()))
      __obj.asInstanceOf[ScrollListenerHookOptions]
    }
    
    extension [Self <: ScrollListenerHookOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOnScroll(value: /* evt */ Event => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
}
