package typingsJapgolly.co

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  def next(): AnonValue
}

object Anon3 {
  @scala.inline
  def apply(next: CallbackTo[AnonValue]): Anon3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Anon3]
  }
}

