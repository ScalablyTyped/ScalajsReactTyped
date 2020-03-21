package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.`bottom-left`
import typingsJapgolly.grommet.grommetStrings.`bottom-right`
import typingsJapgolly.grommet.grommetStrings.`top-left`
import typingsJapgolly.grommet.grommetStrings.`top-right`
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorner extends js.Object {
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonCorner {
  @scala.inline
  def apply(
    corner: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right` = null,
    size: xsmall | small | medium | large | xlarge | String = null
  ): AnonCorner = {
    val __obj = js.Dynamic.literal()
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorner]
  }
}

