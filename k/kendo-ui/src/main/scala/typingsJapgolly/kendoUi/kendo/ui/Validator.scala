package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator
  extends StObject
     with Widget {
  
  def errors(): Any = js.native
  
  def hideMessages(): Unit = js.native
  
  def hideValidationSummary(): Unit = js.native
  
  @JSName("options")
  var options_Validator: ValidatorOptions = js.native
  
  def reset(): Unit = js.native
  
  def showValidationSummary(): Unit = js.native
  
  def validate(): Boolean = js.native
  
  def validateInput(input: Element): Boolean = js.native
  def validateInput(input: JQuery): Boolean = js.native
  
  var wrapper: JQuery = js.native
}
