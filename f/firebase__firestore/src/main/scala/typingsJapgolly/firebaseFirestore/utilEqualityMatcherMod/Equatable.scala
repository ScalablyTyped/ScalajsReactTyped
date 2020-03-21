package typingsJapgolly.firebaseFirestore.utilEqualityMatcherMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equatable[T] extends js.Object {
  def isEqual(other: T): Boolean
}

object Equatable {
  @scala.inline
  def apply[T](isEqual: T => CallbackTo[Boolean]): Equatable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: T) => isEqual(t0).runNow()))
    __obj.asInstanceOf[Equatable[T]]
  }
}

