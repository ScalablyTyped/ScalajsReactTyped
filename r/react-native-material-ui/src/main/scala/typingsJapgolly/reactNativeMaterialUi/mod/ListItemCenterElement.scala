package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemCenterElement extends js.Object {
  var primaryText: String | Element
  var secondaryText: js.UndefOr[String] = js.undefined
  var tertiaryText: js.UndefOr[String] = js.undefined
}

object ListItemCenterElement {
  @scala.inline
  def apply(primaryText: String | Element, secondaryText: String = null, tertiaryText: String = null): ListItemCenterElement = {
    val __obj = js.Dynamic.literal(primaryText = primaryText.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCenterElement]
  }
}

