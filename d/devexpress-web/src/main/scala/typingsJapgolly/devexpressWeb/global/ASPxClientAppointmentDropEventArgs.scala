package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientScheduler.AppointmentDrop event.
  */
@JSGlobal("ASPxClientAppointmentDropEventArgs")
@js.native
open class ASPxClientAppointmentDropEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientAppointmentDropEventArgs {
  /**
    * Initializes a new instance of the ASPxClientAppointmentDropEventArgs class.
    * @param operation An ASPxClientAppointmentOperation object providing methods to perform or cancel the drag operation.
    * @param dragInformation An array of ASPxClientAppointmentDragInfo objects storing information about dropped appointments.
    */
  def this(
    operation: typingsJapgolly.devexpressWeb.ASPxClientAppointmentOperation,
    dragInformation: js.Array[typingsJapgolly.devexpressWeb.ASPxClientAppointmentDragInfo]
  ) = this()
  
  /**
    * Provides information about dropped appointments.
    */
  /* CompleteClass */
  var dragInformation: js.Array[typingsJapgolly.devexpressWeb.ASPxClientAppointmentDragInfo] = js.native
  
  /**
    * Gets or sets a value that specifies whether the event is handled, and the default processing is not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Provides access to an object that enables you to choose an operation to perform.
    */
  /* CompleteClass */
  var operation: typingsJapgolly.devexpressWeb.ASPxClientAppointmentOperation = js.native
}
