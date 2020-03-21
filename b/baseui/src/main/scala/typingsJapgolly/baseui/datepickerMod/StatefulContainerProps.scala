package typingsJapgolly.baseui.datepickerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.AnonDate
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.mouseOver
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveLeft
import typingsJapgolly.baseui.baseuiStrings.moveRight
import typingsJapgolly.baseui.baseuiStrings.moveUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, Node]] = js.undefined
  var initialState: js.UndefOr[ContainerState] = js.undefined
  var onChange: js.UndefOr[typingsJapgolly.baseui.datepickerMod.onChange] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply[T](
    children: /* args */ T => CallbackTo[Node] = null,
    initialState: ContainerState = null,
    onChange: /* args */ AnonDate => CallbackTo[js.Any] = null,
    range: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (/* stateType */ mouseLeave | moveRight | moveDown | moveUp | mouseOver | change_ | moveLeft, /* nextState */ ContainerState, /* currentState */ ContainerState) => CallbackTo[ContainerState] = null
  ): StatefulContainerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ T) => children(t0).runNow()))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonDate) => onChange(t0).runNow()))
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ typingsJapgolly.baseui.baseuiStrings.mouseLeave | typingsJapgolly.baseui.baseuiStrings.moveRight | typingsJapgolly.baseui.baseuiStrings.moveDown | typingsJapgolly.baseui.baseuiStrings.moveUp | typingsJapgolly.baseui.baseuiStrings.mouseOver | typingsJapgolly.baseui.baseuiStrings.change_ | typingsJapgolly.baseui.baseuiStrings.moveLeft, t1: /* nextState */ typingsJapgolly.baseui.datepickerMod.ContainerState, t2: /* currentState */ typingsJapgolly.baseui.datepickerMod.ContainerState) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulContainerProps[T]]
  }
}

