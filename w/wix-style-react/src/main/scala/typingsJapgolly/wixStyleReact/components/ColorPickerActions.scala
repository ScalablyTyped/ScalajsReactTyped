package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.OnCancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPickerActions {
  
  inline def apply(disabled: Any, onCancel: Any, onConfirm: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onConfirm = onConfirm.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[OnCancel]))
  }
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerActions", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OnCancel): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
