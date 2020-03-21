package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.phoneInputMod.PhoneInputOverrides
import typingsJapgolly.baseui.phoneInputMod.State
import typingsJapgolly.baseui.phoneInputMod.StateChange
import typingsJapgolly.baseui.phoneInputMod.StatefulPhoneInputProps
import typingsJapgolly.baseui.selectMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPhoneInput {
  def apply(
    `aria-label`: String = null,
    initialState: State = null,
    mapIsoToLabel: /* iso */ String => CallbackTo[String] = null,
    onCountryChange: /* event */ OnChangeParams => CallbackTo[js.Any] = null,
    onTextChange: /* event */ ReactEventFrom[HTMLInputElement] => CallbackTo[js.Any] = null,
    overrides: PhoneInputOverrides = null,
    stateReducer: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StatefulPhoneInputProps, 
    MountedWithRawType[StatefulPhoneInputProps, js.Object, RawMounted[StatefulPhoneInputProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1((t0: /* iso */ java.lang.String) => mapIsoToLabel(t0).runNow()))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onCountryChange(t0).runNow()))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTextChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* type */ typingsJapgolly.baseui.phoneInputMod.StateChange, t1: /* nextState */ typingsJapgolly.baseui.phoneInputMod.State, t2: /* currentState */ typingsJapgolly.baseui.phoneInputMod.State) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.phoneInputMod.StatefulPhoneInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.phoneInputMod.StatefulPhoneInputProps])(children: _*)
  }
  @JSImport("baseui/phone-input", "StatefulPhoneInput")
  @js.native
  object componentImport extends js.Object
  
}

