package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFail extends js.Object {
  var fail: js.UndefOr[js.Function1[/* res */ AnonError, Unit]] = js.undefined
  var result: AnonHitKeywords
}

object AnonFail {
  @scala.inline
  def apply(result: AnonHitKeywords, fail: /* res */ AnonError => Callback = null): AnonFail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonError) => fail(t0).runNow()))
    __obj.asInstanceOf[AnonFail]
  }
}

