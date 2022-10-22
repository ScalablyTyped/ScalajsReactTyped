package typingsJapgolly.useResizeObserver

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.Element
import typingsJapgolly.std.ResizeObserverSize
import typingsJapgolly.useResizeObserver.anon.Box
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-resize-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Element */](): HookResponse[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[HookResponse[T]]
  inline def default[T /* <: Element */](opts: Box[T]): HookResponse[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[HookResponse[T]]
  
  trait HookResponse[T /* <: Element */]
    extends StObject
       with ObservedSize {
    
    var ref: RefFn[T]
  }
  object HookResponse {
    
    inline def apply[T /* <: Element */](ref: T | Null => Callback): HookResponse[T] = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1((t0: T | Null) => ref(t0).runNow()))
      __obj.asInstanceOf[HookResponse[T]]
    }
    
    extension [Self <: HookResponse[?], T /* <: Element */](x: Self & HookResponse[T]) {
      
      inline def setRef(value: T | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: T | Null) => value(t0).runNow()))
    }
  }
  
  trait ObservedSize extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ObservedSize {
    
    inline def apply(): ObservedSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObservedSize]
    }
    
    extension [Self <: ObservedSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ResizeHandler = js.Function1[/* size */ ObservedSize, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.useResizeObserver.useResizeObserverStrings.`border-box`
    - typingsJapgolly.useResizeObserver.useResizeObserverStrings.`content-box`
    - typingsJapgolly.useResizeObserver.useResizeObserverStrings.`device-pixel-content-box`
  */
  trait ResizeObserverBoxOptions extends StObject
  object ResizeObserverBoxOptions {
    
    inline def `border-box`: typingsJapgolly.useResizeObserver.useResizeObserverStrings.`border-box` = "border-box".asInstanceOf[typingsJapgolly.useResizeObserver.useResizeObserverStrings.`border-box`]
    
    inline def `content-box`: typingsJapgolly.useResizeObserver.useResizeObserverStrings.`content-box` = "content-box".asInstanceOf[typingsJapgolly.useResizeObserver.useResizeObserverStrings.`content-box`]
    
    inline def `device-pixel-content-box`: typingsJapgolly.useResizeObserver.useResizeObserverStrings.`device-pixel-content-box` = "device-pixel-content-box".asInstanceOf[typingsJapgolly.useResizeObserver.useResizeObserverStrings.`device-pixel-content-box`]
  }
  
  type RoundingFunction = js.Function1[/* n */ Double, Double]
  
  object global {
    
    trait ResizeObserverEntry extends StObject {
      
      val devicePixelContentBoxSize: js.Array[ResizeObserverSize]
    }
    object ResizeObserverEntry {
      
      inline def apply(devicePixelContentBoxSize: js.Array[ResizeObserverSize]): ResizeObserverEntry = {
        val __obj = js.Dynamic.literal(devicePixelContentBoxSize = devicePixelContentBoxSize.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResizeObserverEntry]
      }
      
      extension [Self <: ResizeObserverEntry](x: Self) {
        
        inline def setDevicePixelContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "devicePixelContentBoxSize", value.asInstanceOf[js.Any])
        
        inline def setDevicePixelContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "devicePixelContentBoxSize", js.Array(value*))
      }
    }
  }
}
