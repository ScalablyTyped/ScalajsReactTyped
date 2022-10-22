package typingsJapgolly.webix.webix

import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomScroll extends StObject {
  
  def enable(html_node: HTMLElement): Unit = js.native
  def enable(html_node: baseview): Unit = js.native
  
  def init(): Unit = js.native
  
  def resize(): Unit = js.native
  
  var scrollStep: Double = js.native
}
