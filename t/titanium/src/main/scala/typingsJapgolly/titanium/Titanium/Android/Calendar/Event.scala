package typingsJapgolly.titanium.Titanium.Android.Calendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single event in an Android calendar.
			 */
trait Event extends Proxy {
  /**
  				 * Existing alerts for this event.
  				 */
  val alerts: js.Array[Alert]
  /**
  				 * Indicates whether this event is all day.
  				 */
  val allDay: Boolean
  /**
  				 * Start date/time of this event.
  				 */
  val begin: js.Date
  /**
  				 * Description of this event.
  				 */
  val description: String
  /**
  				 * End date/time of this event.
  				 */
  val end: js.Date
  /**
  				 * Extended properties of this event.
  				 */
  val extendedProperties: js.Any
  /**
  				 * Indicates whether an alarm is scheduled for this event.
  				 */
  val hasAlarm: Boolean
  /**
  				 * Indicates whether [extendedProperties](Titanium.Android.Calendar.Event.extendedProperties)
  				 * exists for this event.
  				 */
  val hasExtendedProperties: Boolean
  /**
  				 * Identifier of this event.
  				 */
  val id: String
  /**
  				 * Location of this event.
  				 */
  val location: String
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
  val title: String
  /**
  				 * Visibility of this event.
  				 */
  val visibility: Double
  /**
  				 * Creates an alert for this event.
  				 */
  def createAlert(data: js.Any): Alert
  /**
  				 * Creates a reminder for this event.
  				 */
  def createReminder(data: js.Any): Reminder
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.alerts> property.
  				 */
  def getAlerts(): js.Array[Alert]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.allDay> property.
  				 */
  def getAllDay(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.begin> property.
  				 */
  def getBegin(): js.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.description> property.
  				 */
  def getDescription(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.end> property.
  				 */
  def getEnd(): js.Date
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.extendedProperties> property.
  				 */
  def getExtendedProperties(): js.Any
  /**
  				 * Gets the value of the specified extended property.
  				 */
  def getExtendedProperty(name: String): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.hasAlarm> property.
  				 */
  def getHasAlarm(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.hasExtendedProperties> property.
  				 */
  def getHasExtendedProperties(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.id> property.
  				 */
  def getId(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.location> property.
  				 */
  def getLocation(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.reminders> property.
  				 */
  def getReminders(): js.Array[Reminder]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.status> property.
  				 */
  def getStatus(): Double
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Event.visibility> property.
  				 */
  def getVisibility(): Double
  /**
  				 * Sets the value of the specified extended property.
  				 */
  def setExtendedProperty(name: String, value: String): Unit
}

object Event {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    alerts: js.Array[Alert],
    allDay: Boolean,
    apiName: String,
    applyProperties: js.Any => Callback,
    begin: js.Date,
    bubbleParent: Boolean,
    createAlert: js.Any => CallbackTo[Alert],
    createReminder: js.Any => CallbackTo[Reminder],
    description: String,
    end: js.Date,
    extendedProperties: js.Any,
    fireEvent: (String, js.Any) => Callback,
    getAlerts: CallbackTo[js.Array[Alert]],
    getAllDay: CallbackTo[Boolean],
    getApiName: CallbackTo[String],
    getBegin: CallbackTo[js.Date],
    getBubbleParent: CallbackTo[Boolean],
    getDescription: CallbackTo[String],
    getEnd: CallbackTo[js.Date],
    getExtendedProperties: CallbackTo[js.Any],
    getExtendedProperty: String => CallbackTo[String],
    getHasAlarm: CallbackTo[Boolean],
    getHasExtendedProperties: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getLocation: CallbackTo[String],
    getReminders: CallbackTo[js.Array[Reminder]],
    getStatus: CallbackTo[Double],
    getTitle: CallbackTo[String],
    getVisibility: CallbackTo[Double],
    hasAlarm: Boolean,
    hasExtendedProperties: Boolean,
    id: String,
    location: String,
    reminders: js.Array[Reminder],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setExtendedProperty: (String, String) => Callback,
    status: Double,
    title: String,
    visibility: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Event = {
    val __obj = js.Dynamic.literal(alerts = alerts.asInstanceOf[js.Any], allDay = allDay.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], extendedProperties = extendedProperties.asInstanceOf[js.Any], hasAlarm = hasAlarm.asInstanceOf[js.Any], hasExtendedProperties = hasExtendedProperties.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("createAlert")(js.Any.fromFunction1((t0: js.Any) => createAlert(t0).runNow()))
    __obj.updateDynamic("createReminder")(js.Any.fromFunction1((t0: js.Any) => createReminder(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAlerts")(getAlerts.toJsFn)
    __obj.updateDynamic("getAllDay")(getAllDay.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBegin")(getBegin.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getEnd")(getEnd.toJsFn)
    __obj.updateDynamic("getExtendedProperties")(getExtendedProperties.toJsFn)
    __obj.updateDynamic("getExtendedProperty")(js.Any.fromFunction1((t0: java.lang.String) => getExtendedProperty(t0).runNow()))
    __obj.updateDynamic("getHasAlarm")(getHasAlarm.toJsFn)
    __obj.updateDynamic("getHasExtendedProperties")(getHasExtendedProperties.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getLocation")(getLocation.toJsFn)
    __obj.updateDynamic("getReminders")(getReminders.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getVisibility")(getVisibility.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setExtendedProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setExtendedProperty(t0, t1).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

