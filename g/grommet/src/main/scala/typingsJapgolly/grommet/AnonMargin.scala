package typingsJapgolly.grommet

import typingsJapgolly.grommet.baseMod.ExtendType
import typingsJapgolly.grommet.utilsMod.BackgroundType
import typingsJapgolly.grommet.utilsMod.ColorType
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMargin extends js.Object {
  var active: js.UndefOr[AnonBackgroundBackgroundType] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[AnonHover] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hover: js.UndefOr[AnonBackgroundColorExtend] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object AnonMargin {
  @scala.inline
  def apply(
    active: AnonBackgroundBackgroundType = null,
    background: BackgroundType = null,
    border: AnonHover = null,
    color: ColorType = null,
    extend: ExtendType = null,
    hover: AnonBackgroundColorExtend = null,
    margin: MarginType = null,
    pad: PadType = null
  ): AnonMargin = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMargin]
  }
}

