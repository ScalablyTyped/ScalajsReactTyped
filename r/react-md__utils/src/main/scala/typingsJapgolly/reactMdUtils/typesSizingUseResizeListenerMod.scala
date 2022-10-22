package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingUseResizeListenerMod {
  
  @JSImport("@react-md/utils/types/sizing/useResizeListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResizeListener(hasOnResizeOptionsImmediateEnabled: ResizeListenerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(hasOnResizeOptionsImmediateEnabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ResizeListenerOptions extends StObject {
    
    /**
      * Boolean if the resize observer should be enabled. You can swap this boolean
      * to `true` or `false` to add/remove the event listeners. The event listeners
      * will *always* be removed when the parent component is unmounted though.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the resize event handler should be called immediately once the
      * component is mounted. The default behavior will be to only call the
      * `onResize` event immediately client side and can never be invoked server
      * side since it resize on the `window` to dispatch a `UIEvent`.
      */
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to call when the app is resized.
      */
    var onResize: EventListener
    
    /**
      * Any event listener options to use when attaching the event.
      */
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
  }
  object ResizeListenerOptions {
    
    inline def apply(onResize: /* evt */ Event => Callback): ResizeListenerOptions = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1((t0: /* evt */ Event) => onResize(t0).runNow()))
      __obj.asInstanceOf[ResizeListenerOptions]
    }
    
    extension [Self <: ResizeListenerOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setOnResize(value: /* evt */ Event => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
