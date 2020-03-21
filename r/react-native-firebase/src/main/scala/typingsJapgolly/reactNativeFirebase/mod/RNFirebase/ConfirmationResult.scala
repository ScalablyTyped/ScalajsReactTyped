package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationResult extends js.Object {
  var verificationId: String | Null
  def confirm(verificationCode: String): js.Promise[User | Null]
}

object ConfirmationResult {
  @scala.inline
  def apply(confirm: String => CallbackTo[js.Promise[User | Null]], verificationId: String = null): ConfirmationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("confirm")(js.Any.fromFunction1((t0: java.lang.String) => confirm(t0).runNow()))
    if (verificationId != null) __obj.updateDynamic("verificationId")(verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationResult]
  }
}

