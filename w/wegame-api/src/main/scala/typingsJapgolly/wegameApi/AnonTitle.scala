package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.loading
import typingsJapgolly.wegameApi.wegameApiStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 提示的延迟时间
    */
  var duration: js.UndefOr[Double] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图标
    */
  var icon: js.UndefOr[success | loading] = js.undefined
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[String] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    duration: Int | Double = null,
    fail: js.UndefOr[Callback] = js.undefined,
    icon: success | loading = null,
    image: String = null,
    success: js.UndefOr[Callback] = js.undefined,
    title: String = null
  ): AnonTitle = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

