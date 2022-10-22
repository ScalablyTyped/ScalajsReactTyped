package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.EventHandler
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.anon.FocusVisible
import typingsJapgolly.wixUiCore.anon.PartialCheckboxProps
import typingsJapgolly.wixUiCore.wixUiCoreStrings.grammar
import typingsJapgolly.wixUiCore.wixUiCoreStrings.spelling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCheckboxCheckboxMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/checkbox/Checkbox", "Checkbox")
  @js.native
  open class Checkbox protected () extends Component[CheckboxProps, CheckboxState, Any] {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: Any) = this()
    
    /* private */ var checkbox: Any = js.native
    
    def focus(): Unit = js.native
    
    /* private */ var focusedByMouse: Any = js.native
    
    /* private */ val handleChange: Any = js.native
    
    /* private */ val handleInputBlur: Any = js.native
    
    /* private */ val handleInputFocus: Any = js.native
    
    /* private */ val handleInputKeyDown: Any = js.native
    
    /* private */ val handleMouseDown: Any = js.native
    
    @JSName("state")
    var state_Checkbox: FocusVisible = js.native
  }
  /* static members */
  object Checkbox {
    
    @JSImport("wix-ui-core/dist/es/src/components/checkbox/Checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/checkbox/Checkbox", "Checkbox.defaultProps")
    @js.native
    def defaultProps: PartialCheckboxProps = js.native
    inline def defaultProps_=(x: PartialCheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/checkbox/Checkbox", "Checkbox.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait CheckboxProps
    extends StObject
       with InputHTMLAttributes[HTMLElement] {
    
    @JSName("aria-invalid")
    var `aria-invalid_CheckboxProps`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
    
    /** An element to be displayed when the checkbox is checked */
    var checkedIcon: js.UndefOr[Element] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Whether checkbox should be in error state */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the checkbox is indeterminate */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** An element to be displayed when the checkbox is in indeterminate state */
    var indeterminateIcon: js.UndefOr[Element] = js.undefined
    
    /** A callback to invoke on blur */
    @JSName("onBlur")
    var onBlur_CheckboxProps: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    /** The onChange function will be called with a new checked value */
    @JSName("onChange")
    var onChange_CheckboxProps: js.UndefOr[EventHandler[OnChangeEvent]] = js.undefined
    
    /** A callback to invoke on focus fired from keyboard event */
    var onFocusByKeyboard: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    /** An element to be displayed when the checkbox is unchecked */
    var uncheckedIcon: js.UndefOr[Element] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def setCheckedIcon(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateIcon(value: VdomElement): Self = StObject.set(x, "indeterminateIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndeterminateIconUndefined: Self = StObject.set(x, "indeterminateIcon", js.undefined)
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setOnBlur(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: OnChangeEvent => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: OnChangeEvent) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocusByKeyboard(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onFocusByKeyboard", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnFocusByKeyboardUndefined: Self = StObject.set(x, "onFocusByKeyboard", js.undefined)
      
      inline def setUncheckedIcon(value: VdomElement): Self = StObject.set(x, "uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    }
  }
  
  trait CheckboxState extends StObject {
    
    var focusVisible: Boolean
    
    var isFocused: Boolean
  }
  object CheckboxState {
    
    inline def apply(focusVisible: Boolean, isFocused: Boolean): CheckboxState = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxState]
    }
    
    extension [Self <: CheckboxState](x: Self) {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnChangeEvent
    extends StObject
       with ChangeEvent[HTMLInputElement] {
    
    var checked: Boolean
  }
  object OnChangeEvent {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      checked: Boolean,
      currentTarget: EventTarget & HTMLInputElement,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: Callback,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: EventTarget & HTMLInputElement,
      timeStamp: Double,
      `type`: String
    ): OnChangeEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeEvent]
    }
    
    extension [Self <: OnChangeEvent](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
}
