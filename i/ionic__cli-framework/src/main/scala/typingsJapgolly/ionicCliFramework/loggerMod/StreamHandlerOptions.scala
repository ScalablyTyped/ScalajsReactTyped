package typingsJapgolly.ionicCliFramework.loggerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamHandlerOptions extends js.Object {
  val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
  val formatter: js.UndefOr[LoggerFormatter] = js.undefined
  val stream: WritableStream
}

object StreamHandlerOptions {
  @scala.inline
  def apply(
    stream: WritableStream,
    filter: /* record */ LogRecord => CallbackTo[Boolean] = null,
    formatter: /* record */ LogRecord => CallbackTo[String] = null
  ): StreamHandlerOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.ionicCliFramework.loggerMod.LogRecord) => filter(t0).runNow()))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.ionicCliFramework.loggerMod.LogRecord) => formatter(t0).runNow()))
    __obj.asInstanceOf[StreamHandlerOptions]
  }
}

