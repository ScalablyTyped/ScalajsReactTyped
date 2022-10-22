package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.DisabledSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hash {
  
  inline def apply(disabled: Any, size: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DisabledSize]))
  }
  
  @JSImport("wix-style-react/dist/types/ColorInput/components/Hash", "Hash")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DisabledSize): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
