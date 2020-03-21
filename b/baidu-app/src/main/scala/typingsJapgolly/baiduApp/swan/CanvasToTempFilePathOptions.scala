package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 画布标识，传入 <canvas/> 的 cavas-id
  		 */
  var canvasId: String
  	// 输出图片宽度（默认为 width * 屏幕像素密度）
  var destHeight: js.UndefOr[Double] = js.undefined
  	// 画布高度（默认为 canvas 高度 - y）
  var destWidth: js.UndefOr[Double] = js.undefined
  	// 输出图片高度（默认为 height * 屏幕像素密度）
  var fileType: js.UndefOr[String] = js.undefined
  	// 画布宽度（默认为 canvas 宽度 - x）
  var height: js.UndefOr[Double] = js.undefined
  	// 画布 y 轴起点（默认 0 ）
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  	// 画布 x 轴起点（默认 0 ）
  var y: js.UndefOr[Double] = js.undefined
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(
    canvasId: String,
    complete: /* res */ js.Any => Callback = null,
    destHeight: Int | Double = null,
    destWidth: Int | Double = null,
    fail: js.Any => Callback = null,
    fileType: String = null,
    height: Int | Double = null,
    success: js.Any => Callback = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (destHeight != null) __obj.updateDynamic("destHeight")(destHeight.asInstanceOf[js.Any])
    if (destWidth != null) __obj.updateDynamic("destWidth")(destWidth.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
}

