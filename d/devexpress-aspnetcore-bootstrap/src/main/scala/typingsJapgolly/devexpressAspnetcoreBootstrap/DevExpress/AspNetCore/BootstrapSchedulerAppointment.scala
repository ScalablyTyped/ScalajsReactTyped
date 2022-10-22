package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerAppointment extends StObject {
  
  def addResource(resourceId: js.Object): Unit
  
  val appointmentId: String
  
  val appointmentType: BootstrapSchedulerAppointmentType
  
  def getAllDay(): Boolean
  
  def getAppointmentType(): BootstrapSchedulerAppointmentType
  
  def getDescription(): String
  
  def getDuration(): Double
  
  def getEnd(): js.Date
  
  def getId(): Any
  
  def getLabelId(): Double
  
  def getLocation(): String
  
  def getRecurrenceInfo(): BootstrapSchedulerRecurrenceInfo | Null
  
  def getRecurrencePattern(): BootstrapSchedulerAppointment | Null
  
  def getResource(index: Double): Any
  
  def getStart(): js.Date
  
  def getStatusId(): Double
  
  def getSubject(): String
  
  /* protected */ val instance: Any
  
  val interval: BootstrapTimeInterval | Null
  
  val labelIndex: Double
  
  val resources: js.Array[String]
  
  def setAllDay(allDay: Boolean): Unit
  
  def setAppointmentType(`type`: BootstrapSchedulerAppointmentType): Unit
  
  def setDescription(description: String): Unit
  
  def setDuration(duration: Double): Unit
  
  def setEnd(end: js.Date): Unit
  
  def setId(id: Any): Unit
  
  def setLabelId(statusId: Double): Unit
  
  def setLocation(location: String): Unit
  
  def setRecurrenceInfo(recurrenceInfo: BootstrapSchedulerRecurrenceInfo): Unit
  
  def setStart(start: js.Date): Unit
  
  def setStatusId(statusId: Double): Unit
  
  def setSubject(subject: String): Unit
  
  val statusIndex: Double
}
object BootstrapSchedulerAppointment {
  
  inline def apply(
    addResource: js.Object => Callback,
    appointmentId: String,
    appointmentType: BootstrapSchedulerAppointmentType,
    getAllDay: CallbackTo[Boolean],
    getAppointmentType: CallbackTo[BootstrapSchedulerAppointmentType],
    getDescription: CallbackTo[String],
    getDuration: CallbackTo[Double],
    getEnd: CallbackTo[js.Date],
    getId: CallbackTo[Any],
    getLabelId: CallbackTo[Double],
    getLocation: CallbackTo[String],
    getRecurrenceInfo: CallbackTo[BootstrapSchedulerRecurrenceInfo | Null],
    getRecurrencePattern: CallbackTo[BootstrapSchedulerAppointment | Null],
    getResource: Double => Any,
    getStart: CallbackTo[js.Date],
    getStatusId: CallbackTo[Double],
    getSubject: CallbackTo[String],
    instance: Any,
    labelIndex: Double,
    resources: js.Array[String],
    setAllDay: Boolean => Callback,
    setAppointmentType: BootstrapSchedulerAppointmentType => Callback,
    setDescription: String => Callback,
    setDuration: Double => Callback,
    setEnd: js.Date => Callback,
    setId: Any => Callback,
    setLabelId: Double => Callback,
    setLocation: String => Callback,
    setRecurrenceInfo: BootstrapSchedulerRecurrenceInfo => Callback,
    setStart: js.Date => Callback,
    setStatusId: Double => Callback,
    setSubject: String => Callback,
    statusIndex: Double
  ): BootstrapSchedulerAppointment = {
    val __obj = js.Dynamic.literal(addResource = js.Any.fromFunction1((t0: js.Object) => addResource(t0).runNow()), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], getAllDay = getAllDay.toJsFn, getAppointmentType = getAppointmentType.toJsFn, getDescription = getDescription.toJsFn, getDuration = getDuration.toJsFn, getEnd = getEnd.toJsFn, getId = getId.toJsFn, getLabelId = getLabelId.toJsFn, getLocation = getLocation.toJsFn, getRecurrenceInfo = getRecurrenceInfo.toJsFn, getRecurrencePattern = getRecurrencePattern.toJsFn, getResource = js.Any.fromFunction1(getResource), getStart = getStart.toJsFn, getStatusId = getStatusId.toJsFn, getSubject = getSubject.toJsFn, instance = instance.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], setAllDay = js.Any.fromFunction1((t0: Boolean) => setAllDay(t0).runNow()), setAppointmentType = js.Any.fromFunction1((t0: BootstrapSchedulerAppointmentType) => setAppointmentType(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setDuration = js.Any.fromFunction1((t0: Double) => setDuration(t0).runNow()), setEnd = js.Any.fromFunction1((t0: js.Date) => setEnd(t0).runNow()), setId = js.Any.fromFunction1((t0: Any) => setId(t0).runNow()), setLabelId = js.Any.fromFunction1((t0: Double) => setLabelId(t0).runNow()), setLocation = js.Any.fromFunction1((t0: String) => setLocation(t0).runNow()), setRecurrenceInfo = js.Any.fromFunction1((t0: BootstrapSchedulerRecurrenceInfo) => setRecurrenceInfo(t0).runNow()), setStart = js.Any.fromFunction1((t0: js.Date) => setStart(t0).runNow()), setStatusId = js.Any.fromFunction1((t0: Double) => setStatusId(t0).runNow()), setSubject = js.Any.fromFunction1((t0: String) => setSubject(t0).runNow()), statusIndex = statusIndex.asInstanceOf[js.Any], interval = null)
    __obj.asInstanceOf[BootstrapSchedulerAppointment]
  }
  
  extension [Self <: BootstrapSchedulerAppointment](x: Self) {
    
    inline def setAddResource(value: js.Object => Callback): Self = StObject.set(x, "addResource", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setAppointmentType(value: BootstrapSchedulerAppointmentType): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    inline def setGetAllDay(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllDay", value.toJsFn)
    
    inline def setGetAppointmentType(value: CallbackTo[BootstrapSchedulerAppointmentType]): Self = StObject.set(x, "getAppointmentType", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "getDuration", value.toJsFn)
    
    inline def setGetEnd(value: CallbackTo[js.Date]): Self = StObject.set(x, "getEnd", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLabelId(value: CallbackTo[Double]): Self = StObject.set(x, "getLabelId", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[String]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setGetRecurrenceInfo(value: CallbackTo[BootstrapSchedulerRecurrenceInfo | Null]): Self = StObject.set(x, "getRecurrenceInfo", value.toJsFn)
    
    inline def setGetRecurrencePattern(value: CallbackTo[BootstrapSchedulerAppointment | Null]): Self = StObject.set(x, "getRecurrencePattern", value.toJsFn)
    
    inline def setGetResource(value: Double => Any): Self = StObject.set(x, "getResource", js.Any.fromFunction1(value))
    
    inline def setGetStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "getStart", value.toJsFn)
    
    inline def setGetStatusId(value: CallbackTo[Double]): Self = StObject.set(x, "getStatusId", value.toJsFn)
    
    inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "getSubject", value.toJsFn)
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalNull: Self = StObject.set(x, "interval", null)
    
    inline def setLabelIndex(value: Double): Self = StObject.set(x, "labelIndex", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSetAllDay(value: Boolean => Callback): Self = StObject.set(x, "setAllDay", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetAppointmentType(value: BootstrapSchedulerAppointmentType => Callback): Self = StObject.set(x, "setAppointmentType", js.Any.fromFunction1((t0: BootstrapSchedulerAppointmentType) => value(t0).runNow()))
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDuration(value: Double => Callback): Self = StObject.set(x, "setDuration", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetEnd(value: js.Date => Callback): Self = StObject.set(x, "setEnd", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetId(value: Any => Callback): Self = StObject.set(x, "setId", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLabelId(value: Double => Callback): Self = StObject.set(x, "setLabelId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLocation(value: String => Callback): Self = StObject.set(x, "setLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRecurrenceInfo(value: BootstrapSchedulerRecurrenceInfo => Callback): Self = StObject.set(x, "setRecurrenceInfo", js.Any.fromFunction1((t0: BootstrapSchedulerRecurrenceInfo) => value(t0).runNow()))
    
    inline def setSetStart(value: js.Date => Callback): Self = StObject.set(x, "setStart", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetStatusId(value: Double => Callback): Self = StObject.set(x, "setStatusId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSubject(value: String => Callback): Self = StObject.set(x, "setSubject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStatusIndex(value: Double): Self = StObject.set(x, "statusIndex", value.asInstanceOf[js.Any])
  }
}
