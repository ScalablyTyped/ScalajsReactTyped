package typingsJapgolly.reactNativeSortableList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSortableList.mod.DataByNumber
import typingsJapgolly.reactNativeSortableList.mod.DataByString
import typingsJapgolly.reactNativeSortableList.mod.RowProps
import typingsJapgolly.reactNativeSortableList.mod.SortableListProps
import typingsJapgolly.reactNativeSortableList.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSortableList {
  def apply[T, K](
    data: DataByNumber[T] | DataByString[T],
    renderRow: RowProps[T, K] => CallbackTo[Element | Null],
    autoscrollAreaSize: Int | Double = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    innerContainerStyle: StyleProp[ViewStyle] = null,
    manuallyActivateRows: js.UndefOr[Boolean] = js.undefined,
    onActivateRow: K => Callback = null,
    onChangeOrder: /* nextOrder */ js.Array[K] => Callback = null,
    onPressRow: K => Callback = null,
    onReleaseRow: (K, /* currentOrder */ js.Array[K]) => Callback = null,
    order: js.Array[K] = null,
    refreshControl: VdomElement = null,
    renderFooter: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderHeader: js.UndefOr[CallbackTo[Element]] = js.undefined,
    rowActivationTime: Int | Double = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    sortingEnabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SortableListProps[T, K], default[T, K], Unit, SortableListProps[T, K]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderRow")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeSortableList.mod.RowProps[T, K]) => renderRow(t0).runNow()))
    if (autoscrollAreaSize != null) __obj.updateDynamic("autoscrollAreaSize")(autoscrollAreaSize.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (innerContainerStyle != null) __obj.updateDynamic("innerContainerStyle")(innerContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(manuallyActivateRows)) __obj.updateDynamic("manuallyActivateRows")(manuallyActivateRows.asInstanceOf[js.Any])
    if (onActivateRow != null) __obj.updateDynamic("onActivateRow")(js.Any.fromFunction1((t0: K) => onActivateRow(t0).runNow()))
    if (onChangeOrder != null) __obj.updateDynamic("onChangeOrder")(js.Any.fromFunction1((t0: /* nextOrder */ js.Array[K]) => onChangeOrder(t0).runNow()))
    if (onPressRow != null) __obj.updateDynamic("onPressRow")(js.Any.fromFunction1((t0: K) => onPressRow(t0).runNow()))
    if (onReleaseRow != null) __obj.updateDynamic("onReleaseRow")(js.Any.fromFunction2((t0: K, t1: /* currentOrder */ js.Array[K]) => onReleaseRow(t0, t1).runNow()))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.rawElement.asInstanceOf[js.Any])
    renderFooter.foreach(p => __obj.updateDynamic("renderFooter")(p.toJsFn))
    renderHeader.foreach(p => __obj.updateDynamic("renderHeader")(p.toJsFn))
    if (rowActivationTime != null) __obj.updateDynamic("rowActivationTime")(rowActivationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(sortingEnabled)) __obj.updateDynamic("sortingEnabled")(sortingEnabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSortableList.mod.SortableListProps[T, K], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSortableList.mod.default[T, K]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSortableList.mod.SortableListProps[T, K]])(children: _*)
  }
  @JSImport("react-native-sortable-list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

