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
  * Interface for an activity that uses Go to Line.
  */
trait IGoToLiner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Execute a go to line command for the activity.
    */
  var goToLine: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
}

object IGoToLiner {
  @scala.inline
  def apply[T /* <: Widget */](
    tracker: IWidgetTracker[T],
    goToLine: /* widget */ T => Callback = null,
    isEnabled: T => CallbackTo[Boolean] = null
  ): IGoToLiner[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (goToLine != null) __obj.updateDynamic("goToLine")(js.Any.fromFunction1((t0: /* widget */ T) => goToLine(t0).runNow()))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: T) => isEnabled(t0).runNow()))
    __obj.asInstanceOf[IGoToLiner[T]]
  }
}

