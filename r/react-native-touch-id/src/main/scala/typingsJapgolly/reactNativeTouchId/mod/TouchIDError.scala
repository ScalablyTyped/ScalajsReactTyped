package typingsJapgolly.reactNativeTouchId.mod

import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorAuthenticationFailed
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorPasscodeNotSet
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorSystemCancel
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotAvailable
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotEnrolled
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserCancel
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserFallback
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDNotSupported
import typingsJapgolly.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDUnknownError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchIDError extends js.Object {
  var details: js.Any
  var message: String
  var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
}

object TouchIDError {
  @scala.inline
  def apply(
    details: js.Any,
    message: String,
    name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
  ): TouchIDError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TouchIDError]
  }
}

