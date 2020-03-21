package typingsJapgolly.ono

import typingsJapgolly.ono.typesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage[E /* <: ErrorLike */, P /* <: js.Object */] extends js.Object {
  var message: String
  var originalError: js.UndefOr[E] = js.undefined
  var props: js.UndefOr[P] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply[E /* <: ErrorLike */, P /* <: js.Object */](message: String, originalError: E = null, props: P = null): AnonMessage[E, P] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage[E, P]]
  }
}

