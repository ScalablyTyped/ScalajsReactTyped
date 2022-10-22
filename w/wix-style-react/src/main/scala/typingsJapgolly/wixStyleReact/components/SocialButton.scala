package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.IconOnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SocialButton {
  
  inline def apply(dataHook: Any, disabled: Any, icon: Any, onClick: Any, text: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[IconOnClick]))
  }
  
  @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconOnClick): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
