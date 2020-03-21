package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonLatitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 位置-----地图组件控制
trait GetCenterLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetCenterLocationOptions(res: AnonLatitude): Unit
}

object GetCenterLocationOptions {
  @scala.inline
  def apply(
    success: AnonLatitude => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.weixinApp.AnonLatitude) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
}

