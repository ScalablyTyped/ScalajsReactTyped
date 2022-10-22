package typingsJapgolly.slateReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.slateReact.anon.Dataslateleaf
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderLeafProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultLeaf {
  
  inline def apply(
    attributes: Dataslateleaf,
    children: Any,
    leaf: typingsJapgolly.slate.distInterfacesTextMod.Text,
    text: typingsJapgolly.slate.distInterfacesTextMod.Text
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RenderLeafProps]))
  }
  
  @JSImport("slate-react", "DefaultLeaf")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RenderLeafProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
