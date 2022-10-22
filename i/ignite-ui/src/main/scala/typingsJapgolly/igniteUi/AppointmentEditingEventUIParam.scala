package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentEditingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the original appointment.
    */
  var appointment: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the appointment with the edited values.
    */
  var newAppointment: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object AppointmentEditingEventUIParam {
  
  inline def apply(): AppointmentEditingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentEditingEventUIParam]
  }
  
  extension [Self <: AppointmentEditingEventUIParam](x: Self) {
    
    inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setNewAppointment(value: Any): Self = StObject.set(x, "newAppointment", value.asInstanceOf[js.Any])
    
    inline def setNewAppointmentUndefined: Self = StObject.set(x, "newAppointment", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
