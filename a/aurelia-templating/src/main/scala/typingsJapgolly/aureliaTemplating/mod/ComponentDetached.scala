package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDetached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
    */
  def detached(): Unit
}

object ComponentDetached {
  @scala.inline
  def apply(detached: Callback): ComponentDetached = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detached")(detached.toJsFn)
    __obj.asInstanceOf[ComponentDetached]
  }
}

