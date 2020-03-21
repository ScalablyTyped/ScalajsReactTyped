package typingsJapgolly.semanticUiReact.visibilityVisibilityMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.events
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.repaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictVisibilityProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the
    * threshold is met.
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the
    * page.
    */
  var offset: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  /**
    * Element's bottom edge has passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's bottom edge has not passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's bottom edge has passed bottom of screen
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's bottom edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element is not visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOffScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element is visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOnScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /** Element is not visible on the screen. */
  var onPassed: js.UndefOr[VisibilityOnPassed] = js.undefined
  /**
    * Any part of an element is visible on screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassing: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top has not passed top of screen but bottom has.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassingReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has not passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUpdate: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /** When set to false a callback will occur each time an element passes the threshold for a condition. */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows to choose the mode of the position calculations:
    * - `events` - (default) update and fire callbacks only on scroll/resize events
    * - `repaint` - update and fire callbacks on browser repaint (animation frames)
    */
  var updateOn: js.UndefOr[events | repaint] = js.undefined
}

object StrictVisibilityProps {
  @scala.inline
  def apply(
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
  ): StrictVisibilityProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictVisibilityProps]
  }
}

