package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTransport extends js.Object {
  var clear: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.undefined
  var get: js.UndefOr[js.Function1[/* req */ Request, String | Null]] = js.undefined
  var set: js.UndefOr[js.Function2[/* res */ Response, /* sid */ String, Unit]] = js.undefined
}

object SessionTransport {
  @scala.inline
  def apply(
    clear: /* res */ Response => Callback = null,
    get: /* req */ Request => CallbackTo[String | Null] = null,
    set: (/* res */ Response, /* sid */ String) => Callback = null
  ): SessionTransport = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.arangodb.Foxx.Response) => clear(t0).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.arangodb.Foxx.Request) => get(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* res */ typingsJapgolly.arangodb.Foxx.Response, t1: /* sid */ java.lang.String) => set(t0, t1).runNow()))
    __obj.asInstanceOf[SessionTransport]
  }
}

