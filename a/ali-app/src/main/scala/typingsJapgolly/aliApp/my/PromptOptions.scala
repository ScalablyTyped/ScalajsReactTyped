package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonInputValue
import typingsJapgolly.aliApp.aliAppStrings.center
import typingsJapgolly.aliApp.aliAppStrings.left
import typingsJapgolly.aliApp.aliAppStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions
  extends BaseOptions[js.Any, js.Any] {
  /** message对齐方式，可用枚举left/center/right，iOS ‘center’, android ‘left’ */
  var align: js.UndefOr[left | center | right | String] = js.undefined
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String
  /** prompt框文本，默认‘请输入内容’ */
  var message: js.UndefOr[String] = js.undefined
  /** 确认按钮文字，默认‘确定’ */
  var okButtonText: String
  /** 输入框内的提示文案 */
  var placeholder: js.UndefOr[String] = js.undefined
  /** prompt框标题 */
  var title: js.UndefOr[String] = js.undefined
  @JSName("success")
  def success_MPromptOptions(result: AnonInputValue): Unit
}

object PromptOptions {
  @scala.inline
  def apply(
    cancelButtonText: String,
    okButtonText: String,
    success: AnonInputValue => Callback,
    align: left | center | right | String = null,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    message: String = null,
    placeholder: String = null,
    title: String = null
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonInputValue) => success(t0).runNow()))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

