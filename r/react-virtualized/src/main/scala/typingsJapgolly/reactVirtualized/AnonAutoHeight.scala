package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndices
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetter
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsJapgolly.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`30`
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHeight extends js.Object {
  var autoHeight: `false`
  var estimatedRowSize: `30`
  var overscanIndicesGetter: OverscanIndicesGetter
  var overscanRowCount: `10`
  var scrollToAlignment: auto
  var scrollToIndex: `-1`
  def noRowsRenderer(): Null
  def onRowsRendered(): Unit
  def onScroll(): Unit
}

object AnonAutoHeight {
  @scala.inline
  def apply(
    autoHeight: `false`,
    estimatedRowSize: `30`,
    noRowsRenderer: CallbackTo[Null],
    onRowsRendered: Callback,
    onScroll: Callback,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => CallbackTo[OverscanIndices],
    overscanRowCount: `10`,
    scrollToAlignment: auto,
    scrollToIndex: `-1`
  ): AnonAutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], overscanRowCount = overscanRowCount.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("noRowsRenderer")(noRowsRenderer.toJsFn)
    __obj.updateDynamic("onRowsRendered")(onRowsRendered.toJsFn)
    __obj.updateDynamic("onScroll")(onScroll.toJsFn)
    __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams) => overscanIndicesGetter(t0).runNow()))
    __obj.asInstanceOf[AnonAutoHeight]
  }
}

