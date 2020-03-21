package typingsJapgolly.smoothScrollbar

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(): js.Any
}

object AnonGet {
  @scala.inline
  def apply(get: CallbackTo[js.Any]): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[AnonGet]
  }
}

