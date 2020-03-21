package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWatcherOptions extends js.Object {
  var event_selector: String
  var key: js.UndefOr[String] = js.undefined
  def emitter(newEmitter: js.Any): Unit
  def update(newValue: js.Any): Unit
}

object EventWatcherOptions {
  @scala.inline
  def apply(
    emitter: js.Any => Callback,
    event_selector: String,
    update: js.Any => Callback,
    key: String = null
  ): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(event_selector = event_selector.asInstanceOf[js.Any])
    __obj.updateDynamic("emitter")(js.Any.fromFunction1((t0: js.Any) => emitter(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Any) => update(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWatcherOptions]
  }
}

