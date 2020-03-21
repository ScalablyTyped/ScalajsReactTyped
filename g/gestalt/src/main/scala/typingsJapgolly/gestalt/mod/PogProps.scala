package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PogProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var bgColor: js.UndefOr[transparent | lightGray | white] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var hovered: js.UndefOr[Boolean] = js.undefined
  var icon: Icons
  var iconColor: js.UndefOr[blue | darkGray | gray | red | white] = js.undefined
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object PogProps {
  @scala.inline
  def apply(
    icon: Icons,
    active: js.UndefOr[Boolean] = js.undefined,
    bgColor: transparent | lightGray | white = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    hovered: js.UndefOr[Boolean] = js.undefined,
    iconColor: blue | darkGray | gray | red | white = null,
    size: xs | sm | md | lg | xl = null
  ): PogProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PogProps]
  }
}

