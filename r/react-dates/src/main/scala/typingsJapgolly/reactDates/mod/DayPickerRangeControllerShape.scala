package typingsJapgolly.reactDates.mod

import typingsJapgolly.reactDates.AnonEndDate
import typingsJapgolly.reactDates.AnonStartDate
import typingsJapgolly.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// components/DayPickerRangeController.jsx
@js.native
trait DayPickerRangeControllerShape extends DayPickerShape {
  var disabled: js.UndefOr[DisabledShape] = js.native
  var endDate: momentObj | Null = js.native
  var endDateOffset: js.UndefOr[js.Function1[/* day */ js.Any, _]] = js.native
  var focusedInput: FocusedInputShape = js.native
  var isDayBlocked: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isDayHighlighted: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var isOutsideRange: js.UndefOr[js.Function1[/* day */ js.Any, Boolean]] = js.native
  var keepOpenOnDateSelect: js.UndefOr[Boolean] = js.native
  var minimumNights: js.UndefOr[Double] = js.native
  var onClose: js.UndefOr[js.Function1[/* final */ AnonStartDate, Unit]] = js.native
  // REQUIRED props
  var startDate: momentObj | Null = js.native
  var startDateOffset: js.UndefOr[js.Function1[/* day */ js.Any, _]] = js.native
  def onDatesChange(arg: AnonEndDate): Unit = js.native
  def onFocusChange(): Unit = js.native
  def onFocusChange(arg: FocusedInputShape): Unit = js.native
}

