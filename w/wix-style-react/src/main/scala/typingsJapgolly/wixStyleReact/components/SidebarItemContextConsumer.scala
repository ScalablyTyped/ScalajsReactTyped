package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.GetIsMenuExpandedSelected
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarItemContextConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarItemContextConsumer {
  
  inline def apply(children: GetIsMenuExpandedSelected => Node): Default[typingsJapgolly.wixStyleReact.mod.SidebarItemContextConsumer] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[typingsJapgolly.wixStyleReact.mod.SidebarItemContextConsumer](js.Array(this.component, __props.asInstanceOf[SidebarItemContextConsumerProps]))
  }
  
  @JSImport("wix-style-react", "SidebarItemContextConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SidebarItemContextConsumerProps): Default[typingsJapgolly.wixStyleReact.mod.SidebarItemContextConsumer] = new Default[typingsJapgolly.wixStyleReact.mod.SidebarItemContextConsumer](js.Array(this.component, p.asInstanceOf[js.Any]))
}
