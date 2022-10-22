package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ChildrenSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Description {
  
  inline def apply(children: Any, size: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ChildrenSize]))
  }
  
  @JSImport("wix-style-react/dist/types/MarketingLayout/components/Description", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ChildrenSize): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
