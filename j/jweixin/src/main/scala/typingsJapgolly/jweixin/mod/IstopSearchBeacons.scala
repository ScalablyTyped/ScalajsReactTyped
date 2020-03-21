package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IstopSearchBeacons extends BaseParams {
  // 关闭查找完成后的回调函数
  @JSName("complete")
  def complete_MIstopSearchBeacons(res: js.Any): Unit
}

object IstopSearchBeacons {
  @scala.inline
  def apply(
    complete: js.Any => Callback,
    fail: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): IstopSearchBeacons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[IstopSearchBeacons]
  }
}

