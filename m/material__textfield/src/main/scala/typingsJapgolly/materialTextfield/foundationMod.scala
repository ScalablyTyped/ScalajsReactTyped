package typingsJapgolly.materialTextfield

import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTextfield.adapterMod.MDCTextFieldAdapter
import typingsJapgolly.materialTextfield.anon.PartialMDCTextFieldAdapte
import typingsJapgolly.materialTextfield.anon.PartialMDCTextFieldFounda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/textfield/foundation", JSImport.Default)
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  open class default () extends MDCTextFieldFoundation {
    def this(adapter: PartialMDCTextFieldAdapte) = this()
    def this(adapter: Unit, foundationMap: PartialMDCTextFieldFounda) = this()
    def this(adapter: PartialMDCTextFieldAdapte, foundationMap: PartialMDCTextFieldFounda) = this()
  }
  
  @JSImport("@material/textfield/foundation", "MDCTextFieldFoundation")
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  open class MDCTextFieldFoundation () extends MDCFoundation[MDCTextFieldAdapter] {
    def this(adapter: PartialMDCTextFieldAdapte) = this()
    def this(adapter: Unit, foundationMap: PartialMDCTextFieldFounda) = this()
    def this(adapter: PartialMDCTextFieldAdapte, foundationMap: PartialMDCTextFieldFounda) = this()
    
    /**
      * Activates the text field focus state.
      */
    def activateFocus(): Unit = js.native
    
    /**
      * Activates the Text Field's focus state in cases when the input value
      * changes without user input (e.g. programmatically).
      */
    def autoCompleteFocus(): Unit = js.native
    
    /* private */ val characterCounter: Any = js.native
    
    /**
      * Deactivates the Text Field's focus state.
      */
    def deactivateFocus(): Unit = js.native
    
    /**
      * @return The native text input element from the host environment, or an
      *     object with the same shape for unit tests.
      */
    /* private */ var getNativeInput: Any = js.native
    
    /**
      * @return Whether or not validity should be updated on value change. `true`
      *     by default.
      */
    def getValidateOnValueChange(): Boolean = js.native
    
    def getValue(): String = js.native
    
    /**
      * Handles input change of text input and text area.
      */
    def handleInput(): Unit = js.native
    
    /**
      * Handles user interactions with the Text Field.
      */
    def handleTextFieldInteraction(): Unit = js.native
    
    /**
      * Handles validation attribute changes
      */
    def handleValidationAttributeChange(attributesList: js.Array[String]): Unit = js.native
    
    /* private */ val helperText: Any = js.native
    
    /* private */ val inputBlurHandler: Any = js.native
    
    /* private */ val inputFocusHandler: Any = js.native
    
    /* private */ val inputInputHandler: Any = js.native
    
    /**
      * @return True if the Text Field input fails in converting the user-supplied
      *     value.
      */
    /* private */ var isBadInput: Any = js.native
    
    def isDisabled(): Boolean = js.native
    
    /* private */ var isFocused: Any = js.native
    
    /**
      * @return The result of native validity checking (ValidityState.valid).
      */
    /* private */ var isNativeInputValid: Any = js.native
    
    /**
      * @return The custom validity state, if set; otherwise, the result of a
      *     native validity check.
      */
    def isValid(): Boolean = js.native
    
    /* private */ val leadingIcon: Any = js.native
    
    /**
      * Opens/closes the notched outline.
      */
    def notchOutline(openNotch: Boolean): Unit = js.native
    
    /* private */ var receivedUserInput: Any = js.native
    
    /**
      * @param disabled Sets the text-field disabled or enabled.
      */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    /**
      * @param content Sets the content of the helper text.
      */
    def setHelperTextContent(content: String): Unit = js.native
    
    /**
      * Sets the aria label of the leading icon.
      */
    def setLeadingIconAriaLabel(label: String): Unit = js.native
    
    /**
      * Sets the text content of the leading icon.
      */
    def setLeadingIconContent(content: String): Unit = js.native
    
    /* private */ val setPointerXOffset: Any = js.native
    
    /**
      * Sets the aria label of the trailing icon.
      */
    def setTrailingIconAriaLabel(label: String): Unit = js.native
    
    /**
      * Sets the text content of the trailing icon.
      */
    def setTrailingIconContent(content: String): Unit = js.native
    
    def setTransformOrigin(evt: MouseEvent): Unit = js.native
    /**
      * Sets the line ripple's transform origin, so that the line ripple activate
      * animation will animate out from the user's click location.
      */
    def setTransformOrigin(evt: TouchEvent): Unit = js.native
    
    /**
      * Enables or disables the use of native validation. Use this for custom
      * validation.
      * @param useNativeValidation Set this to false to ignore native input
      *     validation.
      */
    def setUseNativeValidation(useNativeValidation: Boolean): Unit = js.native
    
    /**
      * @param isValid Sets the custom validity state of the Text Field.
      */
    def setValid(isValid: Boolean): Unit = js.native
    
    /**
      * @param shouldValidate Whether or not validity should be updated on
      *     value change.
      */
    def setValidateOnValueChange(shouldValidate: Boolean): Unit = js.native
    
    /**
      * @param value The value to set on the input Element.
      */
    def setValue(value: String): Unit = js.native
    
    /**
      * Sets character counter values that shows characters used and the total
      * character limit.
      */
    /* private */ var setcharacterCounter: Any = js.native
    
    /* private */ def shouldAlwaysFloat: Any = js.native
    
    def shouldFloat: Boolean = js.native
    
    def shouldShake: Boolean = js.native
    
    /**
      * Styles the component based on the disabled state.
      */
    /* private */ var styleDisabled: Any = js.native
    
    /**
      * Styles the component based on the label floating state.
      */
    /* private */ var styleFloating: Any = js.native
    
    /**
      * Styles the component based on the focused state.
      */
    /* private */ var styleFocused: Any = js.native
    
    /**
      * Styles the component based on the validity state.
      */
    /* private */ var styleValidity: Any = js.native
    
    /* private */ val textFieldInteractionHandler: Any = js.native
    
    /* private */ val trailingIcon: Any = js.native
    
    /* private */ var useNativeValidation: Any = js.native
    
    /* private */ var valid: Any = js.native
    
    /* private */ var validateOnValueChange: Any = js.native
    
    /* private */ val validationAttributeChangeHandler: Any = js.native
    
    /* private */ var validationObserver: Any = js.native
  }
}
