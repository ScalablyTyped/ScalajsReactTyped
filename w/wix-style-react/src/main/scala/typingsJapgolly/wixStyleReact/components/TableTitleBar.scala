package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableTitleBar {
  
  inline def apply(dataHook: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[`12`]))
  }
  
  @JSImport("wix-style-react/dist/types/Table/components", "TableTitleBar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: `12`): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
