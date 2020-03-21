package typingsJapgolly.tstl.inegatableMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INegatable[Ret] extends js.Object {
  def negate(): Ret
}

object INegatable {
  @scala.inline
  def apply[Ret](negate: CallbackTo[Ret]): INegatable[Ret] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("negate")(negate.toJsFn)
    __obj.asInstanceOf[INegatable[Ret]]
  }
}

