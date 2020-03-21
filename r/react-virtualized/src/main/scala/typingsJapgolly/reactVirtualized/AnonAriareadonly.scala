package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeProps
import typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndices
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsJapgolly.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsJapgolly.reactVirtualized.reactVirtualizedBooleans.`true`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`100`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`150`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`30`
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.auto
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.grid
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAriareadonly extends js.Object {
  var `aria-label`: grid
  var `aria-readonly`: `true`
  var autoContainerWidth: `false`
  var autoHeight: `false`
  var autoWidth: `false`
  var cellRangeRenderer: GridCellRangeRenderer
  var containerRole: rowgroup
  var estimatedColumnSize: `100`
  var estimatedRowSize: `30`
  var overscanColumnCount: `0`
  var overscanIndicesGetter: OverscanIndicesGetter
  var overscanRowCount: `10`
  var role: grid
  var scrollToAlignment: auto
  var scrollToColumn: `-1`
  var scrollToRow: `-1`
  var scrollingResetTimeInterval: `150`
  var tabIndex: `0`
  def getScrollbarSize(): Double
  def noContentRenderer(): Node
  def onScroll(): Unit
  def onScrollbarPresenceChange(): Unit
  def onSectionRendered(): Unit
}

object AnonAriareadonly {
  @scala.inline
  def apply(
    `aria-label`: grid,
    `aria-readonly`: `true`,
    autoContainerWidth: `false`,
    autoHeight: `false`,
    autoWidth: `false`,
    cellRangeRenderer: /* params */ GridCellRangeProps => CallbackTo[js.Array[Node]],
    containerRole: rowgroup,
    estimatedColumnSize: `100`,
    estimatedRowSize: `30`,
    getScrollbarSize: CallbackTo[Double],
    noContentRenderer: CallbackTo[Node],
    onScroll: Callback,
    onScrollbarPresenceChange: Callback,
    onSectionRendered: Callback,
    overscanColumnCount: `0`,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => CallbackTo[OverscanIndices],
    overscanRowCount: `10`,
    role: grid,
    scrollToAlignment: auto,
    scrollToColumn: `-1`,
    scrollToRow: `-1`,
    scrollingResetTimeInterval: `150`,
    tabIndex: `0`
  ): AnonAriareadonly = {
    val __obj = js.Dynamic.literal(autoContainerWidth = autoContainerWidth.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], containerRole = containerRole.asInstanceOf[js.Any], estimatedColumnSize = estimatedColumnSize.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], overscanColumnCount = overscanColumnCount.asInstanceOf[js.Any], overscanRowCount = overscanRowCount.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToColumn = scrollToColumn.asInstanceOf[js.Any], scrollToRow = scrollToRow.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeProps) => cellRangeRenderer(t0).runNow()))
    __obj.updateDynamic("getScrollbarSize")(getScrollbarSize.toJsFn)
    __obj.updateDynamic("noContentRenderer")(noContentRenderer.toJsFn)
    __obj.updateDynamic("onScroll")(onScroll.toJsFn)
    __obj.updateDynamic("onScrollbarPresenceChange")(onScrollbarPresenceChange.toJsFn)
    __obj.updateDynamic("onSectionRendered")(onSectionRendered.toJsFn)
    __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams) => overscanIndicesGetter(t0).runNow()))
    __obj.asInstanceOf[AnonAriareadonly]
  }
}

