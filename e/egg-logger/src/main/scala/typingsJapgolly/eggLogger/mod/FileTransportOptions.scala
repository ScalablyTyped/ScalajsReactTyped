package typingsJapgolly.eggLogger.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTransportOptions extends TransportOptions {
  var file: String
}

object FileTransportOptions {
  @scala.inline
  def apply(
    file: String,
    contextFormatter: /* meta */ js.UndefOr[js.Object] => CallbackTo[String] = null,
    encoding: String = null,
    eol: String = null,
    formatter: /* meta */ js.UndefOr[js.Object] => CallbackTo[String] = null,
    json: js.UndefOr[Boolean] = js.undefined,
    level: LoggerLevel = null
  ): FileTransportOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (contextFormatter != null) __obj.updateDynamic("contextFormatter")(js.Any.fromFunction1((t0: /* meta */ js.UndefOr[js.Object]) => contextFormatter(t0).runNow()))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* meta */ js.UndefOr[js.Object]) => formatter(t0).runNow()))
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransportOptions]
  }
}

