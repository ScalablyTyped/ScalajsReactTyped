package typingsJapgolly.semanticUiReact.visibilityVisibilityMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.events
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.repaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityEventData extends VisibilityProps {
  var calculations: VisibilityCalculations
}

object VisibilityEventData {
  @scala.inline
  def apply(
    calculations: VisibilityCalculations,
    as: js.Any = null,
    children: VdomNode = null,
    context: js.Object = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    offset: Double | String | (js.Array[Double | String]) = null,
    onBottomPassed: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onBottomPassedReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onBottomVisible: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onBottomVisibleReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onOffScreen: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onOnScreen: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onPassed: VisibilityOnPassed = null,
    onPassing: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onPassingReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopPassed: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopPassedReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopVisible: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onTopVisibleReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    onUpdate: (/* nothing */ Null, /* data */ VisibilityEventData) => Callback = null,
    once: js.UndefOr[Boolean] = js.undefined,
    updateOn: events | repaint = null
  ): VisibilityEventData = {
    val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottomPassed != null) __obj.updateDynamic("onBottomPassed")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onBottomPassed(t0, t1).runNow()))
    if (onBottomPassedReverse != null) __obj.updateDynamic("onBottomPassedReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onBottomPassedReverse(t0, t1).runNow()))
    if (onBottomVisible != null) __obj.updateDynamic("onBottomVisible")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onBottomVisible(t0, t1).runNow()))
    if (onBottomVisibleReverse != null) __obj.updateDynamic("onBottomVisibleReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onBottomVisibleReverse(t0, t1).runNow()))
    if (onOffScreen != null) __obj.updateDynamic("onOffScreen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onOffScreen(t0, t1).runNow()))
    if (onOnScreen != null) __obj.updateDynamic("onOnScreen")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onOnScreen(t0, t1).runNow()))
    if (onPassed != null) __obj.updateDynamic("onPassed")(onPassed.asInstanceOf[js.Any])
    if (onPassing != null) __obj.updateDynamic("onPassing")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onPassing(t0, t1).runNow()))
    if (onPassingReverse != null) __obj.updateDynamic("onPassingReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onPassingReverse(t0, t1).runNow()))
    if (onTopPassed != null) __obj.updateDynamic("onTopPassed")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onTopPassed(t0, t1).runNow()))
    if (onTopPassedReverse != null) __obj.updateDynamic("onTopPassedReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onTopPassedReverse(t0, t1).runNow()))
    if (onTopVisible != null) __obj.updateDynamic("onTopVisible")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onTopVisible(t0, t1).runNow()))
    if (onTopVisibleReverse != null) __obj.updateDynamic("onTopVisibleReverse")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onTopVisibleReverse(t0, t1).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2((t0: /* nothing */ scala.Null, t1: /* data */ typingsJapgolly.semanticUiReact.visibilityVisibilityMod.VisibilityEventData) => onUpdate(t0, t1).runNow()))
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityEventData]
  }
}

