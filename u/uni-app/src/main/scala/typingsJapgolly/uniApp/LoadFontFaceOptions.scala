package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFontFaceOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 可选的字体描述符
    */
  var desc: js.UndefOr[LoadFontFaceOptionsDesc] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 定义的字体名称
    */
  var family: js.UndefOr[String] = js.undefined
  /**
    * 字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object LoadFontFaceOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    desc: LoadFontFaceOptionsDesc = null,
    fail: js.UndefOr[Callback] = js.undefined,
    family: String = null,
    source: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): LoadFontFaceOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[LoadFontFaceOptions]
  }
}

