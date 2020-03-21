package typingsJapgolly.sparqlHttpClient.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectResponse extends js.Object {
  def json(): js.Promise[SelectBindings with AskResult]
}

object SelectResponse {
  @scala.inline
  def apply(json: CallbackTo[js.Promise[SelectBindings with AskResult]]): SelectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.asInstanceOf[SelectResponse]
  }
}

