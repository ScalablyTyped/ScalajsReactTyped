package typingsJapgolly.reactDates.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.moment.mod.MomentFormatSpecification
import typingsJapgolly.moment.mod.MomentInput
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDates.anon.AnchorDirection
import typingsJapgolly.reactDates.anon.AppendToBody
import typingsJapgolly.reactDates.anon.CalendarInfoPosition
import typingsJapgolly.reactDates.anon.DayAriaLabelFormat
import typingsJapgolly.reactDates.anon.DaysViolatingMinNightsCanBeClicked
import typingsJapgolly.reactDates.anon.FirstVisibleMonthIndex
import typingsJapgolly.reactDates.anon.InitialVisibleMonth
import typingsJapgolly.reactDates.anon.OnGetNextScrollableMonths
import typingsJapgolly.reactDates.anon.OnGetPrevScrollableMonths
import typingsJapgolly.reactDates.anon.PickCalendarDayShapedaySi
import typingsJapgolly.reactDates.anon.PickCalendarMonthGridShap
import typingsJapgolly.reactDates.anon.PickCalendarMonthShapeena
import typingsJapgolly.reactDates.anon.PickDayPickerShaperenderW
import typingsJapgolly.reactDates.anon.PickDayPickerShaperenderWCalendarInfoPosition
import typingsJapgolly.reactDates.mod.^
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CalendarDay: ComponentClassP[CalendarDayShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarDay").asInstanceOf[ComponentClassP[CalendarDayShape & js.Object]]
type CalendarDay = ComponentClassP[CalendarDayShape & js.Object]

inline def CalendarMonth: ComponentClassP[CalendarMonthShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarMonth").asInstanceOf[ComponentClassP[CalendarMonthShape & js.Object]]
type CalendarMonth = ComponentClassP[CalendarMonthShape & js.Object]

inline def CalendarMonthGrid: ComponentClassP[CalendarMonthGridShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("CalendarMonthGrid").asInstanceOf[ComponentClassP[CalendarMonthGridShape & js.Object]]
type CalendarMonthGrid = ComponentClassP[CalendarMonthGridShape & js.Object]

inline def DateRangePicker: ComponentClassP[typingsJapgolly.reactDates.mod.DateRangePickerShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePicker").asInstanceOf[ComponentClassP[typingsJapgolly.reactDates.mod.DateRangePickerShape & js.Object]]
type DateRangePicker = ComponentClassP[typingsJapgolly.reactDates.mod.DateRangePickerShape & js.Object]

inline def DateRangePickerInput: ComponentClassP[DateRangePickerInputShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePickerInput").asInstanceOf[ComponentClassP[DateRangePickerInputShape & js.Object]]
type DateRangePickerInput = ComponentClassP[DateRangePickerInputShape & js.Object]

inline def DateRangePickerInputController: ComponentClassP[DateRangePickerInputControllerShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePickerInputController").asInstanceOf[ComponentClassP[DateRangePickerInputControllerShape & js.Object]]
type DateRangePickerInputController = ComponentClassP[DateRangePickerInputControllerShape & js.Object]

inline def DateRangePickerShape: typingsJapgolly.reactDates.mod.DateRangePickerShape = ^.asInstanceOf[js.Dynamic].selectDynamic("DateRangePickerShape").asInstanceOf[typingsJapgolly.reactDates.mod.DateRangePickerShape]
type DateRangePickerShape = RenderMonthProps & AnchorDirection

inline def DayPicker: ComponentClassP[DayPickerShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPicker").asInstanceOf[ComponentClassP[DayPickerShape & js.Object]]
type DayPicker = ComponentClassP[DayPickerShape & js.Object]

inline def DayPickerRangeController: ComponentClassP[DayPickerRangeControllerShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPickerRangeController").asInstanceOf[ComponentClassP[DayPickerRangeControllerShape & js.Object]]
type DayPickerRangeController = ComponentClassP[DayPickerRangeControllerShape & js.Object]

inline def DayPickerSingleDateController: ComponentClassP[DayPickerSingleDateControllerShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("DayPickerSingleDateController").asInstanceOf[ComponentClassP[DayPickerSingleDateControllerShape & js.Object]]
type DayPickerSingleDateController = ComponentClassP[DayPickerSingleDateControllerShape & js.Object]

inline def SingleDatePicker: ComponentClassP[typingsJapgolly.reactDates.mod.SingleDatePickerShape & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleDatePicker").asInstanceOf[ComponentClassP[typingsJapgolly.reactDates.mod.SingleDatePickerShape & js.Object]]
type SingleDatePicker = ComponentClassP[typingsJapgolly.reactDates.mod.SingleDatePickerShape & js.Object]

inline def SingleDatePickerInput: FC[SingleDatePickerInputShape] = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleDatePickerInput").asInstanceOf[FC[SingleDatePickerInputShape]]
type SingleDatePickerInput = FC[SingleDatePickerInputShape]

inline def SingleDatePickerShape: typingsJapgolly.reactDates.mod.SingleDatePickerShape = ^.asInstanceOf[js.Dynamic].selectDynamic("SingleDatePickerShape").asInstanceOf[typingsJapgolly.reactDates.mod.SingleDatePickerShape]
type SingleDatePickerShape = RenderMonthProps & AppendToBody

inline def isInclusivelyAfterDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInclusivelyAfterDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isInclusivelyBeforeDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInclusivelyBeforeDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isNextDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNextDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isSameDay(a: Moment, b: Moment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def toISODateString(date: MomentInput): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toISODateString")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
inline def toISODateString(date: MomentInput, currentFormat: MomentFormatSpecification): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toISODateString")(date.asInstanceOf[js.Any], currentFormat.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def toLocalizedDateString(date: MomentInput): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocalizedDateString")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
inline def toLocalizedDateString(date: MomentInput, currentFormat: MomentFormatSpecification): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toLocalizedDateString")(date.asInstanceOf[js.Any], currentFormat.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def toMomentObject(dateString: MomentInput): Moment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toMomentObject")(dateString.asInstanceOf[js.Any]).asInstanceOf[Moment | Null]
inline def toMomentObject(dateString: MomentInput, customFormat: MomentFormatSpecification): Moment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toMomentObject")(dateString.asInstanceOf[js.Any], customFormat.asInstanceOf[js.Any])).asInstanceOf[Moment | Null]

type CalendarMonthGridShape = RenderMonthProps & PickCalendarMonthShapeena & FirstVisibleMonthIndex

type CalendarMonthShape = RenderMonthProps & PickCalendarDayShapedaySi & DayAriaLabelFormat

type DayPickerRangeControllerShape = RenderMonthProps & PickDayPickerShaperenderW & DaysViolatingMinNightsCanBeClicked

type DayPickerShape = (OnGetNextScrollableMonths & RenderMonthProps & PickCalendarMonthGridShap & CalendarInfoPosition) | (OnGetPrevScrollableMonths & RenderMonthProps & PickCalendarMonthGridShap & CalendarInfoPosition)

type DayPickerSingleDateControllerShape = RenderMonthProps & PickDayPickerShaperenderWCalendarInfoPosition & InitialVisibleMonth

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsJapgolly.reactDates.reactDatesStrings.startDate
  - typingsJapgolly.reactDates.reactDatesStrings.endDate
*/
type DisabledShape = _DisabledShape | Boolean

type ModifiersShape = Set[String]
