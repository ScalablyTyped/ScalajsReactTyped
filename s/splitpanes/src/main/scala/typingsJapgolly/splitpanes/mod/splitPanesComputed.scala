package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesComputed extends js.Object {
  def defaultWidth(): Double
}

object splitPanesComputed {
  @scala.inline
  def apply(defaultWidth: CallbackTo[Double]): splitPanesComputed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultWidth")(defaultWidth.toJsFn)
    __obj.asInstanceOf[splitPanesComputed]
  }
}

