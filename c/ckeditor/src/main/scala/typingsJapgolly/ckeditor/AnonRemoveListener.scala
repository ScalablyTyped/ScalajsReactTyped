package typingsJapgolly.ckeditor

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveListener extends js.Object {
  def removeListener(): Unit
}

object AnonRemoveListener {
  @scala.inline
  def apply(removeListener: Callback): AnonRemoveListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeListener")(removeListener.toJsFn)
    __obj.asInstanceOf[AnonRemoveListener]
  }
}

