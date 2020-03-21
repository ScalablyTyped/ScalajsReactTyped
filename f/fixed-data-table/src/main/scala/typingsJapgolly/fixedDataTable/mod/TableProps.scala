package typingsJapgolly.fixedDataTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends Props[Table] {
  /**
    * Pixel height of the footer.
    *
    * defaultValue: 0
    */
  var footerHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of the column group header.
    *
    * defaultValue: 0
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of the header.
    *
    * defaultValue: 0
    */
  var headerHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of table. If all rows do not fit, a
    * vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any
    * column.
    */
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.undefined
  /**
    * Callback that is called when rowHeightGetter returns a
    * different height for a row than the rowHeight prop. This
    *  is necessary because initially table estimates heights
    * of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.undefined
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-down event happens
    * on a row.
    */
  var onRowMouseDown: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-enter event happens
    * on a row.
    */
  var onRowMouseEnter: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-leave event happens
    * on a row.
    */
  var onRowMouseLeave: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when scrolling ends or stops with
    * new horizontal and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  /**
    * Callback that is called when scrolling starts with
    * current horizontal and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  /**
    * 'hidden'|'auto'
    */
  var overflowX: js.UndefOr[String] = js.undefined
  /**
    * 'hidden'|'auto'
    */
  var overflowY: js.UndefOr[String] = js.undefined
  /**
    * Pixel height of table's owner, this is used in a managed
    * scrolling situation when you want to slide the table up
    * from below the fold without having to constantly update
    * the height on every scroll tick. Instead, vary this
    * property on scroll. By using ownerHeight, we over-render
    * the table while making sure the footer and horizontal
    * scrollbar of the table are visible when the current space
    * for the table in view is smaller than the final,
    * over-flowing height of table. It allows us to avoid
    * resizing and reflowing table when it is moving in the
    * view.
    *
    * This is used if ownerHeight < height (or maxHeight).
    */
  var ownerHeight: js.UndefOr[Double] = js.undefined
  /**
    * To get any additional CSS classes that should be added to
    *  a row, rowClassNameGetter(index) is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  /**
    * Pixel height of rows unless rowHeightGetter is specified
    * and returns different value.
    */
  var rowHeight: Double
  /**
    * If specified, rowHeightGetter(index) is called for each
    * row and the returned value overrides rowHeight for
    * particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double
  /**
    * Value of horizontal scroll.
    *
    * defaultValue: 0
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
    * Index of column to scroll to.
    */
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  /**
    * Index of row to scroll to.
    */
  var scrollToRow: js.UndefOr[Double] = js.undefined
  /**
    * Value of vertical scroll.
    *
    * defaultValue: 0
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
    * Pixel width of table. If all columns do not fit, a
    * horizontal scrollbar will appear.
    */
  var width: Double
}

object TableProps {
  @scala.inline
  def apply(
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    children: VdomNode = null,
    footerHeight: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    headerHeight: Int | Double = null,
    height: Int | Double = null,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    maxHeight: Int | Double = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Callback = null,
    onContentHeightChange: /* newHeight */ Double => Callback = null,
    onRowClick: (/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowDoubleClick: (/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseDown: (/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseEnter: (/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseLeave: (/* event */ ReactEventFrom[Table with Element], /* rowIndex */ Double) => Callback = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Callback = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Callback = null,
    overflowX: String = null,
    overflowY: String = null,
    ownerHeight: Int | Double = null,
    ref: LegacyRef[Table] = null,
    rowClassNameGetter: /* index */ Double => CallbackTo[String] = null,
    rowHeightGetter: /* index */ Double => CallbackTo[Double] = null,
    scrollLeft: Int | Double = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null
  ): TableProps = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2((t0: /* newColumnWidth */ scala.Double, t1: /* columnKey */ java.lang.String) => onColumnResizeEndCallback(t0, t1).runNow()))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1((t0: /* newHeight */ scala.Double) => onContentHeightChange(t0).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowClick(t0, t1).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowDoubleClick(t0, t1).runNow()))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseDown(t0, t1).runNow()))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseEnter(t0, t1).runNow()))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseLeave(t0, t1).runNow()))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onScrollEnd(t0, t1).runNow()))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onScrollStart(t0, t1).runNow()))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowClassNameGetter(t0).runNow()))
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowHeightGetter(t0).runNow()))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

