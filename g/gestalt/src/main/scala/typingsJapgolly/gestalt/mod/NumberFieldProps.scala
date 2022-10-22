package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.anon.EventFocusEventValue
import typingsJapgolly.gestalt.anon.EventKeyboardEventValue
import typingsJapgolly.gestalt.anon.EventSyntheticEventValue
import typingsJapgolly.gestalt.gestaltStrings.done
import typingsJapgolly.gestalt.gestaltStrings.enter
import typingsJapgolly.gestalt.gestaltStrings.go
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.next
import typingsJapgolly.gestalt.gestaltStrings.off
import typingsJapgolly.gestalt.gestaltStrings.on
import typingsJapgolly.gestalt.gestaltStrings.previous
import typingsJapgolly.gestalt.gestaltStrings.search
import typingsJapgolly.gestalt.gestaltStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFieldProps extends StObject {
  
  /**
    * Indicate if autocomplete should be available to the input.
    */
  var autoComplete: js.UndefOr[on | off] = js.undefined
  
  /**
    * Indicate if the input is disabled
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Optionally specify the action label to present for the enter key on virtual keyboards.
    */
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  /**
    * For most cases, pass a string with a helpful error message (be sure to localize!).
    * In certain instances it can be useful to make some text clickable; to suppor this you may instead pass a React.Node to wrap text in Link or TapArea.
    */
  var errorMessage: js.UndefOr[Node] = js.undefined
  
  /**
    * More information about how to complete the form field
    */
  var helperText: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the input
    */
  var id: String
  
  /**
    * The label for the input. Be sure to localize the text.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The upper bound of valid input, inclusive.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The lower bound of valid input, inclusive.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * An unique name for the input
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Callback triggered when the user blurs the input.
    */
  var onBlur: js.UndefOr[js.Function1[/* args */ EventFocusEventValue, Unit]] = js.undefined
  
  /**
    * Callback triggered when the value of the input changes, whether by keyboard entry or the input's arrows.
    */
  def onChange(args: EventSyntheticEventValue): Unit
  
  /**
    * Callback triggered when the user focuses the input.
    */
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEventValue, Unit]] = js.undefined
  
  /**
    * Callback triggered when the user presses any key while the input is focused.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* args */ EventKeyboardEventValue, Unit]] = js.undefined
  
  /**
    * Placeholder text shown when the user has not yes input a value.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * md: 40px, lg: 48px
    *
    * @default "md"
    */
  var size: js.UndefOr[md | lg] = js.undefined
  
  /**
    * Indicates the amount the value will increase or decrease when using the input's arrows.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * The current value of the input.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object NumberFieldProps {
  
  inline def apply(id: String, onChange: EventSyntheticEventValue => Callback): NumberFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: EventSyntheticEventValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[NumberFieldProps]
  }
  
  extension [Self <: NumberFieldProps](x: Self) {
    
    inline def setAutoComplete(value: on | off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
    inline def setErrorMessage(value: VdomNode): Self = StObject.set(x, "errorMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "errorMessage", js.Array(value*))
    
    inline def setErrorMessageVdomElement(value: VdomElement): Self = StObject.set(x, "errorMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(value: /* args */ EventFocusEventValue => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* args */ EventFocusEventValue) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: EventSyntheticEventValue => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: EventSyntheticEventValue) => value(t0).runNow()))
    
    inline def setOnFocus(value: /* args */ EventFocusEventValue => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* args */ EventFocusEventValue) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* args */ EventKeyboardEventValue => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* args */ EventKeyboardEventValue) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
