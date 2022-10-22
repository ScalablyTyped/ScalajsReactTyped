package typingsJapgolly.webix.webix.ui

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait multitext
  extends StObject
     with baseview {
  
  @JSName("$allowsClear")
  var $allowsClear: Boolean = js.native
  
  @JSName("$compareValue")
  def $compareValue(args: Any*): Any = js.native
  @JSName("$compareValue")
  var $compareValue_Original: WebixCallback = js.native
  
  @JSName("$cssName")
  var $cssName: String = js.native
  
  @JSName("$getValue")
  def $getValue(): String = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$render")
  def $render(args: Any*): Any = js.native
  
  @JSName("$renderIcon")
  def $renderIcon(args: Any*): Any = js.native
  @JSName("$renderIcon")
  var $renderIcon_Original: WebixCallback = js.native
  
  @JSName("$renderInput")
  def $renderInput(obj: Any, html: String, id: String): String = js.native
  @JSName("$renderInput")
  def $renderInput(obj: Any, html: String, id: Double): String = js.native
  
  @JSName("$renderLabel")
  def $renderLabel(config: Any, id: String): String = js.native
  @JSName("$renderLabel")
  def $renderLabel(config: Any, id: Double): String = js.native
  
  @JSName("$render")
  var $render_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def addSection(): String | Double = js.native
  def addSection(text: String): String | Double = js.native
  
  def attachEvent(`type`: multitextEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: multitextEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def blur(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_multitext: multitextConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInputNode(): HTMLElement = js.native
  
  def getValue(): String = js.native
  
  def getValueHere(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def on_click(args: Any*): Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  def refresh(): Unit = js.native
  
  def removeSection(): Unit = js.native
  def removeSection(id: String): Unit = js.native
  def removeSection(id: Double): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def setBottomText(text: String): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def setValueHere(value: String): Unit = js.native
  def setValueHere(value: Double): Unit = js.native
  
  def sync(source: Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var touchable: Boolean = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
}
