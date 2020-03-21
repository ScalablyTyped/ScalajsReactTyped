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
import typingsJapgolly.reactVirtualized.AnonOverscanStartIndex
import typingsJapgolly.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsJapgolly.reactVirtualized.esGridMod.GridCellRangeProps
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndices
import typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsJapgolly.reactVirtualized.esGridMod.ScrollParams
import typingsJapgolly.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams
import typingsJapgolly.reactVirtualized.esListMod.ListProps
import typingsJapgolly.reactVirtualized.esListMod.ListRowProps
import typingsJapgolly.reactVirtualized.esScrollSyncMod.OnScrollParams
import typingsJapgolly.reactVirtualized.mod.Alignment
import typingsJapgolly.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply(
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    width: Double,
    rowRenderer: /* props */ ListRowProps => CallbackTo[Node],
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
    estimatedColumnSize: Int | Double = null,
    estimatedRowSize: Int | Double = null,
    getScrollbarSize: js.UndefOr[CallbackTo[Double]] = js.undefined,
    id: String = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: js.UndefOr[CallbackTo[Node]] = js.undefined,
    noRowsRenderer: js.UndefOr[CallbackTo[Element]] = js.undefined,
    onRowsRendered: /* info */ AnonOverscanStartIndex => Callback = null,
    onScroll: (/* params */ OnScrollParams) | (/* params */ ScrollParams) => CallbackTo[js.Any | Unit] = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => CallbackTo[js.Any] = null,
    onSectionRendered: /* params */ SectionRenderedParams => CallbackTo[js.Any] = null,
    overscanColumnCount: Int | Double = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => CallbackTo[OverscanIndices] = null,
    overscanRowCount: Int | Double = null,
    role: String = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment with String = null,
    scrollToColumn: Int | Double = null,
    scrollToIndex: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollingResetTimeInterval: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListProps, typingsJapgolly.reactVirtualized.mod.List, Unit, ListProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("rowRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esListMod.ListRowProps) => rowRenderer(t0).runNow()))
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
    if (estimatedColumnSize != null) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    getScrollbarSize.foreach(p => __obj.updateDynamic("getScrollbarSize")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    noContentRenderer.foreach(p => __obj.updateDynamic("noContentRenderer")(p.toJsFn))
    noRowsRenderer.foreach(p => __obj.updateDynamic("noRowsRenderer")(p.toJsFn))
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactVirtualized.AnonOverscanStartIndex) => onRowsRendered(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: (/* params */ typingsJapgolly.reactVirtualized.esScrollSyncMod.OnScrollParams) | (/* params */ typingsJapgolly.reactVirtualized.esGridMod.ScrollParams)) => onScroll(t0).runNow()))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.ScrollbarPresenceParams) => onScrollbarPresenceChange(t0).runNow()))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams) => onSectionRendered(t0).runNow()))
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.OverscanIndicesGetterParams) => overscanIndicesGetter(t0).runNow()))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esListMod.ListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualized.mod.List](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esListMod.ListProps])(children: _*)
  }
  @JSImport("react-virtualized", "List")
  @js.native
  object componentImport extends js.Object
  
}

