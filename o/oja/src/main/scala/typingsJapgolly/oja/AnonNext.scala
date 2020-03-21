package typingsJapgolly.oja

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  def next(): js.Promise[_]
}

object AnonNext {
  @scala.inline
  def apply(next: CallbackTo[js.Promise[js.Any]]): AnonNext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[AnonNext]
  }
}

