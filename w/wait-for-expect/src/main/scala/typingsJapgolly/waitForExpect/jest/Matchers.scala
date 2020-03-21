package typingsJapgolly.waitForExpect.jest

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.waitForExpect.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toBeInRange(range: AnonMax): R
}

object Matchers {
  @scala.inline
  def apply[R](toBeInRange: AnonMax => CallbackTo[R]): Matchers[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBeInRange")(js.Any.fromFunction1((t0: typingsJapgolly.waitForExpect.AnonMax) => toBeInRange(t0).runNow()))
    __obj.asInstanceOf[Matchers[R]]
  }
}

