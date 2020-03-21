package typingsJapgolly.titanium.Titanium.Calendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single event in a calendar.
		 */
trait Event extends Proxy {
  /**
  			 * Alarms associated with the calendar item, as an array of <Titanium.Calendar.Alert> objects.
  			 */
  var alerts: js.Array[Alert]
  /**
  			 * Indicates whether this event is all day.
  			 */
  var allDay: Boolean
  /**
  			 * The list of event attendees. This list will be empty if the event has no attendees.
  			 */
  val attendees: js.Array[Attendee]
  /**
  			 * Availability of this event.
  			 */
  val availability: Double
  /**
  			 * Start date/time of this event.
  			 */
  var begin: js.Date
  /**
  			 * Description of this event.
  			 */
  val description: String
  /**
  			 * End date/time of this event.
  			 */
  var end: js.Date
  /**
  			 * Extended properties of this event.
  			 */
  val extendedProperties: js.Any
  /**
  			 * Indicates whether an alarm is scheduled for this event.
  			 */
  val hasAlarm: Boolean
  /**
  			 * Identifier of this event.
  			 */
  val id: String
  /**
  			 * Boolean value that indicates whether an event is a detached instance of a
  			 * repeating event.
  			 */
  val isDetached: Boolean
  /**
  			 * Location of this event.
  			 */
  var location: String
  /**
  			 * Notes for this event.
  			 */
  var notes: String
  /**
  			 * The recurrence rules for the calendar item.
  			 */
  var recurrenceRules: js.Array[RecurrenceRule]
  /**
  			 * Existing reminders for this event.
  			 */
  val reminders: js.Array[Reminder]
  /**
  			 * Status of this event.
  			 */
  val status: Double
  /**
  			 * Title of this event.
  			 */
  var title: String
  /**
  			 * Visibility of this event.
  			 */
  val visibility: Double
  /**
  			 * Adds a recurrence rule to the recurrence rule array.
  			 */
  def addRecurrenceRule(rule: RecurrenceRule): Unit
  /**
  			 * Creates an alert for this event.
  			 */
  def createAlert(data: js.Any): Alert
  /**
  			 * Creates an recurrence pattern for a recurring event.
  			 * All of the properties for the recurrence rule must be set during creation.
  			 * The recurrence rule properties cannot be modified.
  			 */
  def createRecurrenceRule(data: js.Any): RecurrenceRule
  /**
  			 * Creates a reminder for this event.
  			 */
  def createReminder(data: js.Any): Reminder
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.alerts> property.
  			 */
  def getAlerts(): js.Array[Alert]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.allDay> property.
  			 */
  def getAllDay(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.attendees> property.
  			 */
  def getAttendees(): js.Array[Attendee]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.availability> property.
  			 */
  def getAvailability(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.begin> property.
  			 */
  def getBegin(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.description> property.
  			 */
  def getDescription(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.end> property.
  			 */
  def getEnd(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.extendedProperties> property.
  			 */
  def getExtendedProperties(): js.Any
  /**
  			 * Gets the value of the specified extended property.
  			 */
  def getExtendedProperty(name: String): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.hasAlarm> property.
  			 */
  def getHasAlarm(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.id> property.
  			 */
  def getId(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.isDetached> property.
  			 */
  def getIsDetached(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.location> property.
  			 */
  def getLocation(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.notes> property.
  			 */
  def getNotes(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
  			 */
  def getRecurrenceRules(): js.Array[RecurrenceRule]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.reminders> property.
  			 */
  def getReminders(): js.Array[Reminder]
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.status> property.
  			 */
  def getStatus(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.title> property.
  			 */
  def getTitle(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Event.visibility> property.
  			 */
  def getVisibility(): Double
  /**
  			 * Updates the event's data with the current information in the Calendar database.
  			 */
  def refresh(): Boolean
  /**
  			 * Removes an event from the event store.
  			 */
  def remove(span: Double): Boolean
  /**
  			 * Removes a recurrence rule to the recurrence rule array.
  			 */
  def removeRecurrenceRule(rule: RecurrenceRule): Unit
  /**
  			 * Saves changes to an event permanently.
  			 */
  def save(span: Double): Boolean
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.alerts> property.
  			 */
  def setAlerts(alerts: js.Array[Alert]): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.allDay> property.
  			 */
  def setAllDay(allDay: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.begin> property.
  			 */
  def setBegin(begin: js.Date): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.end> property.
  			 */
  def setEnd(end: js.Date): Unit
  /**
  			 * Sets the value of the specified extended property.
  			 */
  def setExtendedProperty(name: String, value: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.location> property.
  			 */
  def setLocation(location: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.notes> property.
  			 */
  def setNotes(notes: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.recurrenceRules> property.
  			 */
  def setRecurrenceRules(recurrenceRules: js.Array[RecurrenceRule]): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Event.title> property.
  			 */
  def setTitle(title: String): Unit
}

object Event {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    addRecurrenceRule: RecurrenceRule => Callback,
    alerts: js.Array[Alert],
    allDay: Boolean,
    apiName: String,
    applyProperties: js.Any => Callback,
    attendees: js.Array[Attendee],
    availability: Double,
    begin: js.Date,
    bubbleParent: Boolean,
    createAlert: js.Any => CallbackTo[Alert],
    createRecurrenceRule: js.Any => CallbackTo[RecurrenceRule],
    createReminder: js.Any => CallbackTo[Reminder],
    description: String,
    end: js.Date,
    extendedProperties: js.Any,
    fireEvent: (String, js.Any) => Callback,
    getAlerts: CallbackTo[js.Array[Alert]],
    getAllDay: CallbackTo[Boolean],
    getApiName: CallbackTo[String],
    getAttendees: CallbackTo[js.Array[Attendee]],
    getAvailability: CallbackTo[Double],
    getBegin: CallbackTo[js.Date],
    getBubbleParent: CallbackTo[Boolean],
    getDescription: CallbackTo[String],
    getEnd: CallbackTo[js.Date],
    getExtendedProperties: CallbackTo[js.Any],
    getExtendedProperty: String => CallbackTo[String],
    getHasAlarm: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getIsDetached: CallbackTo[Boolean],
    getLocation: CallbackTo[String],
    getNotes: CallbackTo[String],
    getRecurrenceRules: CallbackTo[js.Array[RecurrenceRule]],
    getReminders: CallbackTo[js.Array[Reminder]],
    getStatus: CallbackTo[Double],
    getTitle: CallbackTo[String],
    getVisibility: CallbackTo[Double],
    hasAlarm: Boolean,
    id: String,
    isDetached: Boolean,
    location: String,
    notes: String,
    recurrenceRules: js.Array[RecurrenceRule],
    refresh: CallbackTo[Boolean],
    reminders: js.Array[Reminder],
    remove: Double => CallbackTo[Boolean],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeRecurrenceRule: RecurrenceRule => Callback,
    save: Double => CallbackTo[Boolean],
    setAlerts: js.Array[Alert] => Callback,
    setAllDay: Boolean => Callback,
    setBegin: js.Date => Callback,
    setBubbleParent: Boolean => Callback,
    setEnd: js.Date => Callback,
    setExtendedProperty: (String, String) => Callback,
    setLocation: String => Callback,
    setNotes: String => Callback,
    setRecurrenceRules: js.Array[RecurrenceRule] => Callback,
    setTitle: String => Callback,
    status: Double,
    title: String,
    visibility: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], allDay = allDay.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], attendees = attendees.asInstanceOf[js.Any], availability = availability.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], hasAlarm = hasAlarm.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDetached = isDetached.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], recurrenceRules = recurrenceRules.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("addRecurrenceRule")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Calendar.RecurrenceRule) => addRecurrenceRule(t0).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("createAlert")(js.Any.fromFunction1((t0: js.Any) => createAlert(t0).runNow()))
    __obj.updateDynamic("createRecurrenceRule")(js.Any.fromFunction1((t0: js.Any) => createRecurrenceRule(t0).runNow()))
    __obj.updateDynamic("createReminder")(js.Any.fromFunction1((t0: js.Any) => createReminder(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAlerts")(getAlerts.toJsFn)
    __obj.updateDynamic("getAllDay")(getAllDay.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getAttendees")(getAttendees.toJsFn)
    __obj.updateDynamic("getAvailability")(getAvailability.toJsFn)
    __obj.updateDynamic("getBegin")(getBegin.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getEnd")(getEnd.toJsFn)
    __obj.updateDynamic("getExtendedProperties")(getExtendedProperties.toJsFn)
    __obj.updateDynamic("getExtendedProperty")(js.Any.fromFunction1((t0: java.lang.String) => getExtendedProperty(t0).runNow()))
    __obj.updateDynamic("getHasAlarm")(getHasAlarm.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIsDetached")(getIsDetached.toJsFn)
    __obj.updateDynamic("getLocation")(getLocation.toJsFn)
    __obj.updateDynamic("getNotes")(getNotes.toJsFn)
    __obj.updateDynamic("getRecurrenceRules")(getRecurrenceRules.toJsFn)
    __obj.updateDynamic("getReminders")(getReminders.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getVisibility")(getVisibility.toJsFn)
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeRecurrenceRule")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Calendar.RecurrenceRule) => removeRecurrenceRule(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction1((t0: scala.Double) => save(t0).runNow()))
    __obj.updateDynamic("setAlerts")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.Titanium.Calendar.Alert]) => setAlerts(t0).runNow()))
    __obj.updateDynamic("setAllDay")(js.Any.fromFunction1((t0: scala.Boolean) => setAllDay(t0).runNow()))
    __obj.updateDynamic("setBegin")(js.Any.fromFunction1((t0: js.Date) => setBegin(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setEnd")(js.Any.fromFunction1((t0: js.Date) => setEnd(t0).runNow()))
    __obj.updateDynamic("setExtendedProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setExtendedProperty(t0, t1).runNow()))
    __obj.updateDynamic("setLocation")(js.Any.fromFunction1((t0: java.lang.String) => setLocation(t0).runNow()))
    __obj.updateDynamic("setNotes")(js.Any.fromFunction1((t0: java.lang.String) => setNotes(t0).runNow()))
    __obj.updateDynamic("setRecurrenceRules")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.Titanium.Calendar.RecurrenceRule]) => setRecurrenceRules(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

