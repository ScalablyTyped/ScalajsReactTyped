package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libPickerAbstractPickerMod.AbstractPickerProps
import typingsJapgolly.antdMobileRn.libPickerAbstractPickerMod.default
import typingsJapgolly.antdMobileRn.libPickerPropsTypeMod.PickerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AbstractPicker {
  
  inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): SharedBuilder_AbstractPickerProps_1562276244[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_AbstractPickerProps_1562276244[default](js.Array(this.component, __props.asInstanceOf[AbstractPickerProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/picker/AbstractPicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AbstractPickerProps): SharedBuilder_AbstractPickerProps_1562276244[default] = new SharedBuilder_AbstractPickerProps_1562276244[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
