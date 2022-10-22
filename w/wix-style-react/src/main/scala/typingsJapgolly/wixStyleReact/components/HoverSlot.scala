package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.Display
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverSlot {
  
  inline def apply(children: Any, display: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Display]))
  }
  
  @JSImport("wix-style-react/dist/types/TableActionCell/HoverSlot", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Display): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
