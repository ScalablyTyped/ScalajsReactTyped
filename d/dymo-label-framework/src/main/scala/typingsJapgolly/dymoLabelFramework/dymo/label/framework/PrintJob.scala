package typingsJapgolly.dymoLabelFramework.dymo.label.framework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Print Job */
trait PrintJob extends StObject {
  
  /**
    * Gets a status of the print job
    *
    * @param replyCallback a function called when the status is available
    */
  def getStatus(replyCallback: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, Any]): Unit
}
object PrintJob {
  
  inline def apply(getStatus: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, Any] => Callback): PrintJob = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1((t0: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, Any]) => getStatus(t0).runNow()))
    __obj.asInstanceOf[PrintJob]
  }
  
  extension [Self <: PrintJob](x: Self) {
    
    inline def setGetStatus(value: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, Any] => Callback): Self = StObject.set(x, "getStatus", js.Any.fromFunction1((t0: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, Any]) => value(t0).runNow()))
  }
}
