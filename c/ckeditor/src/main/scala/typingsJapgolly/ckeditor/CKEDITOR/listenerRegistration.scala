package typingsJapgolly.ckeditor.CKEDITOR

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait listenerRegistration extends js.Object {
  def removeListener(): Unit
}

object listenerRegistration {
  @scala.inline
  def apply(removeListener: Callback): listenerRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeListener")(removeListener.toJsFn)
    __obj.asInstanceOf[listenerRegistration]
  }
}

