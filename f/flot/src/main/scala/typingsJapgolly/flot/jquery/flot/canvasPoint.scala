package typingsJapgolly.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait canvasPoint extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var left: Double
  var right: js.UndefOr[Double] = js.undefined
  var top: Double
}

object canvasPoint {
  @scala.inline
  def apply(left: Double, top: Double, bottom: Int | Double = null, right: Int | Double = null): canvasPoint = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[canvasPoint]
  }
}

