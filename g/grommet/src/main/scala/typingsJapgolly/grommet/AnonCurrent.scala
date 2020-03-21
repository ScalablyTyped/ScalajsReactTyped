package typingsJapgolly.grommet

import typingsJapgolly.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var current: js.UndefOr[js.Any] = js.undefined
  var next: js.UndefOr[js.Any] = js.undefined
  var previous: js.UndefOr[js.Any] = js.undefined
}

object AnonCurrent {
  @scala.inline
  def apply(color: ColorType = null, current: js.Any = null, next: js.Any = null, previous: js.Any = null): AnonCurrent = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

