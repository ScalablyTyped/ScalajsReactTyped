package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 取消按钮的文字颜色，默认为"#000000"
  		 */
  var cancelColor: js.UndefOr[String] = js.undefined
  /**
  		 * 取消按钮的文字，默认为"取消"，最多 4 个字符
  		 */
  var cancelText: js.UndefOr[String] = js.undefined
  /**
  		 * 确定按钮的文字颜色，默认为"#3CC51F"
  		 */
  var confirmColor: js.UndefOr[String] = js.undefined
  /**
  		 * 确定按钮的文字，默认为"确定"，最多 4 个字符
  		 */
  var confirmText: js.UndefOr[String] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var content: String
  /**
  		 * 是否显示取消按钮，默认为 true
  		 */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  @JSName("success")
  var success_ModalOptions: js.UndefOr[js.Function1[/* res */ AnonCancel, Unit]] = js.undefined
  /**
  		 * 提示的标题
  		 */
  var title: String
}

object ModalOptions {
  @scala.inline
  def apply(
    content: String,
    title: String,
    cancelColor: String = null,
    cancelText: String = null,
    complete: /* res */ js.Any => Callback = null,
    confirmColor: String = null,
    confirmText: String = null,
    fail: js.Any => Callback = null,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ AnonCancel => Callback = null
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonCancel) => success(t0).runNow()))
    __obj.asInstanceOf[ModalOptions]
  }
}

