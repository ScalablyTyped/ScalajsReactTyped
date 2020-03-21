package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFullScreenOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 有效值为 0（正常竖向）, 90（屏幕逆时针90度）, -90（屏幕顺时针90度） */
  var direction: Double
}

object RequestFullScreenOptions {
  @scala.inline
  def apply(
    direction: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): RequestFullScreenOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[RequestFullScreenOptions]
  }
}

