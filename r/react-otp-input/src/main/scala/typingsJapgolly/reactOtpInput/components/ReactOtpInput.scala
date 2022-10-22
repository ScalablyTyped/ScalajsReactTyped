package typingsJapgolly.reactOtpInput.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOtpInput.mod.OTPInputProps
import typingsJapgolly.reactOtpInput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactOtpInput {
  
  inline def apply(numInputs: Double, onChange: Any, value: Double | String): Builder = {
    val __props = js.Dynamic.literal(numInputs = numInputs.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OTPInputProps]))
  }
  
  @JSImport("react-otp-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def containerStyle(value: String | CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def disabledStyle(value: String | CSSProperties): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
    
    inline def errorStyle(value: String | CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    inline def focusStyle(value: String | CSSProperties): this.type = set("focusStyle", value.asInstanceOf[js.Any])
    
    inline def hasErrored(value: Boolean): this.type = set("hasErrored", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: String | CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def isInputNum(value: Boolean): this.type = set("isInputNum", value.asInstanceOf[js.Any])
    
    inline def separator(value: VdomElement): this.type = set("separator", value.rawElement.asInstanceOf[js.Any])
    
    inline def shouldAutoFocus(value: Boolean): this.type = set("shouldAutoFocus", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OTPInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
