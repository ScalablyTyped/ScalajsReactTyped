package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment pass activation states.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.activated
  - typingsJapgolly.applepayjs.applepayjsStrings.requiresActivation
  - typingsJapgolly.applepayjs.applepayjsStrings.activating
  - typingsJapgolly.applepayjs.applepayjsStrings.suspended
  - typingsJapgolly.applepayjs.applepayjsStrings.deactivated
*/
trait ApplePayPaymentPassActivationState extends js.Object

object ApplePayPaymentPassActivationState {
  @scala.inline
  def activated: typingsJapgolly.applepayjs.applepayjsStrings.activated = this.cast("activated")
  @scala.inline
  def activating: typingsJapgolly.applepayjs.applepayjsStrings.activating = this.cast("activating")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deactivated: typingsJapgolly.applepayjs.applepayjsStrings.deactivated = this.cast("deactivated")
  @scala.inline
  def requiresActivation: typingsJapgolly.applepayjs.applepayjsStrings.requiresActivation = this.cast("requiresActivation")
  @scala.inline
  def suspended: typingsJapgolly.applepayjs.applepayjsStrings.suspended = this.cast("suspended")
}

