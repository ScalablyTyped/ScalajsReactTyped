package typingsJapgolly.cytoscape

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDegree extends js.Object {
  def degree(): Double
}

object AnonDegree {
  @scala.inline
  def apply(degree: CallbackTo[Double]): AnonDegree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("degree")(degree.toJsFn)
    __obj.asInstanceOf[AnonDegree]
  }
}

