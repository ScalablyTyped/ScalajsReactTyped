package typingsJapgolly.antd.components

import typingsJapgolly.antd.libDropdownDropdownButtonMod.DropdownButtonProps
import typingsJapgolly.antd.libDropdownDropdownMod.OverlayFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownButton {
  
  inline def apply(overlay: japgolly.scalajs.react.facade.React.Element | OverlayFunc): SharedBuilder_DropdownButtonProps_1704320932 = {
    val __props = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    new SharedBuilder_DropdownButtonProps_1704320932(js.Array(this.component, __props.asInstanceOf[DropdownButtonProps]))
  }
  
  @JSImport("antd/lib/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownButtonProps): SharedBuilder_DropdownButtonProps_1704320932 = new SharedBuilder_DropdownButtonProps_1704320932(js.Array(this.component, p.asInstanceOf[js.Any]))
}
