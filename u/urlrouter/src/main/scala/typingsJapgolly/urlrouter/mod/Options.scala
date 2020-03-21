package typingsJapgolly.urlrouter.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorHandler: js.UndefOr[
    js.Function3[/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse, Unit]
  ] = js.undefined
  var pageNotFound: js.UndefOr[js.Function2[/* req */ ServerRequest, /* res */ ServerResponse, Unit]] = js.undefined
  var paramsName: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    errorHandler: (/* err */ js.Error, /* req */ ServerRequest, /* res */ ServerResponse) => Callback = null,
    pageNotFound: (/* req */ ServerRequest, /* res */ ServerResponse) => Callback = null,
    paramsName: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* req */ typingsJapgolly.urlrouter.mod.ServerRequest, t2: /* res */ typingsJapgolly.urlrouter.mod.ServerResponse) => errorHandler(t0, t1, t2).runNow()))
    if (pageNotFound != null) __obj.updateDynamic("pageNotFound")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.urlrouter.mod.ServerRequest, t1: /* res */ typingsJapgolly.urlrouter.mod.ServerResponse) => pageNotFound(t0, t1).runNow()))
    if (paramsName != null) __obj.updateDynamic("paramsName")(paramsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

