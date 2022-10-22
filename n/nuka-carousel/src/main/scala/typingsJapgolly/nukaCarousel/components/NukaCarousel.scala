package typingsJapgolly.nukaCarousel.components

import typingsJapgolly.nukaCarousel.libTypesMod.CarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NukaCarousel {
  
  @JSImport("nuka-carousel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: NukaCarousel.type): SharedBuilder_CarouselProps1475835319 = new SharedBuilder_CarouselProps1475835319(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps): SharedBuilder_CarouselProps1475835319 = new SharedBuilder_CarouselProps1475835319(js.Array(this.component, p.asInstanceOf[js.Any]))
}
