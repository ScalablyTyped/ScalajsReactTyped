package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.phoneInputTypesMod.Country
import typingsJapgolly.baseui.phoneInputTypesMod.PhoneInputOverrides
import typingsJapgolly.baseui.phoneInputTypesMod.PhoneInputProps
import typingsJapgolly.baseui.phoneInputTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhoneInput {
  
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
  ): Builder = {
    val __props = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PhoneInputProps]))
  }
  
  @JSImport("baseui/phone-input", "PhoneInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-describedbyNull`: this.type = set("aria-describedby", null)
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelNull`: this.type = set("aria-label", null)
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledbyNull`: this.type = set("aria-labelledby", null)
    
    inline def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idNull: this.type = set("id", null)
    
    inline def mapIsoToLabel(value: /* iso */ String => String): this.type = set("mapIsoToLabel", js.Any.fromFunction1(value))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameNull: this.type = set("name", null)
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PhoneInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
