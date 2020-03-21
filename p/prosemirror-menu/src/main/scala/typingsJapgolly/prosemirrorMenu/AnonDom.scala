package typingsJapgolly.prosemirrorMenu

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDom[S /* <: Schema[_, _] */] extends js.Object {
  var dom: Node
  def update(p: EditorState[S]): Boolean
}

object AnonDom {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](dom: Node, update: EditorState[S] => CallbackTo[Boolean]): AnonDom[S] = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorState.mod.EditorState[S]) => update(t0).runNow()))
    __obj.asInstanceOf[AnonDom[S]]
  }
}

