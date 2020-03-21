package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var bottom: js.UndefOr[top | typingsJapgolly.grommet.grommetStrings.bottom] = js.undefined
  var left: js.UndefOr[typingsJapgolly.grommet.grommetStrings.left | right] = js.undefined
  var right: js.UndefOr[left | typingsJapgolly.grommet.grommetStrings.right] = js.undefined
  var top: js.UndefOr[typingsJapgolly.grommet.grommetStrings.top | bottom] = js.undefined
}

object AnonLeft {
  @scala.inline
  def apply(
    bottom: top | bottom = null,
    left: left | right = null,
    right: left | right = null,
    top: top | bottom = null
  ): AnonLeft = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

