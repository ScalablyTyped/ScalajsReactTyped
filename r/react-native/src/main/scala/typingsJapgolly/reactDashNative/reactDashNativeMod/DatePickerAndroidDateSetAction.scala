package typingsJapgolly.reactDashNative.reactDashNativeMod

import typingsJapgolly.reactDashNative.reactDashNativeStrings.dateSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAndroidDateSetAction extends DatePickerAndroidOpenReturn {
  var action: dateSetAction
  var day: Double
  var month: Double
  var year: Double
}

object DatePickerAndroidDateSetAction {
  @scala.inline
  def apply(action: dateSetAction, day: Double, month: Double, year: Double): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePickerAndroidDateSetAction]
  }
}

