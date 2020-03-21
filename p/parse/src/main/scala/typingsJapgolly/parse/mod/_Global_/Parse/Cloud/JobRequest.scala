package typingsJapgolly.parse.mod._Global_.Parse.Cloud

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRequest extends js.Object {
  var params: js.Any
  def message(response: js.Any): Unit
}

object JobRequest {
  @scala.inline
  def apply(message: js.Any => Callback, params: js.Any): JobRequest = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(js.Any.fromFunction1((t0: js.Any) => message(t0).runNow()))
    __obj.asInstanceOf[JobRequest]
  }
}

