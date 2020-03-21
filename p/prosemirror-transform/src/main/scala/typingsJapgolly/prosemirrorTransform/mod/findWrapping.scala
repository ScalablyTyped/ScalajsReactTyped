package typingsJapgolly.prosemirrorTransform.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prosemirrorModel.mod.NodeRange
import typingsJapgolly.prosemirrorModel.mod.NodeType
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorTransform.AnonAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "findWrapping")
@js.native
object findWrapping extends js.Object {
  def apply[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S]): js.UndefOr[js.Array[AnonAttrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.UndefOr[js.Array[AnonAttrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: StringDictionary[js.Any],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[AnonAttrs[S]] | Null] = js.native
}

