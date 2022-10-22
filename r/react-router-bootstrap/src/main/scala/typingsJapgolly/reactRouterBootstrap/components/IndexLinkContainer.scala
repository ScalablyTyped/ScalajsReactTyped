package typingsJapgolly.reactRouterBootstrap.components

import typingsJapgolly.reactRouterBootstrap.mod.IndexLinkContainerCls
import typingsJapgolly.reactRouterDom.mod.NavLinkProps
import typingsJapgolly.remixRunRouter.distHistoryMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexLinkContainer {
  
  inline def apply(to: To): SharedBuilder_NavLinkProps_831779880[IndexLinkContainerCls] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps_831779880[IndexLinkContainerCls](js.Array(this.component, __props.asInstanceOf[NavLinkProps]))
  }
  
  @JSImport("react-router-bootstrap", "IndexLinkContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavLinkProps): SharedBuilder_NavLinkProps_831779880[IndexLinkContainerCls] = new SharedBuilder_NavLinkProps_831779880[IndexLinkContainerCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
