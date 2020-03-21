package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zipkin.mod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by the HttpLogger transport to convert spans to JSON */
trait JsonEncoder_ extends js.Object {
  def encode(span: Span): String
}

object JsonEncoder_ {
  @scala.inline
  def apply(encode: Span => CallbackTo[String]): JsonEncoder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: typingsJapgolly.zipkin.mod.model.Span) => encode(t0).runNow()))
    __obj.asInstanceOf[JsonEncoder_]
  }
}

