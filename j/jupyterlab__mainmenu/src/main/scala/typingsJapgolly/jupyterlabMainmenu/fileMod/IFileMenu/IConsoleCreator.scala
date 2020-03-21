package typingsJapgolly.jupyterlabMainmenu.fileMod.IFileMenu

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a command to create a console for an activity.
  */
trait IConsoleCreator[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A label to use for the activity for which a console is being created.
    */
  var name: String
  /**
    * The function to create the console.
    */
  def createConsole(widget: T): js.Promise[Unit]
}

object IConsoleCreator {
  @scala.inline
  def apply[T /* <: Widget */](
    createConsole: T => CallbackTo[js.Promise[Unit]],
    name: String,
    tracker: IWidgetTracker[T],
    isEnabled: T => CallbackTo[Boolean] = null
  ): IConsoleCreator[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    __obj.updateDynamic("createConsole")(js.Any.fromFunction1((t0: T) => createConsole(t0).runNow()))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: T) => isEnabled(t0).runNow()))
    __obj.asInstanceOf[IConsoleCreator[T]]
  }
}

