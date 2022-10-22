package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionButton {
  
  inline def apply(children: Any, link: Any, onClick: Any, target: Any, `type`: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Link]))
  }
  
  @JSImport("wix-style-react/dist/types/Notification/ActionButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Link): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
