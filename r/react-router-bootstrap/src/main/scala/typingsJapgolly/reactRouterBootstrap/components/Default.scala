package typingsJapgolly.reactRouterBootstrap.components

import typingsJapgolly.reactRouterBootstrap.libLinkContainerMod.defaultCls
import typingsJapgolly.reactRouterDom.mod.NavLinkProps
import typingsJapgolly.remixRunRouter.distHistoryMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  inline def apply(to: To): SharedBuilder_NavLinkProps_831779880[defaultCls] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new SharedBuilder_NavLinkProps_831779880[defaultCls](js.Array(this.component, __props.asInstanceOf[NavLinkProps]))
  }
  
  @JSImport("react-router-bootstrap/lib/LinkContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavLinkProps): SharedBuilder_NavLinkProps_831779880[defaultCls] = new SharedBuilder_NavLinkProps_831779880[defaultCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
