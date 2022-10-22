package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.Gutter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slide {
  
  inline def apply(
    children: Any,
    className: Any,
    dataHook: Any,
    gutter: Any,
    image: Any,
    imageFit: Any,
    imagePosition: Any,
    width: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageFit = imageFit.asInstanceOf[js.Any], imagePosition = imagePosition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Gutter]))
  }
  
  @JSImport("wix-style-react/dist/types/CarouselWIP/Slide", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Gutter): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
