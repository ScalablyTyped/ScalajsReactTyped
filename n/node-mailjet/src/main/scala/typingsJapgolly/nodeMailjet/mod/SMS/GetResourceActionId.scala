package typingsJapgolly.nodeMailjet.mod.SMS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceActionId extends js.Object {
  def request(): js.Promise[ExportResponse]
}

object GetResourceActionId {
  @scala.inline
  def apply(request: CallbackTo[js.Promise[ExportResponse]]): GetResourceActionId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request.toJsFn)
    __obj.asInstanceOf[GetResourceActionId]
  }
}

