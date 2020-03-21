package typingsJapgolly.prosemirrorState

import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState[S /* <: Schema[_, _] */] extends js.Object {
  var state: EditorState[S]
  var transactions: js.Array[Transaction[S]]
}

object AnonState {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], transactions: js.Array[Transaction[S]]): AnonState[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonState[S]]
  }
}

