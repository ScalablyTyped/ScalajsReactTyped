package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.AnonSortBy
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeProps
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndices
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsJapgolly.reactVirtualized.esGridMod.ScrollParams
import typingsJapgolly.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams
import typingsJapgolly.reactVirtualized.esTableMod.HeaderMouseEventHandlerParams
import typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams
import typingsJapgolly.reactVirtualized.esTableMod.SortDirectionType
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowProps
import typingsJapgolly.reactVirtualized.esTableMod.TableProps
import typingsJapgolly.reactVirtualized.esTableMod.TableRowProps
import typingsJapgolly.reactVirtualized.mod.Alignment
import typingsJapgolly.reactVirtualized.mod.Index
import typingsJapgolly.reactVirtualized.mod.IndexRange
import typingsJapgolly.reactVirtualized.mod.OverscanIndexRange
import typingsJapgolly.reactVirtualized.mod.ScrollEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    headerHeight: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    autoContainerWidth: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cellRangeRenderer: /* params */ GridCellRangeProps => CallbackTo[js.Array[Node]] = null,
    className: String = null,
    containerProps: js.Object = null,
    containerRole: String = null,
    containerStyle: CSSProperties = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    disableHeader: js.UndefOr[Boolean] = js.undefined,
    estimatedColumnSize: Int | Double = null,
    estimatedRowSize: Int | Double = null,
    getScrollbarSize: js.UndefOr[CallbackTo[Double]] = js.undefined,
    gridClassName: String = null,
    gridStyle: js.Any = null,
    headerClassName: String = null,
    headerRowRenderer: /* props */ TableHeaderRowProps => CallbackTo[Node] = null,
    headerStyle: js.Any = null,
    height: Int | Double = null,
    id: String = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: js.UndefOr[CallbackTo[Node]] = js.undefined,
    noRowsRenderer: js.UndefOr[CallbackTo[Element | Null]] = js.undefined,
    onHeaderClick: /* params */ HeaderMouseEventHandlerParams => Callback = null,
    onRowClick: /* info */ RowMouseEventHandlerParams => Callback = null,
    onRowDoubleClick: /* info */ RowMouseEventHandlerParams => Callback = null,
    onRowMouseOut: /* info */ RowMouseEventHandlerParams => Callback = null,
    onRowMouseOver: /* info */ RowMouseEventHandlerParams => Callback = null,
    onRowsRendered: /* info */ IndexRange with OverscanIndexRange => Callback = null,
    onScroll: (/* info */ ScrollEventData) | (/* params */ ScrollParams) => CallbackTo[js.Any | Unit] = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => CallbackTo[js.Any] = null,
    onSectionRendered: /* params */ SectionRenderedParams => CallbackTo[js.Any] = null,
    overscanColumnCount: Int | Double = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => CallbackTo[OverscanIndices] = null,
    overscanRowCount: Int | Double = null,
    role: String = null,
    rowClassName: String | (js.Function1[/* info */ Index, String]) = null,
    rowGetter: /* info */ Index => CallbackTo[js.Any] = null,
    rowRenderer: /* props */ TableRowProps => CallbackTo[Node] = null,
    rowStyle: CSSProperties | (js.Function1[/* info */ Index, CSSProperties]) = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment with String = null,
    scrollToColumn: Int | Double = null,
    scrollToIndex: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollingResetTimeInterval: Int | Double = null,
    sort: /* info */ AnonSortBy => Callback = null,
    sortBy: String = null,
    sortDirection: SortDirectionType = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps, typingsJapgolly.reactVirtualized.mod.Table, Unit, TableProps] = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoContainerWidth)) __obj.updateDynamic("autoContainerWidth")(autoContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (cellRangeRenderer != null) __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeProps) => cellRangeRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (containerRole != null) __obj.updateDynamic("containerRole")(containerRole.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeader)) __obj.updateDynamic("disableHeader")(disableHeader.asInstanceOf[js.Any])
    if (estimatedColumnSize != null) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    getScrollbarSize.foreach(p => __obj.updateDynamic("getScrollbarSize")(p.toJsFn))
    if (gridClassName != null) __obj.updateDynamic("gridClassName")(gridClassName.asInstanceOf[js.Any])
    if (gridStyle != null) __obj.updateDynamic("gridStyle")(gridStyle.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerRowRenderer != null) __obj.updateDynamic("headerRowRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableHeaderRowProps) => headerRowRenderer(t0).runNow()))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    noContentRenderer.foreach(p => __obj.updateDynamic("noContentRenderer")(p.toJsFn))
    noRowsRenderer.foreach(p => __obj.updateDynamic("noRowsRenderer")(p.toJsFn))
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.HeaderMouseEventHandlerParams) => onHeaderClick(t0).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowClick(t0).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowDoubleClick(t0).runNow()))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowMouseOut(t0).runNow()))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowMouseOver(t0).runNow()))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.mod.IndexRange with typingsJapgolly.reactVirtualized.mod.OverscanIndexRange) => onRowsRendered(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: (/* info */ typingsJapgolly.reactVirtualized.mod.ScrollEventData) | (/* params */ typingsJapgolly.reactVirtualized.esGridMod.ScrollParams)) => onScroll(t0).runNow()))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.ScrollbarPresenceParams) => onScrollbarPresenceChange(t0).runNow()))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams) => onSectionRendered(t0).runNow()))
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams) => overscanIndicesGetter(t0).runNow()))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowGetter != null) __obj.updateDynamic("rowGetter")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.mod.Index) => rowGetter(t0).runNow()))
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableRowProps) => rowRenderer(t0).runNow()))
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.AnonSortBy) => sort(t0).runNow()))
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esTableMod.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualized.mod.Table](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esTableMod.TableProps])(children: _*)
  }
  @JSImport("react-virtualized", "Table")
  @js.native
  object componentImport extends js.Object
  
}

