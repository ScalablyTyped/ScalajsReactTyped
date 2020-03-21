package typingsJapgolly.nextServer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.nextServer.sideEffectMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> */
trait ReadonlySideEffectProps extends js.Object {
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  val inAmpMode: js.UndefOr[Boolean] = js.undefined
  val reduceComponentsToState: js.Function2[/* components */ js.Array[Element], /* props */ js.Any, State]
}

object ReadonlySideEffectProps {
  @scala.inline
  def apply(
    reduceComponentsToState: (/* components */ js.Array[Element], /* props */ js.Any) => CallbackTo[State],
    handleStateChange: /* state */ State => Callback = null,
    inAmpMode: js.UndefOr[Boolean] = js.undefined
  ): ReadonlySideEffectProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reduceComponentsToState")(js.Any.fromFunction2((t0: /* components */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* props */ js.Any) => reduceComponentsToState(t0, t1).runNow()))
    if (handleStateChange != null) __obj.updateDynamic("handleStateChange")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.nextServer.sideEffectMod.State) => handleStateChange(t0).runNow()))
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySideEffectProps]
  }
}

