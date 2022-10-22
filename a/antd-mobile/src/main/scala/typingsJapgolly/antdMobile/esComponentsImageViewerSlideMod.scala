package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageViewerSlideMod {
  
  @JSImport("antd-mobile/es/components/image-viewer/slide", "Slide")
  @js.native
  val Slide: FC[Props] = js.native
  
  trait Props extends StObject {
    
    var dragLockRef: js.UndefOr[MutableRefObject[Boolean]] = js.undefined
    
    var image: String
    
    var maxZoom: Double
    
    def onTap(): Unit
    
    var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.undefined
  }
  object Props {
    
    inline def apply(image: String, maxZoom: Double, onTap: Callback): Props = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], onTap = onTap.toJsFn)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDragLockRef(value: MutableRefObject[Boolean]): Self = StObject.set(x, "dragLockRef", value.asInstanceOf[js.Any])
      
      inline def setDragLockRefUndefined: Self = StObject.set(x, "dragLockRef", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setOnTap(value: Callback): Self = StObject.set(x, "onTap", value.toJsFn)
      
      inline def setOnZoomChange(value: /* zoom */ Double => Callback): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction1((t0: /* zoom */ Double) => value(t0).runNow()))
      
      inline def setOnZoomChangeUndefined: Self = StObject.set(x, "onZoomChange", js.undefined)
    }
  }
}
