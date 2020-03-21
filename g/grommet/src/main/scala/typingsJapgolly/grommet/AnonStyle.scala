package typingsJapgolly.grommet

import typingsJapgolly.grommet.utilsMod.BoxSideType
import typingsJapgolly.grommet.utilsMod.BoxSizeType
import typingsJapgolly.grommet.utilsMod.BoxStyleType
import typingsJapgolly.grommet.utilsMod.ColorType
import typingsJapgolly.grommet.utilsMod._BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends _BorderType {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[BoxSideType] = js.undefined
  var size: js.UndefOr[BoxSizeType] = js.undefined
  var style: js.UndefOr[BoxStyleType] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply(
    color: ColorType = null,
    side: BoxSideType = null,
    size: BoxSizeType = null,
    style: BoxStyleType = null
  ): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

