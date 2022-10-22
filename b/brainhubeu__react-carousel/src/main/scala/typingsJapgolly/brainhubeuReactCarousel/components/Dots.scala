package typingsJapgolly.brainhubeuReactCarousel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.brainhubeuReactCarousel.mod.DotsProps
import typingsJapgolly.brainhubeuReactCarousel.mod.ImgProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dots {
  
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.brainhubeuReactCarousel.mod.Dots] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def number(value: Double): this.type = set("number", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def thumbnails(value: js.Array[ImgProps]): this.type = set("thumbnails", value.asInstanceOf[js.Any])
    
    inline def thumbnailsVarargs(value: ImgProps*): this.type = set("thumbnails", js.Array(value*))
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Dots.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DotsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
