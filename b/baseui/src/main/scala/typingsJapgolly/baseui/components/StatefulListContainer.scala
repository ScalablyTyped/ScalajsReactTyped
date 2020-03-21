package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonNewIndex
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.dndListMod.ListOverrides
import typingsJapgolly.baseui.dndListMod.State
import typingsJapgolly.baseui.dndListMod.StatefulComponentContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulListContainer {
  def apply(
    initialState: State = null,
    onChange: /* params */ AnonNewIndex => CallbackTo[js.Any] = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StatefulComponentContainerProps, 
    typingsJapgolly.baseui.dndListMod.StatefulListContainer, 
    Unit, 
    StatefulComponentContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.baseui.AnonNewIndex) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.dndListMod.State, t2: /* currentState */ typingsJapgolly.baseui.dndListMod.State) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.dndListMod.StatefulComponentContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.dndListMod.StatefulListContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.dndListMod.StatefulComponentContainerProps])(children: _*)
  }
  @JSImport("baseui/dnd-list", "StatefulListContainer")
  @js.native
  object componentImport extends js.Object
  
}

