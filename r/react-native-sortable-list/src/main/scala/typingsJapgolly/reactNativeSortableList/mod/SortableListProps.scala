package typingsJapgolly.reactNativeSortableList.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableListProps[T, K] extends js.Object {
  /**
    * determines the height for vertical list and the width for horizontal list of the area at the begining and
    * the end of the list that will trigger autoscrolling. Defaults to 60.
    */
  var autoscrollAreaSize: js.UndefOr[Double] = js.undefined
  /**
    * these styles will be applied to the inner scroll view content container
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * data source
    */
  var data: DataByNumber[T] | DataByString[T]
  /**
    * when true, the SortableList's children are arranged horizontally in a row instead of vertically in a column.
    * The default value is false.
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * these styles will be applied to the inner scroll view content container, excluding the header and footer
    */
  var innerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * whether you intend to use the toggleRowActive method to activate a row or use the out of box solution.
    */
  var manuallyActivateRows: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when a row was activated (user long tapped).
    */
  var onActivateRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.undefined
  /**
    * Called when rows were reordered, takes an array of rows keys of the next rows order.
    */
  var onChangeOrder: js.UndefOr[js.Function1[/* nextOrder */ js.Array[K], Unit]] = js.undefined
  /**
    * Called when a row was pressed.
    */
  var onPressRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.undefined
  /**
    * Called when the active row was released.
    */
  var onReleaseRow: js.UndefOr[js.Function2[/* key */ K, /* currentOrder */ js.Array[K], Unit]] = js.undefined
  /**
    * an array of keys from data, the order of keys from the array will be used to initial rows order
    */
  var order: js.UndefOr[js.Array[K]] = js.undefined
  /**
    * A RefreshControl that works the same way as a ScrollView's refreshControl.
    */
  var refreshControl: js.UndefOr[Element] = js.undefined
  /**
    * Renders returned component at the bottom of the list.
    */
  var renderFooter: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * Renders returned component at the top of the list.
    */
  var renderHeader: js.UndefOr[js.Function0[Element]] = js.undefined
  /**
    * determines time delay in ms before pressed row becomes active. Defaults to 200 ms.
    */
  var rowActivationTime: js.UndefOr[Double] = js.undefined
  /**
    * when false, the content does not scrollable. The default value is true.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * when false, the horizontal scroll indicator will not be visible. The default value is true.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  /**
    * when false, the vertical scroll indicator will not be visible. The default value is true.
    */
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  /**
    * when false, rows are not sortable. The default value is true.
    */
  var sortingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * style of HOC
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Takes a row key, row index, data entry from the data source and its statuses disabled, active and should
    * return a renderable component to be rendered as the row. The child component will receive a method called
    * toggleRowActive (only if manuallyActivateRows={true}) to manually activate the row. Useful if you have
    * multiple touch responders in your view.
    */
  def renderRow(props: RowProps[T, K]): Element | Null
}

object SortableListProps {
  @scala.inline
  def apply[T, K](
    data: DataByNumber[T] | DataByString[T],
    renderRow: RowProps[T, K] => CallbackTo[Element | Null],
    autoscrollAreaSize: Int | Double = null,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    innerContainerStyle: StyleProp[ViewStyle] = null,
    manuallyActivateRows: js.UndefOr[Boolean] = js.undefined,
    onActivateRow: /* key */ K => Callback = null,
    onChangeOrder: /* nextOrder */ js.Array[K] => Callback = null,
    onPressRow: /* key */ K => Callback = null,
    onReleaseRow: (/* key */ K, /* currentOrder */ js.Array[K]) => Callback = null,
    order: js.Array[K] = null,
    refreshControl: VdomElement = null,
    renderFooter: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderHeader: js.UndefOr[CallbackTo[Element]] = js.undefined,
    rowActivationTime: Int | Double = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    sortingEnabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null
  ): SortableListProps[T, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("renderRow")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeSortableList.mod.RowProps[T, K]) => renderRow(t0).runNow()))
    if (autoscrollAreaSize != null) __obj.updateDynamic("autoscrollAreaSize")(autoscrollAreaSize.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (innerContainerStyle != null) __obj.updateDynamic("innerContainerStyle")(innerContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(manuallyActivateRows)) __obj.updateDynamic("manuallyActivateRows")(manuallyActivateRows.asInstanceOf[js.Any])
    if (onActivateRow != null) __obj.updateDynamic("onActivateRow")(js.Any.fromFunction1((t0: /* key */ K) => onActivateRow(t0).runNow()))
    if (onChangeOrder != null) __obj.updateDynamic("onChangeOrder")(js.Any.fromFunction1((t0: /* nextOrder */ js.Array[K]) => onChangeOrder(t0).runNow()))
    if (onPressRow != null) __obj.updateDynamic("onPressRow")(js.Any.fromFunction1((t0: /* key */ K) => onPressRow(t0).runNow()))
    if (onReleaseRow != null) __obj.updateDynamic("onReleaseRow")(js.Any.fromFunction2((t0: /* key */ K, t1: /* currentOrder */ js.Array[K]) => onReleaseRow(t0, t1).runNow()))
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
    __obj.asInstanceOf[SortableListProps[T, K]]
  }
}

