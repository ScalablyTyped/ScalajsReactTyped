package typingsJapgolly.jupyterlabMainmenu.fileMod.IFileMenu

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that has some cleanup action associated
  * with it in addition to merely closing its widget in the main area.
  */
trait ICloseAndCleaner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A label to use for the cleanup action.
    */
  var action: String
  /**
    * A label to use for the activity that is being cleaned up.
    */
  var name: String
  /**
    * A function to perform the close and cleanup action.
    */
  def closeAndCleanup(widget: T): js.Promise[Unit]
}

object ICloseAndCleaner {
  @scala.inline
  def apply[T /* <: Widget */](
    action: String,
    closeAndCleanup: T => CallbackTo[js.Promise[Unit]],
    name: String,
    tracker: IWidgetTracker[T],
    isEnabled: T => CallbackTo[Boolean] = null
  ): ICloseAndCleaner[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.updateDynamic("closeAndCleanup")(js.Any.fromFunction1((t0: T) => closeAndCleanup(t0).runNow()))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: T) => isEnabled(t0).runNow()))
    __obj.asInstanceOf[ICloseAndCleaner[T]]
  }
}

