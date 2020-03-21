package typingsJapgolly.jupyterlabStatusbar.kernelStatusMod.KernelStatus

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a KernelStatus object.
  */
trait IOptions extends js.Object {
  /**
    * A click handler for the item. By default
    * we launch a kernel selection dialog.
    */
  def onClick(): Unit
}

object IOptions {
  @scala.inline
  def apply(onClick: Callback): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[IOptions]
  }
}

