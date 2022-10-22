package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressEditor.componentsPostVisibilityCheckMod.PostVisibilityCheck.Props
import typingsJapgolly.wordpressEditor.componentsPostVisibilityCheckMod.PostVisibilityCheck.RenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostVisibilityCheck {
  
  inline def apply(render: RenderProps => Element): Default[js.Object] = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "PostVisibilityCheck")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
