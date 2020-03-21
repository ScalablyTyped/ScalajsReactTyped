package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationHandler extends js.Object {
  def cancel(): Unit
}

object NotificationHandler {
  @scala.inline
  def apply(cancel: Callback): NotificationHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[NotificationHandler]
  }
}

