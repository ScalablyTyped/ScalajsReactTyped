package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.ObjectFit
import typingsJapgolly.csstype.mod.Property.ObjectPosition
import typingsJapgolly.wixStyleReact.distTypesCarouselMod.CarouselControlsPosition
import typingsJapgolly.wixStyleReact.distTypesCarouselMod.CarouselImage
import typingsJapgolly.wixStyleReact.distTypesCarouselMod.CarouselProps
import typingsJapgolly.wixStyleReact.distTypesIconButtonMod.IconButtonSkin
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.hidden
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("wix-style-react", "Carousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Carousel] {
    
    inline def afterChange(value: /* currentSlide */ Double => Callback): this.type = set("afterChange", js.Any.fromFunction1((t0: /* currentSlide */ Double) => value(t0).runNow()))
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def beforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Callback): this.type = set("beforeChange", js.Any.fromFunction2((t0: /* currentSlide */ Double, t1: /* nextSlide */ Double) => (value(t0, t1)).runNow()))
    
    inline def buttonSkin(value: IconButtonSkin): this.type = set("buttonSkin", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def controlsPosition(value: CarouselControlsPosition): this.type = set("controlsPosition", value.asInstanceOf[js.Any])
    
    inline def controlsSize(value: tiny | small | medium): this.type = set("controlsSize", value.asInstanceOf[js.Any])
    
    inline def controlsStartEnd(value: disabled | hidden): this.type = set("controlsStartEnd", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dots(value: Boolean): this.type = set("dots", value.asInstanceOf[js.Any])
    
    inline def images(value: js.Array[CarouselImage]): this.type = set("images", value.asInstanceOf[js.Any])
    
    inline def imagesFit(value: ObjectFit): this.type = set("imagesFit", value.asInstanceOf[js.Any])
    
    inline def imagesPosition(value: ObjectPosition[String | Double]): this.type = set("imagesPosition", value.asInstanceOf[js.Any])
    
    inline def imagesVarargs(value: CarouselImage*): this.type = set("images", js.Array(value*))
    
    inline def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    inline def initialSlideIndex(value: Double): this.type = set("initialSlideIndex", value.asInstanceOf[js.Any])
    
    inline def showControlsShadow(value: Boolean): this.type = set("showControlsShadow", value.asInstanceOf[js.Any])
    
    inline def variableWidth(value: Boolean): this.type = set("variableWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
