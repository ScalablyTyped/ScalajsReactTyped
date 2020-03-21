package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait translateMarkerOptions extends CommonCallbackOptions {
  //  动画结束回调函数
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  //  移动过程中是否自动旋转 marker
  var autoRotate: Boolean
  //  指定 marker 移动到的目标点
  var destination: LocationBaseOptions
  //  动画持续时长，平移与旋转分别计算
  var duration: js.UndefOr[Double] = js.undefined
  //  指定 marker
  var markerId: Double
  //  marker 的旋转角度
  var rotate: Double
}

object translateMarkerOptions {
  @scala.inline
  def apply(
    autoRotate: Boolean,
    destination: LocationBaseOptions,
    markerId: Double,
    rotate: Double,
    animationEnd: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.Any => Callback = null,
    duration: Int | Double = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): translateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    animationEnd.foreach(p => __obj.updateDynamic("animationEnd")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[translateMarkerOptions]
  }
}

