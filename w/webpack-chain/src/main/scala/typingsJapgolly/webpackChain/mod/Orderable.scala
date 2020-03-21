package typingsJapgolly.webpackChain.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orderable extends js.Object {
  def after(name: String): this.type
  def before(name: String): this.type
}

object Orderable {
  @scala.inline
  def apply(after: String => CallbackTo[Orderable], before: String => CallbackTo[Orderable]): Orderable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: java.lang.String) => after(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: java.lang.String) => before(t0).runNow()))
    __obj.asInstanceOf[Orderable]
  }
}

