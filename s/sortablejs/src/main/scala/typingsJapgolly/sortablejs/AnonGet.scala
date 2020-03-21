package typingsJapgolly.sortablejs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sortablejs.mod.Sortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(sortable: Sortable): js.Array[String]
  def set(sortable: Sortable): Unit
}

object AnonGet {
  @scala.inline
  def apply(get: Sortable => CallbackTo[js.Array[String]], set: Sortable => Callback): AnonGet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.sortablejs.mod.Sortable) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.sortablejs.mod.Sortable) => set(t0).runNow()))
    __obj.asInstanceOf[AnonGet]
  }
}

