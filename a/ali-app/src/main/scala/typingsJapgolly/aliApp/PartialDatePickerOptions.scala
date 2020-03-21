package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppNumbers.`11`
import typingsJapgolly.aliApp.aliAppStrings.HHColonmm
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM`
import typingsJapgolly.aliApp.aliAppStrings.yyyy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.DatePickerOptions> */
trait PartialDatePickerOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var currentDate: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function1[`11`, Unit]] = js.undefined
  var format: js.UndefOr[`yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ AnonDate, Unit]] = js.undefined
}

object PartialDatePickerOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    currentDate: String = null,
    endDate: String = null,
    fail: `11` => Callback = null,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy = null,
    startDate: String = null,
    success: /* result */ AnonDate => Callback = null
  ): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.aliAppNumbers.`11`) => fail(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.aliApp.AnonDate) => success(t0).runNow()))
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
}

