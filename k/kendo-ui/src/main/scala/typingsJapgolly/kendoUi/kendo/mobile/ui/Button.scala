package typingsJapgolly.kendoUi.kendo.mobile.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Widget {
  
  def badge(value: String): String = js.native
  def badge(value: Boolean): String = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  
  var wrapper: JQuery = js.native
}
