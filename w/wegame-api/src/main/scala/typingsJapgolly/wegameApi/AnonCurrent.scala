package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 当前显示图片的链接，默认为urls的第一张
    */
  var current: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.Array[String]
}

object AnonCurrent {
  @scala.inline
  def apply(
    urls: js.Array[String],
    complete: js.UndefOr[Callback] = js.undefined,
    current: String = null,
    fail: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): AnonCurrent = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[AnonCurrent]
  }
}

