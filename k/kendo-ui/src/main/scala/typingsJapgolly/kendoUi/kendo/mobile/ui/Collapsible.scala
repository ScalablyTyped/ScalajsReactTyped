package typingsJapgolly.kendoUi.kendo.mobile.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapsible
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Widget {
  
  def collapse(instant: Boolean): Unit = js.native
  
  def expand(): Unit = js.native
  def expand(instant: Boolean): Unit = js.native
  
  @JSName("options")
  var options_Collapsible: CollapsibleOptions = js.native
  
  def toggle(): Unit = js.native
  def toggle(instant: Boolean): Unit = js.native
  
  var wrapper: JQuery = js.native
}
