package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.high
import typingsJapgolly.uniApp.uniAppStrings.low
import typingsJapgolly.uniApp.uniAppStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextTakePhotoOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 成像质量，值为high, normal, low，默认normal
    * - normal: 普通质量
    * - high: 高质量
    * - low: 低质量
    */
  var quality: js.UndefOr[normal | high | low] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CameraContextTakePhotoResult, Unit]] = js.undefined
}

object CameraContextTakePhotoOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    quality: normal | high | low = null,
    success: /* result */ CameraContextTakePhotoResult => Callback = null
  ): CameraContextTakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.CameraContextTakePhotoResult) => success(t0).runNow()))
    __obj.asInstanceOf[CameraContextTakePhotoOptions]
  }
}

