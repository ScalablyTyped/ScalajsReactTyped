package typingsJapgolly.slateReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.slateReact.anon.Dataslateinline
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultElement {
  
  inline def apply(
    attributes: Dataslateinline,
    children: Any,
    element: typingsJapgolly.slate.distInterfacesElementMod.Element
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RenderElementProps]))
  }
  
  @JSImport("slate-react", "DefaultElement")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RenderElementProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
