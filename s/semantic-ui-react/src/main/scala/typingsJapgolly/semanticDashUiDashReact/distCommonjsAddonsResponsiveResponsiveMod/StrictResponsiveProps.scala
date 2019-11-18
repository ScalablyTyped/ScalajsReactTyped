package typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictResponsiveProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
    * otherwise, assumes a width of 0.
    */
  var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** The maximum width at which content will be displayed. */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  /** The minimum width at which content will be displayed. */
  var minWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Called on update.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onUpdate: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[HTMLElement], /* data */ ResponsiveOnUpdateData, Unit]
  ] = js.undefined
}

object StrictResponsiveProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: VdomNode = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ ReactEventFrom[HTMLElement], /* data */ ResponsiveOnUpdateData) => Callback = null
  ): StrictResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    getWidth.foreach(p => __obj.updateDynamic("getWidth")(p.toJsFn))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveOnUpdateData) => onUpdate(t0, t1).runNow()))
    __obj.asInstanceOf[StrictResponsiveProps]
  }
}

