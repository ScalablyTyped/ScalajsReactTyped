package typingsJapgolly.reactJoyride

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArialabel extends js.Object {
  var `aria-label`: String
  var `data-action`: String
  var role: String
  var title: String
  def onClick(): Unit
}

object AnonArialabel {
  @scala.inline
  def apply(`aria-label`: String, `data-action`: String, onClick: Callback, role: String, title: String): AnonArialabel = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-action")(`data-action`.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[AnonArialabel]
  }
}

