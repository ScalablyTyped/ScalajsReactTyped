package typingsJapgolly.webix.webix.ui

import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait query
  extends StObject
     with baseview {
  
  @JSName("$app")
  var $app: Any = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  def app(app: Any): Unit = js.native
  
  def attachEvent(`type`: queryEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: queryEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_query: queryConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getFilterFunction(): WebixCallback = js.native
  
  def getService(service: String): Any = js.native
  
  def getState(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
