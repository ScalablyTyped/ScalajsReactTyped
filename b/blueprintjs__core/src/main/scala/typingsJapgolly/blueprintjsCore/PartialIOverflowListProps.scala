package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/overflow-list/overflowList.IOverflowListProps<@blueprintjs/core.@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumb.IBreadcrumbProps>> */
trait PartialIOverflowListProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  var items: js.UndefOr[js.Array[IBreadcrumbProps]] = js.undefined
  var minVisibleItems: js.UndefOr[Double] = js.undefined
  var observeParents: js.UndefOr[Boolean] = js.undefined
  var onOverflow: js.UndefOr[js.Function1[/* overflowItems */ js.Array[IBreadcrumbProps], Unit]] = js.undefined
  var overflowRenderer: js.UndefOr[js.Function1[/* overflowItems */ js.Array[IBreadcrumbProps], Node]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ] = js.undefined
  var visibleItemRenderer: js.UndefOr[js.Function2[/* item */ IBreadcrumbProps, /* index */ Double, ReactChild]] = js.undefined
}

object PartialIOverflowListProps {
  @scala.inline
  def apply(
    className: String = null,
    collapseFrom: Boundary = null,
    items: js.Array[IBreadcrumbProps] = null,
    minVisibleItems: Int | Double = null,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    onOverflow: /* overflowItems */ js.Array[IBreadcrumbProps] => Callback = null,
    overflowRenderer: /* overflowItems */ js.Array[IBreadcrumbProps] => CallbackTo[Node] = null,
    style: CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    visibleItemRenderer: (/* item */ IBreadcrumbProps, /* index */ Double) => CallbackTo[ReactChild] = null
  ): PartialIOverflowListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (onOverflow != null) __obj.updateDynamic("onOverflow")(js.Any.fromFunction1((t0: /* overflowItems */ js.Array[typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps]) => onOverflow(t0).runNow()))
    if (overflowRenderer != null) __obj.updateDynamic("overflowRenderer")(js.Any.fromFunction1((t0: /* overflowItems */ js.Array[typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps]) => overflowRenderer(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (visibleItemRenderer != null) __obj.updateDynamic("visibleItemRenderer")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps, t1: /* index */ scala.Double) => visibleItemRenderer(t0, t1).runNow()))
    __obj.asInstanceOf[PartialIOverflowListProps]
  }
}

