package typingsJapgolly.reactVirtualized.esCellMeasurerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasuredCellParent extends js.Object {
  var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.undefined
  var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, Unit]] = js.undefined
}

object MeasuredCellParent {
  @scala.inline
  def apply(
    invalidateCellSizeAfterRender: /* cell */ CellPosition => Callback = null,
    recomputeGridSize: /* cell */ CellPosition => Callback = null
  ): MeasuredCellParent = {
    val __obj = js.Dynamic.literal()
    if (invalidateCellSizeAfterRender != null) __obj.updateDynamic("invalidateCellSizeAfterRender")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellPosition) => invalidateCellSizeAfterRender(t0).runNow()))
    if (recomputeGridSize != null) __obj.updateDynamic("recomputeGridSize")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellPosition) => recomputeGridSize(t0).runNow()))
    __obj.asInstanceOf[MeasuredCellParent]
  }
}

