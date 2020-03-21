package typingsJapgolly.echarts.echarts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zrender.zrender.LinearGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graphic_ extends js.Object {
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  var LinearGradient: typingsJapgolly.zrender.zrender.LinearGradient
  /**
    * Clip the given points by the given rectangular.
    *
    * @param {number[][]} points The points to be clipped,
    *     like [[23, 44], [12, 15], ...].
    * @param {ERectangle} rect The rectangular that is used to clip points.
    */
  def clipPointsByRect(points: js.Array[js.Array[Double]], rect: ERectangle): js.Array[js.Array[Double]]
  /**
    * Clip the first input rectangular by the second input rectangular.
    *
    * @param {ERectangle} targetRect The rectangular to be clipped.
    * @param {ERectangle} rect The rectangular that is used to clip
    *     targetRect.
    */
  def clipRectByRect(targetRect: ERectangle, rect: ERectangle): ERectangle
}

object Graphic_ {
  @scala.inline
  def apply(
    LinearGradient: LinearGradient,
    clipPointsByRect: (js.Array[js.Array[Double]], ERectangle) => CallbackTo[js.Array[js.Array[Double]]],
    clipRectByRect: (ERectangle, ERectangle) => CallbackTo[ERectangle]
  ): Graphic_ = {
    val __obj = js.Dynamic.literal(LinearGradient = LinearGradient.asInstanceOf[js.Any])
    __obj.updateDynamic("clipPointsByRect")(js.Any.fromFunction2((t0: js.Array[js.Array[scala.Double]], t1: typingsJapgolly.echarts.echarts.ERectangle) => clipPointsByRect(t0, t1).runNow()))
    __obj.updateDynamic("clipRectByRect")(js.Any.fromFunction2((t0: typingsJapgolly.echarts.echarts.ERectangle, t1: typingsJapgolly.echarts.echarts.ERectangle) => clipRectByRect(t0, t1).runNow()))
    __obj.asInstanceOf[Graphic_]
  }
}

