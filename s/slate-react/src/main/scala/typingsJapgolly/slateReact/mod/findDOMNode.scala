package typingsJapgolly.slateReact.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.slate.mod.Node
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findDOMNode")
@js.native
object findDOMNode extends js.Object {
  def apply(node: String): Element = js.native
  def apply(node: String, win: Window_): Element = js.native
  def apply(node: Node): Element = js.native
  def apply(node: Node, win: Window_): Element = js.native
}

