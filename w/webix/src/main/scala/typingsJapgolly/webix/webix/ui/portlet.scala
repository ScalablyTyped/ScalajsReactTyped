package typingsJapgolly.webix.webix.ui

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait portlet
  extends StObject
     with baseview {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String = js.native
  
  def addView(view: Any): String | Double = js.native
  def addView(view: Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: portletEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: portletEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_portlet: portletConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: Any): Double = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def markDropArea(target: String, mode: String): Unit = js.native
  
  def movePortlet(target: String, mode: String): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: Any, factory: WebixCallback): Unit = js.native
  
  def serialize(): Any = js.native
  def serialize(serializer: WebixCallback): Any = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
