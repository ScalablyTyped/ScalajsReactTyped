package typingsJapgolly.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.notification
  - typings.reactDashNative.reactDashNativeStrings.localNotification
  - typings.reactDashNative.reactDashNativeStrings.register
  - typings.reactDashNative.reactDashNativeStrings.registrationError
*/
trait PushNotificationEventName extends js.Object

object PushNotificationEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localNotification: typingsJapgolly.reactDashNative.reactDashNativeStrings.localNotification = this.cast("localNotification")
  @scala.inline
  def notification: typingsJapgolly.reactDashNative.reactDashNativeStrings.notification = this.cast("notification")
  @scala.inline
  def register: typingsJapgolly.reactDashNative.reactDashNativeStrings.register = this.cast("register")
  @scala.inline
  def registrationError: typingsJapgolly.reactDashNative.reactDashNativeStrings.registrationError = this.cast("registrationError")
}

