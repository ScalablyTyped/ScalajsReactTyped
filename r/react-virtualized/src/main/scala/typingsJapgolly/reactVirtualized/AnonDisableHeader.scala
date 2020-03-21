package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowProps
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typingsJapgolly.reactVirtualized.esTableMod.TableRowProps
import typingsJapgolly.reactVirtualized.esTableMod.TableRowRenderer
import typingsJapgolly.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`-1`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`10`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`30`
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisableHeader extends js.Object {
  var disableHeader: `false`
  var estimatedRowSize: `30`
  var headerHeight: `0`
  var headerRowRenderer: TableHeaderRowRenderer
  var overscanRowCount: `10`
  var rowRenderer: TableRowRenderer
  var scrollToAlignment: auto
  var scrollToIndex: `-1`
  def noRowsRenderer(): Null
  def onRowsRendered(): Null
  def onScroll(): Null
}

object AnonDisableHeader {
  @scala.inline
  def apply(
    disableHeader: `false`,
    estimatedRowSize: `30`,
    headerHeight: `0`,
    headerRowRenderer: /* props */ TableHeaderRowProps => CallbackTo[Node],
    noRowsRenderer: CallbackTo[Null],
    onRowsRendered: CallbackTo[Null],
    onScroll: CallbackTo[Null],
    overscanRowCount: `10`,
    rowRenderer: /* props */ TableRowProps => CallbackTo[Node],
    scrollToAlignment: auto,
    scrollToIndex: `-1`
  ): AnonDisableHeader = {
    val __obj = js.Dynamic.literal(disableHeader = disableHeader.asInstanceOf[js.Any], estimatedRowSize = estimatedRowSize.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], overscanRowCount = overscanRowCount.asInstanceOf[js.Any], scrollToAlignment = scrollToAlignment.asInstanceOf[js.Any], scrollToIndex = scrollToIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("headerRowRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowProps) => headerRowRenderer(t0).runNow()))
    __obj.updateDynamic("noRowsRenderer")(noRowsRenderer.toJsFn)
    __obj.updateDynamic("onRowsRendered")(onRowsRendered.toJsFn)
    __obj.updateDynamic("onScroll")(onScroll.toJsFn)
    __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableRowProps) => rowRenderer(t0).runNow()))
    __obj.asInstanceOf[AnonDisableHeader]
  }
}

