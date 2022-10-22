package typingsJapgolly.chenfengyuanDatepicker

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`0`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`1`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`2`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`3`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`4`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`5`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerInts.`6`
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.datepicker
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.day
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.month
import typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.year
import typingsJapgolly.chenfengyuanDatepicker.mod.global.JQuery
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait DatePickerEvent
    extends StObject
       with Event {
    
    var date: js.Date = js.native
    
    var namespace: datepicker = js.native
    
    var view: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.show
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.hide
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.update
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.pick
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.reset
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getMonthName
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getDayName
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getDate
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setDate
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setStartDate
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setEndDate
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.parseDate
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.formatDate
    - typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.destroy
  */
  trait DatePickerMethod extends StObject
  object DatePickerMethod {
    
    inline def destroy: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.destroy = "destroy".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.destroy]
    
    inline def formatDate: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.formatDate = "formatDate".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.formatDate]
    
    inline def getDate: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getDate = "getDate".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getDate]
    
    inline def getDayName: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getDayName = "getDayName".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getDayName]
    
    inline def getMonthName: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getMonthName = "getMonthName".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.getMonthName]
    
    inline def hide: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.hide = "hide".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.hide]
    
    inline def parseDate: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.parseDate = "parseDate".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.parseDate]
    
    inline def pick: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.pick = "pick".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.pick]
    
    inline def reset: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.reset = "reset".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.reset]
    
    inline def setDate: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setDate = "setDate".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setDate]
    
    inline def setEndDate: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setEndDate = "setEndDate".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setEndDate]
    
    inline def setStartDate: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setStartDate = "setStartDate".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.setStartDate]
    
    inline def show: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.show = "show".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.show]
    
    inline def update: typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.update = "update".asInstanceOf[typingsJapgolly.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.update]
  }
  
  trait DatepickerOptions extends StObject {
    
    /**
      * Hide the datepicker automatically when picked.
      *
      * Default: `false`
      */
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pick the initial date automatically when initialized.
      *
      * Default: `false`
      */
    var autoPick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show the datepicker automatically when initialized.
      *
      * Default: `false`
      */
    var autoShow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A element for putting the datepicker. If not set, the datepicker will be appended to
      * `document.body` by default.
      *
      * > Only works when the `inline` option set to `true`.
      */
    var container: js.UndefOr[Element | JQuery[HTMLElement] | String | Null] = js.undefined
    
    /**
      * The initial date. If not set, will use the current date by default.
      */
    var date: js.UndefOr[js.Date | String] = js.undefined
    
    /**
      * Days' name of the week.
      *
      * Default: `['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']`
      */
    var days: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Shortest days' name.
      *
      * Default: `['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa']`
      */
    var daysMin: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Shorter days' name.
      *
      * Default: `['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']`
      */
    var daysShort: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * CSS class for a disabled item.
      *
      * Default: `disabled`
      */
    var disabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * The end view date. All the dates after this date will be disabled.
      */
    var endDate: js.UndefOr[js.Date | String] = js.undefined
    
    /**
      * Filter each date item. If it returns `false`, the related date will be disabled.
      */
    var filter: js.UndefOr[
        js.Function2[/* date */ js.Date, /* view */ day | month | year, js.UndefOr[Boolean]]
      ] = js.undefined
    
    /**
      * The date string format.
      *
      * Default: `mm/dd/yyyy`
      *
      * Available date placeholders:
      * * Year: `yyyy`, `yy`
      * * Month: `mm`, `m`
      * * Day: `dd`, `d`
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * A shortcut of the "hide.datepicker" event.
      */
    var hide: js.UndefOr[js.Function1[/* event */ DatePickerEvent, Unit]] = js.undefined
    
    /**
      * CSS class for highlight date item.
      *
      * Default: `highlighted`
      */
    var highlightedClass: js.UndefOr[String] = js.undefined
    
    /**
      * Enable inline mode.
      *
      * If the element is not an input element, will append the datepicker to the element.
      * If the `container` option is set, will append the datepicker to the container.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A element tag for each item of years, months and days.
      *
      * Default: `li`
      */
    var itemTag: js.UndefOr[String] = js.undefined
    
    /**
      * The ISO language code. If not set, will use the built-in language (`en-US`) by default.
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Months' name.
      *
      * Default: `['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']`
      */
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Shorter months' name.
      *
      * Default: `['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']`
      */
    var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The offset top or bottom of the datepicker from the element.
      *
      * Default: `10`
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * A shortcut of the "pick.datepicker" event.
      */
    var pick: js.UndefOr[js.Function1[/* event */ DatePickerEvent, Unit]] = js.undefined
    
    /**
      * CSS class for a muted item.
      *
      * Default: `picked`
      */
    var pickedClass: js.UndefOr[String] = js.undefined
    
    /**
      * A shortcut of the "show.datepicker" event.
      */
    var show: js.UndefOr[js.Function1[/* event */ DatePickerEvent, Unit]] = js.undefined
    
    /**
      * The start view date. All the dates before this date will be disabled.
      */
    var startDate: js.UndefOr[js.Date | String] = js.undefined
    
    /**
      * The start view when initialized.
      *
      * Default: `0`
      *
      * Options:
      * * `0`: days
      * * `1`: months
      * * `2`: years
      */
    var startView: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    /**
      * The template of the datepicker.
      *
      * Default:
      * ```
      * <div class="datepicker-container">
      *   <div class="datepicker-panel" data-view="years picker">
      *     <ul>
      *     <li data-view="years prev">&lsaquo;</li>
      *     <li data-view="years current"></li>
      *     <li data-view="years next">&rsaquo;</li>
      *     </ul>
      *     <ul data-view="years"></ul>
      *   </div>
      *   <div class="datepicker-panel" data-view="months picker">
      *     <ul>
      *     <li data-view="year prev">&lsaquo;</li>
      *     <li data-view="year current"></li>
      *     <li data-view="year next">&rsaquo;</li>
      *     </ul>
      *     <ul data-view="months"></ul>
      *   </div>
      *   <div class="datepicker-panel" data-view="days picker">
      *     <ul>
      *     <li data-view="month prev">&lsaquo;</li>
      *     <li data-view="month current"></li>
      *     <li data-view="month next">&rsaquo;</li>
      *     </ul>
      *     <ul data-view="week"></ul>
      *     <ul data-view="days"></ul>
      *   </div>
      *  </div>
      * ```
      *
      * **Note**: All the data-view attributes must be set when you customize it.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * A element for triggering the datepicker.
      */
    var trigger: js.UndefOr[Element | JQuery[HTMLElement] | String | Null] = js.undefined
    
    /**
      * The start day of the week.
      *
      * Default: `0`
      * Options:
      * * `0`: Sunday
      * * `1`: Monday
      * * `2`: Tuesday
      * * `3`: Wednesday
      * * `4`: Thursday
      * * `5`: Friday
      * * `6`: Saturday
      */
    var weekStart: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    /**
      * Show year before month on the datepicker header.
      *
      * Default: `false`
      */
    var yearFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string suffix to the year number.
      */
    var yearSuffix: js.UndefOr[String] = js.undefined
    
    /**
      * The CSS `z-index` style for the datepicker.
      *
      * Default: `1`
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DatepickerOptions {
    
    inline def apply(): DatepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatepickerOptions]
    }
    
    extension [Self <: DatepickerOptions](x: Self) {
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setAutoPick(value: Boolean): Self = StObject.set(x, "autoPick", value.asInstanceOf[js.Any])
      
      inline def setAutoPickUndefined: Self = StObject.set(x, "autoPick", js.undefined)
      
      inline def setAutoShow(value: Boolean): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      inline def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      inline def setContainer(value: Element | JQuery[HTMLElement] | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDate(value: js.Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysMin(value: js.Array[String]): Self = StObject.set(x, "daysMin", value.asInstanceOf[js.Any])
      
      inline def setDaysMinUndefined: Self = StObject.set(x, "daysMin", js.undefined)
      
      inline def setDaysMinVarargs(value: String*): Self = StObject.set(x, "daysMin", js.Array(value*))
      
      inline def setDaysShort(value: js.Array[String]): Self = StObject.set(x, "daysShort", value.asInstanceOf[js.Any])
      
      inline def setDaysShortUndefined: Self = StObject.set(x, "daysShort", js.undefined)
      
      inline def setDaysShortVarargs(value: String*): Self = StObject.set(x, "daysShort", js.Array(value*))
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value*))
      
      inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      inline def setEndDate(value: js.Date | String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setFilter(value: (/* date */ js.Date, /* view */ day | month | year) => js.UndefOr[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHide(value: /* event */ DatePickerEvent => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: /* event */ DatePickerEvent) => value(t0).runNow()))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHighlightedClass(value: String): Self = StObject.set(x, "highlightedClass", value.asInstanceOf[js.Any])
      
      inline def setHighlightedClassUndefined: Self = StObject.set(x, "highlightedClass", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setItemTag(value: String): Self = StObject.set(x, "itemTag", value.asInstanceOf[js.Any])
      
      inline def setItemTagUndefined: Self = StObject.set(x, "itemTag", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
      
      inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPick(value: /* event */ DatePickerEvent => Callback): Self = StObject.set(x, "pick", js.Any.fromFunction1((t0: /* event */ DatePickerEvent) => value(t0).runNow()))
      
      inline def setPickUndefined: Self = StObject.set(x, "pick", js.undefined)
      
      inline def setPickedClass(value: String): Self = StObject.set(x, "pickedClass", value.asInstanceOf[js.Any])
      
      inline def setPickedClassUndefined: Self = StObject.set(x, "pickedClass", js.undefined)
      
      inline def setShow(value: /* event */ DatePickerEvent => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: /* event */ DatePickerEvent) => value(t0).runNow()))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStartDate(value: js.Date | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStartView(value: `0` | `1` | `2`): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
      
      inline def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTrigger(value: Element | JQuery[HTMLElement] | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setWeekStart(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
      
      inline def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
      
      inline def setYearFirst(value: Boolean): Self = StObject.set(x, "yearFirst", value.asInstanceOf[js.Any])
      
      inline def setYearFirstUndefined: Self = StObject.set(x, "yearFirst", js.undefined)
      
      inline def setYearSuffix(value: String): Self = StObject.set(x, "yearSuffix", value.asInstanceOf[js.Any])
      
      inline def setYearSuffixUndefined: Self = StObject.set(x, "yearSuffix", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type DatepickerPlugin[TElement] = js.Function0[JQuery[TElement]]
  
  object global {
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
      def datepicker(): DatepickerPlugin[TElement] = js.native
      def datepicker(method: DatePickerMethod, args: (Double | Boolean | js.Date | String)*): Unit | String | js.Date = js.native
      def datepicker(options: DatepickerOptions): DatepickerPlugin[TElement] = js.native
    }
  }
}
