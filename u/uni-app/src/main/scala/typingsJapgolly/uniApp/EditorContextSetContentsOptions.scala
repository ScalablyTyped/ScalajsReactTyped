package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorContextSetContentsOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 表示内容的delta对象
    */
  var delta: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 带标签的HTML内容
    */
  var html: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object EditorContextSetContentsOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    delta: js.Any = null,
    fail: js.UndefOr[Callback] = js.undefined,
    html: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): EditorContextSetContentsOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[EditorContextSetContentsOptions]
  }
}

