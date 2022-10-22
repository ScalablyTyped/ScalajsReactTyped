package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Tracer sends each annotation to a Recorder implementation */
trait Recorder extends StObject {
  
  def record(rec: Record): Unit
}
object Recorder {
  
  inline def apply(record: Record => Callback): Recorder = {
    val __obj = js.Dynamic.literal(record = js.Any.fromFunction1((t0: Record) => record(t0).runNow()))
    __obj.asInstanceOf[Recorder]
  }
  
  extension [Self <: Recorder](x: Self) {
    
    inline def setRecord(value: Record => Callback): Self = StObject.set(x, "record", js.Any.fromFunction1((t0: Record) => value(t0).runNow()))
  }
}
