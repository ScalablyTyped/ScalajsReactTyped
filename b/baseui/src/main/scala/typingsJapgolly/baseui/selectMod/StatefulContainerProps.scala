package typingsJapgolly.baseui.selectMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, _]] = js.undefined
  var overrides: js.UndefOr[SelectOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    initialState: State = null,
    onChange: /* params */ OnChangeParams => CallbackTo[js.Any] = null,
    overrides: SelectOverrides = null,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ java.lang.String, t1: /* nextState */ typingsJapgolly.baseui.selectMod.State, t2: /* currentState */ typingsJapgolly.baseui.selectMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

