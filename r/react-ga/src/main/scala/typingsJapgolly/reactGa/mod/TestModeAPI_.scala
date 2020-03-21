package typingsJapgolly.reactGa.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestModeAPI_ extends js.Object {
  var calls: js.Array[js.Array[_]]
  var resetCalls: js.Function
  def ga(args: js.Any*): js.Any
}

object TestModeAPI_ {
  @scala.inline
  def apply(
    calls: js.Array[js.Array[_]],
    ga: /* repeated */ js.Any => CallbackTo[js.Any],
    resetCalls: js.Function
  ): TestModeAPI_ = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], resetCalls = resetCalls.asInstanceOf[js.Any])
    __obj.updateDynamic("ga")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => ga(t0).runNow()))
    __obj.asInstanceOf[TestModeAPI_]
  }
}

