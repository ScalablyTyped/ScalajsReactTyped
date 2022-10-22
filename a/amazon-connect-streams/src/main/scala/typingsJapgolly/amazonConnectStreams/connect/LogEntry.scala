package typingsJapgolly.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to add additional information to a log entry. */
trait LogEntry extends StObject {
  
  /**
    * Adds an error stack trace and additional info.
    *
    * @param err The error to add.
    */
  def withException(err: js.Error): LogEntry
  
  /**
    * Adds an arbitrary object.
    *
    * @param obj The object to add.
    */
  def withObject(obj: js.Object): LogEntry
}
object LogEntry {
  
  inline def apply(withException: js.Error => LogEntry, withObject: js.Object => LogEntry): LogEntry = {
    val __obj = js.Dynamic.literal(withException = js.Any.fromFunction1(withException), withObject = js.Any.fromFunction1(withObject))
    __obj.asInstanceOf[LogEntry]
  }
  
  extension [Self <: LogEntry](x: Self) {
    
    inline def setWithException(value: js.Error => LogEntry): Self = StObject.set(x, "withException", js.Any.fromFunction1(value))
    
    inline def setWithObject(value: js.Object => LogEntry): Self = StObject.set(x, "withObject", js.Any.fromFunction1(value))
  }
}
