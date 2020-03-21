package typingsJapgolly.ionic

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: String
  def treat(): js.Promise[Unit]
}

object AnonMessage {
  @scala.inline
  def apply(message: String, treat: CallbackTo[js.Promise[Unit]]): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("treat")(treat.toJsFn)
    __obj.asInstanceOf[AnonMessage]
  }
}

