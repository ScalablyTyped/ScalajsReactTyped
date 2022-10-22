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
trait ojDatePicker
  extends StObject
     with ojInputDate[ojDatePickerSettableProperties] {
  
  @JSName("keyboardEdit")
  var keyboardEdit_ojDatePicker: disabled = js.native
  
  @JSName("renderMode")
  var renderMode_ojDatePicker: jet = js.native
  
  def setProperties(properties: ojDatePickerSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: keyboardEdit, value: disabled): Unit = js.native
  def setProperty(property: renderMode, value: jet): Unit = js.native
}
object ojDatePicker {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
