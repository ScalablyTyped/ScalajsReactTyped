package typingsJapgolly.reduxLittleRouter.components

import typingsJapgolly.reduxLittleRouter.mod.Href
import typingsJapgolly.reduxLittleRouter.mod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImmutableLink {
  
  inline def apply(href: Href): SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutableLink] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutableLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("redux-little-router", "ImmutableLink")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutableLink] = new SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutableLink](js.Array(this.component, p.asInstanceOf[js.Any]))
}
