package typingsJapgolly.antd.components

import typingsJapgolly.antd.libAnchorAnchorLinkMod.AnchorLinkProps
import typingsJapgolly.antd.libAnchorAnchorLinkMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnchorLink {
  
  inline def apply(href: String): SharedBuilder_AnchorLinkProps382954627[default] = {
    val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    new SharedBuilder_AnchorLinkProps382954627[default](js.Array(this.component, __props.asInstanceOf[AnchorLinkProps]))
  }
  
  @JSImport("antd/lib/anchor/AnchorLink", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AnchorLinkProps): SharedBuilder_AnchorLinkProps382954627[default] = new SharedBuilder_AnchorLinkProps382954627[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
