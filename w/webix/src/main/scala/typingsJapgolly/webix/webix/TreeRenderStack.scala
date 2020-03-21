package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeRenderStack extends js.Object {
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
}

@JSGlobal("webix.TreeRenderStack")
@js.native
object TreeRenderStack extends TopLevel[TreeRenderStack]

