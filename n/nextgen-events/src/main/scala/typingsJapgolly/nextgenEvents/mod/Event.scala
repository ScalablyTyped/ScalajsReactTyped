package typingsJapgolly.nextgenEvents.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var args: js.Any
  var emitter: NextGenEvents
  var interrupt: Null
  var mice: Double
  var name: String
  var sync: Boolean
  def callback(interrupt: js.Any): js.Any
}

object Event {
  @scala.inline
  def apply(
    args: js.Any,
    callback: js.Any => CallbackTo[js.Any],
    emitter: NextGenEvents,
    interrupt: Null,
    mice: Double,
    name: String,
    sync: Boolean
  ): Event = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], mice = mice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: js.Any) => callback(t0).runNow()))
    __obj.asInstanceOf[Event]
  }
}

