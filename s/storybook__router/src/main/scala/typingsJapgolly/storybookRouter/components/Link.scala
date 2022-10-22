package typingsJapgolly.storybookRouter.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookRouter.mod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  inline def apply(to: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("@storybook/router", "Link")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
