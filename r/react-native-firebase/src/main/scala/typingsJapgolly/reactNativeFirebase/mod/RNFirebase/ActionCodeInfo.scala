package typingsJapgolly.reactNativeFirebase.mod.RNFirebase

import typingsJapgolly.reactNativeFirebase.AnonEmail
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.EMAIL_SIGNIN
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ERROR
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.PASSWORD_RESET
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.RECOVER_EMAIL
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.VERIFY_EMAIL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeInfo extends js.Object {
  var data: AnonEmail
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: AnonEmail, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

