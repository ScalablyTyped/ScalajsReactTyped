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
		 * An object that represents a single alert for an event in an calendar.
		 */
trait Alert extends Proxy {
  /**
  			 * The absolute date for the alarm.
  			 */
  var absoluteDate: js.Date
  /**
  			 * Date/time at which this alert alarm is set to trigger.
  			 */
  val alarmTime: js.Date
  /**
  			 * Start date/time for the corresponding event.
  			 */
  val begin: js.Date
  /**
  			 * End date/time for the corresponding event.
  			 */
  val end: js.Date
  /**
  			 * Identifier of the event for which this alert is set.
  			 */
  val eventId: Double
  /**
  			 * Identifier of this alert.
  			 */
  val id: String
  /**
  			 * Reminder notice period in minutes, that determines how long prior to the event this alert
  			 * should trigger.
  			 */
  val minutes: Double
  /**
  			 * The offset from the start of an event, at which the alarm fires.
  			 */
  var relativeOffset: Double
  /**
  			 * The current state of the alert.
  			 */
  val state: Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
  			 */
  def getAbsoluteDate(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.alarmTime> property.
  			 */
  def getAlarmTime(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.begin> property.
  			 */
  def getBegin(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.end> property.
  			 */
  def getEnd(): js.Date
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.eventId> property.
  			 */
  def getEventId(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.id> property.
  			 */
  def getId(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.minutes> property.
  			 */
  def getMinutes(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
  			 */
  def getRelativeOffset(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Alert.state> property.
  			 */
  def getState(): Double
  /**
  			 * Sets the value of the <Titanium.Calendar.Alert.absoluteDate> property.
  			 */
  def setAbsoluteDate(absoluteDate: js.Date): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Alert.relativeOffset> property.
  			 */
  def setRelativeOffset(relativeOffset: Double): Unit
}

object Alert {
  @scala.inline
  def apply(
    absoluteDate: js.Date,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    alarmTime: js.Date,
    apiName: String,
    applyProperties: js.Any => Callback,
    begin: js.Date,
    bubbleParent: Boolean,
    end: js.Date,
    eventId: Double,
    fireEvent: (String, js.Any) => Callback,
    getAbsoluteDate: CallbackTo[js.Date],
    getAlarmTime: CallbackTo[js.Date],
    getApiName: CallbackTo[String],
    getBegin: CallbackTo[js.Date],
    getBubbleParent: CallbackTo[Boolean],
    getEnd: CallbackTo[js.Date],
    getEventId: CallbackTo[Double],
    getId: CallbackTo[String],
    getMinutes: CallbackTo[Double],
    getRelativeOffset: CallbackTo[Double],
    getState: CallbackTo[Double],
    id: String,
    minutes: Double,
    relativeOffset: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setAbsoluteDate: js.Date => Callback,
    setBubbleParent: Boolean => Callback,
    setRelativeOffset: Double => Callback,
    state: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Alert = {
    val __obj = js.Dynamic.literal(absoluteDate = absoluteDate.asInstanceOf[js.Any], alarmTime = alarmTime.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], relativeOffset = relativeOffset.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getAbsoluteDate")(getAbsoluteDate.toJsFn)
    __obj.updateDynamic("getAlarmTime")(getAlarmTime.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBegin")(getBegin.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getEnd")(getEnd.toJsFn)
    __obj.updateDynamic("getEventId")(getEventId.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getMinutes")(getMinutes.toJsFn)
    __obj.updateDynamic("getRelativeOffset")(getRelativeOffset.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAbsoluteDate")(js.Any.fromFunction1((t0: js.Date) => setAbsoluteDate(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setRelativeOffset")(js.Any.fromFunction1((t0: scala.Double) => setRelativeOffset(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

