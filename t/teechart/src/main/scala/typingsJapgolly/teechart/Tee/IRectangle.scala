package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRectangle extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
  def contains(point: IPoint): Boolean
}

object IRectangle {
  @scala.inline
  def apply(contains: IPoint => CallbackTo[Boolean], height: Double, width: Double, x: Double, y: Double): IRectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => contains(t0).runNow()))
    __obj.asInstanceOf[IRectangle]
  }
}

