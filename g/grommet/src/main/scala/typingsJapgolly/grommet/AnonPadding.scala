package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPadding extends js.Object {
  var padding: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object AnonPadding {
  @scala.inline
  def apply(padding: String = null, weight: Int | Double = null): AnonPadding = {
    val __obj = js.Dynamic.literal()
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPadding]
  }
}

