package typingsJapgolly.reactBeforeunload

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactBeforeunload.mod.UseBeforeunloadHandler
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var onBeforeunload: UseBeforeunloadHandler
}

object AnonChildren {
  @scala.inline
  def apply(
    onBeforeunload: /* arg */ Event_ => CallbackTo[js.UndefOr[String | Unit]],
    children: VdomNode = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onBeforeunload")(js.Any.fromFunction1((t0: /* arg */ typingsJapgolly.std.Event_) => onBeforeunload(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

