package typingsJapgolly.reactNativeModernDatepicker.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactNativeModernDatepicker.anon.BackgroundColor
import typingsJapgolly.reactNativeModernDatepicker.mod.ModernDatepickerProps
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`10`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`12`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`15`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`1`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`20`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`2`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`30`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`3`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`4`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`5`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`60`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerInts.`6`
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerStrings.calendar
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerStrings.datepicker
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerStrings.monthYear
import typingsJapgolly.reactNativeModernDatepicker.reactNativeModernDatepickerStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModernDatepicker {
  
  @JSImport("react-native-modern-datepicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def current(value: String): this.type = set("current", value.asInstanceOf[js.Any])
    
    inline def disableDateChange(value: Boolean): this.type = set("disableDateChange", value.asInstanceOf[js.Any])
    
    inline def isGregorian(value: Boolean): this.type = set("isGregorian", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maximumDate(value: String): this.type = set("maximumDate", value.asInstanceOf[js.Any])
    
    inline def minimumDate(value: String): this.type = set("minimumDate", value.asInstanceOf[js.Any])
    
    inline def minuteInterval(value: `1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30` | `60`): this.type = set("minuteInterval", value.asInstanceOf[js.Any])
    
    inline def mode(value: datepicker | calendar | monthYear | time): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onDateChange(value: /* dateString */ String => Callback): this.type = set("onDateChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
    
    inline def onMonthYearChange(value: /* dateString */ String => Callback): this.type = set("onMonthYearChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
    
    inline def onSelectedChange(value: /* dateString */ String => Callback): this.type = set("onSelectedChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
    
    inline def onTimeChange(value: /* dateString */ String => Callback): this.type = set("onTimeChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
    
    inline def options(value: BackgroundColor): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def selected(value: String): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectorEndingYear(value: Double): this.type = set("selectorEndingYear", value.asInstanceOf[js.Any])
    
    inline def selectorStartingYear(value: Double): this.type = set("selectorStartingYear", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeModernDatepicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModernDatepickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
