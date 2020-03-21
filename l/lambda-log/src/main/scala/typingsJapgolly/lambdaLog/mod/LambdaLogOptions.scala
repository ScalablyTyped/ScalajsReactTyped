package typingsJapgolly.lambdaLog.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaLogOptions extends js.Object {
  // Enable debugging mode (log.debug messages)
  var debug: js.UndefOr[Boolean] = js.undefined
  // Enable development mode which pretty-prints the log object to the console
  var dev: js.UndefOr[Boolean] = js.undefined
  // Optional function which will run for every log to inject dynamic metadata
  var dynamicMeta: js.UndefOr[js.Function1[/* message */ LogMessage, _]] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  // Optional replacer function for `JSON.stringify`
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  // Disables logging to the console (used for testing)
  var silent: js.UndefOr[Boolean] = js.undefined
  // Optional stream to write stderr messages to
  var stderrStream: js.UndefOr[WriteStream] = js.undefined
  // Optional stream to write stdout messages to
  var stdoutStream: js.UndefOr[WriteStream] = js.undefined
  // Global tags array to include with every log
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object LambdaLogOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    dynamicMeta: /* message */ LogMessage => CallbackTo[js.Any] = null,
    meta: js.Any = null,
    replacer: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any] = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    stderrStream: WriteStream = null,
    stdoutStream: WriteStream = null,
    tags: js.Array[String] = null
  ): LambdaLogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (dynamicMeta != null) __obj.updateDynamic("dynamicMeta")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.lambdaLog.mod.LogMessage) => dynamicMeta(t0).runNow()))
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => replacer(t0, t1).runNow()))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (stderrStream != null) __obj.updateDynamic("stderrStream")(stderrStream.asInstanceOf[js.Any])
    if (stdoutStream != null) __obj.updateDynamic("stdoutStream")(stdoutStream.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaLogOptions]
  }
}

