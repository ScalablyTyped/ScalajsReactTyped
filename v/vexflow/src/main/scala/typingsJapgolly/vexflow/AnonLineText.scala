package typingsJapgolly.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineText extends js.Object {
  var duration: String
  var line: js.UndefOr[Double] = js.undefined
  var text: String
}

object AnonLineText {
  @scala.inline
  def apply(duration: String, text: String, line: Int | Double = null): AnonLineText = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineText]
  }
}

