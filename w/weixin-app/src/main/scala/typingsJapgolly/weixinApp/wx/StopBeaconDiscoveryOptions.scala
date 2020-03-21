package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("complete")
  var complete_StopBeaconDiscoveryOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("fail")
  var fail_StopBeaconDiscoveryOptions: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("success")
  var success_StopBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}

object StopBeaconDiscoveryOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ ErrMsgResponse => Callback = null
  ): StopBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.wx.ErrMsgResponse) => success(t0).runNow()))
    __obj.asInstanceOf[StopBeaconDiscoveryOptions]
  }
}

