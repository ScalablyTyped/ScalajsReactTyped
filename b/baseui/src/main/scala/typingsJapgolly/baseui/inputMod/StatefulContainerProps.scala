package typingsJapgolly.baseui.inputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.react.mod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    initialState: State = null,
    onChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.inputMod.State, t2: /* currentState */ typingsJapgolly.baseui.inputMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

