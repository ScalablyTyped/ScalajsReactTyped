package typingsJapgolly.ckeditorCkeditor5Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestroy extends js.Object {
  def destroy(): Unit | Null | js.Promise[_]
}

object AnonDestroy {
  @scala.inline
  def apply(destroy: CallbackTo[Unit | Null | js.Promise[js.Any]]): AnonDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[AnonDestroy]
  }
}

