package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 最多可以选择的图片张数，默认9
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * original 原图，compressed 压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * album 从相册选图，camera 使用相机，默认二者都有
    */
  var sourceType: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * 成功则返回图片的本地文件路径列表 tempFilePaths
    */
  var success: js.UndefOr[js.Function1[/* result */ ChooseImageSuccessCallbackResult, Unit]] = js.undefined
}

object ChooseImageOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    count: Int | Double = null,
    fail: js.UndefOr[Callback] = js.undefined,
    sizeType: String | js.Array[String] = null,
    sourceType: String | js.Array[String] = null,
    success: /* result */ ChooseImageSuccessCallbackResult => Callback = null
  ): ChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.ChooseImageSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseImageOptions]
  }
}

