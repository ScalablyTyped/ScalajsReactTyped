package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片路径，目前支持：
  		 * - 网络图片路径
  		 * - apFilePath路径
  		 * - 相对路径
  		 */
  var src: String
  @JSName("success")
  var success_GetImageInfoOptions: js.UndefOr[js.Function1[/* res */ AnonHeight, Unit]] = js.undefined
}

object GetImageInfoOptions {
  @scala.inline
  def apply(
    src: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonHeight => Callback = null
  ): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonHeight) => success(t0).runNow()))
    __obj.asInstanceOf[GetImageInfoOptions]
  }
}

