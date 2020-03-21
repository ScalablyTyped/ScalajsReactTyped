package typingsJapgolly.co

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  def next(): Anon0
}

object Anon1 {
  @scala.inline
  def apply(next: CallbackTo[Anon0]): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[Anon1]
  }
}

