package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a StoreChanged event. */
trait AppointmentStoreChangedEventArgs extends StObject {
  
  /**
    * Gets the deferral object for the StoreChanged event.
    * @return The deferral object for the StoreChanged event.
    */
  def getDeferral(): AppointmentStoreChangedDeferral
}
object AppointmentStoreChangedEventArgs {
  
  inline def apply(getDeferral: CallbackTo[AppointmentStoreChangedDeferral]): AppointmentStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn)
    __obj.asInstanceOf[AppointmentStoreChangedEventArgs]
  }
  
  extension [Self <: AppointmentStoreChangedEventArgs](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[AppointmentStoreChangedDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
  }
}
