package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimePresentation
import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.TitleSelectedDatesFormatter
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonDatetimeElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.cover
import typingsJapgolly.ionicCore.ionicCoreStrings.fixed
import typingsJapgolly.ionicCore.ionicCoreStrings.h12
import typingsJapgolly.ionicCore.ionicCoreStrings.h23
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeDatetimeMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/datetime", "Datetime")
  @js.native
  open class Datetime ()
    extends StObject
       with ComponentInterface {
    
    var activeParts: DatetimeParts | js.Array[DatetimeParts] = js.native
    
    /* protected */ def activePartsChanged(): Unit = js.native
    
    /**
      * Duplicate reference to `activeParts` that does not trigger a re-render of the component.
      * Allows caching an instance of the `activeParts` in between render cycles.
      */
    /* private */ var activePartsClone: Any = js.native
    
    /* private */ var calendarBodyRef: Any = js.native
    
    /**
      * Emits the ionCancel event and
      * optionally closes the popover
      * or modal that the datetime was
      * presented in.
      */
    def cancel(): js.Promise[Unit] = js.native
    def cancel(closeOverlay: Boolean): js.Promise[Unit] = js.native
    
    /**
      * The text to display on the picker's cancel button.
      */
    var cancelText: String = js.native
    
    /* private */ var clearFocusVisible: Any = js.native
    
    /**
      * The text to display on the picker's "Clear" button.
      */
    var clearText: String = js.native
    
    /* private */ var closeParentOverlay: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MDatetime(): Unit = js.native
    
    /**
      * When the presentation is changed, all calendar content is recreated,
      * so we need to re-init behavior with the new elements.
      */
    @JSName("componentDidRender")
    def componentDidRender_MDatetime(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MDatetime(): Unit = js.native
    
    /**
      * Confirms the selected datetime value, updates the
      * `value` property, and optionally closes the popover
      * or modal that the datetime was presented in.
      */
    def confirm(): js.Promise[Unit] = js.native
    def confirm(closeOverlay: Boolean): js.Promise[Unit] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MDatetime(): Unit = js.native
    
    /**
      * Values used to create the list of selectable days. By default
      * every day is shown for the given month. However, to control exactly which days of
      * the month to display, the `dayValues` input can take a number, an array of numbers, or
      * a string of comma separated numbers. Note that even if the array days have an invalid
      * number for the selected month, like `31` in February, it will correctly not show
      * days which are not valid for the selected month.
      */
    var dayValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    
    /* protected */ def dayValuesChanged(): Unit = js.native
    
    /* private */ var destroyCalendarListener: Any = js.native
    
    /**
      * Clean up all listeners except for the overlay
      * listener. This is so that we can re-create the listeners
      * if the datetime has been hidden/presented by a modal or popover.
      */
    /* private */ var destroyInteractionListeners: Any = js.native
    
    /* private */ var destroyKeyboardMO: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the datetime.
      */
    var disabled: Boolean = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MDatetime(): Unit = js.native
    
    /**
      * The text to display on the picker's "Done" button.
      */
    var doneText: String = js.native
    
    var el: HTMLIonDatetimeElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /**
      * The first day of the week to use for `ion-datetime`. The
      * default value is `0` and represents Sunday.
      */
    var firstDayOfWeek: Double = js.native
    
    /* private */ var focusWorkingDay: Any = js.native
    
    /**
      * Returns the DatetimePart interface
      * to use when rendering an initial set of
      * data. This should be used when rendering an
      * interface in an environment where the `value`
      * may not be set. This function works
      * by returning the first selected date in
      * "activePartsClone" and then falling back to
      * today's DatetimeParts if no active date is selected.
      */
    /* private */ var getDefaultPart: Any = js.native
    
    /* private */ var hasValue: Any = js.native
    
    /**
      * The hour cycle of the `ion-datetime`. If no value is set, this is
      * specified by the current locale.
      */
    var hourCycle: js.UndefOr[h23 | h12] = js.native
    
    /**
      * Values used to create the list of selectable hours. By default
      * the hour values range from `0` to `23` for 24-hour, or `1` to `12` for 12-hour. However,
      * to control exactly which hours to display, the `hourValues` input can take a number, an
      * array of numbers, or a string of comma separated numbers.
      */
    var hourValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    
    /* protected */ def hourValuesChanged(): Unit = js.native
    
    /* private */ var initializeCalendarListener: Any = js.native
    
    /* private */ var initializeKeyboardListeners: Any = js.native
    
    /* private */ var initializeListeners: Any = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * Emitted when the datetime loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the datetime selection was cancelled.
      */
    var ionCancel: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value (selected date) has changed.
      */
    var ionChange: EventEmitter[DatetimeChangeEventDetail] = js.native
    
    /**
      * Emitted when the datetime has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when componentDidRender is fired.
      * @internal
      */
    var ionRender: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /* private */ def isCalendarPicker: Any = js.native
    
    /**
      * Returns if an individual date (calendar day) is enabled or disabled.
      *
      * If `true`, the day will be enabled/interactive.
      * If `false`, the day will be disabled/non-interactive.
      *
      * The function accepts an ISO 8601 date string of a given day.
      * By default, all days are enabled. Developers can use this function
      * to write custom logic to disable certain days.
      *
      * The function is called for each rendered calendar day, for the previous, current and next month.
      * Custom implementations should be optimized for performance to avoid jank.
      */
    var isDateEnabled: js.UndefOr[js.Function1[/* dateIsoString */ String, Boolean]] = js.native
    
    var isPresented: Boolean = js.native
    
    var isTimePopoverOpen: Boolean = js.native
    
    /**
      * The locale to use for `ion-datetime`. This
      * impacts month and day name formatting.
      * The `'default'` value refers to the default
      * locale set by your device.
      */
    var locale: String = js.native
    
    /**
      * The maximum datetime allowed. Value must be a date string
      * following the
      * [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime),
      * `1996-12-19`. The format does not have to be specific to an exact
      * datetime. For example, the maximum could just be the year, such as `1994`.
      * Defaults to the end of this year.
      */
    var max: js.UndefOr[String] = js.native
    
    /* protected */ def maxChanged(): Unit = js.native
    
    /* private */ var maxParts: Any = js.native
    
    /**
      * The minimum datetime allowed. Value must be a date string
      * following the
      * [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime),
      * such as `1996-12-19`. The format does not have to be specific to an exact
      * datetime. For example, the minimum could just be the year, such as `1994`.
      * Defaults to the beginning of the year, 100 years ago from today.
      */
    var min: js.UndefOr[String] = js.native
    
    /* protected */ def minChanged(): Unit = js.native
    
    /* private */ var minParts: Any = js.native
    
    /**
      * Values used to create the list of selectable minutes. By default
      * the minutes range from `0` to `59`. However, to control exactly which minutes to display,
      * the `minuteValues` input can take a number, an array of numbers, or a string of comma
      * separated numbers. For example, if the minute selections should only be every 15 minutes,
      * then this input value would be `minuteValues="0,15,30,45"`.
      */
    var minuteValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    
    /* protected */ def minuteValuesChanged(): Unit = js.native
    
    /**
      * Values used to create the list of selectable months. By default
      * the month values range from `1` to `12`. However, to control exactly which months to
      * display, the `monthValues` input can take a number, an array of numbers, or a string of
      * comma separated numbers. For example, if only summer months should be shown, then this
      * input value would be `monthValues="6,7,8"`. Note that month numbers do *not* have a
      * zero-based index, meaning January's value is `1`, and December's is `12`.
      */
    var monthValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    
    /* protected */ def monthValuesChanged(): Unit = js.native
    
    /**
      * If `true`, multiple dates can be selected at once. Only
      * applies to `presentation="date"` and `preferWheel="false"`.
      */
    var multiple: Boolean = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var nextMonth: Any = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var parsedDayValues: Any = js.native
    
    /* private */ var parsedHourValues: Any = js.native
    
    /* private */ var parsedMinuteValues: Any = js.native
    
    /* private */ var parsedMonthValues: Any = js.native
    
    /* private */ var parsedYearValues: Any = js.native
    
    /* private */ var popoverRef: Any = js.native
    
    /**
      * If `true`, a wheel picker will be rendered instead of a calendar grid
      * where possible. If `false`, a calendar grid will be rendered instead of
      * a wheel picker where possible.
      *
      * A wheel picker can be rendered instead of a grid when `presentation` is
      * one of the following values: `'date'`, `'date-time'`, or `'time-date'`.
      *
      * A wheel picker will always be rendered regardless of
      * the `preferWheel` value when `presentation` is one of the following values:
      * `'time'`, `'month'`, `'month-year'`, or `'year'`.
      */
    var preferWheel: Boolean = js.native
    
    /**
      * Which values you want to select. `'date'` will show
      * a calendar picker to select the month, day, and year. `'time'`
      * will show a time picker to select the hour, minute, and (optionally)
      * AM/PM. `'date-time'` will show the date picker first and time picker second.
      * `'time-date'` will show the time picker first and date picker second.
      */
    var presentation: DatetimePresentation = js.native
    
    /* private */ var prevMonth: Any = js.native
    
    /* private */ var prevPresentation: Any = js.native
    
    /* private */ var processMaxParts: Any = js.native
    
    /* private */ var processMinParts: Any = js.native
    
    /* private */ var processValue: Any = js.native
    
    /**
      * If `true`, the datetime appears normal but is not interactive.
      */
    var readonly: Boolean = js.native
    
    /* private */ var renderCalendar: Any = js.native
    
    /* private */ var renderCalendarBody: Any = js.native
    
    /**
      * Grid Render Methods
      */
    /* private */ var renderCalendarHeader: Any = js.native
    
    /* private */ var renderCalendarViewHeader: Any = js.native
    
    /**
      * Renders the month/year picker that is
      * displayed on the calendar grid.
      * The .datetime-year class has additional
      * styles that let us show/hide the
      * picker when the user clicks on the
      * toggle in the calendar header.
      */
    /* private */ var renderCalendarViewMonthYearPicker: Any = js.native
    
    /* private */ var renderCombinedDatePickerColumn: Any = js.native
    
    /* private */ var renderDatePickerColumns: Any = js.native
    
    /**
      * Render entry point
      * All presentation types are rendered from here.
      */
    /* private */ var renderDatetime: Any = js.native
    
    /* private */ var renderDayPeriodPickerColumn: Any = js.native
    
    /* private */ var renderDayPickerColumn: Any = js.native
    
    /**
      * Universal render methods
      * These are pieces of datetime that
      * are rendered independently of presentation.
      */
    /* private */ var renderFooter: Any = js.native
    
    /* private */ var renderHourPickerColumn: Any = js.native
    
    /* private */ var renderIndividualDatePickerColumns: Any = js.native
    
    /* private */ var renderMinutePickerColumn: Any = js.native
    
    /* private */ var renderMonth: Any = js.native
    
    /* private */ var renderMonthPickerColumn: Any = js.native
    
    /**
      * Render time picker inside of datetime.
      * Do not pass color prop to segment on
      * iOS mode. MD segment has been customized and
      * should take on the color prop, but iOS
      * should just be the default segment.
      */
    /* private */ var renderTime: Any = js.native
    
    /* private */ var renderTimeLabel: Any = js.native
    
    /* private */ var renderTimeOverlay: Any = js.native
    
    /* private */ var renderTimePickerColumns: Any = js.native
    
    /**
      * Wheel picker render methods
      */
    /* private */ var renderWheelPicker: Any = js.native
    
    /* private */ var renderWheelView: Any = js.native
    
    /* private */ var renderYearPickerColumn: Any = js.native
    
    @JSName("render")
    def render_MDatetime(): Any = js.native
    
    /**
      * Resets the internal state of the datetime but does not update the value.
      * Passing a valid ISO-8601 string will reset the state of the component to the provided date.
      * If no value is provided, the internal state will be reset to the clamped value of the min, max and today.
      */
    def reset(): js.Promise[Unit] = js.native
    def reset(startDate: String): js.Promise[Unit] = js.native
    
    /* private */ var setActiveParts: Any = js.native
    
    /* private */ var setWorkingParts: Any = js.native
    
    /**
      * If `true`, a "Clear" button will be rendered alongside
      * the default "Cancel" and "OK" buttons at the bottom of the `ion-datetime`
      * component. Developers can also use the `button` slot
      * if they want to customize these buttons. If custom
      * buttons are set in the `button` slot then the
      * default buttons will not be rendered.
      */
    var showClearButton: Boolean = js.native
    
    /**
      * If `true`, the default "Cancel" and "OK" buttons
      * will be rendered at the bottom of the `ion-datetime`
      * component. Developers can also use the `button` slot
      * if they want to customize these buttons. If custom
      * buttons are set in the `button` slot then the
      * default buttons will not be rendered.
      */
    var showDefaultButtons: Boolean = js.native
    
    /**
      * If `true`, the default "Time" label will be rendered
      * for the time selector of the `ion-datetime` component.
      * Developers can also use the `time-label` slot
      * if they want to customize this label. If a custom
      * label is set in the `time-label` slot then the
      * default label will not be rendered.
      */
    var showDefaultTimeLabel: Boolean = js.native
    
    /**
      * If `true`, a header will be shown above the calendar
      * picker. This will include both the slotted title, and
      * the selected date.
      */
    var showDefaultTitle: Boolean = js.native
    
    var showMonthAndYear: Boolean = js.native
    
    /**
      * If `cover`, the `ion-datetime` will expand to cover the full width of its container.
      * If `fixed`, the `ion-datetime` will have a fixed width.
      */
    var size: cover | fixed = js.native
    
    /**
      * A callback used to format the header text that shows how many
      * dates are selected. Only used if there are 0 or more than 1
      * selected (i.e. unused for exactly 1). By default, the header
      * text is set to "numberOfDates days".
      */
    var titleSelectedDatesFormatter: js.UndefOr[TitleSelectedDatesFormatter] = js.native
    
    /* private */ var todayParts: Any = js.native
    
    /* private */ var toggleMonthAndYearView: Any = js.native
    
    /**
      * The value of the datetime as a valid ISO 8601 datetime string.
      * Should be an array of strings if `multiple="true"`.
      */
    var value: js.UndefOr[String | js.Array[String] | Null] = js.native
    
    /**
      * Update the datetime value when the value changes
      */
    /* protected */ def valueChanged(): Unit = js.native
    
    var workingParts: DatetimeParts = js.native
    
    /**
      * Values used to create the list of selectable years. By default
      * the year values range between the `min` and `max` datetime inputs. However, to
      * control exactly which years to display, the `yearValues` input can take a number, an array
      * of numbers, or string of comma separated numbers. For example, to show upcoming and
      * recent leap years, then this input's value would be `yearValues="2024,2020,2016,2012,2008"`.
      */
    var yearValues: js.UndefOr[js.Array[Double] | Double | String] = js.native
    
    /* protected */ def yearValuesChanged(): Unit = js.native
  }
}
