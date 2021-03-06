package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Block
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Document
import typingsJapgolly.slate.mod.Editor
import typingsJapgolly.slate.mod.Inline
import typingsJapgolly.slate.mod.Node
import typingsJapgolly.slate.mod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallNode extends js.Object {
  def apply(node: Block): Editor = js.native
  def apply(node: Document): Editor = js.native
  def apply(node: Inline): Editor = js.native
  def apply(node: Node): Controller = js.native
  def apply(node: Text): Editor = js.native
}

