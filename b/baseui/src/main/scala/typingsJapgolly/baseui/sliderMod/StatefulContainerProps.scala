package typingsJapgolly.baseui.sliderMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.undefined
  var onFinalChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.undefined
  var overrides: js.UndefOr[SliderOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    initialState: State = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* e */ State => CallbackTo[js.Any] = null,
    onFinalChange: /* e */ State => CallbackTo[js.Any] = null,
    overrides: SliderOverrides = null,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    step: Int | Double = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.baseui.sliderMod.State) => onChange(t0).runNow()))
    if (onFinalChange != null) __obj.updateDynamic("onFinalChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.baseui.sliderMod.State) => onFinalChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ java.lang.String, t1: /* nextState */ typingsJapgolly.baseui.sliderMod.State, t2: /* currentState */ typingsJapgolly.baseui.sliderMod.State) => stateReducer(t0, t1, t2).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

