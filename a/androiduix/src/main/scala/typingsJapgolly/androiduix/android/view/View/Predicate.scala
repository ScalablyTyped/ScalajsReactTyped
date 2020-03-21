package typingsJapgolly.androiduix.android.view.View

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Predicate[T] extends js.Object {
  @JSName("apply")
  def apply(t: T): Boolean
}

object Predicate {
  @scala.inline
  def apply[T](apply: T => CallbackTo[Boolean]): Predicate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: T) => apply(t0).runNow()))
    __obj.asInstanceOf[Predicate[T]]
  }
}

