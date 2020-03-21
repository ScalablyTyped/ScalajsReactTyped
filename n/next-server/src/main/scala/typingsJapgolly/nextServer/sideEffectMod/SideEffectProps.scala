package typingsJapgolly.nextServer.sideEffectMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideEffectProps extends js.Object {
  var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  var inAmpMode: js.UndefOr[Boolean] = js.undefined
  def reduceComponentsToState[T](components: js.Array[Element], props: T): State
}

object SideEffectProps {
  @scala.inline
  def apply(
    reduceComponentsToState: (js.Array[Element], js.Any) => CallbackTo[State],
    handleStateChange: /* state */ State => Callback = null,
    inAmpMode: js.UndefOr[Boolean] = js.undefined
  ): SideEffectProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reduceComponentsToState")(js.Any.fromFunction2((t0: js.Array[japgolly.scalajs.react.raw.React.Element], t1: js.Any) => reduceComponentsToState(t0, t1).runNow()))
    if (handleStateChange != null) __obj.updateDynamic("handleStateChange")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.nextServer.sideEffectMod.State) => handleStateChange(t0).runNow()))
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideEffectProps]
  }
}

