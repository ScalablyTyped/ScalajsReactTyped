package typingsJapgolly.reactColorful.components

import typingsJapgolly.reactColorful.anon.PartialColorPickerBasePro
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HexColorPicker {
  
  @JSImport("react-colorful", "HexColorPicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: HexColorPicker.type): SharedBuilder_PartialColorPickerBasePro2010714988 = new SharedBuilder_PartialColorPickerBasePro2010714988(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialColorPickerBasePro): SharedBuilder_PartialColorPickerBasePro2010714988 = new SharedBuilder_PartialColorPickerBasePro2010714988(js.Array(this.component, p.asInstanceOf[js.Any]))
}
