package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: js.UndefOr[js.Array[Double]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonEnd {
  @scala.inline
  def apply(end: js.Array[Double] = null, name: String = null, start: js.Array[Double] = null): AnonEnd = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

