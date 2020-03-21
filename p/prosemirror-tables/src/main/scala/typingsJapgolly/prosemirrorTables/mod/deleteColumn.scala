package typingsJapgolly.prosemirrorTables.mod

import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "deleteColumn")
@js.native
object deleteColumn extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
}

