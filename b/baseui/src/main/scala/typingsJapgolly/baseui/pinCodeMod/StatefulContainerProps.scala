package typingsJapgolly.baseui.pinCodeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonValues
import typingsJapgolly.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonValues, Unit]] = js.undefined
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    initialState: State = null,
    onChange: /* args */ AnonValues => Callback = null,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonValues) => onChange(t0).runNow()))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.pinCodeMod.State, t2: /* currentState */ typingsJapgolly.baseui.pinCodeMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

