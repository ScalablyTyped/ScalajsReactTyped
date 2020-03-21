package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zoomPointsOptions extends CommonCallbackOptions {
  //  坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  //  要显示在可视区域内的坐标点列表
  var points: js.Array[LocationBaseOptions]
}

object zoomPointsOptions {
  @scala.inline
  def apply(
    points: js.Array[LocationBaseOptions],
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    padding: js.Array[Double] = null,
    success: /* res */ js.Any => Callback = null
  ): zoomPointsOptions = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[zoomPointsOptions]
  }
}

