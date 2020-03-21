package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonDate
import typingsJapgolly.aliApp.aliAppNumbers.`11`
import typingsJapgolly.aliApp.aliAppStrings.HHColonmm
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM`
import typingsJapgolly.aliApp.aliAppStrings.yyyy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择日期 https://docs.alipay.com/mini/api/ui-date
trait DatePickerOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: String
  /** 最大日期时间 */
  var endDate: String
  /**
  		 * 返回的日期格式，
  		 * 1. yyyy-MM-dd（默认）
  		 * 2. HH:mm
  		 * 3. yyyy-MM-dd HH:mm
  		 * 4. yyyy-MM （最低基础库：1.1.1, 可用 canIUse('datePicker.object.format.yyyy-MM') 判断）
  		 * 5. yyyy （最低基础库：1.1.1,可用 canIUse('datePicker.object.format.yyyy') 判断）
  		 */
  var format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy
  /** 最小日期时间 */
  var startDate: String
  /** 11 用户取消操作 */
  @JSName("fail")
  def fail_11(error: `11`): Unit
  @JSName("success")
  def success_MDatePickerOptions(result: AnonDate): Unit
}

object DatePickerOptions {
  @scala.inline
  def apply(
    currentDate: String,
    endDate: String,
    fail: `11` => Callback,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy,
    startDate: String,
    success: AnonDate => Callback,
    complete: /* res */ js.Any => Callback = null
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.aliAppNumbers.`11`) => fail(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonDate) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    __obj.asInstanceOf[DatePickerOptions]
  }
}

