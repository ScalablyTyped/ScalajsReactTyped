package typingsJapgolly.prosemirrorTransform.mod

import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.NodeType
import typingsJapgolly.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "insertPoint")
@js.native
object insertPoint extends js.Object {
  def apply[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, nodeType: NodeType[S]): js.UndefOr[Double | Null] = js.native
}

