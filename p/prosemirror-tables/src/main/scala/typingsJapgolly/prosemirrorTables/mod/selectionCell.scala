package typingsJapgolly.prosemirrorTables.mod

import typingsJapgolly.prosemirrorModel.mod.ResolvedPos
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "selectionCell")
@js.native
object selectionCell extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = js.native
}

