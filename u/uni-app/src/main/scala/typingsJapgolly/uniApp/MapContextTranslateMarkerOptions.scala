package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextTranslateMarkerOptions extends js.Object {
  /**
    * 动画结束回调函数
    */
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 移动过程中是否自动旋转marker
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  /**
    * 指定marker移动到的目标点
    */
  var destination: js.UndefOr[LocationObject] = js.undefined
  /**
    * 动画持续时长，默认值1000ms，平移与旋转分别计算
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 指定marker
    */
  var markerId: js.UndefOr[Double] = js.undefined
  /**
    * marker的旋转角度
    */
  var rotate: js.UndefOr[Double] = js.undefined
}

object MapContextTranslateMarkerOptions {
  @scala.inline
  def apply(
    animationEnd: js.UndefOr[Callback] = js.undefined,
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    destination: LocationObject = null,
    duration: Int | Double = null,
    fail: js.UndefOr[Callback] = js.undefined,
    markerId: Int | Double = null,
    rotate: Int | Double = null
  ): MapContextTranslateMarkerOptions = {
    val __obj = js.Dynamic.literal()
    animationEnd.foreach(p => __obj.updateDynamic("animationEnd")(p.toJsFn))
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (markerId != null) __obj.updateDynamic("markerId")(markerId.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextTranslateMarkerOptions]
  }
}

