package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentUnbind extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic after the component is detached and unbound.
    */
  def unbind(): Unit
}

object ComponentUnbind {
  @scala.inline
  def apply(unbind: Callback): ComponentUnbind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unbind")(unbind.toJsFn)
    __obj.asInstanceOf[ComponentUnbind]
  }
}

