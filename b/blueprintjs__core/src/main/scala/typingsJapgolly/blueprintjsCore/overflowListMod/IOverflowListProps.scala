package typingsJapgolly.blueprintjsCore.overflowListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowListProps[T] extends IProps {
  /**
    * Which direction the items should collapse from: start or end of the
    * children. This also determines whether `overflowRenderer` appears before
    * (`START`) or after (`END`) the visible items.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  /**
    * All items to display in the list. Items that do not fit in the container
    * will be rendered in the overflow instead.
    */
  var items: js.Array[T]
  /**
    * The minimum number of visible items that should never collapse into the
    * overflow menu, regardless of DOM dimensions.
    * @default 0
    */
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, all parent DOM elements of the container will also be
    * observed. If changes to a parent's size is detected, the overflow will be
    * recalculated.
    *
    * Only enable this prop if the overflow should be recalculated when a
    * parent element resizes in a way that does not also cause the
    * `OverflowList` to resize.
    * @default false
    */
  var observeParents: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback invoked when the overflowed items change. This is called once
    * after the DOM has settled, rather that on every intermediate change. It
    * is not invoked if resizing produces an unchanged overflow state.
    */
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[T], Unit]] = js.undefined
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * HTML tag name for the container element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
  /**
    * Callback invoked to render the overflowed items. Unlike
    * `visibleItemRenderer`, this prop is invoked once with all items that do
    * not fit in the container.
    *
    * Typical use cases for this prop will put overflowed items in a dropdown
    * menu or display a "+X items" label.
    */
  def overflowRenderer(overflowItems: js.Array[T]): Node
  /**
    * Callback invoked to render each visible item.
    * Remember to set a `key` on the rendered element!
    */
  def visibleItemRenderer(item: T, index: Double): ReactChild
}

object IOverflowListProps {
  @scala.inline
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => CallbackTo[Node],
    visibleItemRenderer: (T, Double) => CallbackTo[ReactChild],
    className: String = null,
    collapseFrom: Boundary = null,
    minVisibleItems: Int | Double = null,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    onOverflow: /* overflowItems */ js.Array[T] => Callback = null,
    style: CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null
  ): IOverflowListProps[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("overflowRenderer")(js.Any.fromFunction1((t0: js.Array[T]) => overflowRenderer(t0).runNow()))
    __obj.updateDynamic("visibleItemRenderer")(js.Any.fromFunction2((t0: T, t1: scala.Double) => visibleItemRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (onOverflow != null) __obj.updateDynamic("onOverflow")(js.Any.fromFunction1((t0: /* overflowItems */ js.Array[T]) => onOverflow(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowListProps[T]]
  }
}

