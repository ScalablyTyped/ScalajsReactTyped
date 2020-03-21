package typingsJapgolly.storybookComponents.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkStylesProps extends js.Object {
  var inverse: js.UndefOr[Boolean] = js.native
  var isButton: js.UndefOr[Boolean] = js.native
  var nochrome: js.UndefOr[Boolean] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
  var tertiary: js.UndefOr[Boolean] = js.native
}

object LinkStylesProps {
  @scala.inline
  def apply(
    inverse: js.UndefOr[Boolean] = js.undefined,
    isButton: js.UndefOr[Boolean] = js.undefined,
    nochrome: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    tertiary: js.UndefOr[Boolean] = js.undefined
  ): LinkStylesProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton.asInstanceOf[js.Any])
    if (!js.isUndefined(nochrome)) __obj.updateDynamic("nochrome")(nochrome.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (!js.isUndefined(tertiary)) __obj.updateDynamic("tertiary")(tertiary.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkStylesProps]
  }
}

