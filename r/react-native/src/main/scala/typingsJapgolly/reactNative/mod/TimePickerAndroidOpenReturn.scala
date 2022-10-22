package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.TimePickerAndroidTimeSetAction
  - typingsJapgolly.reactNative.mod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends StObject
object TimePickerAndroidOpenReturn {
  
  inline def TimePickerAndroidDismissedAction(): typingsJapgolly.reactNative.mod.TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.TimePickerAndroidDismissedAction]
  }
  
  inline def TimePickerAndroidTimeSetAction(hour: Double, minute: Double): typingsJapgolly.reactNative.mod.TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = "timeSetAction", hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.TimePickerAndroidTimeSetAction]
  }
}
