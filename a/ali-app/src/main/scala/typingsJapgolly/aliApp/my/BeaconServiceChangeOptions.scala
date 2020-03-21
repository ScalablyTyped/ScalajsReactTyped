package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconServiceChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_BeaconServiceChangeOptions: js.UndefOr[js.Function1[/* res */ AnonAvailable, Unit]] = js.undefined
}

object BeaconServiceChangeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonAvailable => Callback = null
  ): BeaconServiceChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonAvailable) => success(t0).runNow()))
    __obj.asInstanceOf[BeaconServiceChangeOptions]
  }
}

