package typingsJapgolly.paystack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListbanks extends js.Object {
  def list_banks(params: AnonPage): js.Promise[ResponsedataArrayany]
  def resolve_bin(bin: String): js.Promise[Response]
}

object AnonListbanks {
  @scala.inline
  def apply(
    list_banks: AnonPage => CallbackTo[js.Promise[ResponsedataArrayany]],
    resolve_bin: String => CallbackTo[js.Promise[Response]]
  ): AnonListbanks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list_banks")(js.Any.fromFunction1((t0: typingsJapgolly.paystack.AnonPage) => list_banks(t0).runNow()))
    __obj.updateDynamic("resolve_bin")(js.Any.fromFunction1((t0: java.lang.String) => resolve_bin(t0).runNow()))
    __obj.asInstanceOf[AnonListbanks]
  }
}

