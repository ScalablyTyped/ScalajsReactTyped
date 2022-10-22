package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.`13`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircleLoaderCheck {
  
  inline def apply(className: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[`13`]))
  }
  
  @JSImport("wix-style-react/dist/types/Themes/businessDashboard/icons", "CircleLoaderCheck")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: `13`): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
