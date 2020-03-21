package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowModalOptions extends js.Object {
  /**
    * 取消按钮的文字颜色，默认为"#000000"
    */
  var cancelColor: js.UndefOr[String] = js.undefined
  /**
    * 取消按钮的文字，默认为"取消"
    */
  var cancelText: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 确定按钮的文字颜色，默认为"#3CC51F"
    */
  var confirmColor: js.UndefOr[String] = js.undefined
  /**
    * 确定按钮的文字，默认为"确定"
    */
  var confirmText: js.UndefOr[String] = js.undefined
  /**
    * 提示的内容
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否显示取消按钮，默认为 true
    */
  var showCancel: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowModalRes, Unit]] = js.undefined
  /**
    * 提示的标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShowModalOptions {
  @scala.inline
  def apply(
    cancelColor: String = null,
    cancelText: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    confirmColor: String = null,
    confirmText: String = null,
    content: String = null,
    fail: js.UndefOr[Callback] = js.undefined,
    showCancel: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ ShowModalRes => Callback = null,
    title: String = null
  ): ShowModalOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelColor != null) __obj.updateDynamic("cancelColor")(cancelColor.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (confirmColor != null) __obj.updateDynamic("confirmColor")(confirmColor.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (!js.isUndefined(showCancel)) __obj.updateDynamic("showCancel")(showCancel.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.ShowModalRes) => success(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowModalOptions]
  }
}

