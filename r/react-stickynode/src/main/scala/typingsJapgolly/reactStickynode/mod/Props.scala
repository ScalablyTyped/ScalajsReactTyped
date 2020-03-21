package typingsJapgolly.reactStickynode.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Class name to be applied to the element when the sticky state is
    * active (active by default).
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * The offset from the top of document which release state will be
    * triggered when the bottom of the element reaches at.If it is a
    * selector to a target(via `querySelector()`), the offset will be the
    * bottom of the target.
    */
  var bottomBoundary: js.UndefOr[Double | String] = js.undefined
  var children: Node | (js.Function1[/* status */ Status, Node])
  /** Enable the use of CSS3 transforms (true by default). */
  var enableTransforms: js.UndefOr[Boolean] = js.undefined
  /** The switch to enable or disable Sticky (true by default ). */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** z-index of the sticky */
  var innerZ: js.UndefOr[Double | String] = js.undefined
  /** Callback for when the sticky state changes. */
  var onStateChange: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.undefined
  /**
    * Class name to be applied to the element when the sticky state is
    * released (released by default).
    */
  var releasedClass: js.UndefOr[String] = js.undefined
  /**
    * Callback to indicate when the sticky plugin should freeze position
    * and ignore scroll/resize events.
    */
  var shouldFreeze: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The offset from the top of window where the top of the element will
    * be when sticky state is triggered(0 by default ).If it is a selector
    * to a target(via `querySelector()`), the offset will be the height of
    * the target.
    */
  var top: js.UndefOr[Double | String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    activeClass: String = null,
    bottomBoundary: Double | String = null,
    children: Node | (js.Function1[/* status */ Status, Node]) = null,
    enableTransforms: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    innerZ: Double | String = null,
    onStateChange: /* status */ Status => Callback = null,
    releasedClass: String = null,
    shouldFreeze: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    top: Double | String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (bottomBoundary != null) __obj.updateDynamic("bottomBoundary")(bottomBoundary.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransforms)) __obj.updateDynamic("enableTransforms")(enableTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (innerZ != null) __obj.updateDynamic("innerZ")(innerZ.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* status */ typingsJapgolly.reactStickynode.mod.Status) => onStateChange(t0).runNow()))
    if (releasedClass != null) __obj.updateDynamic("releasedClass")(releasedClass.asInstanceOf[js.Any])
    shouldFreeze.foreach(p => __obj.updateDynamic("shouldFreeze")(p.toJsFn))
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

