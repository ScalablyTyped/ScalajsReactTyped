package typingsJapgolly.nativeToast

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.nativeToast.nativeToastStrings.`north-east`
import typingsJapgolly.nativeToast.nativeToastStrings.`north-west`
import typingsJapgolly.nativeToast.nativeToastStrings.`south-east`
import typingsJapgolly.nativeToast.nativeToastStrings.`south-west`
import typingsJapgolly.nativeToast.nativeToastStrings.center
import typingsJapgolly.nativeToast.nativeToastStrings.east
import typingsJapgolly.nativeToast.nativeToastStrings.error
import typingsJapgolly.nativeToast.nativeToastStrings.info
import typingsJapgolly.nativeToast.nativeToastStrings.north
import typingsJapgolly.nativeToast.nativeToastStrings.south
import typingsJapgolly.nativeToast.nativeToastStrings.success
import typingsJapgolly.nativeToast.nativeToastStrings.warning
import typingsJapgolly.nativeToast.nativeToastStrings.west
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  @JSImport("native-toast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  inline def info(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  inline def success(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  inline def warning(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  trait Toast extends StObject {
    
    def destroy(): Unit
    
    def hide(): Unit
    
    def show(): Unit
  }
  object Toast {
    
    inline def apply(destroy: Callback, hide: Callback, show: Callback): Toast = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[Toast]
    }
    
    extension [Self <: Toast](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ToastOptions extends StObject {
    
    var closeOnClick: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var edge: js.UndefOr[Boolean] = js.undefined
    
    var el: js.UndefOr[HTMLElement] = js.undefined
    
    var elements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var icon: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[
        center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
      ] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[success | warning | info | error] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    extension [Self <: ToastOptions](x: Self) {
      
      inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPosition(
        value: center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: success | warning | info | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
