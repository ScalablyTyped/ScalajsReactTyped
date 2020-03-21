package typingsJapgolly.immutable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueObject extends js.Object {
  /**
    * True if this and the other Collection have value equality, as defined
    * by `Immutable.is()`.
    *
    * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
    * allow for chained expressions.
    */
  def equals(other: js.Any): Boolean
}

object ValueObject {
  @scala.inline
  def apply(equals: js.Any => CallbackTo[Boolean]): ValueObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: js.Any) => equals(t0).runNow()))
    __obj.asInstanceOf[ValueObject]
  }
}

