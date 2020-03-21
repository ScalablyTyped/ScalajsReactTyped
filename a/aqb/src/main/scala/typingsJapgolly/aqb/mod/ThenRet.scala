package typingsJapgolly.aqb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThenRet extends js.Object {
  var else_ : TernaryOperation
  def `else`(y: js.Any): TernaryOperation
  def otherwise(y: js.Any): TernaryOperation
}

object ThenRet {
  @scala.inline
  def apply(
    `else`: js.Any => CallbackTo[TernaryOperation],
    else_ : TernaryOperation,
    otherwise: js.Any => CallbackTo[TernaryOperation]
  ): ThenRet = {
    val __obj = js.Dynamic.literal(else_ = else_.asInstanceOf[js.Any])
    __obj.updateDynamic("else")(js.Any.fromFunction1((t0: js.Any) => `else`(t0).runNow()))
    __obj.updateDynamic("otherwise")(js.Any.fromFunction1((t0: js.Any) => otherwise(t0).runNow()))
    __obj.asInstanceOf[ThenRet]
  }
}

