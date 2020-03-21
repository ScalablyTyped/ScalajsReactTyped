package typingsJapgolly.griddleReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterPlaceholder extends js.Object {
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
  var settingsToggle: js.UndefOr[String] = js.undefined
}

object AnonFilterPlaceholder {
  @scala.inline
  def apply(
    filterPlaceholder: String = null,
    next: String = null,
    previous: String = null,
    settingsToggle: String = null
  ): AnonFilterPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (settingsToggle != null) __obj.updateDynamic("settingsToggle")(settingsToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterPlaceholder]
  }
}

