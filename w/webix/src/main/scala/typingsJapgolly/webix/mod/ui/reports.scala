package typingsJapgolly.webix.mod.ui

import typingsJapgolly.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.reports")
@js.native
open class reports ()
  extends StObject
     with typingsJapgolly.webix.webix.ui.baseview {
  
  @JSName("$app")
  var $app: Any = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_reports: WebixCallback = js.native
  
  def app(app: Any): Unit = js.native
  
  def attachEvent(`type`: reportsEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: reportsEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_reports: reportsConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getService(service: String): Any = js.native
  
  def getState(state: Any): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
