package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonIsEnrolled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  var checkAuthMode: AuthModes
   // 认证方式
  @JSName("success")
  var success_CheckIsSoterEnrolledInDeviceOptions: js.UndefOr[js.Function1[/* res */ AnonIsEnrolled, Unit]] = js.undefined
}

object CheckIsSoterEnrolledInDeviceOptions {
  @scala.inline
  def apply(
    checkAuthMode: AuthModes,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonIsEnrolled => Callback = null
  ): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonIsEnrolled) => success(t0).runNow()))
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
}

