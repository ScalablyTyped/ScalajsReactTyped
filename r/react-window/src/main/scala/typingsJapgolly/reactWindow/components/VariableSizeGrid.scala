package typingsJapgolly.reactWindow.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.reactWindow.AnonColumnIndex
import typingsJapgolly.reactWindow.mod.CSSDirection
import typingsJapgolly.reactWindow.mod.GridChildComponentProps
import typingsJapgolly.reactWindow.mod.GridOnItemsRenderedProps
import typingsJapgolly.reactWindow.mod.GridOnScrollProps
import typingsJapgolly.reactWindow.mod.ReactElementType
import typingsJapgolly.reactWindow.mod.VariableSizeGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VariableSizeGrid {
  def apply(
    columnCount: Double,
    height: Double,
    rowCount: Double,
    width: Double,
    columnWidth: Double => CallbackTo[Double],
    rowHeight: Double => CallbackTo[Double],
    className: String = null,
    direction: CSSDirection = null,
    estimatedColumnWidth: Int | Double = null,
    estimatedRowHeight: Int | Double = null,
    initialScrollLeft: Int | Double = null,
    initialScrollTop: Int | Double = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: /* params */ AnonColumnIndex => CallbackTo[Key] = null,
    onItemsRendered: /* props */ GridOnItemsRenderedProps => CallbackTo[js.Any] = null,
    onScroll: /* props */ GridOnScrollProps => CallbackTo[js.Any] = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref = null,
    outerTagName: String = null,
    overscanColumnCount: Int | Double = null,
    overscanColumnsCount: Int | Double = null,
    overscanCount: Int | Double = null,
    overscanRowCount: Int | Double = null,
    overscanRowsCount: Int | Double = null,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ComponentType[GridChildComponentProps]
  ): UnmountedWithRoot[
    VariableSizeGridProps, 
    typingsJapgolly.reactWindow.mod.VariableSizeGrid, 
    Unit, 
    VariableSizeGridProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("columnWidth")(js.Any.fromFunction1((t0: scala.Double) => columnWidth(t0).runNow()))
    __obj.updateDynamic("rowHeight")(js.Any.fromFunction1((t0: scala.Double) => rowHeight(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (estimatedColumnWidth != null) __obj.updateDynamic("estimatedColumnWidth")(estimatedColumnWidth.asInstanceOf[js.Any])
    if (estimatedRowHeight != null) __obj.updateDynamic("estimatedRowHeight")(estimatedRowHeight.asInstanceOf[js.Any])
    if (initialScrollLeft != null) __obj.updateDynamic("initialScrollLeft")(initialScrollLeft.asInstanceOf[js.Any])
    if (initialScrollTop != null) __obj.updateDynamic("initialScrollTop")(initialScrollTop.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactWindow.AnonColumnIndex) => itemKey(t0).runNow()))
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactWindow.mod.GridOnItemsRenderedProps) => onItemsRendered(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactWindow.mod.GridOnScrollProps) => onScroll(t0).runNow()))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanColumnsCount != null) __obj.updateDynamic("overscanColumnsCount")(overscanColumnsCount.asInstanceOf[js.Any])
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (overscanRowsCount != null) __obj.updateDynamic("overscanRowsCount")(overscanRowsCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWindow.mod.VariableSizeGridProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactWindow.mod.VariableSizeGrid](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWindow.mod.VariableSizeGridProps])
  }
  @JSImport("react-window", "VariableSizeGrid")
  @js.native
  object componentImport extends js.Object
  
}

