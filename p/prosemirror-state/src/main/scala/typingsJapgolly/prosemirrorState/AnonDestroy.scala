package typingsJapgolly.prosemirrorState

import japgolly.scalajs.react.Callback
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy[S /* <: Schema[_, _] */] extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var update: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
  ] = js.undefined
}

object AnonDestroy {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    destroy: js.UndefOr[Callback] = js.undefined,
    update: (/* view */ EditorView[S], /* prevState */ EditorState[S]) => Callback = null
  ): AnonDestroy[S] = {
    val __obj = js.Dynamic.literal()
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.prosemirrorView.mod.EditorView[S], t1: /* prevState */ typingsJapgolly.prosemirrorState.mod.EditorState[S]) => update(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDestroy[S]]
  }
}

