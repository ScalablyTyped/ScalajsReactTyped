package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentClick and the ASPxClientScheduler.AppointmentDoubleClick events.
  */
@JSGlobal("AppointmentClickEventArgs")
@js.native
open class AppointmentClickEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.AppointmentClickEventArgs {
  /**
    * Initializes a new instance of the class.
    * @param appointmentId Specifies an appointment ID.
    * @param sourceEvent Specifies an event source.
    */
  def this(appointmentId: String, sourceEvent: Any) = this()
  
  /**
    * Gets the client appointment ID for the appointment being clicked.
    */
  /* CompleteClass */
  var appointmentId: String = js.native
  
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the HTML element that the event was triggered on.
    */
  /* CompleteClass */
  var htmlElement: Any = js.native
}
