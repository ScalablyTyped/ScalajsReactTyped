package typingsJapgolly.rcResizeObserver.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcResizeObserver.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverProps extends js.Object {
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Trigger if element resized. Will always trigger when first time render. */
  var onResize: js.UndefOr[js.Function1[/* size */ AnonHeight, Unit]] = js.undefined
}

object ResizeObserverProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ AnonHeight => Callback = null
  ): ResizeObserverProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* size */ typingsJapgolly.rcResizeObserver.AnonHeight) => onResize(t0).runNow()))
    __obj.asInstanceOf[ResizeObserverProps]
  }
}

