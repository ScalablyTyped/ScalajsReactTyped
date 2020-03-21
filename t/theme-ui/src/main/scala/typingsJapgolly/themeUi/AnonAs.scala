package typingsJapgolly.themeUi

import japgolly.scalajs.react.raw.React.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: js.UndefOr[ElementType] = js.undefined
}

object AnonAs {
  @scala.inline
  def apply(as: ElementType = null): AnonAs = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs]
  }
}

