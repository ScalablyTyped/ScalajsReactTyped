package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  def request(email: String): js.Promise[Unit]
}

object AnonRequest {
  @scala.inline
  def apply(request: String => CallbackTo[js.Promise[Unit]]): AnonRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: java.lang.String) => request(t0).runNow()))
    __obj.asInstanceOf[AnonRequest]
  }
}

