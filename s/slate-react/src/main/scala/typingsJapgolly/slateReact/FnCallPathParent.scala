package typingsJapgolly.slateReact

import typingsJapgolly.immutable.Immutable.List
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
trait FnCallPathParent extends js.Object {
  def apply(path: List[Double], parent: Block): Editor = js.native
  def apply(path: List[Double], parent: Document): Editor = js.native
  def apply(path: List[Double], parent: Inline): Editor = js.native
  def apply(path: List[Double], parent: Node): Controller = js.native
  def apply(path: List[Double], parent: Text): Editor = js.native
}

