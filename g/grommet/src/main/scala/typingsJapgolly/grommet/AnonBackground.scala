package typingsJapgolly.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: js.UndefOr[js.Object] = js.undefined
  var border: js.UndefOr[js.Object] = js.undefined
  var pad: js.UndefOr[js.Object] = js.undefined
}

object AnonBackground {
  @scala.inline
  def apply(background: js.Object = null, border: js.Object = null, pad: js.Object = null): AnonBackground = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

