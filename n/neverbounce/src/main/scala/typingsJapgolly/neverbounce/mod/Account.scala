package typingsJapgolly.neverbounce.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  def info(): js.Promise[Response]
}

object Account {
  @scala.inline
  def apply(info: CallbackTo[js.Promise[Response]]): Account = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info.toJsFn)
    __obj.asInstanceOf[Account]
  }
}

