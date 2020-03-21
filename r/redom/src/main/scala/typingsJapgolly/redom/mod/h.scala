package typingsJapgolly.redom.mod

import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "h")
@js.native
object h extends js.Object {
  def apply(query: String, args: RedomQueryArgument*): HTMLElementOfRedomQuery[String] = js.native
  def apply(query: RedomComponent, args: RedomQueryArgument*): HTMLElementOfRedomQuery[RedomComponent] = js.native
  def apply(query: Node, args: RedomQueryArgument*): HTMLElementOfRedomQuery[org.scalajs.dom.raw.Node] = js.native
}

