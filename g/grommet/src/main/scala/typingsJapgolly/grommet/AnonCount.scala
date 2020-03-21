package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.`1Slash2`
import typingsJapgolly.grommet.grommetStrings.`1Slash3`
import typingsJapgolly.grommet.grommetStrings.`1Slash4`
import typingsJapgolly.grommet.grommetStrings.`2Slash3`
import typingsJapgolly.grommet.grommetStrings.`2Slash4`
import typingsJapgolly.grommet.grommetStrings.`3Slash4`
import typingsJapgolly.grommet.grommetStrings.auto
import typingsJapgolly.grommet.grommetStrings.fill
import typingsJapgolly.grommet.grommetStrings.fit
import typingsJapgolly.grommet.grommetStrings.flex
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: js.UndefOr[fit | fill | Double] = js.undefined
  var size: js.UndefOr[
    xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
  ] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(
    count: fit | fill | Double = null,
    size: xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String] = null
  ): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

