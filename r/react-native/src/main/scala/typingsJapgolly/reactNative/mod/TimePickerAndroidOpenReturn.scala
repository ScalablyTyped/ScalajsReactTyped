package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.reactNativeStrings.dismissedAction
import typingsJapgolly.reactNative.reactNativeStrings.timeSetAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.TimePickerAndroidTimeSetAction
  - typingsJapgolly.reactNative.mod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends js.Object

object TimePickerAndroidOpenReturn {
  @scala.inline
  def TimePickerAndroidTimeSetAction(action: timeSetAction, hour: Double, minute: Double): TimePickerAndroidOpenReturn = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimePickerAndroidOpenReturn]
  }
  @scala.inline
  def TimePickerAndroidDismissedAction(action: dismissedAction): TimePickerAndroidOpenReturn = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimePickerAndroidOpenReturn]
  }
}

