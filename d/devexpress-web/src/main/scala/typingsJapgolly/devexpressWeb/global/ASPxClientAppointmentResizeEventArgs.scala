package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentResize event.
  */
@JSGlobal("ASPxClientAppointmentResizeEventArgs")
@js.native
open class ASPxClientAppointmentResizeEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientAppointmentResizeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentResizeEventArgs class.
    * @param operation An ASPxClientAppointmentOperation object providing methods to perform or cancel the resize operation.
    * @param appointmentId A string containing an appointment identifier.
    * @param oldInterval An  object specifying the appointment's interval before the resize operation.
    * @param newInterval An  object specifying the appointment's interval after the resize operation.
    */
  def this(
    operation: typingsJapgolly.devexpressWeb.ASPxClientAppointmentOperation,
    appointmentId: String,
    oldInterval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval,
    newInterval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval
  ) = this()
  
  /**
    * Gets the resized appointment's identifier.
    */
  /* CompleteClass */
  var appointmentId: String = js.native
  
  /**
    * Gets or sets whether default event processing is required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the appointment's interval after resizing.
    */
  /* CompleteClass */
  var newInterval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Gets the appointment's interval before resizing.
    */
  /* CompleteClass */
  var oldInterval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  /* CompleteClass */
  var operation: typingsJapgolly.devexpressWeb.ASPxClientAppointmentOperation = js.native
}
