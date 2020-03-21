package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions[R, E] extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* res */ E, Unit]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ R, Unit]] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply[R, E](
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ E => Callback = null,
    success: /* res */ R => Callback = null
  ): BaseOptions[R, E] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ E) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ R) => success(t0).runNow()))
    __obj.asInstanceOf[BaseOptions[R, E]]
  }
}

