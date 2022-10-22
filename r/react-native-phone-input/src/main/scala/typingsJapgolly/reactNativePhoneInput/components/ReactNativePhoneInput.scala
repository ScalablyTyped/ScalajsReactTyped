package typingsJapgolly.reactNativePhoneInput.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePhoneInput.mod.CountriesListItem
import typingsJapgolly.reactNativePhoneInput.mod.ReactNativePhoneInputProps
import typingsJapgolly.reactNativePhoneInput.mod.TextStyle
import typingsJapgolly.reactNativePhoneInput.mod.ViewStyle
import typingsJapgolly.reactNativePhoneInput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativePhoneInput {
  
  inline def apply[TextComponentType /* <: ComponentType[js.Object] */](): Builder[TextComponentType] = {
    val __props = js.Dynamic.literal()
    new Builder[TextComponentType](js.Array(this.component, __props.asInstanceOf[ReactNativePhoneInputProps[TextComponentType]]))
  }
  
  @JSImport("react-native-phone-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TextComponentType /* <: ComponentType[js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[TextComponentType]] {
    
    inline def allowZeroAfterCountryCode(value: Boolean): this.type = set("allowZeroAfterCountryCode", value.asInstanceOf[js.Any])
    
    inline def buttonTextStyle(value: TextStyle): this.type = set("buttonTextStyle", value.asInstanceOf[js.Any])
    
    inline def buttonTextStyleNull: this.type = set("buttonTextStyle", null)
    
    inline def cancelText(value: String): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    inline def confirmText(value: String): this.type = set("confirmText", value.asInstanceOf[js.Any])
    
    inline def countriesList(value: js.Array[CountriesListItem]): this.type = set("countriesList", value.asInstanceOf[js.Any])
    
    inline def countriesListVarargs(value: CountriesListItem*): this.type = set("countriesList", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def flagStyle(value: ViewStyle): this.type = set("flagStyle", value.asInstanceOf[js.Any])
    
    inline def flagStyleNull: this.type = set("flagStyle", null)
    
    inline def initialCountry(value: String): this.type = set("initialCountry", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onChangePhoneNumber(value: /* number */ String => Callback): this.type = set("onChangePhoneNumber", js.Any.fromFunction1((t0: /* number */ String) => value(t0).runNow()))
    
    inline def onPressCancel(value: Callback): this.type = set("onPressCancel", value.toJsFn)
    
    inline def onPressConfirm(value: Callback): this.type = set("onPressConfirm", value.toJsFn)
    
    inline def onPressFlag(value: Callback): this.type = set("onPressFlag", value.toJsFn)
    
    inline def onSelectCountry(value: /* iso2 */ String => Callback): this.type = set("onSelectCountry", js.Any.fromFunction1((t0: /* iso2 */ String) => value(t0).runNow()))
    
    inline def pickerBackgroundColor(value: String): this.type = set("pickerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def pickerButtonColor(value: String): this.type = set("pickerButtonColor", value.asInstanceOf[js.Any])
    
    inline def pickerItemStyle(value: ViewStyle): this.type = set("pickerItemStyle", value.asInstanceOf[js.Any])
    
    inline def pickerItemStyleNull: this.type = set("pickerItemStyle", null)
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textComponent(value: TextComponentType): this.type = set("textComponent", value.asInstanceOf[js.Any])
    
    inline def textProps(value: ComponentProps[TextComponentType]): this.type = set("textProps", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make[TextComponentType /* <: ComponentType[js.Object] */](companion: ReactNativePhoneInput.type): Builder[TextComponentType] = new Builder[TextComponentType](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[TextComponentType /* <: ComponentType[js.Object] */](p: ReactNativePhoneInputProps[TextComponentType]): Builder[TextComponentType] = new Builder[TextComponentType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
