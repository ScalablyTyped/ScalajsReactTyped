package typingsJapgolly.opentracing.mockSpanMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.opentracing.spanMod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer/mock_span", "MockSpan")
@js.native
class MockSpan protected () extends Span {
  def this(tracer: typingsJapgolly.opentracing.mockTracerMockTracerMod.default) = this()
  var _finishMs: Double = js.native
  var _generateUUID: js.Any = js.native
  var _logs: js.Any = js.native
  var _mockTracer: js.Any = js.native
  var _operationName: js.Any = js.native
  var _startMs: js.Any = js.native
  var _startStack: js.UndefOr[String] = js.native
  var _tags: js.Any = js.native
  var _uuid: js.Any = js.native
  def addReference(ref: typingsJapgolly.opentracing.referenceMod.default): Unit = js.native
  /**
    * Returns a simplified object better for console.log()'ing.
    */
  def debug(): DebugInfo = js.native
  def durationMs(): Double = js.native
  def operationName(): String = js.native
  def tags(): StringDictionary[js.Any] = js.native
  def uuid(): String = js.native
}

