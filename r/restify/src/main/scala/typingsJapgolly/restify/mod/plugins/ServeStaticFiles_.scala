package typingsJapgolly.restify.mod.plugins

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.restify.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeStaticFiles_ extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, _]] = js.undefined
}

object ServeStaticFiles_ {
  @scala.inline
  def apply(
    etag: String = null,
    maxAge: Int | Double = null,
    setHeaders: (/* res */ Response, /* path */ String, /* stat */ js.Any) => CallbackTo[js.Any] = null
  ): ServeStaticFiles_ = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3((t0: /* res */ typingsJapgolly.restify.mod.Response, t1: /* path */ java.lang.String, t2: /* stat */ js.Any) => setHeaders(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ServeStaticFiles_]
  }
}

