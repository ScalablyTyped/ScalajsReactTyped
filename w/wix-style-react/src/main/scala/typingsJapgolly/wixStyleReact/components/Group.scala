package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ChildrenAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  inline def apply(children: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ChildrenAny]))
  }
  
  @JSImport("wix-style-react/dist/types/Input/Group", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ChildrenAny): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
