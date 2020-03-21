package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashContour extends js.Object {
  var fill: FlashFill
  var interior: Boolean
  var orientation: Double
  def getHalfEdge(): FlashHalfEdge
}

object FlashContour {
  @scala.inline
  def apply(fill: FlashFill, getHalfEdge: CallbackTo[FlashHalfEdge], interior: Boolean, orientation: Double): FlashContour = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], interior = interior.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("getHalfEdge")(getHalfEdge.toJsFn)
    __obj.asInstanceOf[FlashContour]
  }
}

