package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.DataHookHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FunnelBar {
  
  inline def apply(dataHook: Any, height: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DataHookHeight]))
  }
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelBar", "FunnelBar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DataHookHeight): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
