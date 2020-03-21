package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否只能从相机扫码，不允许从相册选择图片
  		 * @version 1.2.0
  		 */
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  /**
  		 * 扫码类型，参数类型是数组
  		 * 二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
  		 * @version 1.7.0
  		 */
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("success")
  def success_MScanCodeOptions(res: ScanCodeData): Unit
}

object ScanCodeOptions {
  @scala.inline
  def apply(
    success: ScanCodeData => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    onlyFromCamera: js.UndefOr[Boolean] = js.undefined,
    scanType: js.Array[String] = null
  ): ScanCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.ScanCodeData) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(onlyFromCamera)) __obj.updateDynamic("onlyFromCamera")(onlyFromCamera.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeOptions]
  }
}

