package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonConfirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: String
  /** confirm框的内容 */
  var content: String
  /** confirm框的标题 */
  var title: String
  @JSName("success")
  def success_MConfirmOptions(result: AnonConfirm): Unit
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancelButtonText: String,
    confirmButtonText: String,
    content: String,
    success: AnonConfirm => Callback,
    title: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], confirmButtonText = confirmButtonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonConfirm) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[ConfirmOptions]
  }
}

