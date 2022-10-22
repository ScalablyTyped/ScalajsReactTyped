package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.AM
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.PM
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.vibrate
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.webkitVibrate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timepicker
  extends StObject
     with Component[TimepickerOptions] {
  
  /**
    * If the time is AM or PM on twelve-hour clock
    * @default 'PM'
    */
  var amOrPm: AM | PM
  
  /**
    * Close timepicker
    */
  def close(): Unit
  
  /**
    * Current view on the timepicker
    * @default 'hours'
    */
  var currentView: Views
  
  /**
    * If the picker is open.
    */
  var isOpen: Boolean
  
  /**
    * Open timepicker
    */
  def open(): Unit
  
  /**
    * Show hours or minutes view on timepicker
    * @param view The name of the view you want to switch to, 'hours' or 'minutes'.
    */
  def showView(view: Views): Unit
  
  /**
    * The selected time.
    */
  var time: String
  
  /**
    * Vibrate device when dragging clock hand.
    */
  var vibrate: typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.vibrate | webkitVibrate | Null
}
object Timepicker {
  
  inline def apply(
    amOrPm: AM | PM,
    close: Callback,
    currentView: Views,
    destroy: Callback,
    el: Element,
    isOpen: Boolean,
    open: Callback,
    options: TimepickerOptions,
    showView: Views => Callback,
    time: String
  ): Timepicker = {
    val __obj = js.Dynamic.literal(amOrPm = amOrPm.asInstanceOf[js.Any], close = close.toJsFn, currentView = currentView.asInstanceOf[js.Any], destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any], showView = js.Any.fromFunction1((t0: Views) => showView(t0).runNow()), time = time.asInstanceOf[js.Any], vibrate = null)
    __obj.asInstanceOf[Timepicker]
  }
  
  extension [Self <: Timepicker](x: Self) {
    
    inline def setAmOrPm(value: AM | PM): Self = StObject.set(x, "amOrPm", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCurrentView(value: Views): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setShowView(value: Views => Callback): Self = StObject.set(x, "showView", js.Any.fromFunction1((t0: Views) => value(t0).runNow()))
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setVibrate(value: vibrate | webkitVibrate): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    inline def setVibrateNull: Self = StObject.set(x, "vibrate", null)
  }
}
