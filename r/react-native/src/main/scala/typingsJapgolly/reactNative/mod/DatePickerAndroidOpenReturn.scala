package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.reactNativeStrings.dateSetAction
import typingsJapgolly.reactNative.reactNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.DatePickerAndroidDateSetAction
  - typingsJapgolly.reactNative.mod.DatePickerAndroidDismissedAction
*/
trait DatePickerAndroidOpenReturn extends js.Object

object DatePickerAndroidOpenReturn {
  @scala.inline
  def DatePickerAndroidDateSetAction(action: dateSetAction, day: Double, month: Double, year: Double): DatePickerAndroidOpenReturn = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePickerAndroidOpenReturn]
  }
  @scala.inline
  def DatePickerAndroidDismissedAction(action: dismissedAction): DatePickerAndroidOpenReturn = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePickerAndroidOpenReturn]
  }
}

