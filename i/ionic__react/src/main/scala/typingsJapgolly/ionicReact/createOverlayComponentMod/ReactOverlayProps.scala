package typingsJapgolly.ionicReact.createOverlayComponentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactOverlayProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var isOpen: Boolean
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
}

object ReactOverlayProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    children: VdomNode = null,
    onDidDismiss: /* event */ CustomEvent => Callback = null,
    onDidPresent: /* event */ CustomEvent => Callback = null,
    onWillDismiss: /* event */ CustomEvent => Callback = null,
    onWillPresent: /* event */ CustomEvent => Callback = null
  ): ReactOverlayProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onDidDismiss(t0).runNow()))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onDidPresent(t0).runNow()))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onWillDismiss(t0).runNow()))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onWillPresent(t0).runNow()))
    __obj.asInstanceOf[ReactOverlayProps]
  }
}

