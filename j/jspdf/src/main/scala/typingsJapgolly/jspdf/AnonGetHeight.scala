package typingsJapgolly.jspdf

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetHeight extends js.Object {
  var height: Double
  var width: Double
  def getHeight(): Double
  def getWidth(): Double
}

object AnonGetHeight {
  @scala.inline
  def apply(getHeight: CallbackTo[Double], getWidth: CallbackTo[Double], height: Double, width: Double): AnonGetHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.asInstanceOf[AnonGetHeight]
  }
}

