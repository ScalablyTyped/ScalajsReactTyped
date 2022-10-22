package typingsJapgolly.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeWindows.rntypesMod.TimePickerAndroidTimeSetAction
  - typingsJapgolly.reactNativeWindows.rntypesMod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends StObject
object TimePickerAndroidOpenReturn {
  
  inline def TimePickerAndroidDismissedAction(): typingsJapgolly.reactNativeWindows.rntypesMod.TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typingsJapgolly.reactNativeWindows.rntypesMod.TimePickerAndroidDismissedAction]
  }
  
  inline def TimePickerAndroidTimeSetAction(hour: Double, minute: Double): typingsJapgolly.reactNativeWindows.rntypesMod.TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = "timeSetAction", hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeWindows.rntypesMod.TimePickerAndroidTimeSetAction]
  }
}
