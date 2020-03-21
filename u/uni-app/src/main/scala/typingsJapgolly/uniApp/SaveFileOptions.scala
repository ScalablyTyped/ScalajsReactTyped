package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'}
    */
  var success: js.UndefOr[js.Function1[/* result */ SaveFileSuccess, Unit]] = js.undefined
  /**
    * 需要保存的文件的临时路径
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}

object SaveFileOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* result */ SaveFileSuccess => Callback = null,
    tempFilePath: String = null
  ): SaveFileOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.SaveFileSuccess) => success(t0).runNow()))
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileOptions]
  }
}

