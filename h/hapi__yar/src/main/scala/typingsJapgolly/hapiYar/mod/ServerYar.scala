package typingsJapgolly.hapiYar.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiCatbox.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerYar extends js.Object {
  def revoke(id: Id): js.Promise[Unit]
}

object ServerYar {
  @scala.inline
  def apply(revoke: Id => CallbackTo[js.Promise[Unit]]): ServerYar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("revoke")(js.Any.fromFunction1((t0: typingsJapgolly.hapiCatbox.mod.Id) => revoke(t0).runNow()))
    __obj.asInstanceOf[ServerYar]
  }
}

