package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewFullSizeTypesMod {
  
  trait IPreviewFullSize extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def showAt(second: Double): Unit
  }
  object IPreviewFullSize {
    
    inline def apply(destroy: Callback, getElement: CallbackTo[HTMLElement], hide: Callback, showAt: Double => Callback): IPreviewFullSize = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, hide = hide.toJsFn, showAt = js.Any.fromFunction1((t0: Double) => showAt(t0).runNow()))
      __obj.asInstanceOf[IPreviewFullSize]
    }
    
    extension [Self <: IPreviewFullSize](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShowAt(value: Double => Callback): Self = StObject.set(x, "showAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait IPreviewFullSizeViewStyles extends StObject {
    
    var container: String
    
    var frame: String
    
    var hidden: String
  }
  object IPreviewFullSizeViewStyles {
    
    inline def apply(container: String, frame: String, hidden: String): IPreviewFullSizeViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreviewFullSizeViewStyles]
    }
    
    extension [Self <: IPreviewFullSizeViewStyles](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
