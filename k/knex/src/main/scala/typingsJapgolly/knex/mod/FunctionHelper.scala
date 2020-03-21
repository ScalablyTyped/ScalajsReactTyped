package typingsJapgolly.knex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionHelper extends js.Object {
  def now(): Raw[_]
}

object FunctionHelper {
  @scala.inline
  def apply(now: CallbackTo[Raw[js.Any]]): FunctionHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("now")(now.toJsFn)
    __obj.asInstanceOf[FunctionHelper]
  }
}

