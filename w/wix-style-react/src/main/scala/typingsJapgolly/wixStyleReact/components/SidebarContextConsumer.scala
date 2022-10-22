package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.GetIsMenuExpanded
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarContextConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarContextConsumer {
  
  inline def apply(children: GetIsMenuExpanded => Node): Default[typingsJapgolly.wixStyleReact.mod.SidebarContextConsumer] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[typingsJapgolly.wixStyleReact.mod.SidebarContextConsumer](js.Array(this.component, __props.asInstanceOf[SidebarContextConsumerProps]))
  }
  
  @JSImport("wix-style-react", "SidebarContextConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SidebarContextConsumerProps): Default[typingsJapgolly.wixStyleReact.mod.SidebarContextConsumer] = new Default[typingsJapgolly.wixStyleReact.mod.SidebarContextConsumer](js.Array(this.component, p.asInstanceOf[js.Any]))
}
