package typingsJapgolly.winrtUwp.Windows.System

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result to the application that launched the current application for results. */
trait ProtocolForResultsOperation extends StObject {
  
  /**
    * Indicates that the application activated for results is ready to return to the application that launched it for results.
    * @param data The data to return to the application that activated this app.
    */
  def reportCompleted(data: ValueSet): Unit
}
object ProtocolForResultsOperation {
  
  inline def apply(reportCompleted: ValueSet => Callback): ProtocolForResultsOperation = {
    val __obj = js.Dynamic.literal(reportCompleted = js.Any.fromFunction1((t0: ValueSet) => reportCompleted(t0).runNow()))
    __obj.asInstanceOf[ProtocolForResultsOperation]
  }
  
  extension [Self <: ProtocolForResultsOperation](x: Self) {
    
    inline def setReportCompleted(value: ValueSet => Callback): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction1((t0: ValueSet) => value(t0).runNow()))
  }
}
