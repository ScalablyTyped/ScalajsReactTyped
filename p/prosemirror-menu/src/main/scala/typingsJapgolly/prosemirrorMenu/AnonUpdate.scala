package typingsJapgolly.prosemirrorMenu

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: Node
  def update(p: EditorState[S]): Unit
}

object AnonUpdate {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](dom: Node, update: EditorState[S] => Callback): AnonUpdate[S] = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorState.mod.EditorState[S]) => update(t0).runNow()))
    __obj.asInstanceOf[AnonUpdate[S]]
  }
}

