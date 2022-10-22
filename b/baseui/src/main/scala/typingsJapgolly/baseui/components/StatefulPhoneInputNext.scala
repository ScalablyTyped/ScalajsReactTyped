package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.phoneInputTypesMod.Country
import typingsJapgolly.baseui.phoneInputTypesMod.PhoneInputOverrides
import typingsJapgolly.baseui.phoneInputTypesMod.Size
import typingsJapgolly.baseui.phoneInputTypesMod.StatefulPhoneInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulPhoneInputNext {
  
  inline def apply(
    country: Country,
    disabled: Boolean,
    error: Boolean,
    maxDropdownHeight: String,
    maxDropdownWidth: String,
    overrides: PhoneInputOverrides,
    positive: Boolean,
    required: Boolean,
    size: Size,
    text: String
  ): SharedBuilder_StatefulPhoneInputProps45473510 = {
    val __props = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new SharedBuilder_StatefulPhoneInputProps45473510(js.Array(this.component, __props.asInstanceOf[StatefulPhoneInputProps]))
  }
  
  @JSImport("baseui/phone-input/stateful-phone-input-next", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StatefulPhoneInputProps): SharedBuilder_StatefulPhoneInputProps45473510 = new SharedBuilder_StatefulPhoneInputProps45473510(js.Array(this.component, p.asInstanceOf[js.Any]))
}
