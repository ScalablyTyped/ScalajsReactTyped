package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedTextBox
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_MaskedTextBox: MaskedTextBoxOptions = js.native
  
  def raw(): String = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
