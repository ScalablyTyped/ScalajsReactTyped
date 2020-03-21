package typingsJapgolly.baseui.dndListMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonNewIndex
import typingsJapgolly.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/dnd-list.StatefulListProps & {  initialState ? :baseui.baseui/dnd-list.State,   children  :react.react.ReactNode} */
trait StatefulComponentContainerProps extends js.Object {
  var children: Node
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ AnonNewIndex, _]] = js.undefined
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  var removable: js.UndefOr[Boolean] = js.undefined
  var removableByMove: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulComponentContainerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    initialState: State = null,
    onChange: /* params */ AnonNewIndex => CallbackTo[js.Any] = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulComponentContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.baseui.AnonNewIndex) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.dndListMod.State, t2: /* currentState */ typingsJapgolly.baseui.dndListMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulComponentContainerProps]
  }
}

