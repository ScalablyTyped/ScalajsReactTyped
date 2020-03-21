package typingsJapgolly.grommet.tableCellMod

import typingsJapgolly.grommet.grommetStrings.`1Slash2`
import typingsJapgolly.grommet.grommetStrings.`1Slash3`
import typingsJapgolly.grommet.grommetStrings.`1Slash4`
import typingsJapgolly.grommet.grommetStrings.`2Slash3`
import typingsJapgolly.grommet.grommetStrings.`2Slash4`
import typingsJapgolly.grommet.grommetStrings.`3Slash4`
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.col
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.middle
import typingsJapgolly.grommet.grommetStrings.row
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[col | row] = js.undefined
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | String
  ] = js.undefined
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply(
    plain: js.UndefOr[Boolean] = js.undefined,
    scope: col | row = null,
    size: xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | String = null,
    verticalAlign: top | middle | bottom = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
}

