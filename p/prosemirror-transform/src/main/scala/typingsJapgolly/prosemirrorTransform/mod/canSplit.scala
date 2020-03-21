package typingsJapgolly.prosemirrorTransform.mod

import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorTransform.AnonAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "canSplit")
@js.native
object canSplit extends js.Object {
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double, typesAfter: js.Array[js.UndefOr[AnonAttrs[S] | Null]]): Boolean = js.native
}

