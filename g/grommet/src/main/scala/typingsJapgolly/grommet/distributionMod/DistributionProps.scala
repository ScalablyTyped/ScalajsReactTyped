package typingsJapgolly.grommet.distributionMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grommet.AnonColorValue
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.BasisType
import typingsJapgolly.grommet.utilsMod.GapType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var basis: js.UndefOr[BasisType] = js.undefined
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var values: js.Array[AnonColorValue]
}

object DistributionProps {
  @scala.inline
  def apply(
    values: js.Array[AnonColorValue],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    basis: BasisType = null,
    children: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    margin: MarginType = null
  ): DistributionProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => children(t0).runNow()))
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionProps]
  }
}

