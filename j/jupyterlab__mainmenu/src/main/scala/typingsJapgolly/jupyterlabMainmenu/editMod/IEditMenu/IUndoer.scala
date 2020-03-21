package typingsJapgolly.jupyterlabMainmenu.editMod.IEditMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Undo/Redo.
  */
trait IUndoer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Execute a redo command for the activity.
    */
  var redo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Execute an undo command for the activity.
    */
  var undo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
}

object IUndoer {
  @scala.inline
  def apply[T /* <: Widget */](
    tracker: IWidgetTracker[T],
    isEnabled: T => CallbackTo[Boolean] = null,
    redo: /* widget */ T => Callback = null,
    undo: /* widget */ T => Callback = null
  ): IUndoer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: T) => isEnabled(t0).runNow()))
    if (redo != null) __obj.updateDynamic("redo")(js.Any.fromFunction1((t0: /* widget */ T) => redo(t0).runNow()))
    if (undo != null) __obj.updateDynamic("undo")(js.Any.fromFunction1((t0: /* widget */ T) => undo(t0).runNow()))
    __obj.asInstanceOf[IUndoer[T]]
  }
}

