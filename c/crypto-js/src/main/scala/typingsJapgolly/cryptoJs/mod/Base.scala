package typingsJapgolly.cryptoJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  def create(): js.Any
}

object Base {
  @scala.inline
  def apply(create: CallbackTo[js.Any]): Base = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.asInstanceOf[Base]
  }
}

