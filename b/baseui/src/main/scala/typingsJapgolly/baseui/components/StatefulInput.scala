package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.baseuiStrings.both
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.inputMod.InputOverrides
import typingsJapgolly.baseui.inputMod.SharedProps
import typingsJapgolly.baseui.inputMod.State
import typingsJapgolly.baseui.inputMod.StatefulInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulInput {
  def apply(
    adjoined: none | left | right | both = null,
    `aria-describedby`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    clearable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    endEnhancer: (js.Function1[/* args */ SharedProps, Node]) | Node = null,
    error: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    initialState: State = null,
    inputRef: Ref = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onBlur: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    onFocus: ReactFocusEventFrom[HTMLInputElement] => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLInputElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLInputElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLInputElement] => Callback = null,
    overrides: InputOverrides = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    size: default_ | compact | large_ = null,
    startEnhancer: (js.Function1[/* args */ SharedProps, Node]) | Node = null,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    `type`: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StatefulInputProps, 
    MountedWithRawType[StatefulInputProps, js.Object, RawMounted[StatefulInputProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (adjoined != null) __obj.updateDynamic("adjoined")(adjoined.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(clearable)) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onKeyUp(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (startEnhancer != null) __obj.updateDynamic("startEnhancer")(startEnhancer.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.inputMod.State, t2: /* currentState */ typingsJapgolly.baseui.inputMod.State) => stateReducer(t0, t1, t2).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.inputMod.StatefulInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.inputMod.StatefulInputProps])(children: _*)
  }
  @JSImport("baseui/input", "StatefulInput")
  @js.native
  object componentImport extends js.Object
  
}

