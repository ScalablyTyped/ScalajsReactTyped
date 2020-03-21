package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.PartialInternationalizati
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  /**
    * Automatically close picker when minute is selected.
    * @default false;
    */
  var autoClose: Boolean
  /**
    * Specify a selector for a DOM element to render the calendar in, by default it will be placed before the input.
    */
  var container: String
  /**
    * Default time to set on the timepicker 'now' or '13:14'
    * @default 'now';
    */
  var defaultTime: String
  /**
    * Duration of the transition from/to the hours/minutes view.
    * @default 350
    */
  var duration: Double
  /**
    * Millisecond offset from the defaultTime.
    * @default 0
    */
  var fromNow: Double
  /**
    * Internationalization options
    */
  var i18n: PartialInternationalizati
  /**
    * Show the clear button in the Timepicker
    * @default false
    */
  var showClearBtn: Boolean
  /**
    * Use 12 hour AM/PM clock instead of 24 hour clock.
    * @default true
    */
  var twelveHour: Boolean
  /**
    * Vibrate device when dragging clock hand.
    * @default true
    */
  var vibrate: Boolean
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit
  /**
    * Callback function when a time is selected
    * @default null
    */
  def onSelect(hour: Double, minute: Double): Unit
}

object TimepickerOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: String,
    defaultTime: String,
    duration: Double,
    fromNow: Double,
    i18n: PartialInternationalizati,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    onSelect: (Double, Double) => Callback,
    showClearBtn: Boolean,
    twelveHour: Boolean,
    vibrate: Boolean
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultTime = defaultTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fromNow = fromNow.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], showClearBtn = showClearBtn.asInstanceOf[js.Any], twelveHour = twelveHour.asInstanceOf[js.Any], vibrate = vibrate.asInstanceOf[js.Any])
    __obj.updateDynamic("onCloseEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseEnd(t0).runNow()))
    __obj.updateDynamic("onCloseStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onCloseStart(t0).runNow()))
    __obj.updateDynamic("onOpenEnd")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenEnd(t0).runNow()))
    __obj.updateDynamic("onOpenStart")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => onOpenStart(t0).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => onSelect(t0, t1).runNow()))
    __obj.asInstanceOf[TimepickerOptions]
  }
}

