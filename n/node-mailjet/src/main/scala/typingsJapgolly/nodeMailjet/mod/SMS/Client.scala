package typingsJapgolly.nodeMailjet.mod.SMS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  def get(action: String): GetResource
  def post(action: String): PostResource
}

object Client {
  @scala.inline
  def apply(get: String => CallbackTo[GetResource], post: String => CallbackTo[PostResource]): Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("post")(js.Any.fromFunction1((t0: java.lang.String) => post(t0).runNow()))
    __obj.asInstanceOf[Client]
  }
}

