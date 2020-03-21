package typingsJapgolly.onfleetNodeOnfleet.administratorsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Admin extends js.Object {
  def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin]
  def deleteOne(id: String): js.Promise[Unit]
  def get(): js.Promise[js.Array[OnfleetAdmin]]
  def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin]
}

object Admin {
  @scala.inline
  def apply(
    create: CreateAdminProps => CallbackTo[js.Promise[OnfleetAdmin]],
    deleteOne: String => CallbackTo[js.Promise[Unit]],
    get: CallbackTo[js.Promise[js.Array[OnfleetAdmin]]],
    update: (String, UpdateAdminProps) => CallbackTo[js.Promise[OnfleetAdmin]]
  ): Admin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.onfleetNodeOnfleet.administratorsMod.CreateAdminProps) => create(t0).runNow()))
    __obj.updateDynamic("deleteOne")(js.Any.fromFunction1((t0: java.lang.String) => deleteOne(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.onfleetNodeOnfleet.administratorsMod.UpdateAdminProps) => update(t0, t1).runNow()))
    __obj.asInstanceOf[Admin]
  }
}

