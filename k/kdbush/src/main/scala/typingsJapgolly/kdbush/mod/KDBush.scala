package typingsJapgolly.kdbush.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KDBush[T] extends js.Object {
  var coords: js.Array[Double]
  var ids: js.Array[Double]
  var nodeSize: Double
  var points: js.Array[T]
  def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double]
  def within(x: Double, y: Double, r: Double): js.Array[Double]
}

object KDBush {
  @scala.inline
  def apply[T](
    coords: js.Array[Double],
    ids: js.Array[Double],
    nodeSize: Double,
    points: js.Array[T],
    range: (Double, Double, Double, Double) => CallbackTo[js.Array[Double]],
    within: (Double, Double, Double) => CallbackTo[js.Array[Double]]
  ): KDBush[T] = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("range")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => range(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("within")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => within(t0, t1, t2).runNow()))
    __obj.asInstanceOf[KDBush[T]]
  }
}

