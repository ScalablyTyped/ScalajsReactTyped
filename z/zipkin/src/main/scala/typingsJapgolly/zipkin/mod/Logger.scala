package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.zipkin.mod.model.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Logger (or transport) is what the Recorder uses to send spans to Zipkin.
  * @see https://github.com/openzipkin/zipkin-js/#transports Official transport implementations
  */
trait Logger extends StObject {
  
  def logSpan(span: Span): Unit
}
object Logger {
  
  inline def apply(logSpan: Span => Callback): Logger = {
    val __obj = js.Dynamic.literal(logSpan = js.Any.fromFunction1((t0: Span) => logSpan(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setLogSpan(value: Span => Callback): Self = StObject.set(x, "logSpan", js.Any.fromFunction1((t0: Span) => value(t0).runNow()))
  }
}
