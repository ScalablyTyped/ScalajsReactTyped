package typingsJapgolly.makeupFloatingLabel.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingLabel extends js.Object {
  def refresh(): Unit
}

object FloatingLabel {
  @scala.inline
  def apply(refresh: Callback): FloatingLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[FloatingLabel]
  }
}

