package typingsJapgolly.brainhubeuReactCarousel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.brainhubeuReactCarousel.mod.CarouselBreakpoints
import typingsJapgolly.brainhubeuReactCarousel.mod.CarouselPluginTypes
import typingsJapgolly.brainhubeuReactCarousel.mod.CarouselProps
import typingsJapgolly.brainhubeuReactCarousel.mod.default
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCarousel {
  
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationSpeed(value: Double): this.type = set("animationSpeed", value.asInstanceOf[js.Any])
    
    inline def breakpoints(value: CarouselBreakpoints): this.type = set("breakpoints", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def itemWidth(value: Double): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def plugins(value: js.Array[String | CarouselPluginTypes]): this.type = set("plugins", value.asInstanceOf[js.Any])
    
    inline def pluginsVarargs(value: (String | CarouselPluginTypes)*): this.type = set("plugins", js.Array(value*))
    
    inline def slides(value: js.Array[Element]): this.type = set("slides", value.asInstanceOf[js.Any])
    
    inline def slidesVarargs(value: Element*): this.type = set("slides", js.Array(value*))
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCarousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
