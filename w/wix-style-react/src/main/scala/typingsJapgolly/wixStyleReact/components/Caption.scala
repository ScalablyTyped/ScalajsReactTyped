package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.Light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Caption {
  
  inline def apply(caption: Any, children: Any, className: Any, dataHook: Any, light: Any, tagName: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Light]))
  }
  
  @JSImport("wix-style-react/dist/types/Text/Caption", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Light): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
