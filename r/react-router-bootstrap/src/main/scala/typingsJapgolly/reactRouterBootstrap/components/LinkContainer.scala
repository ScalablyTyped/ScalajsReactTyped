package typingsJapgolly.reactRouterBootstrap.components

import typingsJapgolly.reactRouterBootstrap.mod.LinkContainerCls
import typingsJapgolly.reactRouterDom.mod.NavLinkProps
import typingsJapgolly.remixRunRouter.distHistoryMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkContainer {
  
  inline def apply(to: To): SharedBuilder_NavLinkProps_831779880[LinkContainerCls] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps_831779880[LinkContainerCls](js.Array(this.component, __props.asInstanceOf[NavLinkProps]))
  }
  
  @JSImport("react-router-bootstrap", "LinkContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavLinkProps): SharedBuilder_NavLinkProps_831779880[LinkContainerCls] = new SharedBuilder_NavLinkProps_831779880[LinkContainerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
