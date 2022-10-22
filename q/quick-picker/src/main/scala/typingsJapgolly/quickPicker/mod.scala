package typingsJapgolly.quickPicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.quickPicker.quickPickerInts.`10`
import typingsJapgolly.quickPicker.quickPickerInts.`12`
import typingsJapgolly.quickPicker.quickPickerInts.`15`
import typingsJapgolly.quickPicker.quickPickerInts.`1`
import typingsJapgolly.quickPicker.quickPickerInts.`20`
import typingsJapgolly.quickPicker.quickPickerInts.`2`
import typingsJapgolly.quickPicker.quickPickerInts.`30`
import typingsJapgolly.quickPicker.quickPickerInts.`3`
import typingsJapgolly.quickPicker.quickPickerInts.`4`
import typingsJapgolly.quickPicker.quickPickerInts.`5`
import typingsJapgolly.quickPicker.quickPickerInts.`6`
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quick-picker", JSImport.Default)
  @js.native
  open class default ()
    extends Component[js.Object, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("quick-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    
    // tslint:disable-next-line
    inline def open[T](options: QuickPickerOpenOptions[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  // tslint:disable-next-line
  trait ItemType extends StObject {
    
    val label: String
    
    val value: String | Double
  }
  object ItemType {
    
    inline def apply(label: String, value: String | Double): ItemType = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemType]
    }
    
    extension [Self <: ItemType](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.quickPicker.quickPickerStrings.default
    - typingsJapgolly.quickPicker.quickPickerStrings.spinner
    - typingsJapgolly.quickPicker.quickPickerStrings.calendar
    - typingsJapgolly.quickPicker.quickPickerStrings.clock
  */
  trait PickerDisplayType extends StObject
  object PickerDisplayType {
    
    inline def default: typingsJapgolly.quickPicker.quickPickerStrings.default = "default".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.default]
    
    inline def calendar: typingsJapgolly.quickPicker.quickPickerStrings.calendar = "calendar".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.calendar]
    
    inline def clock: typingsJapgolly.quickPicker.quickPickerStrings.clock = "clock".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.clock]
    
    inline def spinner: typingsJapgolly.quickPicker.quickPickerStrings.spinner = "spinner".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.spinner]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.quickPicker.quickPickerStrings.date
    - typingsJapgolly.quickPicker.quickPickerStrings.time
    - typingsJapgolly.quickPicker.quickPickerStrings.datetime
    - typingsJapgolly.quickPicker.quickPickerStrings.countdown
  */
  trait PickerMode extends StObject
  object PickerMode {
    
    inline def countdown: typingsJapgolly.quickPicker.quickPickerStrings.countdown = "countdown".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.countdown]
    
    inline def date: typingsJapgolly.quickPicker.quickPickerStrings.date = "date".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.date]
    
    inline def datetime: typingsJapgolly.quickPicker.quickPickerStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.datetime]
    
    inline def time: typingsJapgolly.quickPicker.quickPickerStrings.time = "time".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.time]
  }
  
  // tslint:disable-next-line
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.quickPicker.quickPickerStrings.normal
    - typingsJapgolly.quickPicker.quickPickerStrings.time
  */
  trait PickerType extends StObject
  object PickerType {
    
    inline def normal: typingsJapgolly.quickPicker.quickPickerStrings.normal = "normal".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.normal]
    
    inline def time: typingsJapgolly.quickPicker.quickPickerStrings.time = "time".asInstanceOf[typingsJapgolly.quickPicker.quickPickerStrings.time]
  }
  
  type QuickPicker = japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
  
  trait QuickPickerOpenOptions[T] extends StObject {
    
    /**
      * Android's modal items style
      * @default undefined
      */
    val androidItemStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Android's modal items text style
      * @default undefined
      */
    val androidItemTextStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Android's modal view style
      * @default undefined
      */
    val androidModalStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Android's modal selected item text style
      * @default undefined
      */
    val androidSelectedItemStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Cancel button text
      * @default "Cancel"
      * @platform Android
      */
    val cancelButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * Current selected date
      * @default new Date()
      */
    val date: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Disable the picker top bar
      * @default false
      * @platform iOS
      */
    val disableTopRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the visual display of the picker for Android
      * @default undefined
      * @platform Android
      */
    val display: js.UndefOr[PickerDisplayType] = js.undefined
    
    /**
      * Done button text
      * @default "Done" (iOS) "Ok" (Android)
      * @platform both
      */
    val doneButtonText: js.UndefOr[String] = js.undefined
    
    /**
      * Done (and Cancel on Android) button text style
      * @default undefined
      * @platform both
      */
    val doneButtonTextStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Allows changing of the time picker to a 24 hour format.
      * @default undefined
      * @platform iOS
      */
    val is24Hour: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Picker's selected item
      * @default undefined
      * @platform both
      */
    val item: js.UndefOr[T] = js.undefined
    
    /**
      * Picker's items
      * @default [] // an empty array
      * @platform both
      */
    val items: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * Allows changing of the locale of the component. By default it uses the device's locale.
      * @default undefined
      * @platform iOS
      */
    val locale: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum date
      * @default undefined
      * @platform both
      */
    val maximumDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Minimum date
      * @default undefined
      * @platform both
      */
    val minimumDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * The interval at which minutes can be selected.
      * @default undefined
      * @platform iOS
      */
    val minuteInterval: js.UndefOr[`1` | `2` | `6` | `5` | `4` | `3` | `10` | `12` | `15` | `20` | `30`] = js.undefined
    
    /**
      * mode if pickerType is set to "time"
      * @default undefined
      * @platform both
      */
    val mode: js.UndefOr[PickerMode] = js.undefined
    
    /**
      * Callback function when an item is selected
      * @default undefined
      * @platform both
      */
    val onChange: js.UndefOr[js.Function1[/* item */ T | js.Date, Unit]] = js.undefined
    
    /**
      * Callback function when Done/Ok button is pressed
      * @default undefined
      * @platform both
      */
    val onPressDone: js.UndefOr[js.Function1[/* item */ T | js.Date, Unit]] = js.undefined
    
    /**
      * Callback function when Cancel button is pressed or when user taps Out
      * @default undefined
      * @platform both
      */
    val onTapOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * sets the picker to his normal mode or to time mode
      * @default "normal"
      * @platform both
      */
    val pickerType: js.UndefOr[PickerType] = js.undefined
    
    /**
      * Allows changing of the timeZone of the date picker. By default it uses the device's time zone.
      * @default undefined
      * @platform both
      */
    val timeZoneOffsetInMinutes: js.UndefOr[Double] = js.undefined
    
    /**
      * If you want to create your own custom top bar
      * @default undefined
      * @platform iOS
      */
    val topRow: js.UndefOr[Node] = js.undefined
    
    /**
      * Use native driver
      * @default true
      * @platform both
      */
    val useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object QuickPickerOpenOptions {
    
    inline def apply[T](): QuickPickerOpenOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickPickerOpenOptions[T]]
    }
    
    extension [Self <: QuickPickerOpenOptions[?], T](x: Self & QuickPickerOpenOptions[T]) {
      
      inline def setAndroidItemStyle(value: ViewStyle): Self = StObject.set(x, "androidItemStyle", value.asInstanceOf[js.Any])
      
      inline def setAndroidItemStyleUndefined: Self = StObject.set(x, "androidItemStyle", js.undefined)
      
      inline def setAndroidItemTextStyle(value: TextStyle): Self = StObject.set(x, "androidItemTextStyle", value.asInstanceOf[js.Any])
      
      inline def setAndroidItemTextStyleUndefined: Self = StObject.set(x, "androidItemTextStyle", js.undefined)
      
      inline def setAndroidModalStyle(value: ViewStyle): Self = StObject.set(x, "androidModalStyle", value.asInstanceOf[js.Any])
      
      inline def setAndroidModalStyleUndefined: Self = StObject.set(x, "androidModalStyle", js.undefined)
      
      inline def setAndroidSelectedItemStyle(value: TextStyle): Self = StObject.set(x, "androidSelectedItemStyle", value.asInstanceOf[js.Any])
      
      inline def setAndroidSelectedItemStyleUndefined: Self = StObject.set(x, "androidSelectedItemStyle", js.undefined)
      
      inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDisableTopRow(value: Boolean): Self = StObject.set(x, "disableTopRow", value.asInstanceOf[js.Any])
      
      inline def setDisableTopRowUndefined: Self = StObject.set(x, "disableTopRow", js.undefined)
      
      inline def setDisplay(value: PickerDisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDoneButtonText(value: String): Self = StObject.set(x, "doneButtonText", value.asInstanceOf[js.Any])
      
      inline def setDoneButtonTextStyle(value: TextStyle): Self = StObject.set(x, "doneButtonTextStyle", value.asInstanceOf[js.Any])
      
      inline def setDoneButtonTextStyleUndefined: Self = StObject.set(x, "doneButtonTextStyle", js.undefined)
      
      inline def setDoneButtonTextUndefined: Self = StObject.set(x, "doneButtonText", js.undefined)
      
      inline def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
      
      inline def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaximumDate(value: js.Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
      
      inline def setMaximumDateUndefined: Self = StObject.set(x, "maximumDate", js.undefined)
      
      inline def setMinimumDate(value: js.Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
      
      inline def setMinimumDateUndefined: Self = StObject.set(x, "minimumDate", js.undefined)
      
      inline def setMinuteInterval(value: `1` | `2` | `6` | `5` | `4` | `3` | `10` | `12` | `15` | `20` | `30`): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
      
      inline def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
      
      inline def setMode(value: PickerMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnChange(value: /* item */ T | js.Date => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* item */ T | js.Date) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPressDone(value: /* item */ T | js.Date => Callback): Self = StObject.set(x, "onPressDone", js.Any.fromFunction1((t0: /* item */ T | js.Date) => value(t0).runNow()))
      
      inline def setOnPressDoneUndefined: Self = StObject.set(x, "onPressDone", js.undefined)
      
      inline def setOnTapOut(value: Callback): Self = StObject.set(x, "onTapOut", value.toJsFn)
      
      inline def setOnTapOutUndefined: Self = StObject.set(x, "onTapOut", js.undefined)
      
      inline def setPickerType(value: PickerType): Self = StObject.set(x, "pickerType", value.asInstanceOf[js.Any])
      
      inline def setPickerTypeUndefined: Self = StObject.set(x, "pickerType", js.undefined)
      
      inline def setTimeZoneOffsetInMinutes(value: Double): Self = StObject.set(x, "timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneOffsetInMinutesUndefined: Self = StObject.set(x, "timeZoneOffsetInMinutes", js.undefined)
      
      inline def setTopRow(value: VdomNode): Self = StObject.set(x, "topRow", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTopRowNull: Self = StObject.set(x, "topRow", null)
      
      inline def setTopRowUndefined: Self = StObject.set(x, "topRow", js.undefined)
      
      inline def setTopRowVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "topRow", js.Array(value*))
      
      inline def setTopRowVdomElement(value: VdomElement): Self = StObject.set(x, "topRow", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
