package typingsJapgolly.tar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.undefined
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.undefined
  /**
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.undefined
  /**
    * By default, entry streams are resumed immediately after the call to
    * onentry. Set noResume: true to suppress this behavior. Note that by
    * opting into this, the stream will never complete until the entry
    * data is consumed.
    */
  var noResume: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter. This is important for when both file and sync are set, because
    * it will be called synchronously.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, Unit]] = js.undefined
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    C: String = null,
    cwd: String = null,
    filter: (/* path */ String, /* entry */ FileStat) => CallbackTo[Boolean] = null,
    maxReadSize: Int | Double = null,
    noResume: js.UndefOr[Boolean] = js.undefined,
    onentry: /* entry */ FileStat => Callback = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (C != null) __obj.updateDynamic("C")(C.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* entry */ typingsJapgolly.tar.mod.FileStat) => filter(t0, t1).runNow()))
    if (maxReadSize != null) __obj.updateDynamic("maxReadSize")(maxReadSize.asInstanceOf[js.Any])
    if (!js.isUndefined(noResume)) __obj.updateDynamic("noResume")(noResume.asInstanceOf[js.Any])
    if (onentry != null) __obj.updateDynamic("onentry")(js.Any.fromFunction1((t0: /* entry */ typingsJapgolly.tar.mod.FileStat) => onentry(t0).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

