package typingsJapgolly.jenkins

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  def cancel(n: Double): js.Promise[Unit]
  def item(n: Double): js.Promise[_]
  def list(): js.Promise[_]
}

object AnonItem {
  @scala.inline
  def apply(
    cancel: Double => CallbackTo[js.Promise[Unit]],
    item: Double => CallbackTo[js.Promise[js.Any]],
    list: CallbackTo[js.Promise[js.Any]]
  ): AnonItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: scala.Double) => cancel(t0).runNow()))
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[AnonItem]
  }
}

