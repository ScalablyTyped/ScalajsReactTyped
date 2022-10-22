package typingsJapgolly.pixiApp

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  trait Application extends StObject {
    
    def cancelResize(): Unit
    
    def queueResize(): Unit
    
    def resize(): Unit
    
    var resizeTo: Window | HTMLElement
  }
  object Application {
    
    inline def apply(cancelResize: Callback, queueResize: Callback, resize: Callback, resizeTo: Window | HTMLElement): Application = {
      val __obj = js.Dynamic.literal(cancelResize = cancelResize.toJsFn, queueResize = queueResize.toJsFn, resize = resize.toJsFn, resizeTo = resizeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setCancelResize(value: Callback): Self = StObject.set(x, "cancelResize", value.toJsFn)
      
      inline def setQueueResize(value: Callback): Self = StObject.set(x, "queueResize", value.toJsFn)
      
      inline def setResize(value: Callback): Self = StObject.set(x, "resize", value.toJsFn)
      
      inline def setResizeTo(value: Window | HTMLElement): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationOptions extends StObject {
    
    var resizeTo: js.UndefOr[Window | HTMLElement] = js.undefined
  }
  object IApplicationOptions {
    
    inline def apply(): IApplicationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationOptions]
    }
    
    extension [Self <: IApplicationOptions](x: Self) {
      
      inline def setResizeTo(value: Window | HTMLElement): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
      
      inline def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
    }
  }
}
