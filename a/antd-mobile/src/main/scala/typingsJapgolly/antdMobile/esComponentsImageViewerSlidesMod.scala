package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsImageViewerSlidesMod {
  
  @JSImport("antd-mobile/es/components/image-viewer/slides", "Slides")
  @js.native
  val Slides: ForwardRefExoticComponent[SlidesType & RefAttributes[SlidesRef]] = js.native
  
  @js.native
  trait SlidesRef extends StObject {
    
    def swipeTo(index: Double): Unit = js.native
    def swipeTo(index: Double, immediate: Boolean): Unit = js.native
  }
  
  trait SlidesType extends StObject {
    
    var defaultIndex: Double
    
    var images: js.Array[String]
    
    var maxZoom: Double
    
    var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    def onTap(): Unit
  }
  object SlidesType {
    
    inline def apply(defaultIndex: Double, images: js.Array[String], maxZoom: Double, onTap: Callback): SlidesType = {
      val __obj = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], onTap = onTap.toJsFn)
      __obj.asInstanceOf[SlidesType]
    }
    
    extension [Self <: SlidesType](x: Self) {
      
      inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setOnIndexChange(value: /* index */ Double => Callback): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
      
      inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
      
      inline def setOnTap(value: Callback): Self = StObject.set(x, "onTap", value.toJsFn)
    }
  }
}
