package typingsJapgolly.storybookComponents.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkInnerProps extends js.Object {
  var containsIcon: js.UndefOr[Boolean] = js.native
  var withArrow: js.UndefOr[Boolean] = js.native
}

object LinkInnerProps {
  @scala.inline
  def apply(containsIcon: js.UndefOr[Boolean] = js.undefined, withArrow: js.UndefOr[Boolean] = js.undefined): LinkInnerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsIcon)) __obj.updateDynamic("containsIcon")(containsIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(withArrow)) __obj.updateDynamic("withArrow")(withArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkInnerProps]
  }
}

