package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.mod.DatePickerAndroidDateSetAction
  - typingsJapgolly.reactNative.mod.DatePickerAndroidDismissedAction
*/
trait DatePickerAndroidOpenReturn extends StObject
object DatePickerAndroidOpenReturn {
  
  inline def DatePickerAndroidDateSetAction(day: Double, month: Double, year: Double): typingsJapgolly.reactNative.mod.DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = "dateSetAction", day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.DatePickerAndroidDateSetAction]
  }
  
  inline def DatePickerAndroidDismissedAction(): typingsJapgolly.reactNative.mod.DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typingsJapgolly.reactNative.mod.DatePickerAndroidDismissedAction]
  }
}
