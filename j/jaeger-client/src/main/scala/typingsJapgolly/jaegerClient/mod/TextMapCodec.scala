package typingsJapgolly.jaegerClient.mod

import typingsJapgolly.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jaeger-client", "TextMapCodec")
@js.native
class TextMapCodec protected ()
  extends Injector
     with Extractor {
  def this(options: TextMapCodecOptions) = this()
  /* CompleteClass */
  override def extract(carrier: js.Any): SpanContext | Null = js.native
  /* CompleteClass */
  override def inject(spanContext: SpanContext, carrier: js.Any): Unit = js.native
}

