package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extractor extends js.Object {
  def extract(carrier: js.Any): SpanContext | Null
}

object Extractor {
  @scala.inline
  def apply(extract: js.Any => CallbackTo[SpanContext | Null]): Extractor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extract")(js.Any.fromFunction1((t0: js.Any) => extract(t0).runNow()))
    __obj.asInstanceOf[Extractor]
  }
}

