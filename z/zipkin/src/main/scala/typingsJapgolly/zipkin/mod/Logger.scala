package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.zipkin.mod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Logger (or transport) is what the Recorder uses to send spans to Zipkin.
  * @see https://github.com/openzipkin/zipkin-js/#transports Official transport implementations
  */
trait Logger extends js.Object {
  def logSpan(span: Span): Unit
}

object Logger {
  @scala.inline
  def apply(logSpan: Span => Callback): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logSpan")(js.Any.fromFunction1((t0: typingsJapgolly.zipkin.mod.model.Span) => logSpan(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

