package typingsJapgolly.yaml.mod.cst

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: Double
  var origEnd: js.UndefOr[Double] = js.undefined
  var origStart: js.UndefOr[Double] = js.undefined
  var start: Double
  def isEmpty(): Boolean
}

object Range {
  @scala.inline
  def apply(
    end: Double,
    isEmpty: CallbackTo[Boolean],
    start: Double,
    origEnd: Int | Double = null,
    origStart: Int | Double = null
  ): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    if (origEnd != null) __obj.updateDynamic("origEnd")(origEnd.asInstanceOf[js.Any])
    if (origStart != null) __obj.updateDynamic("origStart")(origStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

