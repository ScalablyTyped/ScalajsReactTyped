package typingsJapgolly.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.reactNativeStrings.notification
  - typingsJapgolly.reactNative.reactNativeStrings.localNotification
  - typingsJapgolly.reactNative.reactNativeStrings.register
  - typingsJapgolly.reactNative.reactNativeStrings.registrationError
*/
trait PushNotificationEventName extends js.Object

object PushNotificationEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localNotification: typingsJapgolly.reactNative.reactNativeStrings.localNotification = this.cast("localNotification")
  @scala.inline
  def notification: typingsJapgolly.reactNative.reactNativeStrings.notification = this.cast("notification")
  @scala.inline
  def register: typingsJapgolly.reactNative.reactNativeStrings.register = this.cast("register")
  @scala.inline
  def registrationError: typingsJapgolly.reactNative.reactNativeStrings.registrationError = this.cast("registrationError")
}

