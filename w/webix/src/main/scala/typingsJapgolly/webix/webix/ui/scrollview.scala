package typingsJapgolly.webix.webix.ui

import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait scrollview
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_scrollview: scrollviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): Any = js.native
  
  def getScrollState(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def showView(id: String): Unit = js.native
  def showView(id: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
