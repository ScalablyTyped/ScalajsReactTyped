package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
}

object AnonHeight {
  @scala.inline
  def apply(
    height: xxsmall | xsmall | small | medium | large | xlarge | full | String = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | full | String = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

