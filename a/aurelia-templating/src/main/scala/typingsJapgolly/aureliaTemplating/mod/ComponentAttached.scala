package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentAttached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic when the component is attached to the DOM (in document).
    */
  def attached(): Unit
}

object ComponentAttached {
  @scala.inline
  def apply(attached: Callback): ComponentAttached = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(attached.toJsFn)
    __obj.asInstanceOf[ComponentAttached]
  }
}

