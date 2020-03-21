package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.selectMod.OnChangeParams
import typingsJapgolly.baseui.selectMod.SelectOverrides
import typingsJapgolly.baseui.selectMod.State
import typingsJapgolly.baseui.selectMod.StatefulContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulSelectContainer {
  def apply(
    initialState: State = null,
    onChange: /* params */ OnChangeParams => CallbackTo[js.Any] = null,
    overrides: SelectOverrides = null,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StatefulContainerProps, 
    typingsJapgolly.baseui.selectMod.StatefulSelectContainer, 
    Unit, 
    StatefulContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ java.lang.String, t1: /* nextState */ typingsJapgolly.baseui.selectMod.State, t2: /* currentState */ typingsJapgolly.baseui.selectMod.State) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.selectMod.StatefulContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.selectMod.StatefulSelectContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.selectMod.StatefulContainerProps])(children: _*)
  }
  @JSImport("baseui/select", "StatefulSelectContainer")
  @js.native
  object componentImport extends js.Object
  
}

