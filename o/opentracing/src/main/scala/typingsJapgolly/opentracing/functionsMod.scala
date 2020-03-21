package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.spanContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  def childOf(spanContext: default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def childOf(spanContext: typingsJapgolly.opentracing.spanMod.default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typingsJapgolly.opentracing.spanMod.default): typingsJapgolly.opentracing.referenceMod.default = js.native
}

