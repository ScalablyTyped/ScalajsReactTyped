package typingsJapgolly.baseui.dndListMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonNewIndex
import typingsJapgolly.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulListProps extends js.Object {
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ AnonNewIndex, _]] = js.undefined
  var overrides: js.UndefOr[ListOverrides] = js.undefined
  var removable: js.UndefOr[Boolean] = js.undefined
  var removableByMove: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulListProps {
  @scala.inline
  def apply(
    initialState: State = null,
    onChange: /* params */ AnonNewIndex => CallbackTo[js.Any] = null,
    overrides: ListOverrides = null,
    removable: js.UndefOr[Boolean] = js.undefined,
    removableByMove: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulListProps = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.baseui.AnonNewIndex) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(removable)) __obj.updateDynamic("removable")(removable.asInstanceOf[js.Any])
    if (!js.isUndefined(removableByMove)) __obj.updateDynamic("removableByMove")(removableByMove.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.dndListMod.State, t2: /* currentState */ typingsJapgolly.baseui.dndListMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulListProps]
  }
}

