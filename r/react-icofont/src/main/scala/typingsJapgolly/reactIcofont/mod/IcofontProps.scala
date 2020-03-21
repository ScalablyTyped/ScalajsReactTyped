package typingsJapgolly.reactIcofont.mod

import typingsJapgolly.reactIcofont.reactIcofontStrings.`10`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`180`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`1`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`270`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`2`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`3`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`4`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`5`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`6`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`7`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`8`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`90`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`9`
import typingsJapgolly.reactIcofont.reactIcofontStrings.h
import typingsJapgolly.reactIcofont.reactIcofontStrings.v
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcofontProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var flip: js.UndefOr[h | v] = js.undefined
  var icon: String
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
}

object IcofontProps {
  @scala.inline
  def apply(
    icon: String,
    className: String = null,
    flip: h | v = null,
    rotate: `90` | `180` | `270` = null,
    size: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` = null,
    spin: js.UndefOr[Boolean] = js.undefined
  ): IcofontProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcofontProps]
  }
}

