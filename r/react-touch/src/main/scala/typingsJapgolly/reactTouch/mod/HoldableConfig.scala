package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldableConfig extends js.Object {
  def holdComplete(callback: js.Function0[Unit]): js.Function0[js.Function0[Unit]]
  def holdProgress(callback: js.Function0[Unit]): js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
}

object HoldableConfig {
  @scala.inline
  def apply(
    holdComplete: js.Function0[Unit] => CallbackTo[js.Function0[js.Function0[Unit]]],
    holdProgress: js.Function0[Unit] => CallbackTo[
      js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
    ]
  ): HoldableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("holdComplete")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => holdComplete(t0).runNow()))
    __obj.updateDynamic("holdProgress")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => holdProgress(t0).runNow()))
    __obj.asInstanceOf[HoldableConfig]
  }
}

