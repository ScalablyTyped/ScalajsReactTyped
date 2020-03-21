package typingsJapgolly.webpackChain.mod._Config

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chained[Parent] extends js.Object {
  def end(): Parent
}

object Chained {
  @scala.inline
  def apply[Parent](end: CallbackTo[Parent]): Chained[Parent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.asInstanceOf[Chained[Parent]]
  }
}

