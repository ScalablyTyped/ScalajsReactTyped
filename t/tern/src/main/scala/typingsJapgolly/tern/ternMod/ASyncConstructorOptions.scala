package typingsJapgolly.tern.ternMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.tern.ternBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASyncConstructorOptions extends js.Object {
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: `true`
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[js.Error], /* content */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
}

object ASyncConstructorOptions {
  @scala.inline
  def apply(
    async: `true`,
    getFile: (/* filename */ String, /* callback */ js.Function2[/* error */ js.UndefOr[js.Error], /* content */ js.UndefOr[String], Unit]) => Callback = null
  ): ASyncConstructorOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction2((t0: /* filename */ java.lang.String, t1: /* callback */ js.Function2[
  /* error */ js.UndefOr[js.Error], 
  /* content */ js.UndefOr[java.lang.String], 
  scala.Unit]) => getFile(t0, t1).runNow()))
    __obj.asInstanceOf[ASyncConstructorOptions]
  }
}

