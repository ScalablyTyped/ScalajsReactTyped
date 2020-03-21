package typingsJapgolly.flight.Flight_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdviceStatic extends js.Object {
  def withAdvice(): js.Function
}

object AdviceStatic {
  @scala.inline
  def apply(withAdvice: CallbackTo[js.Function]): AdviceStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withAdvice")(withAdvice.toJsFn)
    __obj.asInstanceOf[AdviceStatic]
  }
}

