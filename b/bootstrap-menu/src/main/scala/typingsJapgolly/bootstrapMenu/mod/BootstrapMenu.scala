package typingsJapgolly.bootstrapMenu.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMenu extends js.Object {
  /**
    * Close the context menu
    */
  def close(): Unit
  /**
    * Close the menu and remove every event listeners
    */
  def destroy(): Unit
}

object BootstrapMenu {
  @scala.inline
  def apply(close: Callback, destroy: Callback): BootstrapMenu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[BootstrapMenu]
  }
}

