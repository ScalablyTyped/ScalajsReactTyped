package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Injector extends js.Object {
  def inject(spanContext: SpanContext, carrier: js.Any): Unit
}

object Injector {
  @scala.inline
  def apply(inject: (SpanContext, js.Any) => Callback): Injector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inject")(js.Any.fromFunction2((t0: typingsJapgolly.opentracing.mod.SpanContext, t1: js.Any) => inject(t0, t1).runNow()))
    __obj.asInstanceOf[Injector]
  }
}

