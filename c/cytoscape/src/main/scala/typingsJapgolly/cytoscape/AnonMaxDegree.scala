package typingsJapgolly.cytoscape

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxDegree extends js.Object {
  def maxDegree(): Double
}

object AnonMaxDegree {
  @scala.inline
  def apply(maxDegree: CallbackTo[Double]): AnonMaxDegree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxDegree")(maxDegree.toJsFn)
    __obj.asInstanceOf[AnonMaxDegree]
  }
}

