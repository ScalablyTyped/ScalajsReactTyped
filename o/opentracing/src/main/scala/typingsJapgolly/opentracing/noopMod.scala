package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.spanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/noop", JSImport.Namespace)
@js.native
object noopMod extends js.Object {
  var span: default | Null = js.native
  var spanContext: typingsJapgolly.opentracing.spanContextMod.default | Null = js.native
  var tracer: typingsJapgolly.opentracing.tracerMod.default | Null = js.native
  def initialize(): Unit = js.native
}

