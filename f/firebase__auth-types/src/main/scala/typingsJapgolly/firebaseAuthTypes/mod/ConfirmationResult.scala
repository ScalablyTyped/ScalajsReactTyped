package typingsJapgolly.firebaseAuthTypes.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationResult extends js.Object {
  var verificationId: String
  def confirm(verificationCode: String): js.Promise[UserCredential]
}

object ConfirmationResult {
  @scala.inline
  def apply(confirm: String => CallbackTo[js.Promise[UserCredential]], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(verificationId = verificationId.asInstanceOf[js.Any])
    __obj.updateDynamic("confirm")(js.Any.fromFunction1((t0: java.lang.String) => confirm(t0).runNow()))
    __obj.asInstanceOf[ConfirmationResult]
  }
}

