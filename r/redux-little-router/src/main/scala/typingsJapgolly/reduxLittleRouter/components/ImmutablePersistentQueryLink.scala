package typingsJapgolly.reduxLittleRouter.components

import typingsJapgolly.reduxLittleRouter.mod.Href
import typingsJapgolly.reduxLittleRouter.mod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImmutablePersistentQueryLink {
  
  inline def apply(href: Href): SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutablePersistentQueryLink] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutablePersistentQueryLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("redux-little-router", "ImmutablePersistentQueryLink")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutablePersistentQueryLink] = new SharedBuilder_LinkProps1956631017[typingsJapgolly.reduxLittleRouter.mod.ImmutablePersistentQueryLink](js.Array(this.component, p.asInstanceOf[js.Any]))
}
