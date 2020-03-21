package typingsJapgolly.jestPnpResolver.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestResolverOptions extends js.Object {
  var basedir: String
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  def defaultResolver(request: String, opts: js.Any): String
}

object JestResolverOptions {
  @scala.inline
  def apply(
    basedir: String,
    defaultResolver: (String, js.Any) => CallbackTo[String],
    extensions: js.Array[String] = null
  ): JestResolverOptions = {
    val __obj = js.Dynamic.literal(basedir = basedir.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultResolver")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => defaultResolver(t0, t1).runNow()))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestResolverOptions]
  }
}

