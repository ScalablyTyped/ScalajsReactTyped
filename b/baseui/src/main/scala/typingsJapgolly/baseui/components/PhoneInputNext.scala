package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.phoneInputTypesMod.Country
import typingsJapgolly.baseui.phoneInputTypesMod.PhoneInputLiteProps
import typingsJapgolly.baseui.phoneInputTypesMod.PhoneInputOverrides
import typingsJapgolly.baseui.phoneInputTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhoneInputNext {
  
  inline def apply(
    country: Country,
    disabled: Boolean,
    error: Boolean,
    maxDropdownHeight: String,
    maxDropdownWidth: String,
    onCountryChange: OnChangeParams => Any,
    onTextChange: ReactEventFrom[HTMLInputElement] => Any,
    overrides: PhoneInputOverrides,
    positive: Boolean,
    required: Boolean,
    size: Size,
    text: String
  ): SharedBuilder_PhoneInputLiteProps_1629848077 = {
    val __props = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new SharedBuilder_PhoneInputLiteProps_1629848077(js.Array(this.component, __props.asInstanceOf[PhoneInputLiteProps]))
  }
  
  @JSImport("baseui/phone-input/phone-input-next", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PhoneInputLiteProps): SharedBuilder_PhoneInputLiteProps_1629848077 = new SharedBuilder_PhoneInputLiteProps_1629848077(js.Array(this.component, p.asInstanceOf[js.Any]))
}
