package typingsJapgolly.tern.ternMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tern.ternBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncConstructorOptions extends js.Object {
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: js.UndefOr[`false`] = js.undefined
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[js.Function1[/* filename */ String, String]] = js.undefined
}

object SyncConstructorOptions {
  @scala.inline
  def apply(async: `false` = null, getFile: /* filename */ String => CallbackTo[String] = null): SyncConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction1((t0: /* filename */ java.lang.String) => getFile(t0).runNow()))
    __obj.asInstanceOf[SyncConstructorOptions]
  }
}

