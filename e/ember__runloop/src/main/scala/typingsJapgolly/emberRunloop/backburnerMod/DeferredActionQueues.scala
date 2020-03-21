package typingsJapgolly.emberRunloop.backburnerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredActionQueues
  extends /* index */ StringDictionary[js.Any] {
  var queues: js.Object
  def flush(fromAutorun: Boolean): js.Any
  def schedule(queueName: String, target: js.Any, method: js.Any, args: js.Any, onceFlag: Boolean, stack: js.Any): js.Any
}

object DeferredActionQueues {
  @scala.inline
  def apply(
    flush: Boolean => CallbackTo[js.Any],
    queues: js.Object,
    schedule: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => CallbackTo[js.Any],
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): DeferredActionQueues = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: scala.Boolean) => flush(t0).runNow()))
    __obj.updateDynamic("schedule")(js.Any.fromFunction6((t0: java.lang.String, t1: js.Any, t2: js.Any, t3: js.Any, t4: scala.Boolean, t5: js.Any) => schedule(t0, t1, t2, t3, t4, t5).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DeferredActionQueues]
  }
}

