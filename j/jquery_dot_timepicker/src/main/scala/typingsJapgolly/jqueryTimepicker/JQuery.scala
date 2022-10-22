package typingsJapgolly.jqueryTimepicker

import typingsJapgolly.jqueryTimepicker.jqueryTimepickerStrings.getHour
import typingsJapgolly.jqueryTimepicker.jqueryTimepickerStrings.getMinute
import typingsJapgolly.jqueryTimepicker.jqueryTimepickerStrings.getTime
import typingsJapgolly.jqueryTimepicker.jqueryTimepickerStrings.getTimeAsDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def timepicker(): JQuery = js.native
  def timepicker(methodName: String): Any = js.native
  def timepicker(methodName: String, methodParameter: Any): Any = js.native
  def timepicker(optionLiteral: String, optionName: String): Any = js.native
  def timepicker(options: TimePickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_getHour(methodName: getHour): Double = js.native
  @JSName("timepicker")
  def timepicker_getMinute(methodName: getMinute): Double = js.native
  @JSName("timepicker")
  def timepicker_getTime(methodName: getTime): String = js.native
  @JSName("timepicker")
  def timepicker_getTimeAsDate(methodName: getTimeAsDate): js.Date = js.native
}
