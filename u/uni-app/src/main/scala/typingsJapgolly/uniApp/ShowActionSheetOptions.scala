package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowActionSheetOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 按钮的文字颜色，默认为"#000000"
    */
  var itemColor: js.UndefOr[String] = js.undefined
  /**
    * 按钮的文字数组
    */
  var itemList: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ShowActionSheetRes, Unit]] = js.undefined
}

object ShowActionSheetOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    itemColor: String = null,
    itemList: js.Array[_] = null,
    success: /* result */ ShowActionSheetRes => Callback = null
  ): ShowActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (itemColor != null) __obj.updateDynamic("itemColor")(itemColor.asInstanceOf[js.Any])
    if (itemList != null) __obj.updateDynamic("itemList")(itemList.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.ShowActionSheetRes) => success(t0).runNow()))
    __obj.asInstanceOf[ShowActionSheetOptions]
  }
}

