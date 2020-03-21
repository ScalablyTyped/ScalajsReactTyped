package typingsJapgolly.webix.mod.ui

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseview extends js.Object {
  @JSName("$height")
  var $height: Double = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  @JSName("$view")
  var $view: HTMLElement = js.native
  @JSName("$width")
  var $width: Double = js.native
  var config: baseviewConfig = js.native
  var name: String = js.native
  @JSName("$getSize")
  def $getSize(): js.Array[_] = js.native
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  @JSName("$skin")
  def $skin(args: js.Any*): js.Any = js.native
  def adjust(): Unit = js.native
  def bind(target: js.Any): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  def define(property: String, value: js.Any): Unit = js.native
  def destructor(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getChildViews(): js.Array[_] = js.native
  def getFormView(): typingsJapgolly.webix.webix.ui.baseview = js.native
  def getNode(): js.Any = js.native
  def getParentView(): js.Any = js.native
  def getTopParentView(): typingsJapgolly.webix.webix.ui.baseview = js.native
  def hide(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def queryView(config: js.Any): js.Any = js.native
  def queryView(config: js.Any, mode: String): js.Any = js.native
  def resize(): Unit = js.native
  def show(): Unit = js.native
  def show(force: Boolean): Unit = js.native
  def show(force: Boolean, animation: Boolean): Unit = js.native
  def unbind(): Unit = js.native
}

