package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.exception
import typingsJapgolly.aliApp.aliAppStrings.fail
import typingsJapgolly.aliApp.aliAppStrings.none
import typingsJapgolly.aliApp.aliAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文字内容
  		 */
  var content: String
  /**
  		 * 显示时长，单位为 ms，默认 2000
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  /** toast 类型，展示相应图标，默认 none，支持 success / fail / exception / none’。其中 exception 类型必须传文字信息 */
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    content: String,
    complete: /* res */ js.Any => Callback = null,
    duration: Int | Double = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null,
    `type`: none | success | fail | exception | String = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

