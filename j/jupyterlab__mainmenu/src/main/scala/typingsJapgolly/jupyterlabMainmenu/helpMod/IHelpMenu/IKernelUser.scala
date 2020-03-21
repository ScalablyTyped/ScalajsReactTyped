package typingsJapgolly.jupyterlabMainmenu.helpMod.IHelpMenu

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.IKernelConnection
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Kernel user to register itself
  * with the IHelpMenu's semantic extension points.
  */
trait IKernelUser[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A function to get the kernel for a widget.
    */
  def getKernel(widget: T): IKernelConnection | Null
}

object IKernelUser {
  @scala.inline
  def apply[T /* <: Widget */](
    getKernel: T => CallbackTo[IKernelConnection | Null],
    tracker: IWidgetTracker[T],
    isEnabled: T => CallbackTo[Boolean] = null
  ): IKernelUser[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.updateDynamic("getKernel")(js.Any.fromFunction1((t0: T) => getKernel(t0).runNow()))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: T) => isEnabled(t0).runNow()))
    __obj.asInstanceOf[IKernelUser[T]]
  }
}

