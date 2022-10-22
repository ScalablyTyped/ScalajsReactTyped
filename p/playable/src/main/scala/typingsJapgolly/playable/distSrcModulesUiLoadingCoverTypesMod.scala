package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLoadingCoverTypesMod {
  
  trait ILoadingCover extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setLoadingCover(src: String): Unit
    
    def show(): Unit
  }
  object ILoadingCover {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      hide: Callback,
      setLoadingCover: String => Callback,
      show: Callback
    ): ILoadingCover = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, setLoadingCover = js.Any.fromFunction1((t0: String) => setLoadingCover(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[ILoadingCover]
    }
    
    extension [Self <: ILoadingCover](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setSetLoadingCover(value: String => Callback): Self = StObject.set(x, "setLoadingCover", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait ILoadingCoverViewStyles extends StObject {
    
    var hidden: String
    
    var loadingCover: String
    
    var loadingCoverImage: String
  }
  object ILoadingCoverViewStyles {
    
    inline def apply(hidden: String, loadingCover: String, loadingCoverImage: String): ILoadingCoverViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], loadingCover = loadingCover.asInstanceOf[js.Any], loadingCoverImage = loadingCoverImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadingCoverViewStyles]
    }
    
    extension [Self <: ILoadingCoverViewStyles](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLoadingCover(value: String): Self = StObject.set(x, "loadingCover", value.asInstanceOf[js.Any])
      
      inline def setLoadingCoverImage(value: String): Self = StObject.set(x, "loadingCoverImage", value.asInstanceOf[js.Any])
    }
  }
}
