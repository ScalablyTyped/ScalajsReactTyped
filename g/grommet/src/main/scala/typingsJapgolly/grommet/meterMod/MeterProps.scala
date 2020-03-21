package typingsJapgolly.grommet.meterMod

import typingsJapgolly.grommet.AnonColorOpacity
import typingsJapgolly.grommet.AnonHighlight
import typingsJapgolly.grommet.grommetStrings.bar
import typingsJapgolly.grommet.grommetStrings.circle
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeterProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var background: js.UndefOr[String | AnonColorOpacity] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var thickness: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var `type`: js.UndefOr[bar | circle] = js.undefined
  var values: js.UndefOr[js.Array[AnonHighlight]] = js.undefined
}

object MeterProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    background: String | AnonColorOpacity = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    max: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xsmall | small | medium | large | xlarge | full | String = null,
    thickness: xsmall | small | medium | large | xlarge | String = null,
    `type`: bar | circle = null,
    values: js.Array[AnonHighlight] = null
  ): MeterProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterProps]
  }
}

