package typingsJapgolly.reactOverlays.rootCloseWrapperMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactOverlays.reactOverlaysStrings.click
import typingsJapgolly.reactOverlays.reactOverlaysStrings.mousedown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCloseWrapperProps extends js.Object {
  /**
    * Children to render.
    */
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Disable the the RootCloseWrapper, preventing it from triggering
    * `onRootClose`.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose which document mouse event to bind to
    */
  var event: js.UndefOr[click | mousedown] = js.undefined
  /**
    * Callback fired after click or mousedown. Also triggers when user hits `esc`.
    */
  var onRootClose: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Unit]] = js.undefined
}

object RootCloseWrapperProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    event: click | mousedown = null,
    onRootClose: /* e */ ReactEventFrom[Element] => Callback = null
  ): RootCloseWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onRootClose(t0).runNow()))
    __obj.asInstanceOf[RootCloseWrapperProps]
  }
}

