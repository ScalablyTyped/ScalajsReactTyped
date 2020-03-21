package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonLongitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateMarkerOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 动画持续时长，默认值1000ms，平移与旋转分别计算。
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  	// 指定marker移动到的目标点
  var autoRotate: Boolean
  	// 指定 marker
  var destination: AnonLongitude
  	// marker 的旋转角度
  var duration: js.UndefOr[Double] = js.undefined
  var markerId: Double
  	// 移动过程中是否自动旋转 marker
  var rotate: Double
}

object TranslateMarkerOptions {
  @scala.inline
  def apply(
    autoRotate: Boolean,
    destination: AnonLongitude,
    markerId: Double,
    rotate: Double,
    animationEnd: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.Any => Callback = null,
    duration: Int | Double = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): TranslateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    animationEnd.foreach(p => __obj.updateDynamic("animationEnd")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[TranslateMarkerOptions]
  }
}

