package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popup
  extends StObject
     with Widget {
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
  
  @JSName("options")
  var options_Popup: PopupOptions = js.native
  
  def position(): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def toggle(): Unit = js.native
  def toggle(toggle: Boolean): Unit = js.native
  
  def visible(): Boolean = js.native
  
  var wrapper: JQuery = js.native
}
