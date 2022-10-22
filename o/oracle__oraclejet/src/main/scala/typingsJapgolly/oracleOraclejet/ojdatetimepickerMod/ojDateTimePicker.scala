package typingsJapgolly.oracleOraclejet.ojdatetimepickerMod

import org.scalajs.dom.CustomEvent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.jet
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.keyboardEdit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.renderMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojDateTimePicker
  extends StObject
     with ojInputDateTime[ojDateTimePickerSettableProperties] {
  
  @JSName("keyboardEdit")
  var keyboardEdit_ojDateTimePicker: disabled = js.native
  
  @JSName("renderMode")
  var renderMode_ojDateTimePicker: jet = js.native
  
  def setProperties(properties: ojDateTimePickerSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
}
object ojDateTimePicker {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
