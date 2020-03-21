package typingsJapgolly.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.braintreeStrings.subscription_canceled
  - typingsJapgolly.braintree.braintreeStrings.subscription_charged_successfully
  - typingsJapgolly.braintree.braintreeStrings.subscription_charged_unsuccessfully
  - typingsJapgolly.braintree.braintreeStrings.subscription_expired
  - typingsJapgolly.braintree.braintreeStrings.subscription_trial_ended
  - typingsJapgolly.braintree.braintreeStrings.subscription_went_active
  - typingsJapgolly.braintree.braintreeStrings.subscription_went_past_due
*/
trait SubscriptionNotificationKind extends _WebhookNotificationKind

object SubscriptionNotificationKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def subscription_canceled: typingsJapgolly.braintree.braintreeStrings.subscription_canceled = this.cast("subscription_canceled")
  @scala.inline
  def subscription_charged_successfully: typingsJapgolly.braintree.braintreeStrings.subscription_charged_successfully = this.cast("subscription_charged_successfully")
  @scala.inline
  def subscription_charged_unsuccessfully: typingsJapgolly.braintree.braintreeStrings.subscription_charged_unsuccessfully = this.cast("subscription_charged_unsuccessfully")
  @scala.inline
  def subscription_expired: typingsJapgolly.braintree.braintreeStrings.subscription_expired = this.cast("subscription_expired")
  @scala.inline
  def subscription_trial_ended: typingsJapgolly.braintree.braintreeStrings.subscription_trial_ended = this.cast("subscription_trial_ended")
  @scala.inline
  def subscription_went_active: typingsJapgolly.braintree.braintreeStrings.subscription_went_active = this.cast("subscription_went_active")
  @scala.inline
  def subscription_went_past_due: typingsJapgolly.braintree.braintreeStrings.subscription_went_past_due = this.cast("subscription_went_past_due")
}

