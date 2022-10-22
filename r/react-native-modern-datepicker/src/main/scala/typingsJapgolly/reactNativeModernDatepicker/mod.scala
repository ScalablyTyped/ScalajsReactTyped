package typingsJapgolly.reactNativeModernDatepicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeModernDatepicker.anon.BackgroundColor
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

object mod {
  
  @JSImport("react-native-modern-datepicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ModernDatepickerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getFormatedDate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatedDate")().asInstanceOf[String]
  inline def getFormatedDate(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatedDate")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getFormatedDate(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatedDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getFormatedDate(date: Unit, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormatedDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getToday(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToday")().asInstanceOf[String]
  
  trait ModernDatepickerProps extends StObject {
    
    var current: js.UndefOr[String] = js.undefined
    
    var disableDateChange: js.UndefOr[Boolean] = js.undefined
    
    var isGregorian: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maximumDate: js.UndefOr[String] = js.undefined
    
    var minimumDate: js.UndefOr[String] = js.undefined
    
    var minuteInterval: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30` | `60`] = js.undefined
    
    var mode: js.UndefOr[datepicker | calendar | monthYear | time] = js.undefined
    
    var onDateChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.undefined
    
    var onMonthYearChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.undefined
    
    var onSelectedChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.undefined
    
    var onTimeChange: js.UndefOr[js.Function1[/* dateString */ String, Unit]] = js.undefined
    
    var options: js.UndefOr[BackgroundColor] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
    
    var selectorEndingYear: js.UndefOr[Double] = js.undefined
    
    var selectorStartingYear: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ModernDatepickerProps {
    
    inline def apply(): ModernDatepickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModernDatepickerProps]
    }
    
    extension [Self <: ModernDatepickerProps](x: Self) {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDisableDateChange(value: Boolean): Self = StObject.set(x, "disableDateChange", value.asInstanceOf[js.Any])
      
      inline def setDisableDateChangeUndefined: Self = StObject.set(x, "disableDateChange", js.undefined)
      
      inline def setIsGregorian(value: Boolean): Self = StObject.set(x, "isGregorian", value.asInstanceOf[js.Any])
      
      inline def setIsGregorianUndefined: Self = StObject.set(x, "isGregorian", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaximumDate(value: String): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      inline def setMinimumDate(value: String): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      inline def setMinuteInterval(value: `1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30` | `60`): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
      
      inline def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
      
      inline def setMode(value: datepicker | calendar | monthYear | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDateChange(value: /* dateString */ String => Callback): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnMonthYearChange(value: /* dateString */ String => Callback): Self = StObject.set(x, "onMonthYearChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
      
      inline def setOnMonthYearChangeUndefined: Self = StObject.set(x, "onMonthYearChange", js.undefined)
      
      inline def setOnSelectedChange(value: /* dateString */ String => Callback): Self = StObject.set(x, "onSelectedChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
      
      inline def setOnSelectedChangeUndefined: Self = StObject.set(x, "onSelectedChange", js.undefined)
      
      inline def setOnTimeChange(value: /* dateString */ String => Callback): Self = StObject.set(x, "onTimeChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
      
      inline def setOnTimeChangeUndefined: Self = StObject.set(x, "onTimeChange", js.undefined)
      
      inline def setOptions(value: BackgroundColor): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectorEndingYear(value: Double): Self = StObject.set(x, "selectorEndingYear", value.asInstanceOf[js.Any])
      
      inline def setSelectorEndingYearUndefined: Self = StObject.set(x, "selectorEndingYear", js.undefined)
      
      inline def setSelectorStartingYear(value: Double): Self = StObject.set(x, "selectorStartingYear", value.asInstanceOf[js.Any])
      
      inline def setSelectorStartingYearUndefined: Self = StObject.set(x, "selectorStartingYear", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
