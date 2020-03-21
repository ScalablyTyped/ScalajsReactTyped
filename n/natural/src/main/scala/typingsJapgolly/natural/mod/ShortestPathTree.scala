package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortestPathTree extends js.Object {
  def getDistTo(vertex: Double): Double
  def hasDistTo(vertex: Double): Boolean
  def pathTo(vertex: Double): js.Array[Double]
}

object ShortestPathTree {
  @scala.inline
  def apply(
    getDistTo: Double => CallbackTo[Double],
    hasDistTo: Double => CallbackTo[Boolean],
    pathTo: Double => CallbackTo[js.Array[Double]]
  ): ShortestPathTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDistTo")(js.Any.fromFunction1((t0: scala.Double) => getDistTo(t0).runNow()))
    __obj.updateDynamic("hasDistTo")(js.Any.fromFunction1((t0: scala.Double) => hasDistTo(t0).runNow()))
    __obj.updateDynamic("pathTo")(js.Any.fromFunction1((t0: scala.Double) => pathTo(t0).runNow()))
    __obj.asInstanceOf[ShortestPathTree]
  }
}

