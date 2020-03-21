package typingsJapgolly.ionicCliFramework

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCliFramework.loggerMod.LogRecord
import typingsJapgolly.ionicCliFramework.loggerMod.LoggerFormatter
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.StreamHandlerOptions> */
trait PartialStreamHandlerOptio extends js.Object {
  var filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
  var formatter: js.UndefOr[LoggerFormatter] = js.undefined
  var stream: js.UndefOr[WritableStream] = js.undefined
}

object PartialStreamHandlerOptio {
  @scala.inline
  def apply(
    filter: /* record */ LogRecord => CallbackTo[Boolean] = null,
    formatter: /* record */ LogRecord => CallbackTo[String] = null,
    stream: WritableStream = null
  ): PartialStreamHandlerOptio = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.ionicCliFramework.loggerMod.LogRecord) => filter(t0).runNow()))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.ionicCliFramework.loggerMod.LogRecord) => formatter(t0).runNow()))
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStreamHandlerOptio]
  }
}

