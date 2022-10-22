package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task deferral returned by the AppointmentStoreChangedEventArgs.GetDeferral method. */
trait AppointmentStoreChangedDeferral extends StObject {
  
  /** Informs the system that an asynchronous operation associated with an AppointmentStore has finished. */
  def complete(): Unit
}
object AppointmentStoreChangedDeferral {
  
  inline def apply(complete: Callback): AppointmentStoreChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[AppointmentStoreChangedDeferral]
  }
  
  extension [Self <: AppointmentStoreChangedDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
