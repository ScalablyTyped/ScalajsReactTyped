package typingsJapgolly.prosemirrorMenu

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.DocumentFragment
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: js.UndefOr[DocumentFragment | Null] = js.undefined
  def update(p: EditorState[S]): Boolean
}

object AnonDomUpdate {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](update: EditorState[S] => CallbackTo[Boolean], dom: DocumentFragment = null): AnonDomUpdate[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorState.mod.EditorState[S]) => update(t0).runNow()))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomUpdate[S]]
  }
}

