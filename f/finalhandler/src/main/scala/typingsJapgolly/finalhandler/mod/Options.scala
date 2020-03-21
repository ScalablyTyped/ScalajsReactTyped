package typingsJapgolly.finalhandler.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var env: js.UndefOr[String] = js.undefined
  var onerror: js.UndefOr[
    js.Function3[/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    env: String = null,
    onerror: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3((t0: /* err */ js.Any, t1: /* req */ typingsJapgolly.node.httpMod.IncomingMessage, t2: /* res */ typingsJapgolly.node.httpMod.ServerResponse) => onerror(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

