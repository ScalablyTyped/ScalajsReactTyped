package typingsJapgolly.storybookComponents.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
}

object RightProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): RightProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightProps]
  }
}

