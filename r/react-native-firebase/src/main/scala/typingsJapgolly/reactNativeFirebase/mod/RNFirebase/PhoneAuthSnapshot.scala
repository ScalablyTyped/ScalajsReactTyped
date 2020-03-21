package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.sent
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.timeout
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneAuthSnapshot extends js.Object {
  var code: String | Null
  var error: NativeError | Null
  var state: sent | timeout | verified | error_
  var verificationId: String
}

object PhoneAuthSnapshot {
  @scala.inline
  def apply(
    state: sent | timeout | verified | error_,
    verificationId: String,
    code: String = null,
    error: NativeError = null
  ): PhoneAuthSnapshot = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], verificationId = verificationId.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneAuthSnapshot]
  }
}

