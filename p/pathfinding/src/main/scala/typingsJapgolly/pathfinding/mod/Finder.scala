package typingsJapgolly.pathfinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finder extends js.Object {
  def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]]
}

object Finder {
  @scala.inline
  def apply(findPath: (Double, Double, Double, Double, Grid) => CallbackTo[js.Array[js.Array[Double]]]): Finder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findPath")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: typingsJapgolly.pathfinding.mod.Grid) => findPath(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[Finder]
  }
}

