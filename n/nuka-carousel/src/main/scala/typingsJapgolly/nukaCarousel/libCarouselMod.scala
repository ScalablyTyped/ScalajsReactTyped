package typingsJapgolly.nukaCarousel

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.nukaCarousel.libTypesMod.CarouselProps
import typingsJapgolly.nukaCarousel.libTypesMod.InternalCarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCarouselMod {
  
  object default {
    
    inline def apply(rawProps: CarouselProps): Element = ^.asInstanceOf[js.Dynamic].apply(rawProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("nuka-carousel/lib/carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nuka-carousel/lib/carousel", "default.defaultProps")
    @js.native
    def defaultProps: InternalCarouselProps = js.native
    inline def defaultProps_=(x: InternalCarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object Carousel {
    
    inline def apply(rawProps: CarouselProps): Element = ^.asInstanceOf[js.Dynamic].apply(rawProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("nuka-carousel/lib/carousel", "Carousel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nuka-carousel/lib/carousel", "Carousel.defaultProps")
    @js.native
    def defaultProps: InternalCarouselProps = js.native
    inline def defaultProps_=(x: InternalCarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
