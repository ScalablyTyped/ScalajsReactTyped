package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover
  extends StObject
     with Widget {
  
  def hide(): Unit = js.native
  
  @JSName("options")
  var options_Popover: PopoverOptions = js.native
  
  var popup: Popup = js.native
  
  def show(element: JQuery): Unit = js.native
  
  def target(): JQuery = js.native
  
  var wrapper: JQuery = js.native
}
