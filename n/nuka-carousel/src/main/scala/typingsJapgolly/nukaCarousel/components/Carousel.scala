package typingsJapgolly.nukaCarousel.components

import typingsJapgolly.nukaCarousel.libTypesMod.CarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("nuka-carousel/lib/carousel", "Carousel")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Carousel.type): SharedBuilder_CarouselProps1475835319 = new SharedBuilder_CarouselProps1475835319(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): SharedBuilder_CarouselProps1475835319 = new SharedBuilder_CarouselProps1475835319(js.Array(this.component, p.asInstanceOf[js.Any]))
}
