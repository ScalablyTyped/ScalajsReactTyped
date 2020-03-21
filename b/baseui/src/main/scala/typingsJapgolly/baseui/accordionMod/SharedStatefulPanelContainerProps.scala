package typingsJapgolly.baseui.accordionMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonExpandedBoolean
import typingsJapgolly.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStatefulPanelContainerProps extends js.Object {
  var initialState: js.UndefOr[PanelState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonExpandedBoolean, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.undefined
}

object SharedStatefulPanelContainerProps {
  @scala.inline
  def apply(
    initialState: PanelState = null,
    onChange: /* args */ AnonExpandedBoolean => CallbackTo[js.Any] = null,
    stateReducer: (expand, PanelState, PanelState) => CallbackTo[PanelState] = null
  ): SharedStatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpandedBoolean) => onChange(t0).runNow()))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.expand, t1: typingsJapgolly.baseui.accordionMod.PanelState, t2: typingsJapgolly.baseui.accordionMod.PanelState) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SharedStatefulPanelContainerProps]
  }
}

