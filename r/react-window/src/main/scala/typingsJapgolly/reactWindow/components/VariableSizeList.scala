package typingsJapgolly.reactWindow.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.reactWindow.mod.CSSDirection
import typingsJapgolly.reactWindow.mod.Direction
import typingsJapgolly.reactWindow.mod.Layout
import typingsJapgolly.reactWindow.mod.ListChildComponentProps
import typingsJapgolly.reactWindow.mod.ListOnItemsRenderedProps
import typingsJapgolly.reactWindow.mod.ListOnScrollProps
import typingsJapgolly.reactWindow.mod.ReactElementType
import typingsJapgolly.reactWindow.mod.VariableSizeListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VariableSizeList {
  def apply(
    height: Double | String,
    itemCount: Double,
    width: Double | String,
    itemSize: Double => CallbackTo[Double],
    className: String = null,
    direction: CSSDirection | Direction = null,
    estimatedItemSize: Int | Double = null,
    initialScrollOffset: Int | Double = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: (/* index */ Double, /* data */ js.Any) => CallbackTo[Key] = null,
    layout: Layout = null,
    onItemsRendered: /* props */ ListOnItemsRenderedProps => CallbackTo[js.Any] = null,
    onScroll: /* props */ ListOnScrollProps => CallbackTo[js.Any] = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref = null,
    outerTagName: String = null,
    overscanCount: Int | Double = null,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ComponentType[ListChildComponentProps]
  ): UnmountedWithRoot[
    VariableSizeListProps, 
    typingsJapgolly.reactWindow.mod.VariableSizeList, 
    Unit, 
    VariableSizeListProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("itemSize")(js.Any.fromFunction1((t0: scala.Double) => itemSize(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (estimatedItemSize != null) __obj.updateDynamic("estimatedItemSize")(estimatedItemSize.asInstanceOf[js.Any])
    if (initialScrollOffset != null) __obj.updateDynamic("initialScrollOffset")(initialScrollOffset.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* data */ js.Any) => itemKey(t0, t1).runNow()))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactWindow.mod.ListOnItemsRenderedProps) => onItemsRendered(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactWindow.mod.ListOnScrollProps) => onScroll(t0).runNow()))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactWindow.mod.VariableSizeListProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactWindow.mod.VariableSizeList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactWindow.mod.VariableSizeListProps])
  }
  @JSImport("react-window", "VariableSizeList")
  @js.native
  object componentImport extends js.Object
  
}

