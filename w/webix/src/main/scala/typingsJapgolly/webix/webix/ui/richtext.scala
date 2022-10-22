package typingsJapgolly.webix.webix.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait richtext
  extends StObject
     with baseview {
  
  @JSName("$$")
  var DollarDollar: Any = js.native
  
  def attachEvent(`type`: richtextEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: richtextEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_richtext: richtextConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInputNode(): HTMLElement = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def ui(view: Any): baseview = js.native
  
  def unblockEvent(): Unit = js.native
}
