package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libCarouselCaptionMod.CarouselCaptionProps
import typingsJapgolly.reactBootstrap.libCarouselCaptionMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CarouselCaption {
  
  @JSImport("react-bootstrap/lib/CarouselCaption", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CarouselCaption.type): SharedBuilder_CarouselCaptionProps_1691608149[^] = new SharedBuilder_CarouselCaptionProps_1691608149[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselCaptionProps): SharedBuilder_CarouselCaptionProps_1691608149[^] = new SharedBuilder_CarouselCaptionProps_1691608149[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
