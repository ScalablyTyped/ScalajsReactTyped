package typingsJapgolly.baseui.paginationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonEventAny
import typingsJapgolly.baseui.AnonNextPage
import typingsJapgolly.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPaginationProps extends Callbacks {
  var initialState: js.UndefOr[State] = js.undefined
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPaginationProps {
  @scala.inline
  def apply(
    numPages: Double,
    initialState: State = null,
    labels: Labels = null,
    onNextClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    onPageChange: /* args */ AnonNextPage => CallbackTo[js.Any] = null,
    onPrevClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    overrides: PaginationOverrides = null,
    stateReducer: (change_, /* changes */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulPaginationProps = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onNextClick(t0).runNow()))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonNextPage) => onPageChange(t0).runNow()))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onPrevClick(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* changes */ typingsJapgolly.baseui.paginationMod.State, t2: /* currentState */ typingsJapgolly.baseui.paginationMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulPaginationProps]
  }
}

