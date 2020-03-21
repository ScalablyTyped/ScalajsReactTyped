package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangeCancellable extends EditorChange {
  /** may be used to modify the change. All three arguments to update are optional, and can be left off to leave the existing value for that field intact.
    If the change came from undo/redo, `update` is undefined and the change cannot be modified. */
  var update: js.UndefOr[
    js.Function3[
      /* from */ js.UndefOr[Position], 
      /* to */ js.UndefOr[Position], 
      /* text */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  def cancel(): Unit
}

object EditorChangeCancellable {
  @scala.inline
  def apply(
    cancel: Callback,
    from: Position,
    text: js.Array[String],
    to: Position,
    origin: String = null,
    removed: js.Array[String] = null,
    update: (/* from */ js.UndefOr[Position], /* to */ js.UndefOr[Position], /* text */ js.UndefOr[js.Array[String]]) => Callback = null
  ): EditorChangeCancellable = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* from */ js.UndefOr[typingsJapgolly.codemirror.mod.Position], t1: /* to */ js.UndefOr[typingsJapgolly.codemirror.mod.Position], t2: /* text */ js.UndefOr[js.Array[java.lang.String]]) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[EditorChangeCancellable]
  }
}

