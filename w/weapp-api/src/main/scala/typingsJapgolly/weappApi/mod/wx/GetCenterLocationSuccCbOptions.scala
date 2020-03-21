package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCenterLocationSuccCbOptions extends CommonCallbackOptions {
  @JSName("success")
  def success_MGetCenterLocationSuccCbOptions(res: LocationBaseOptions): Unit
}

object GetCenterLocationSuccCbOptions {
  @scala.inline
  def apply(
    success: LocationBaseOptions => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null
  ): GetCenterLocationSuccCbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.LocationBaseOptions) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetCenterLocationSuccCbOptions]
  }
}

