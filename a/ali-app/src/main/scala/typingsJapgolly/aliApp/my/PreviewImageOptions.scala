package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 当当前显示图片索引，默认 0 */
  var current: js.UndefOr[Double] = js.undefined
  /** 要预览的图片链接列表 */
  var urls: js.Array[String]
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    urls: js.Array[String],
    complete: /* res */ js.Any => Callback = null,
    current: Int | Double = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

