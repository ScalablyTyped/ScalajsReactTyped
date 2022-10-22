package typingsJapgolly.reactOtpInput

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-otp-input", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[OTPInputProps, js.Object, Any] {
    def this(props: OTPInputProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OTPInputProps, context: Any) = this()
  }
  
  trait OTPInputProps extends StObject {
    
    var containerStyle: js.UndefOr[String | CSSProperties] = js.undefined
    
    var disabledStyle: js.UndefOr[String | CSSProperties] = js.undefined
    
    var errorStyle: js.UndefOr[String | CSSProperties] = js.undefined
    
    var focusStyle: js.UndefOr[String | CSSProperties] = js.undefined
    
    var hasErrored: js.UndefOr[Boolean] = js.undefined
    
    var inputStyle: js.UndefOr[String | CSSProperties] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isInputNum: js.UndefOr[Boolean] = js.undefined
    
    var numInputs: Double
    
    var onChange: Any
    
    var separator: js.UndefOr[Element] = js.undefined
    
    var shouldAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    var value: Double | String
  }
  object OTPInputProps {
    
    inline def apply(numInputs: Double, onChange: Any, value: Double | String): OTPInputProps = {
      val __obj = js.Dynamic.literal(numInputs = numInputs.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OTPInputProps]
    }
    
    extension [Self <: OTPInputProps](x: Self) {
      
      inline def setContainerStyle(value: String | CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisabledStyle(value: String | CSSProperties): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setErrorStyle(value: String | CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
      
      inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
      
      inline def setFocusStyle(value: String | CSSProperties): Self = StObject.set(x, "focusStyle", value.asInstanceOf[js.Any])
      
      inline def setFocusStyleUndefined: Self = StObject.set(x, "focusStyle", js.undefined)
      
      inline def setHasErrored(value: Boolean): Self = StObject.set(x, "hasErrored", value.asInstanceOf[js.Any])
      
      inline def setHasErroredUndefined: Self = StObject.set(x, "hasErrored", js.undefined)
      
      inline def setInputStyle(value: String | CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsInputNum(value: Boolean): Self = StObject.set(x, "isInputNum", value.asInstanceOf[js.Any])
      
      inline def setIsInputNumUndefined: Self = StObject.set(x, "isInputNum", js.undefined)
      
      inline def setNumInputs(value: Double): Self = StObject.set(x, "numInputs", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setShouldAutoFocus(value: Boolean): Self = StObject.set(x, "shouldAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setShouldAutoFocusUndefined: Self = StObject.set(x, "shouldAutoFocus", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
