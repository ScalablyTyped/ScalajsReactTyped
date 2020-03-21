package typingsJapgolly.reactList.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.reactList.reactListStrings.x
import typingsJapgolly.reactList.reactListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactListProps extends Props[ReactList] {
  var axis: js.UndefOr[x | y] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var itemRenderer: js.UndefOr[ItemRenderer] = js.undefined
  var itemSizeEstimator: js.UndefOr[ItemSizeEstimator] = js.undefined
  var itemSizeGetter: js.UndefOr[ItemSizeGetter] = js.undefined
  var itemsRenderer: js.UndefOr[ItemsRenderer] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var scrollParentGetter: js.UndefOr[ScrollParentGetter] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useStaticSize: js.UndefOr[Boolean] = js.undefined
  var useTranslate3d: js.UndefOr[Boolean] = js.undefined
}

object ReactListProps {
  @scala.inline
  def apply(
    axis: x | y = null,
    children: VdomNode = null,
    initialIndex: Int | Double = null,
    itemRenderer: (/* index */ Double, /* key */ Double | String) => CallbackTo[Element] = null,
    itemSizeEstimator: (/* index */ Double, /* cache */ js.Object) => CallbackTo[Double] = null,
    itemSizeGetter: /* index */ Double => CallbackTo[Double] = null,
    itemsRenderer: (/* items */ js.Array[Element], /* ref */ String) => CallbackTo[Element] = null,
    key: Key = null,
    length: Int | Double = null,
    minSize: Int | Double = null,
    pageSize: Int | Double = null,
    ref: LegacyRef[ReactList] = null,
    scrollParentGetter: js.UndefOr[CallbackTo[Element]] = js.undefined,
    threshold: Int | Double = null,
    `type`: String = null,
    useStaticSize: js.UndefOr[Boolean] = js.undefined,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined
  ): ReactListProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* key */ scala.Double | java.lang.String) => itemRenderer(t0, t1).runNow()))
    if (itemSizeEstimator != null) __obj.updateDynamic("itemSizeEstimator")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* cache */ js.Object) => itemSizeEstimator(t0, t1).runNow()))
    if (itemSizeGetter != null) __obj.updateDynamic("itemSizeGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => itemSizeGetter(t0).runNow()))
    if (itemsRenderer != null) __obj.updateDynamic("itemsRenderer")(js.Any.fromFunction2((t0: /* items */ js.Array[japgolly.scalajs.react.raw.React.Element], t1: /* ref */ java.lang.String) => itemsRenderer(t0, t1).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    scrollParentGetter.foreach(p => __obj.updateDynamic("scrollParentGetter")(p.toJsFn))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useStaticSize)) __obj.updateDynamic("useStaticSize")(useStaticSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactListProps]
  }
}

