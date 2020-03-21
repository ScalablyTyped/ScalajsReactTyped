package typingsJapgolly.grommet.chartMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grommet.AnonColor
import typingsJapgolly.grommet.AnonHeight
import typingsJapgolly.grommet.AnonLabel
import typingsJapgolly.grommet.AnonValue
import typingsJapgolly.grommet.grommetStrings.area
import typingsJapgolly.grommet.grommetStrings.bar
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.hair
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.line
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.point
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GapType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var color: js.UndefOr[String | AnonColor | js.Array[AnonValue]] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var overflow: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | AnonHeight | String] = js.undefined
  var thickness: js.UndefOr[hair | xsmall | small | medium | large | xlarge | none | String] = js.undefined
  var `type`: js.UndefOr[bar | line | area | point] = js.undefined
  var values: js.Array[Double | js.Array[Double] | AnonLabel]
}

object ChartProps {
  @scala.inline
  def apply(
    values: js.Array[Double | js.Array[Double] | AnonLabel],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    bounds: js.Array[js.Array[Double]] = null,
    color: String | AnonColor | js.Array[AnonValue] = null,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onHover: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    size: xxsmall | xsmall | small | medium | large | xlarge | full | AnonHeight | String = null,
    thickness: hair | xsmall | small | medium | large | xlarge | none | String = null,
    `type`: bar | line | area | point = null
  ): ChartProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onHover(t0).runNow()))
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
}

