package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  def equalityComparer(a: js.Any, b: js.Any): Boolean
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](equalityComparer: (js.Any, js.Any) => CallbackTo[Boolean]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equalityComparer")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => equalityComparer(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

