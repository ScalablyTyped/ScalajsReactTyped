package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorContextInsertImageOptions extends js.Object {
  /**
    * 图像无法显示时的替代文本
    */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * data 被序列化为 name=value;name1=value2 的格式挂在属性 data-custom 上
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图片地址
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object EditorContextInsertImageOptions {
  @scala.inline
  def apply(
    alt: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    data: js.Any = null,
    fail: js.UndefOr[Callback] = js.undefined,
    src: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): EditorContextInsertImageOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[EditorContextInsertImageOptions]
  }
}

