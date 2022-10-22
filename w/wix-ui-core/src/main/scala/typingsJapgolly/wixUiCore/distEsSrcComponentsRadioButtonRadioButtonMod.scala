package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.AbstractView
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.KeyboardEvent
import typingsJapgolly.react.mod.MouseEvent
import typingsJapgolly.react.mod.NativeMouseEvent
import typingsJapgolly.wixUiCore.anon.Focused
import typingsJapgolly.wixUiCore.anon.OnBlur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsRadioButtonRadioButtonMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton", "RadioButton")
  @js.native
  open class RadioButton protected () extends Component[RadioButtonProps, RadioButtonState, Any] {
    def this(props: RadioButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonProps, context: Any) = this()
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    /* private */ var focusedByMouse: Any = js.native
    
    def handleClick(event: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
    
    def handleInputChange(event: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
    
    def handleInputKeyDown(event: RadioButtonKeyDownEvent): Unit = js.native
    
    def onFocus(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
    
    def onHover(event: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onInputBlur(event: ReactFocusEventFrom[HTMLInputElement]): Unit = js.native
    
    /* private */ var radioRef: Any = js.native
    
    @JSName("state")
    var state_RadioButton: Focused = js.native
  }
  /* static members */
  object RadioButton {
    
    @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton", "RadioButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton", "RadioButton.bypassDefaultPropsTypecheck")
    @js.native
    def bypassDefaultPropsTypecheck: Any = js.native
    inline def bypassDefaultPropsTypecheck_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassDefaultPropsTypecheck")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton", "RadioButton.defaultProps")
    @js.native
    def defaultProps: OnBlur = js.native
    inline def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/radio-button/RadioButton", "RadioButton.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait RadioButtonChangeEvent
    extends StObject
       with MouseEvent[HTMLDivElement, NativeMouseEvent] {
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonChangeEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLDivElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: Callback,
      preventDefault: Callback,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView
    ): RadioButtonChangeEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonChangeEvent]
    }
    
    extension [Self <: RadioButtonChangeEvent](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioButtonClickEvent
    extends StObject
       with MouseEvent[HTMLDivElement, NativeMouseEvent] {
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonClickEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLDivElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: Callback,
      preventDefault: Callback,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView
    ): RadioButtonClickEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonClickEvent]
    }
    
    extension [Self <: RadioButtonClickEvent](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioButtonHoverEvent
    extends StObject
       with MouseEvent[HTMLSpanElement, NativeMouseEvent] {
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonHoverEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLSpanElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: Callback,
      preventDefault: Callback,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView
    ): RadioButtonHoverEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonHoverEvent]
    }
    
    extension [Self <: RadioButtonHoverEvent](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioButtonKeyDownEvent
    extends StObject
       with KeyboardEvent[HTMLInputElement] {
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonKeyDownEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLInputElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      key: String,
      keyCode: Double,
      locale: String,
      location: Double,
      metaKey: Boolean,
      nativeEvent: org.scalajs.dom.KeyboardEvent,
      persist: Callback,
      preventDefault: Callback,
      repeat: Boolean,
      shiftKey: Boolean,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      view: AbstractView,
      which: Double
    ): RadioButtonKeyDownEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonKeyDownEvent]
    }
    
    extension [Self <: RadioButtonKeyDownEvent](x: Self) {
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioButtonProps extends StObject {
    
    /** aria-describedby - Accessibility */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** aria-label - Accessibility */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** aria-labelledby - Accessibility */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /** define whether the native input radio should be auto focused */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Sets checked status of the radio */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** The checked icon */
    var checkedIcon: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Sets the disabled status of the radio */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** The button id */
    var id: js.UndefOr[String] = js.undefined
    
    /** The label */
    var label: js.UndefOr[Node] = js.undefined
    
    /** The group name which the button belongs to */
    var name: js.UndefOr[String] = js.undefined
    
    /** A callback to invoke on blur */
    var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    /** A callback to invoke on change */
    var onChange: js.UndefOr[js.Function1[/* event */ RadioButtonChangeEvent | RadioButtonClickEvent, Unit]] = js.undefined
    
    /** A callback to invoke on focus */
    var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    /** A callback to invoke on focus fired from keyboard event */
    var onFocusByKeyboard: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLInputElement], Unit]] = js.undefined
    
    /** A callback to invoke on hover */
    var onHover: js.UndefOr[js.Function1[/* event */ RadioButtonHoverEvent, Unit]] = js.undefined
    
    /** A callback to invoke on blur */
    var onIconBlur: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    /** A callback to invoke on keydown */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ RadioButtonKeyDownEvent, Unit]] = js.undefined
    
    /** Sets the required status of the radio */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** Inline style */
    var style: js.UndefOr[js.Object] = js.undefined
    
    /** Sets the tabindex to the input */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** The unchecked icon */
    var uncheckedIcon: js.UndefOr[Node] = js.undefined
    
    /** The value which the radio represents */
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonProps {
    
    inline def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: VdomNode): Self = StObject.set(x, "checkedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCheckedIconNull: Self = StObject.set(x, "checkedIcon", null)
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkedIcon", js.Array(value*))
      
      inline def setCheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "checkedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* event */ RadioButtonChangeEvent | RadioButtonClickEvent => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ RadioButtonChangeEvent | RadioButtonClickEvent) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnFocusByKeyboard(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onFocusByKeyboard", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnFocusByKeyboardUndefined: Self = StObject.set(x, "onFocusByKeyboard", js.undefined)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHover(value: /* event */ RadioButtonHoverEvent => Callback): Self = StObject.set(x, "onHover", js.Any.fromFunction1((t0: /* event */ RadioButtonHoverEvent) => value(t0).runNow()))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnIconBlur(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onIconBlur", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnIconBlurUndefined: Self = StObject.set(x, "onIconBlur", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ RadioButtonKeyDownEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* event */ RadioButtonKeyDownEvent) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUncheckedIcon(value: VdomNode): Self = StObject.set(x, "uncheckedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setUncheckedIconNull: Self = StObject.set(x, "uncheckedIcon", null)
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setUncheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "uncheckedIcon", js.Array(value*))
      
      inline def setUncheckedIconVdomElement(value: VdomElement): Self = StObject.set(x, "uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioButtonState extends StObject {
    
    var focusVisible: Boolean
    
    var focused: Boolean
  }
  object RadioButtonState {
    
    inline def apply(focusVisible: Boolean, focused: Boolean): RadioButtonState = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonState]
    }
    
    extension [Self <: RadioButtonState](x: Self) {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
}
