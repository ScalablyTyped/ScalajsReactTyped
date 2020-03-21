package typingsJapgolly.reactDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // COMPONENTS
  //
  // components/DateRangePicker.js
  type DateRangePicker = typingsJapgolly.react.mod.ClassicComponentClass[typingsJapgolly.reactDates.mod.DateRangePickerShape]
  type DayPickerRangeController = typingsJapgolly.react.mod.ClassicComponentClass[typingsJapgolly.reactDates.mod.DayPickerRangeControllerShape]
  type DayPickerSingleDateController = typingsJapgolly.react.mod.ClassicComponentClass[typingsJapgolly.reactDates.mod.DayPickerSingleDateControllerShape]
  // shapes/DisabledShape.js
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.reactDates.reactDatesStrings.startDate
    - typingsJapgolly.reactDates.reactDatesStrings.endDate
  */
  type DisabledShape = typingsJapgolly.reactDates.mod._DisabledShape | scala.Boolean
  // components/SingleDatePicker.js
  type SingleDatePicker = typingsJapgolly.react.mod.ClassicComponentClass[typingsJapgolly.reactDates.mod.SingleDatePickerShape]
}
