package typingsJapgolly.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.oracleOraclejet.anon.Cancel
import typingsJapgolly.oracleOraclejet.anon.FooterLayout
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timePicker
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timePickerChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputDateTime[SP /* <: ojInputDateTimeSettableProperties */]
  extends StObject
     with ojInputDate[SP] {
  
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(`type`: timePickerChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timePickerChanged(
    `type`: timePickerChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_timePicker(property: timePicker): FooterLayout = js.native
  
  def hideTimePicker(): Unit = js.native
  
  var onTimePickerChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
  
  def setProperties(properties: ojInputDateTimeSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_timePicker(property: timePicker, value: FooterLayout): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Cancel): Unit = js.native
  
  def showTimePicker(): Unit = js.native
  
  var timePicker: FooterLayout = js.native
  
  @JSName("translations")
  var translations_ojInputDateTime: Cancel = js.native
}
object ojInputDateTime {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
