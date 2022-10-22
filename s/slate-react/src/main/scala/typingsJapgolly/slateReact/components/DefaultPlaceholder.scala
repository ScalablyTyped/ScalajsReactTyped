package typingsJapgolly.slateReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.slateReact.anon.ContentEditable
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultPlaceholder {
  
  inline def apply(attributes: ContentEditable, children: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RenderPlaceholderProps]))
  }
  
  @JSImport("slate-react", "DefaultPlaceholder")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RenderPlaceholderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
