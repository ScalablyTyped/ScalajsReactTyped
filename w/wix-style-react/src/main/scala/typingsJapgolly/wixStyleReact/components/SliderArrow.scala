package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ArrowSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderArrow {
  
  inline def apply(arrowSize: Any, buttonSkin: Any, className: Any, controlsStartEnd: Any, dataHook: Any, icon: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], buttonSkin = buttonSkin.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], controlsStartEnd = controlsStartEnd.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ArrowSize]))
  }
  
  @JSImport("wix-style-react/dist/types/Carousel/SliderArrow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArrowSize): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
