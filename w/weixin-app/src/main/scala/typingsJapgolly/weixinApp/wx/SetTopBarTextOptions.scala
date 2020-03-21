package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----设置置顶信息
trait SetTopBarTextOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 置顶栏文字内容
  		 */
  var text: String
}

object SetTopBarTextOptions {
  @scala.inline
  def apply(
    text: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
}

