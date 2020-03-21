package typingsJapgolly.co

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  def next(): AnonDone
}

object AnonNext {
  @scala.inline
  def apply(next: CallbackTo[AnonDone]): AnonNext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[AnonNext]
  }
}

