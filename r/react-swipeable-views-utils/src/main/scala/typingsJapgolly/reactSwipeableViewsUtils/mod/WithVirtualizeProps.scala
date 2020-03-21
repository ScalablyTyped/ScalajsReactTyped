package typingsJapgolly.reactSwipeableViewsUtils.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsJapgolly.reactSwipeableViews.mod.OnTransitionEndCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithVirtualizeProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var index: Double
  var onChangeIndex: OnChangeIndexCallback
  var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.undefined
  var overscanSlideAfter: js.UndefOr[Double] = js.undefined
  var overscanSliedBefore: js.UndefOr[Double] = js.undefined
  var slideCount: js.UndefOr[Double] = js.undefined
  var slideRenderer: SlideRendererCallback
}

object WithVirtualizeProps {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback,
    slideRenderer: /* render */ SlideRenderProps => CallbackTo[Node],
    children: VdomNode = null,
    onTransitionEnd: js.UndefOr[Callback] = js.undefined,
    overscanSlideAfter: Int | Double = null,
    overscanSliedBefore: Int | Double = null,
    slideCount: Int | Double = null
  ): WithVirtualizeProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    __obj.updateDynamic("slideRenderer")(js.Any.fromFunction1((t0: /* render */ typingsJapgolly.reactSwipeableViewsUtils.mod.SlideRenderProps) => slideRenderer(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    onTransitionEnd.foreach(p => __obj.updateDynamic("onTransitionEnd")(p.toJsFn))
    if (overscanSlideAfter != null) __obj.updateDynamic("overscanSlideAfter")(overscanSlideAfter.asInstanceOf[js.Any])
    if (overscanSliedBefore != null) __obj.updateDynamic("overscanSliedBefore")(overscanSliedBefore.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithVirtualizeProps]
  }
}

