package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewThumbnailTypesMod {
  
  trait IPreviewThumbnail extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def setTime(time: String): Unit
    
    def showAt(second: Double): Unit
  }
  object IPreviewThumbnail {
    
    inline def apply(
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      setTime: String => Callback,
      showAt: Double => Callback
    ): IPreviewThumbnail = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getElement = getElement.toJsFn, setTime = js.Any.fromFunction1((t0: String) => setTime(t0).runNow()), showAt = js.Any.fromFunction1((t0: Double) => showAt(t0).runNow()))
      __obj.asInstanceOf[IPreviewThumbnail]
    }
    
    extension [Self <: IPreviewThumbnail](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setSetTime(value: String => Callback): Self = StObject.set(x, "setTime", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setShowAt(value: Double => Callback): Self = StObject.set(x, "showAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait IPreviewThumbnailViewStyles extends StObject {
    
    var container: String
    
    var empty: String
    
    var highQualityFrame: String
    
    var lowQualityFrame: String
    
    var thumbText: String
  }
  object IPreviewThumbnailViewStyles {
    
    inline def apply(
      container: String,
      empty: String,
      highQualityFrame: String,
      lowQualityFrame: String,
      thumbText: String
    ): IPreviewThumbnailViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], highQualityFrame = highQualityFrame.asInstanceOf[js.Any], lowQualityFrame = lowQualityFrame.asInstanceOf[js.Any], thumbText = thumbText.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPreviewThumbnailViewStyles]
    }
    
    extension [Self <: IPreviewThumbnailViewStyles](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setHighQualityFrame(value: String): Self = StObject.set(x, "highQualityFrame", value.asInstanceOf[js.Any])
      
      inline def setLowQualityFrame(value: String): Self = StObject.set(x, "lowQualityFrame", value.asInstanceOf[js.Any])
      
      inline def setThumbText(value: String): Self = StObject.set(x, "thumbText", value.asInstanceOf[js.Any])
    }
  }
}
