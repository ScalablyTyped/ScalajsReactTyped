package typingsJapgolly.webix.webix.ui

import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hint
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  def attachEvent(`type`: hintEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: hintEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_hint: hintConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def end(): Unit = js.native
  
  def getCurrentStep(): Double = js.native
  
  def getSteps(): js.Array[Any] = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def resume(): Unit = js.native
  def resume(stepNumber: Double): Unit = js.native
  
  def setSteps(steps: js.Array[Any]): Unit = js.native
  
  def start(): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
