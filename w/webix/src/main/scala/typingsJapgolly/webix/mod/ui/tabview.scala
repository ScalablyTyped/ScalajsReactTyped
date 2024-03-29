package typingsJapgolly.webix.mod.ui

import typingsJapgolly.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.tabview")
@js.native
open class tabview ()
  extends StObject
     with typingsJapgolly.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_tabview: WebixCallback = js.native
  
  def addView(obj: Any): Unit = js.native
  
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_tabview: tabviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getMultiview(): Any = js.native
  
  def getTabbar(): Any = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def removeView(id: Any): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
