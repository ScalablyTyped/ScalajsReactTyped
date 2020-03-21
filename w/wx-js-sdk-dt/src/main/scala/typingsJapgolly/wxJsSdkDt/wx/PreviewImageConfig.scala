package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 显示照片预览用的配置对象
  */
trait PreviewImageConfig extends WxBaseRequestConfig {
  /**
    * 当前显示图片的 http 链接
    */
  var current: String
  /**
    * 需要预览的图片 http 链接列表
    */
  var urls: js.Array[String]
}

object PreviewImageConfig {
  @scala.inline
  def apply(
    current: String,
    urls: js.Array[String],
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null
  ): PreviewImageConfig = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    __obj.asInstanceOf[PreviewImageConfig]
  }
}

