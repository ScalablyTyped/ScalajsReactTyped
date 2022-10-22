package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.ContentAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SideContent {
  
  inline def apply(content: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ContentAny]))
  }
  
  @JSImport("wix-style-react/dist/types/Tabs/core/SideContent", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ContentAny): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
