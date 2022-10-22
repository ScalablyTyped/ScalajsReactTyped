package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.antdMobileRn.libPickerAbstractPickerMod.AbstractPickerProps
import typingsJapgolly.antdMobileRn.libPickerPropsTypeMod.PickerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Picker {
  
  inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): SharedBuilder_AbstractPickerProps_1562276244[typingsJapgolly.antdMobileRn.mod.Picker] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_AbstractPickerProps_1562276244[typingsJapgolly.antdMobileRn.mod.Picker](js.Array(this.component, __props.asInstanceOf[AbstractPickerProps]))
  }
  
  @JSImport("antd-mobile-rn", "Picker")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AbstractPickerProps): SharedBuilder_AbstractPickerProps_1562276244[typingsJapgolly.antdMobileRn.mod.Picker] = new SharedBuilder_AbstractPickerProps_1562276244[typingsJapgolly.antdMobileRn.mod.Picker](js.Array(this.component, p.asInstanceOf[js.Any]))
}
