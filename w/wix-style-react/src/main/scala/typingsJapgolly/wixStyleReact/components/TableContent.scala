package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.TitleBarDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableContent {
  
  inline def apply(dataHook: Any, titleBarDisplay: Any, titleBarVisible: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], titleBarDisplay = titleBarDisplay.asInstanceOf[js.Any], titleBarVisible = titleBarVisible.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TitleBarDisplay]))
  }
  
  @JSImport("wix-style-react/dist/types/Table/components", "TableContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TitleBarDisplay): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
