package typingsJapgolly.nukaCarousel

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.nukaCarousel.libTypesMod.InternalCarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libControlsMod {
  
  @JSImport("nuka-carousel/lib/controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    props: InternalCarouselProps,
    slideCount: Double,
    currentSlide: Double,
    goToSlide: js.Function1[/* targetSlideIndex */ Double, Unit],
    nextSlide: js.Function0[Unit],
    prevSlide: js.Function0[Unit],
    slidesToScroll: Double
  ): js.Array[Element] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], slideCount.asInstanceOf[js.Any], currentSlide.asInstanceOf[js.Any], goToSlide.asInstanceOf[js.Any], nextSlide.asInstanceOf[js.Any], prevSlide.asInstanceOf[js.Any], slidesToScroll.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element] | Null]
}
