package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  var min: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(
    max: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null,
    min: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null
  ): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

