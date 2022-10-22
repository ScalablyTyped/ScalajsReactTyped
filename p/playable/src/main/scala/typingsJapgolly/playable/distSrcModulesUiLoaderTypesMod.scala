package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLoaderTypesMod {
  
  trait ILoader extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isDelayedShowScheduled: Boolean
    
    def show(): Unit
    
    def stopDelayedShow(): Unit
  }
  object ILoader {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      isDelayedShowScheduled: Boolean,
      show: Callback,
      stopDelayedShow: Callback
    ): ILoader = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, isDelayedShowScheduled = isDelayedShowScheduled.asInstanceOf[js.Any], show = show.toJsFn, stopDelayedShow = stopDelayedShow.toJsFn)
      __obj.asInstanceOf[ILoader]
    }
    
    extension [Self <: ILoader](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsDelayedShowScheduled(value: Boolean): Self = StObject.set(x, "isDelayedShowScheduled", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setStopDelayedShow(value: Callback): Self = StObject.set(x, "stopDelayedShow", value.toJsFn)
    }
  }
  
  trait ILoaderViewStyles extends StObject {
    
    var active: String
    
    var hidden: String
    
    var loader: String
  }
  object ILoaderViewStyles {
    
    inline def apply(active: String, hidden: String, loader: String): ILoaderViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoaderViewStyles]
    }
    
    extension [Self <: ILoaderViewStyles](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    }
  }
}
