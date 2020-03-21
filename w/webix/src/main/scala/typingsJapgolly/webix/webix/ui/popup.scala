package typingsJapgolly.webix.webix.ui

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.popup")
@js.native
class popup () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_popup: popupConfig = js.native
  def attachEvent(`type`: popupEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: popupEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getBody(): js.Any = js.native
  def getHead(): js.Any = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: js.Any): Unit = js.native
  def show(node: HTMLElement, position: js.Any, point: String): Unit = js.native
  def unblockEvent(): Unit = js.native
}

