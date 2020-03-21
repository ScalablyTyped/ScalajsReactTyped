package typingsJapgolly.paystack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisable extends js.Object {
  def create(params: AnonAuthorization): js.Promise[Response]
  def disable(params: AnonCode): js.Promise[Responsedataundefined]
  def enable(params: AnonCode): js.Promise[Responsedataundefined]
  def get(id_or_subscription_code: String): js.Promise[Response]
  def list(): js.Promise[ResponsedataArrayanymetaaDictothers]
}

object AnonDisable {
  @scala.inline
  def apply(
    create: AnonAuthorization => CallbackTo[js.Promise[Response]],
    disable: AnonCode => CallbackTo[js.Promise[Responsedataundefined]],
    enable: AnonCode => CallbackTo[js.Promise[Responsedataundefined]],
    get: String => CallbackTo[js.Promise[Response]],
    list: CallbackTo[js.Promise[ResponsedataArrayanymetaaDictothers]]
  ): AnonDisable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.paystack.AnonAuthorization) => create(t0).runNow()))
    __obj.updateDynamic("disable")(js.Any.fromFunction1((t0: typingsJapgolly.paystack.AnonCode) => disable(t0).runNow()))
    __obj.updateDynamic("enable")(js.Any.fromFunction1((t0: typingsJapgolly.paystack.AnonCode) => enable(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.asInstanceOf[AnonDisable]
  }
}

