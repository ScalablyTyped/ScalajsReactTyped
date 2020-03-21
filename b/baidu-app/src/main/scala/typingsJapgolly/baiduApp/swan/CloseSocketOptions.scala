package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 关闭WebSocket连接。
	 */
trait CloseSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  var code: js.UndefOr[Double] = js.undefined
   // 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。如果这个参数没有被指定，默认的取值是1000 （表示正常连接关闭）	1.4.0
  var reason: js.UndefOr[String] = js.undefined
}

object CloseSocketOptions {
  @scala.inline
  def apply(
    code: Int | Double = null,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    reason: String = null,
    success: js.Any => Callback = null
  ): CloseSocketOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[CloseSocketOptions]
  }
}

