package typingsJapgolly.webix.mod.ui

import typingsJapgolly.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.abslayout")
@js.native
class abslayout ()
  extends typingsJapgolly.webix.webix.ui.baseview {
  @JSName("$skin")
  var $skin_Original_abslayout: WebixCallback = js.native
  @JSName("config")
  var config_abslayout: abslayoutConfig = js.native
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  def attachEvent(`type`: abslayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: abslayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def index(obj: js.Any): Double = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def reconstruct(): Unit = js.native
  def removeView(id: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
}

