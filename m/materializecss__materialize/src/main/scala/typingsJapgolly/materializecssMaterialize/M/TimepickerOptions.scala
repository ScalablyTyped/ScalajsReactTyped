package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.anon.PartialInternationalizati
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimepickerOptions extends StObject {
  
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
}
object TimepickerOptions {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultTime = defaultTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fromNow = fromNow.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1((t0: Element) => onCloseEnd(t0).runNow()), onCloseStart = js.Any.fromFunction1((t0: Element) => onCloseStart(t0).runNow()), onOpenEnd = js.Any.fromFunction1((t0: Element) => onOpenEnd(t0).runNow()), onOpenStart = js.Any.fromFunction1((t0: Element) => onOpenStart(t0).runNow()), onSelect = js.Any.fromFunction2((t0: Double, t1: Double) => (onSelect(t0, t1)).runNow()), showClearBtn = showClearBtn.asInstanceOf[js.Any], twelveHour = twelveHour.asInstanceOf[js.Any], vibrate = vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
  
  extension [Self <: TimepickerOptions](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDefaultTime(value: String): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFromNow(value: Double): Self = StObject.set(x, "fromNow", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: PartialInternationalizati): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Callback): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnCloseStart(value: Element => Callback): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenEnd(value: Element => Callback): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenStart(value: Element => Callback): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnSelect(value: (Double, Double) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    inline def setTwelveHour(value: Boolean): Self = StObject.set(x, "twelveHour", value.asInstanceOf[js.Any])
    
    inline def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
  }
}
