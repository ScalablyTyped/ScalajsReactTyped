package typingsJapgolly.monk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEach[U] extends js.Object {
  def each(record: U, cursor: AnonClose): js.Any
}

object AnonEach {
  @scala.inline
  def apply[U](each: (U, AnonClose) => CallbackTo[js.Any]): AnonEach[U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("each")(js.Any.fromFunction2((t0: U, t1: typingsJapgolly.monk.AnonClose) => each(t0, t1).runNow()))
    __obj.asInstanceOf[AnonEach[U]]
  }
}

