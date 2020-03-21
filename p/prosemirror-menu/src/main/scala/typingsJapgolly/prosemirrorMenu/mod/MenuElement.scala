package typingsJapgolly.prosemirrorMenu.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prosemirrorMenu.AnonDom
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuElement[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Render the element for display in the menu. Must return a DOM
    * element and a function that can be used to update the element to
    * a new state. The `update` function will return false if the
    * update hid the entire element.
    */
  def render(pm: EditorView[S]): AnonDom[S]
}

object MenuElement {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](render: EditorView[S] => CallbackTo[AnonDom[S]]): MenuElement[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.prosemirrorView.mod.EditorView[S]) => render(t0).runNow()))
    __obj.asInstanceOf[MenuElement[S]]
  }
}

