package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.Ariadescribedby
import typingsJapgolly.baseui.anon.CalendarPropsunknownadapt
import typingsJapgolly.baseui.anon.Orientation
import typingsJapgolly.baseui.anon.`1`
import typingsJapgolly.baseui.anon.`3`
import typingsJapgolly.baseui.anon.separateRangeInputsboolea
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.span
import typingsJapgolly.baseui.datepickerCalendarMod.default
import typingsJapgolly.baseui.datepickerStatefulContainerMod.InputProps
import typingsJapgolly.baseui.datepickerStatefulContainerMod.Props
import typingsJapgolly.baseui.datepickerTypesMod.CalendarProps
import typingsJapgolly.baseui.datepickerTypesMod.ContainerState
import typingsJapgolly.baseui.datepickerTypesMod.DatepickerProps
import typingsJapgolly.baseui.datepickerTypesMod.SharedStyleProps
import typingsJapgolly.baseui.datepickerTypesMod.StateReducer
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerDefaultProps
import typingsJapgolly.baseui.timepickerTypesMod.TimePickerProps
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerMod {
  
  @JSImport("baseui/datepicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/datepicker", "Calendar")
  @js.native
  open class Calendar[T] protected () extends default[T] {
    def this(props: CalendarProps[T]) = this()
  }
  /* static members */
  object Calendar {
    
    @JSImport("baseui/datepicker", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker", "Calendar.defaultProps")
    @js.native
    def defaultProps: CalendarPropsunknownadapt = js.native
    inline def defaultProps_=(x: CalendarPropsunknownadapt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object DENSITY extends Shortcut {
    
    @JSImport("baseui/datepicker", "DENSITY.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/datepicker", "DENSITY.high")
    @js.native
    val high: typingsJapgolly.baseui.baseuiStrings.high = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `DENSITY.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/datepicker", "DatePicker")
  @js.native
  open class DatePicker_[T] protected ()
    extends typingsJapgolly.baseui.datepickerDatepickerMod.default[T] {
    def this(props: DatepickerProps[T]) = this()
  }
  /* static members */
  object DatePicker_ {
    
    @JSImport("baseui/datepicker", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker", "DatePicker.defaultProps")
    @js.native
    def defaultProps: Ariadescribedby = js.native
    inline def defaultProps_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "Datepicker")
  @js.native
  open class Datepicker[T] protected ()
    extends typingsJapgolly.baseui.datepickerDatepickerMod.default[T] {
    def this(props: DatepickerProps[T]) = this()
  }
  /* static members */
  object Datepicker {
    
    @JSImport("baseui/datepicker", "Datepicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker", "Datepicker.defaultProps")
    @js.native
    def defaultProps: Ariadescribedby = js.native
    inline def defaultProps_=(x: Ariadescribedby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical'}> */
  object ORIENTATION {
    
    @JSImport("baseui/datepicker", "ORIENTATION.horizontal")
    @js.native
    val horizontal: typingsJapgolly.baseui.baseuiStrings.horizontal = js.native
    
    @JSImport("baseui/datepicker", "ORIENTATION.vertical")
    @js.native
    val vertical: typingsJapgolly.baseui.baseuiStrings.vertical = js.native
  }
  
  /* Inlined std.Readonly<{ readonly change :'change',  readonly moveUp :'moveUp',  readonly moveDown :'moveDown',  readonly moveLeft :'moveLeft',  readonly moveRight :'moveRight',  readonly mouseOver :'mouseOver',  readonly mouseLeave :'mouseLeave'}> */
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.mouseLeave")
    @js.native
    val mouseLeave: typingsJapgolly.baseui.baseuiStrings.mouseLeave = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.mouseOver")
    @js.native
    val mouseOver: typingsJapgolly.baseui.baseuiStrings.mouseOver = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveDown")
    @js.native
    val moveDown: typingsJapgolly.baseui.baseuiStrings.moveDown = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveLeft")
    @js.native
    val moveLeft: typingsJapgolly.baseui.baseuiStrings.moveLeft = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveRight")
    @js.native
    val moveRight: typingsJapgolly.baseui.baseuiStrings.moveRight = js.native
    
    @JSImport("baseui/datepicker", "STATE_CHANGE_TYPE.moveUp")
    @js.native
    val moveUp: typingsJapgolly.baseui.baseuiStrings.moveUp = js.native
  }
  
  @JSImport("baseui/datepicker", "StatefulCalendar")
  @js.native
  open class StatefulCalendar[T] ()
    extends typingsJapgolly.baseui.datepickerStatefulCalendarMod.default[T]
  object StatefulCalendar {
    
    @JSImport("baseui/datepicker", "StatefulCalendar")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "StatefulCalendar.defaultProps")
    @js.native
    def defaultProps: typingsJapgolly.baseui.datepickerStatefulCalendarMod.DatepickerProps[Any] = js.native
    inline def defaultProps_=(x: typingsJapgolly.baseui.datepickerStatefulCalendarMod.DatepickerProps[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "StatefulContainer")
  @js.native
  open class StatefulContainer[T] protected ()
    extends typingsJapgolly.baseui.datepickerStatefulContainerMod.default[T] {
    def this(props: Props[T]) = this()
  }
  object StatefulContainer {
    
    /* static member */
    /* Inlined {  stateReducer :baseui.baseui/datepicker/types.StateReducer<unknown>} & std.Partial<baseui.baseui/datepicker/stateful-container.Props<unknown>> */
    object defaultProps {
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.adapter")
      @js.native
      def adapter: js.UndefOr[DateIOAdapter[Any]] = js.native
      inline def adapter_=(x: js.UndefOr[DateIOAdapter[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adapter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* a */ InputProps[Any], Node]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* a */ InputProps[Any], Node]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[ContainerState[Any]] = js.native
      inline def initialState_=(x: js.UndefOr[ContainerState[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* a */ `3`, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* a */ `3`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.onRangeChange")
      @js.native
      def onRangeChange: js.UndefOr[js.Function1[/* a */ `1`, Any]] = js.native
      inline def onRangeChange_=(x: js.UndefOr[js.Function1[/* a */ `1`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRangeChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.range")
      @js.native
      def range: js.UndefOr[Boolean] = js.native
      inline def range_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer[Any]] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/datepicker", "StatefulDatePicker")
  @js.native
  open class StatefulDatePicker_[T] ()
    extends typingsJapgolly.baseui.datepickerStatefulDatepickerMod.default[T]
  object StatefulDatePicker_ {
    
    @JSImport("baseui/datepicker", "StatefulDatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "StatefulDatePicker.defaultProps")
    @js.native
    def defaultProps: typingsJapgolly.baseui.datepickerStatefulDatepickerMod.Props[Any] = js.native
    inline def defaultProps_=(x: typingsJapgolly.baseui.datepickerStatefulDatepickerMod.Props[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "StatefulDatepicker")
  @js.native
  open class StatefulDatepicker[T] ()
    extends typingsJapgolly.baseui.datepickerStatefulDatepickerMod.default[T]
  object StatefulDatepicker {
    
    @JSImport("baseui/datepicker", "StatefulDatepicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "StatefulDatepicker.defaultProps")
    @js.native
    def defaultProps: typingsJapgolly.baseui.datepickerStatefulDatepickerMod.Props[Any] = js.native
    inline def defaultProps_=(x: typingsJapgolly.baseui.datepickerStatefulDatepickerMod.Props[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "StyledCalendarContainer")
  @js.native
  val StyledCalendarContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledCalendarHeader")
  @js.native
  val StyledCalendarHeader: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledDay")
  @js.native
  val StyledDay: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledDayLabel")
  @js.native
  val StyledDayLabel: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledEndDate")
  @js.native
  val StyledEndDate: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledInputLabel")
  @js.native
  val StyledInputLabel: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledInputWrapper")
  @js.native
  val StyledInputWrapper: StyletronComponent[div, separateRangeInputsboolea] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonth")
  @js.native
  val StyledMonth: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthContainer")
  @js.native
  val StyledMonthContainer: StyletronComponent[div, Orientation] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthHeader")
  @js.native
  val StyledMonthHeader: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthYearSelectButton")
  @js.native
  val StyledMonthYearSelectButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledMonthYearSelectIconContainer")
  @js.native
  val StyledMonthYearSelectIconContainer: StyletronComponent[span, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledNextButton")
  @js.native
  val StyledNextButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledPrevButton")
  @js.native
  val StyledPrevButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledSelectorContainer")
  @js.native
  val StyledSelectorContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledStartDate")
  @js.native
  val StyledStartDate: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/datepicker", "StyledWeek")
  @js.native
  val StyledWeek: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "StyledWeekdayHeader")
  @js.native
  val StyledWeekdayHeader: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/datepicker", "TimePicker")
  @js.native
  open class TimePicker[T] protected ()
    extends typingsJapgolly.baseui.timepickerMod.TimePicker[T] {
    def this(props: TimePickerProps[T]) = this()
  }
  object TimePicker {
    
    @JSImport("baseui/datepicker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/datepicker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: TimePickerDefaultProps = js.native
    inline def defaultProps_=(x: TimePickerDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/datepicker", "TimezonePicker")
  @js.native
  open class TimezonePicker ()
    extends typingsJapgolly.baseui.timezonepickerMod.TimezonePicker
  
  inline def formatDate(c: js.Date, b: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatDate(c: js.Date, b: String, a: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(c.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type SharedStylePropsT = SharedStyleProps
}
