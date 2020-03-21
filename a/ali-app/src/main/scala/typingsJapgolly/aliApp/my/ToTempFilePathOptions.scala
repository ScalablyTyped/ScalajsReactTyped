package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 画布 https://docs.alipay.com/mini/api/ui-canvas
trait ToTempFilePathOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 输出的图片宽度，默认为 width
  var destHeight: Double
  		// 画布高度，默认为 canvas 高度 - y
  var destWidth: Double
  		// 画布宽度，默认为 canvas 宽度 - x
  var height: Double
  			// 画布 y 轴起点，默认为 0
  var width: Double
  var x: Double
  			// 画布 x 轴起点，默认为 0
  var y: Double
}

object ToTempFilePathOptions {
  @scala.inline
  def apply(
    destHeight: Double,
    destWidth: Double,
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): ToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(destHeight = destHeight.asInstanceOf[js.Any], destWidth = destWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ToTempFilePathOptions]
  }
}

