package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Appointment class.
  */
trait ASPxClientAppointment extends StObject {
  
  /**
    * Adds a resource to the collection of resources associated with the client appointment.
    * @param resourceId An object, representing the resource id.
    */
  def AddResource(resourceId: String): Unit
  
  /**
    * Returns a value specifying whether the current appointment lasts the entire day.
    */
  def GetAllDay(): Boolean
  
  /**
    * Returns the appointment type.
    */
  def GetAppointmentType(): ASPxAppointmentType
  
  /**
    * Gets the description of the appointment.
    */
  def GetDescription(): String
  
  /**
    * Returns the duration of the appointment.
    */
  def GetDuration(): Double
  
  /**
    * Gets the end date and time of the appointment.
    */
  def GetEnd(): js.Date
  
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String
  
  /**
    * Gets or sets the integer identifier of the label object associated with the appointment.
    */
  def GetLabelId(): Double
  
  /**
    * Gets or sets the text that specifies a place where the appointment is scheduled.
    */
  def GetLocation(): String
  
  /**
    * Gets the property value of the client appointment corresponding to the Appointment.RecurrenceInfo appointment property.
    */
  def GetRecurrenceInfo(): ASPxClientRecurrenceInfo
  
  /**
    * Gets the appointment that is the Appointment.RecurrencePattern for the current appointment.
    */
  def GetRecurrencePattern(): ASPxClientAppointment
  
  /**
    * Gets the resource associated with the client-side appointment by its index. An identifier of the specified resource (IPersistentObject.Id)
    * @param index An integer, representing an index of a resource in a resource collection associated with the current appointment.
    */
  def GetResource(index: Double): String
  
  /**
    * Gets the start date and time of the appointment.
    */
  def GetStart(): js.Date
  
  /**
    * Gets or sets the integer identifier of the status object associated with the appointment.
    */
  def GetStatusId(): Double
  
  /**
    * Gets or sets the appointment's subject text.
    */
  def GetSubject(): String
  
  /**
    * Specifies the property value of the client appointment corresponding to the Appointment.AllDay appointment property.
    * @param allDay true to indicate the all-day appointment; otherwise, false.
    */
  def SetAllDay(allDay: Boolean): Unit
  
  /**
    * Specifies the type of the current client appointment.
    * @param type An ASPxAppointmentType enumeration value indicating the appointment type.
    */
  def SetAppointmentType(`type`: ASPxAppointmentType): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Description appointment property.
    * @param description A string representing the appointment description.
    */
  def SetDescription(description: String): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Duration appointment property.
    * @param duration A TimeSpan object representing the appointment duration.
    */
  def SetDuration(duration: Any): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.End appointment property.
    * @param end A JavaScript Date object representing the end of the appointment.
    */
  def SetEnd(end: js.Date): Unit
  
  /**
    * Sets the ID of the client appointment.
    * @param id An string value representing the appointment identifier.
    */
  def SetId(id: String): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.LabelId appointment property.
    * @param statusId An integer representing the index of the label in the AppointmentStorage.Labels label collection.
    */
  def SetLabelId(statusId: Double): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Location appointment property.
    * @param location A string representing the appointment location.
    */
  def SetLocation(location: String): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.RecurrenceInfo appointment property.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object representing the recurrence information.
    */
  def SetRecurrenceInfo(recurrenceInfo: ASPxClientRecurrenceInfo): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Start appointment property.
    * @param start A JavaScript Date object representing the appointment start.
    */
  def SetStart(start: js.Date): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.StatusId appointment property.
    * @param statusId An integer representing the index in the AppointmentStatusCollection.
    */
  def SetStatusId(statusId: Double): Unit
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Subject appointment property.
    * @param subject A string containing the appointment subject.
    */
  def SetSubject(subject: String): Unit
  
  /**
    * Returns the client appointment ID.
    */
  var appointmentId: String
  
  /**
    * Gets the appointment type.
    */
  var appointmentType: ASPxAppointmentType
  
  /**
    * Gets or sets the time interval of the time cells covered by the current appointment.
    */
  var interval: ASPxClientTimeInterval
  
  /**
    * Returns the label's index.
    */
  var labelIndex: Double
  
  /**
    * Gets resources associated with the appointment.
    */
  var resources: js.Array[String]
  
  /**
    * Gets the status index.
    */
  var statusIndex: Double
}
object ASPxClientAppointment {
  
  inline def apply(
    AddResource: String => Callback,
    GetAllDay: CallbackTo[Boolean],
    GetAppointmentType: CallbackTo[ASPxAppointmentType],
    GetDescription: CallbackTo[String],
    GetDuration: CallbackTo[Double],
    GetEnd: CallbackTo[js.Date],
    GetId: CallbackTo[String],
    GetLabelId: CallbackTo[Double],
    GetLocation: CallbackTo[String],
    GetRecurrenceInfo: CallbackTo[ASPxClientRecurrenceInfo],
    GetRecurrencePattern: CallbackTo[ASPxClientAppointment],
    GetResource: Double => String,
    GetStart: CallbackTo[js.Date],
    GetStatusId: CallbackTo[Double],
    GetSubject: CallbackTo[String],
    SetAllDay: Boolean => Callback,
    SetAppointmentType: ASPxAppointmentType => Callback,
    SetDescription: String => Callback,
    SetDuration: Any => Callback,
    SetEnd: js.Date => Callback,
    SetId: String => Callback,
    SetLabelId: Double => Callback,
    SetLocation: String => Callback,
    SetRecurrenceInfo: ASPxClientRecurrenceInfo => Callback,
    SetStart: js.Date => Callback,
    SetStatusId: Double => Callback,
    SetSubject: String => Callback,
    appointmentId: String,
    appointmentType: ASPxAppointmentType,
    interval: ASPxClientTimeInterval,
    labelIndex: Double,
    resources: js.Array[String],
    statusIndex: Double
  ): ASPxClientAppointment = {
    val __obj = js.Dynamic.literal(AddResource = js.Any.fromFunction1((t0: String) => AddResource(t0).runNow()), GetAllDay = GetAllDay.toJsFn, GetAppointmentType = GetAppointmentType.toJsFn, GetDescription = GetDescription.toJsFn, GetDuration = GetDuration.toJsFn, GetEnd = GetEnd.toJsFn, GetId = GetId.toJsFn, GetLabelId = GetLabelId.toJsFn, GetLocation = GetLocation.toJsFn, GetRecurrenceInfo = GetRecurrenceInfo.toJsFn, GetRecurrencePattern = GetRecurrencePattern.toJsFn, GetResource = js.Any.fromFunction1(GetResource), GetStart = GetStart.toJsFn, GetStatusId = GetStatusId.toJsFn, GetSubject = GetSubject.toJsFn, SetAllDay = js.Any.fromFunction1((t0: Boolean) => SetAllDay(t0).runNow()), SetAppointmentType = js.Any.fromFunction1((t0: ASPxAppointmentType) => SetAppointmentType(t0).runNow()), SetDescription = js.Any.fromFunction1((t0: String) => SetDescription(t0).runNow()), SetDuration = js.Any.fromFunction1((t0: Any) => SetDuration(t0).runNow()), SetEnd = js.Any.fromFunction1((t0: js.Date) => SetEnd(t0).runNow()), SetId = js.Any.fromFunction1((t0: String) => SetId(t0).runNow()), SetLabelId = js.Any.fromFunction1((t0: Double) => SetLabelId(t0).runNow()), SetLocation = js.Any.fromFunction1((t0: String) => SetLocation(t0).runNow()), SetRecurrenceInfo = js.Any.fromFunction1((t0: ASPxClientRecurrenceInfo) => SetRecurrenceInfo(t0).runNow()), SetStart = js.Any.fromFunction1((t0: js.Date) => SetStart(t0).runNow()), SetStatusId = js.Any.fromFunction1((t0: Double) => SetStatusId(t0).runNow()), SetSubject = js.Any.fromFunction1((t0: String) => SetSubject(t0).runNow()), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], statusIndex = statusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointment]
  }
  
  extension [Self <: ASPxClientAppointment](x: Self) {
    
    inline def setAddResource(value: String => Callback): Self = StObject.set(x, "AddResource", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setAppointmentType(value: ASPxAppointmentType): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    inline def setGetAllDay(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetAllDay", value.toJsFn)
    
    inline def setGetAppointmentType(value: CallbackTo[ASPxAppointmentType]): Self = StObject.set(x, "GetAppointmentType", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "GetDescription", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "GetDuration", value.toJsFn)
    
    inline def setGetEnd(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetEnd", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "GetId", value.toJsFn)
    
    inline def setGetLabelId(value: CallbackTo[Double]): Self = StObject.set(x, "GetLabelId", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[String]): Self = StObject.set(x, "GetLocation", value.toJsFn)
    
    inline def setGetRecurrenceInfo(value: CallbackTo[ASPxClientRecurrenceInfo]): Self = StObject.set(x, "GetRecurrenceInfo", value.toJsFn)
    
    inline def setGetRecurrencePattern(value: CallbackTo[ASPxClientAppointment]): Self = StObject.set(x, "GetRecurrencePattern", value.toJsFn)
    
    inline def setGetResource(value: Double => String): Self = StObject.set(x, "GetResource", js.Any.fromFunction1(value))
    
    inline def setGetStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetStart", value.toJsFn)
    
    inline def setGetStatusId(value: CallbackTo[Double]): Self = StObject.set(x, "GetStatusId", value.toJsFn)
    
    inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "GetSubject", value.toJsFn)
    
    inline def setInterval(value: ASPxClientTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setLabelIndex(value: Double): Self = StObject.set(x, "labelIndex", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSetAllDay(value: Boolean => Callback): Self = StObject.set(x, "SetAllDay", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetAppointmentType(value: ASPxAppointmentType => Callback): Self = StObject.set(x, "SetAppointmentType", js.Any.fromFunction1((t0: ASPxAppointmentType) => value(t0).runNow()))
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "SetDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDuration(value: Any => Callback): Self = StObject.set(x, "SetDuration", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetEnd(value: js.Date => Callback): Self = StObject.set(x, "SetEnd", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetId(value: String => Callback): Self = StObject.set(x, "SetId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetLabelId(value: Double => Callback): Self = StObject.set(x, "SetLabelId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLocation(value: String => Callback): Self = StObject.set(x, "SetLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRecurrenceInfo(value: ASPxClientRecurrenceInfo => Callback): Self = StObject.set(x, "SetRecurrenceInfo", js.Any.fromFunction1((t0: ASPxClientRecurrenceInfo) => value(t0).runNow()))
    
    inline def setSetStart(value: js.Date => Callback): Self = StObject.set(x, "SetStart", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetStatusId(value: Double => Callback): Self = StObject.set(x, "SetStatusId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSubject(value: String => Callback): Self = StObject.set(x, "SetSubject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStatusIndex(value: Double): Self = StObject.set(x, "statusIndex", value.asInstanceOf[js.Any])
  }
}
