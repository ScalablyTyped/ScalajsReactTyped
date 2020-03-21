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
trait FnCallKeyNode extends js.Object {
  def apply(key: String, node: Block): Editor = js.native
  def apply(key: String, node: Document): Editor = js.native
  def apply(key: String, node: Inline): Editor = js.native
  def apply(key: String, node: Node): Controller = js.native
  def apply(key: String, node: Text): Editor = js.native
}

