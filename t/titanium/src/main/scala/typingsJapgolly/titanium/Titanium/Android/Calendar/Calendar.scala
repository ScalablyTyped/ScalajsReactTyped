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
			 * An object that represents a single calendar on Android.
			 */
trait Calendar extends Proxy {
  /**
  				 * Indicates whether this calendar is hidden.
  				 */
  val hidden: Boolean
  /**
  				 * Identifier of this calendar.
  				 */
  val id: String
  /**
  				 * Display name of this calendar.
  				 */
  val name: String
  /**
  				 * Indicates whether the calendar is selected.
  				 */
  val selected: Boolean
  /**
  				 * Creates an event in this calendar.
  				 */
  def createEvent(properties: js.Any): Event
  /**
  				 * Gets the event with the specified identifier.
  				 */
  def getEventById(id: Double): Event
  /**
  				 * Gets events that occur between two dates.
  				 */
  def getEventsBetweenDates(date1: js.Date, date2: js.Date): js.Array[Event]
  /**
  				 * Gets events that occur on a specified date.
  				 */
  def getEventsInDate(year: Double, month: Double, day: Double): js.Array[Event]
  /**
  				 * Gets events that occur during a specified month.
  				 */
  def getEventsInMonth(year: Double, month: Double): js.Array[Event]
  /**
  				 * Gets all events that occur during a specified year.
  				 */
  def getEventsInYear(year: Double): js.Array[Event]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.hidden> property.
  				 */
  def getHidden(): Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.id> property.
  				 */
  def getId(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.name> property.
  				 */
  def getName(): String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.selected> property.
  				 */
  def getSelected(): Boolean
}

object Calendar {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    createEvent: js.Any => CallbackTo[Event],
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getEventById: Double => CallbackTo[Event],
    getEventsBetweenDates: (js.Date, js.Date) => CallbackTo[js.Array[Event]],
    getEventsInDate: (Double, Double, Double) => CallbackTo[js.Array[Event]],
    getEventsInMonth: (Double, Double) => CallbackTo[js.Array[Event]],
    getEventsInYear: Double => CallbackTo[js.Array[Event]],
    getHidden: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    getSelected: CallbackTo[Boolean],
    hidden: Boolean,
    id: String,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    selected: Boolean,
    setBubbleParent: Boolean => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("createEvent")(js.Any.fromFunction1((t0: js.Any) => createEvent(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getEventById")(js.Any.fromFunction1((t0: scala.Double) => getEventById(t0).runNow()))
    __obj.updateDynamic("getEventsBetweenDates")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => getEventsBetweenDates(t0, t1).runNow()))
    __obj.updateDynamic("getEventsInDate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => getEventsInDate(t0, t1, t2).runNow()))
    __obj.updateDynamic("getEventsInMonth")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getEventsInMonth(t0, t1).runNow()))
    __obj.updateDynamic("getEventsInYear")(js.Any.fromFunction1((t0: scala.Double) => getEventsInYear(t0).runNow()))
    __obj.updateDynamic("getHidden")(getHidden.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getSelected")(getSelected.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
}

