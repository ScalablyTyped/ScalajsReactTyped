package typingsJapgolly.webix.mod.ui

import typingsJapgolly.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.pdfviewer")
@js.native
class pdfviewer ()
  extends typingsJapgolly.webix.webix.ui.baseview {
  @JSName("$numPages")
  var $numPages: Double = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  @JSName("$pageNum")
  var $pageNum: Double = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_pdfviewer: WebixCallback = js.native
  @JSName("config")
  var config_pdfviewer: pdfviewerConfig = js.native
  @JSName("$onLoad")
  def $onLoad(args: js.Any*): js.Any = js.native
  def attachEvent(`type`: pdfviewerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: pdfviewerEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clear(): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def download(): Unit = js.native
  def getPopup(): typingsJapgolly.webix.webix.ui.baseview = js.native
  def hasEvent(name: String): Boolean = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def nextPage(): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def prevPage(): Unit = js.native
  def renderPage(page: Double): Unit = js.native
  def setScale(scale: String, update: Boolean): Unit = js.native
  def setScale(scale: Double, update: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
  def zoomIn(): Unit = js.native
  def zoomOut(): Unit = js.native
}

