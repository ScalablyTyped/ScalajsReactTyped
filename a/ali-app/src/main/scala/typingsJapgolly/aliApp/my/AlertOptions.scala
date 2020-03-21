package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 交互反馈 https://docs.alipay.com/mini/api/ui-feedback
trait AlertOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 按钮文字，默认确定 */
  var buttonText: String
  /** alert框的内容 */
  var content: String
  /** alert框的标题 */
  var title: String
}

object AlertOptions {
  @scala.inline
  def apply(
    buttonText: String,
    content: String,
    title: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): AlertOptions = {
    val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[AlertOptions]
  }
}

