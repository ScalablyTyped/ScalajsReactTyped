package typingsJapgolly.grommet

import typingsJapgolly.grommet.utilsMod.ColorType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorMargin extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object AnonColorMargin {
  @scala.inline
  def apply(color: ColorType = null, margin: MarginType = null): AnonColorMargin = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorMargin]
  }
}

