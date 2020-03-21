package typingsJapgolly.firebase

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  def delete(): js.Promise[Unit]
}

object AnonDelete {
  @scala.inline
  def apply(delete: CallbackTo[js.Promise[Unit]]): AnonDelete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.asInstanceOf[AnonDelete]
  }
}

