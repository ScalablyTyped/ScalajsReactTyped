package typingsJapgolly.reactBroadcast.mod.Broadcast

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>> */
trait Props[T] extends js.Object {
  var channel: String
  var children: Node
  var compareValues: js.UndefOr[js.Function2[/* prevValue */ T, /* nextValue */ T, Boolean]] = js.undefined
  var value: T
}

object Props {
  @scala.inline
  def apply[T](
    channel: String,
    value: T,
    children: VdomNode = null,
    compareValues: (/* prevValue */ T, /* nextValue */ T) => CallbackTo[Boolean] = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (compareValues != null) __obj.updateDynamic("compareValues")(js.Any.fromFunction2((t0: /* prevValue */ T, t1: /* nextValue */ T) => compareValues(t0, t1).runNow()))
    __obj.asInstanceOf[Props[T]]
  }
}

