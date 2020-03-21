package typingsJapgolly.rrc.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnUpdateProps extends js.Object {
  var call: OnUpdateCall
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object OnUpdateProps {
  @scala.inline
  def apply(
    call: /* location */ Location[LocationState] => Callback,
    immediate: js.UndefOr[Boolean] = js.undefined
  ): OnUpdateProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(js.Any.fromFunction1((t0: /* location */ typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState]) => call(t0).runNow()))
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUpdateProps]
  }
}

