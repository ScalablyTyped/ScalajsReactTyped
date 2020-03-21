package typingsJapgolly.burns.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Burns configuration settings
  */
trait Config extends js.Object {
  var broadcaster: js.UndefOr[String | Null] = js.undefined
  var defaultHandler: js.UndefOr[HandlerFn] = js.undefined
  var pusher: js.UndefOr[Record[String, _]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    broadcaster: String = null,
    defaultHandler: /* payload */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    pusher: Record[String, _] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster.asInstanceOf[js.Any])
    if (defaultHandler != null) __obj.updateDynamic("defaultHandler")(js.Any.fromFunction1((t0: /* payload */ js.UndefOr[js.Any]) => defaultHandler(t0).runNow()))
    if (pusher != null) __obj.updateDynamic("pusher")(pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

