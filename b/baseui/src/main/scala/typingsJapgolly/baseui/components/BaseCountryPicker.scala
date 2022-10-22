package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.phoneInputTypesMod.Country
import typingsJapgolly.baseui.phoneInputTypesMod.CountrySelectProps
import typingsJapgolly.baseui.phoneInputTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseCountryPicker {
  
  inline def apply(
    country: Country,
    disabled: Boolean,
    error: Boolean,
    inputRef: RefHandle[HTMLInputElement],
    maxDropdownHeight: String,
    maxDropdownWidth: String,
    onCountryChange: OnChangeParams => Any,
    overrides: typingsJapgolly.baseui.anon.CountrySelect,
    positive: Boolean,
    required: Boolean,
    size: Size
  ): SharedBuilder_CountrySelectProps183684365 = {
    val __props = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new SharedBuilder_CountrySelectProps183684365(js.Array(this.component, __props.asInstanceOf[CountrySelectProps]))
  }
  
  @JSImport("baseui/phone-input/base-country-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CountrySelectProps): SharedBuilder_CountrySelectProps183684365 = new SharedBuilder_CountrySelectProps183684365(js.Array(this.component, p.asInstanceOf[js.Any]))
}
