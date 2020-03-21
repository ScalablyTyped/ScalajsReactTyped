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
trait FnCallKeyParent extends js.Object {
  def apply(key: String, parent: Block): Editor = js.native
  def apply(key: String, parent: Document): Editor = js.native
  def apply(key: String, parent: Inline): Editor = js.native
  def apply(key: String, parent: Node): Controller = js.native
  def apply(key: String, parent: Text): Editor = js.native
}

