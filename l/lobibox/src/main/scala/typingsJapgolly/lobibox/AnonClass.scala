package typingsJapgolly.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonClass {
  @scala.inline
  def apply(`class`: String = null, closeOnClick: js.UndefOr[Boolean] = js.undefined, text: String = null): AnonClass = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}

