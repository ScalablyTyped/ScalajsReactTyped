package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBar
  extends StObject
     with Widget {
  
  def add(command: Any): Unit = js.native
  
  def enable(command: String, enable: Boolean): Unit = js.native
  def enable(command: Element, enable: Boolean): Unit = js.native
  def enable(command: JQuery, enable: Boolean): Unit = js.native
  
  def getSelectedFromGroup(groupName: String): Unit = js.native
  
  def hide(command: String): Unit = js.native
  def hide(command: Element): Unit = js.native
  def hide(command: JQuery): Unit = js.native
  
  @JSName("options")
  var options_ToolBar: ToolBarOptions = js.native
  
  var overflowAnchor: JQuery = js.native
  
  var popup: Popup = js.native
  
  def remove(command: String): Unit = js.native
  def remove(command: Element): Unit = js.native
  def remove(command: JQuery): Unit = js.native
  
  def show(command: String): Unit = js.native
  def show(command: Element): Unit = js.native
  def show(command: JQuery): Unit = js.native
  
  def toggle(command: String, state: Boolean): Unit = js.native
  def toggle(command: Element, state: Boolean): Unit = js.native
  def toggle(command: JQuery, state: Boolean): Unit = js.native
  
  var wrapper: JQuery = js.native
}
