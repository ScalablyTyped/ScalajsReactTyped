package typingsJapgolly.pg.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Submittable extends js.Object {
  def submit(connection: Connection): Unit
}

object Submittable {
  @scala.inline
  def apply(submit: Connection => Callback): Submittable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: typingsJapgolly.pg.mod.Connection) => submit(t0).runNow()))
    __obj.asInstanceOf[Submittable]
  }
}

