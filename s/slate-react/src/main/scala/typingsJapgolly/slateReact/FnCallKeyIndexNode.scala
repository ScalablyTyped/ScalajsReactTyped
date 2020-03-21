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
trait FnCallKeyIndexNode extends js.Object {
  def apply(key: String, index: Double, node: Block): Editor = js.native
  def apply(key: String, index: Double, node: Document): Editor = js.native
  def apply(key: String, index: Double, node: Inline): Editor = js.native
  def apply(key: String, index: Double, node: Node): Controller = js.native
  def apply(key: String, index: Double, node: Text): Editor = js.native
}

