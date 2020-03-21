package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderStack extends js.Object {
  var `type`: StringDictionary[js.Any] = js.native
  var types: StringDictionary[js.Any] = js.native
  def customize(obj: js.Any): Unit = js.native
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  def locate(e: Event_): String | Double = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
}

@JSGlobal("webix.RenderStack")
@js.native
object RenderStack extends TopLevel[RenderStack]

