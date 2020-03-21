package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.AnonEventSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var image: js.UndefOr[Node] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    image: VdomNode = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Callback = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Callback = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.rawNode.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseLeave(t0).runNow()))
    __obj.asInstanceOf[CardProps]
  }
}

