package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 是否只能从相机扫码，不允许从相册选择图片
    */
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  /**
    * 扫码类型，参数类型是数组，二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
    */
  var scanType: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ScanCodeSuccessRes, Unit]] = js.undefined
}

object ScanCodeOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    onlyFromCamera: js.UndefOr[Boolean] = js.undefined,
    scanType: js.Array[_] = null,
    success: /* result */ ScanCodeSuccessRes => Callback = null
  ): ScanCodeOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (!js.isUndefined(onlyFromCamera)) __obj.updateDynamic("onlyFromCamera")(onlyFromCamera.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.ScanCodeSuccessRes) => success(t0).runNow()))
    __obj.asInstanceOf[ScanCodeOptions]
  }
}

