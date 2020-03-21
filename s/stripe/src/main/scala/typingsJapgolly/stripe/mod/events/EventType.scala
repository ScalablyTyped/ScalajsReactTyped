package typingsJapgolly.stripe.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.Asterisk
  - typingsJapgolly.stripe.stripeStrings.accountDotupdated
  - typingsJapgolly.stripe.stripeStrings.accountDotapplicationDotauthorized
  - typingsJapgolly.stripe.stripeStrings.accountDotapplicationDotdeauthorized
  - typingsJapgolly.stripe.stripeStrings.accountDotexternal_accountDotcreated
  - typingsJapgolly.stripe.stripeStrings.accountDotexternal_accountDotdeleted
  - typingsJapgolly.stripe.stripeStrings.accountDotexternal_accountDotupdated
  - typingsJapgolly.stripe.stripeStrings.application_feeDotcreated
  - typingsJapgolly.stripe.stripeStrings.application_feeDotrefunded
  - typingsJapgolly.stripe.stripeStrings.application_feeDotrefundDotupdated
  - typingsJapgolly.stripe.stripeStrings.balanceDotavailable
  - typingsJapgolly.stripe.stripeStrings.capabilityDotupdated
  - typingsJapgolly.stripe.stripeStrings.chargeDotcaptured
  - typingsJapgolly.stripe.stripeStrings.chargeDotexpired
  - typingsJapgolly.stripe.stripeStrings.chargeDotfailed
  - typingsJapgolly.stripe.stripeStrings.chargeDotpending
  - typingsJapgolly.stripe.stripeStrings.chargeDotrefunded
  - typingsJapgolly.stripe.stripeStrings.chargeDotsucceeded
  - typingsJapgolly.stripe.stripeStrings.chargeDotupdated
  - typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotclosed
  - typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotcreated
  - typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated
  - typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn
  - typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotupdated
  - typingsJapgolly.stripe.stripeStrings.chargeDotrefundDotupdated
  - typingsJapgolly.stripe.stripeStrings.checkoutDotsessionDotcompleted
  - typingsJapgolly.stripe.stripeStrings.couponDotcreated
  - typingsJapgolly.stripe.stripeStrings.couponDotdeleted
  - typingsJapgolly.stripe.stripeStrings.couponDotupdated
  - typingsJapgolly.stripe.stripeStrings.credit_noteDotcreated
  - typingsJapgolly.stripe.stripeStrings.credit_noteDotupdated
  - typingsJapgolly.stripe.stripeStrings.credit_noteDotvoided
  - typingsJapgolly.stripe.stripeStrings.customerDotcreated
  - typingsJapgolly.stripe.stripeStrings.customerDotdeleted
  - typingsJapgolly.stripe.stripeStrings.customerDotupdated
  - typingsJapgolly.stripe.stripeStrings.customerDotdiscountDotcreated
  - typingsJapgolly.stripe.stripeStrings.customerDotdiscountDotdeleted
  - typingsJapgolly.stripe.stripeStrings.customerDotdiscountDotupdated
  - typingsJapgolly.stripe.stripeStrings.customerDotsourceDotcreated
  - typingsJapgolly.stripe.stripeStrings.customerDotsourceDotdeleted
  - typingsJapgolly.stripe.stripeStrings.customerDotsourceDotexpiring
  - typingsJapgolly.stripe.stripeStrings.customerDotsourceDotupdated
  - typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDotcreated
  - typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDotdeleted
  - typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end
  - typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDotupdated
  - typingsJapgolly.stripe.stripeStrings.customerDottax_idDotcreated
  - typingsJapgolly.stripe.stripeStrings.customerDottax_idDotdeleted
  - typingsJapgolly.stripe.stripeStrings.customerDottax_idDotupdated
  - typingsJapgolly.stripe.stripeStrings.fileDotcreated
  - typingsJapgolly.stripe.stripeStrings.invoiceDotcreated
  - typingsJapgolly.stripe.stripeStrings.invoiceDotdeleted
  - typingsJapgolly.stripe.stripeStrings.invoiceDotfinalized
  - typingsJapgolly.stripe.stripeStrings.invoiceDotmarked_uncollectible
  - typingsJapgolly.stripe.stripeStrings.invoiceDotpayment_action_required
  - typingsJapgolly.stripe.stripeStrings.invoiceDotpayment_failed
  - typingsJapgolly.stripe.stripeStrings.invoiceDotpayment_succeeded
  - typingsJapgolly.stripe.stripeStrings.invoiceDotsent
  - typingsJapgolly.stripe.stripeStrings.invoiceDotupcoming
  - typingsJapgolly.stripe.stripeStrings.invoiceDotupdated
  - typingsJapgolly.stripe.stripeStrings.invoiceDotvoided
  - typingsJapgolly.stripe.stripeStrings.invoiceitemDotcreated
  - typingsJapgolly.stripe.stripeStrings.invoiceitemDotdeleted
  - typingsJapgolly.stripe.stripeStrings.invoiceitemDotupdated
  - typingsJapgolly.stripe.stripeStrings.issuing_authorizationDotcreated
  - typingsJapgolly.stripe.stripeStrings.issuing_authorizationDotrequest
  - typingsJapgolly.stripe.stripeStrings.issuing_authorizationDotupdated
  - typingsJapgolly.stripe.stripeStrings.issuing_cardDotcreated
  - typingsJapgolly.stripe.stripeStrings.issuing_cardDotupdated
  - typingsJapgolly.stripe.stripeStrings.issuing_cardholderDotcreated
  - typingsJapgolly.stripe.stripeStrings.issuing_cardholderDotupdated
  - typingsJapgolly.stripe.stripeStrings.issuing_disputeDotcreated
  - typingsJapgolly.stripe.stripeStrings.issuing_disputeDotupdated
  - typingsJapgolly.stripe.stripeStrings.issuing_settlementDotcreated
  - typingsJapgolly.stripe.stripeStrings.issuing_settlementDotupdated
  - typingsJapgolly.stripe.stripeStrings.issuing_transactionDotcreated
  - typingsJapgolly.stripe.stripeStrings.issuing_transactionDotupdated
  - typingsJapgolly.stripe.stripeStrings.mandateDotupdated
  - typingsJapgolly.stripe.stripeStrings.orderDotcreated
  - typingsJapgolly.stripe.stripeStrings.orderDotpayment_failed
  - typingsJapgolly.stripe.stripeStrings.orderDotpayment_succeeded
  - typingsJapgolly.stripe.stripeStrings.orderDotupdated
  - typingsJapgolly.stripe.stripeStrings.order_returnDotcreated
  - typingsJapgolly.stripe.stripeStrings.payment_intentDotamount_capturable_updated
  - typingsJapgolly.stripe.stripeStrings.payment_intentDotcanceled
  - typingsJapgolly.stripe.stripeStrings.payment_intentDotcreated
  - typingsJapgolly.stripe.stripeStrings.payment_intentDotpayment_failed
  - typingsJapgolly.stripe.stripeStrings.payment_intentDotsucceeded
  - typingsJapgolly.stripe.stripeStrings.payment_methodDotattached
  - typingsJapgolly.stripe.stripeStrings.payment_methodDotcard_automatically_updated
  - typingsJapgolly.stripe.stripeStrings.payment_methodDotdetached
  - typingsJapgolly.stripe.stripeStrings.payment_methodDotupdated
  - typingsJapgolly.stripe.stripeStrings.payoutDotcanceled
  - typingsJapgolly.stripe.stripeStrings.payoutDotcreated
  - typingsJapgolly.stripe.stripeStrings.payoutDotfailed
  - typingsJapgolly.stripe.stripeStrings.payoutDotpaid
  - typingsJapgolly.stripe.stripeStrings.payoutDotupdated
  - typingsJapgolly.stripe.stripeStrings.personDotcreated
  - typingsJapgolly.stripe.stripeStrings.personDotdeleted
  - typingsJapgolly.stripe.stripeStrings.personDotupdated
  - typingsJapgolly.stripe.stripeStrings.planDotcreated
  - typingsJapgolly.stripe.stripeStrings.planDotdeleted
  - typingsJapgolly.stripe.stripeStrings.planDotupdated
  - typingsJapgolly.stripe.stripeStrings.productDotcreated
  - typingsJapgolly.stripe.stripeStrings.productDotdeleted
  - typingsJapgolly.stripe.stripeStrings.productDotupdated
  - typingsJapgolly.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated
  - typingsJapgolly.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated
  - typingsJapgolly.stripe.stripeStrings.recipientDotcreated
  - typingsJapgolly.stripe.stripeStrings.recipientDotdeleted
  - typingsJapgolly.stripe.stripeStrings.recipientDotupdated
  - typingsJapgolly.stripe.stripeStrings.reportingDotreport_runDotfailed
  - typingsJapgolly.stripe.stripeStrings.reportingDotreport_runDotsucceeded
  - typingsJapgolly.stripe.stripeStrings.reportingDotreport_typeDotupdated
  - typingsJapgolly.stripe.stripeStrings.reviewDotclosed
  - typingsJapgolly.stripe.stripeStrings.reviewDotopened
  - typingsJapgolly.stripe.stripeStrings.setup_intentDotcanceled
  - typingsJapgolly.stripe.stripeStrings.setup_intentDotcreated
  - typingsJapgolly.stripe.stripeStrings.setup_intentDotsetup_failed
  - typingsJapgolly.stripe.stripeStrings.setup_intentDotsucceeded
  - typingsJapgolly.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated
  - typingsJapgolly.stripe.stripeStrings.skuDotcreated
  - typingsJapgolly.stripe.stripeStrings.skuDotdeleted
  - typingsJapgolly.stripe.stripeStrings.skuDotupdated
  - typingsJapgolly.stripe.stripeStrings.sourceDotcanceled
  - typingsJapgolly.stripe.stripeStrings.sourceDotchargeable
  - typingsJapgolly.stripe.stripeStrings.sourceDotfailed
  - typingsJapgolly.stripe.stripeStrings.sourceDotmandate_notification
  - typingsJapgolly.stripe.stripeStrings.sourceDotrefund_attributes_required
  - typingsJapgolly.stripe.stripeStrings.sourceDottransactionDotcreated
  - typingsJapgolly.stripe.stripeStrings.sourceDottransactionDotupdated
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotaborted
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotcanceled
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotcompleted
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotcreated
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotexpiring
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotreleased
  - typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotupdated
  - typingsJapgolly.stripe.stripeStrings.tax_rateDotcreated
  - typingsJapgolly.stripe.stripeStrings.tax_rateDotupdated
  - typingsJapgolly.stripe.stripeStrings.topupDotcreated
  - typingsJapgolly.stripe.stripeStrings.topupDotfailed
  - typingsJapgolly.stripe.stripeStrings.topupDotreversed
  - typingsJapgolly.stripe.stripeStrings.topupDotsucceeded
  - typingsJapgolly.stripe.stripeStrings.transferDotcreated
  - typingsJapgolly.stripe.stripeStrings.transferDotfailed
  - typingsJapgolly.stripe.stripeStrings.transferDotpaid
  - typingsJapgolly.stripe.stripeStrings.transferDotreversed
  - typingsJapgolly.stripe.stripeStrings.transferDotupdated
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Asterisk: typingsJapgolly.stripe.stripeStrings.Asterisk = this.cast("*")
  @scala.inline
  def accountDotapplicationDotauthorized: typingsJapgolly.stripe.stripeStrings.accountDotapplicationDotauthorized = this.cast("account.application.authorized")
  @scala.inline
  def accountDotapplicationDotdeauthorized: typingsJapgolly.stripe.stripeStrings.accountDotapplicationDotdeauthorized = this.cast("account.application.deauthorized")
  @scala.inline
  def accountDotexternal_accountDotcreated: typingsJapgolly.stripe.stripeStrings.accountDotexternal_accountDotcreated = this.cast("account.external_account.created")
  @scala.inline
  def accountDotexternal_accountDotdeleted: typingsJapgolly.stripe.stripeStrings.accountDotexternal_accountDotdeleted = this.cast("account.external_account.deleted")
  @scala.inline
  def accountDotexternal_accountDotupdated: typingsJapgolly.stripe.stripeStrings.accountDotexternal_accountDotupdated = this.cast("account.external_account.updated")
  @scala.inline
  def accountDotupdated: typingsJapgolly.stripe.stripeStrings.accountDotupdated = this.cast("account.updated")
  @scala.inline
  def application_feeDotcreated: typingsJapgolly.stripe.stripeStrings.application_feeDotcreated = this.cast("application_fee.created")
  @scala.inline
  def application_feeDotrefundDotupdated: typingsJapgolly.stripe.stripeStrings.application_feeDotrefundDotupdated = this.cast("application_fee.refund.updated")
  @scala.inline
  def application_feeDotrefunded: typingsJapgolly.stripe.stripeStrings.application_feeDotrefunded = this.cast("application_fee.refunded")
  @scala.inline
  def balanceDotavailable: typingsJapgolly.stripe.stripeStrings.balanceDotavailable = this.cast("balance.available")
  @scala.inline
  def capabilityDotupdated: typingsJapgolly.stripe.stripeStrings.capabilityDotupdated = this.cast("capability.updated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chargeDotcaptured: typingsJapgolly.stripe.stripeStrings.chargeDotcaptured = this.cast("charge.captured")
  @scala.inline
  def chargeDotdisputeDotclosed: typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotclosed = this.cast("charge.dispute.closed")
  @scala.inline
  def chargeDotdisputeDotcreated: typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotcreated = this.cast("charge.dispute.created")
  @scala.inline
  def chargeDotdisputeDotfunds_reinstated: typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated = this.cast("charge.dispute.funds_reinstated")
  @scala.inline
  def chargeDotdisputeDotfunds_withdrawn: typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn = this.cast("charge.dispute.funds_withdrawn")
  @scala.inline
  def chargeDotdisputeDotupdated: typingsJapgolly.stripe.stripeStrings.chargeDotdisputeDotupdated = this.cast("charge.dispute.updated")
  @scala.inline
  def chargeDotexpired: typingsJapgolly.stripe.stripeStrings.chargeDotexpired = this.cast("charge.expired")
  @scala.inline
  def chargeDotfailed: typingsJapgolly.stripe.stripeStrings.chargeDotfailed = this.cast("charge.failed")
  @scala.inline
  def chargeDotpending: typingsJapgolly.stripe.stripeStrings.chargeDotpending = this.cast("charge.pending")
  @scala.inline
  def chargeDotrefundDotupdated: typingsJapgolly.stripe.stripeStrings.chargeDotrefundDotupdated = this.cast("charge.refund.updated")
  @scala.inline
  def chargeDotrefunded: typingsJapgolly.stripe.stripeStrings.chargeDotrefunded = this.cast("charge.refunded")
  @scala.inline
  def chargeDotsucceeded: typingsJapgolly.stripe.stripeStrings.chargeDotsucceeded = this.cast("charge.succeeded")
  @scala.inline
  def chargeDotupdated: typingsJapgolly.stripe.stripeStrings.chargeDotupdated = this.cast("charge.updated")
  @scala.inline
  def checkoutDotsessionDotcompleted: typingsJapgolly.stripe.stripeStrings.checkoutDotsessionDotcompleted = this.cast("checkout.session.completed")
  @scala.inline
  def couponDotcreated: typingsJapgolly.stripe.stripeStrings.couponDotcreated = this.cast("coupon.created")
  @scala.inline
  def couponDotdeleted: typingsJapgolly.stripe.stripeStrings.couponDotdeleted = this.cast("coupon.deleted")
  @scala.inline
  def couponDotupdated: typingsJapgolly.stripe.stripeStrings.couponDotupdated = this.cast("coupon.updated")
  @scala.inline
  def credit_noteDotcreated: typingsJapgolly.stripe.stripeStrings.credit_noteDotcreated = this.cast("credit_note.created")
  @scala.inline
  def credit_noteDotupdated: typingsJapgolly.stripe.stripeStrings.credit_noteDotupdated = this.cast("credit_note.updated")
  @scala.inline
  def credit_noteDotvoided: typingsJapgolly.stripe.stripeStrings.credit_noteDotvoided = this.cast("credit_note.voided")
  @scala.inline
  def customerDotcreated: typingsJapgolly.stripe.stripeStrings.customerDotcreated = this.cast("customer.created")
  @scala.inline
  def customerDotdeleted: typingsJapgolly.stripe.stripeStrings.customerDotdeleted = this.cast("customer.deleted")
  @scala.inline
  def customerDotdiscountDotcreated: typingsJapgolly.stripe.stripeStrings.customerDotdiscountDotcreated = this.cast("customer.discount.created")
  @scala.inline
  def customerDotdiscountDotdeleted: typingsJapgolly.stripe.stripeStrings.customerDotdiscountDotdeleted = this.cast("customer.discount.deleted")
  @scala.inline
  def customerDotdiscountDotupdated: typingsJapgolly.stripe.stripeStrings.customerDotdiscountDotupdated = this.cast("customer.discount.updated")
  @scala.inline
  def customerDotsourceDotcreated: typingsJapgolly.stripe.stripeStrings.customerDotsourceDotcreated = this.cast("customer.source.created")
  @scala.inline
  def customerDotsourceDotdeleted: typingsJapgolly.stripe.stripeStrings.customerDotsourceDotdeleted = this.cast("customer.source.deleted")
  @scala.inline
  def customerDotsourceDotexpiring: typingsJapgolly.stripe.stripeStrings.customerDotsourceDotexpiring = this.cast("customer.source.expiring")
  @scala.inline
  def customerDotsourceDotupdated: typingsJapgolly.stripe.stripeStrings.customerDotsourceDotupdated = this.cast("customer.source.updated")
  @scala.inline
  def customerDotsubscriptionDotcreated: typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDotcreated = this.cast("customer.subscription.created")
  @scala.inline
  def customerDotsubscriptionDotdeleted: typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDotdeleted = this.cast("customer.subscription.deleted")
  @scala.inline
  def customerDotsubscriptionDottrial_will_end: typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end = this.cast("customer.subscription.trial_will_end")
  @scala.inline
  def customerDotsubscriptionDotupdated: typingsJapgolly.stripe.stripeStrings.customerDotsubscriptionDotupdated = this.cast("customer.subscription.updated")
  @scala.inline
  def customerDottax_idDotcreated: typingsJapgolly.stripe.stripeStrings.customerDottax_idDotcreated = this.cast("customer.tax_id.created")
  @scala.inline
  def customerDottax_idDotdeleted: typingsJapgolly.stripe.stripeStrings.customerDottax_idDotdeleted = this.cast("customer.tax_id.deleted")
  @scala.inline
  def customerDottax_idDotupdated: typingsJapgolly.stripe.stripeStrings.customerDottax_idDotupdated = this.cast("customer.tax_id.updated")
  @scala.inline
  def customerDotupdated: typingsJapgolly.stripe.stripeStrings.customerDotupdated = this.cast("customer.updated")
  @scala.inline
  def fileDotcreated: typingsJapgolly.stripe.stripeStrings.fileDotcreated = this.cast("file.created")
  @scala.inline
  def invoiceDotcreated: typingsJapgolly.stripe.stripeStrings.invoiceDotcreated = this.cast("invoice.created")
  @scala.inline
  def invoiceDotdeleted: typingsJapgolly.stripe.stripeStrings.invoiceDotdeleted = this.cast("invoice.deleted")
  @scala.inline
  def invoiceDotfinalized: typingsJapgolly.stripe.stripeStrings.invoiceDotfinalized = this.cast("invoice.finalized")
  @scala.inline
  def invoiceDotmarked_uncollectible: typingsJapgolly.stripe.stripeStrings.invoiceDotmarked_uncollectible = this.cast("invoice.marked_uncollectible")
  @scala.inline
  def invoiceDotpayment_action_required: typingsJapgolly.stripe.stripeStrings.invoiceDotpayment_action_required = this.cast("invoice.payment_action_required")
  @scala.inline
  def invoiceDotpayment_failed: typingsJapgolly.stripe.stripeStrings.invoiceDotpayment_failed = this.cast("invoice.payment_failed")
  @scala.inline
  def invoiceDotpayment_succeeded: typingsJapgolly.stripe.stripeStrings.invoiceDotpayment_succeeded = this.cast("invoice.payment_succeeded")
  @scala.inline
  def invoiceDotsent: typingsJapgolly.stripe.stripeStrings.invoiceDotsent = this.cast("invoice.sent")
  @scala.inline
  def invoiceDotupcoming: typingsJapgolly.stripe.stripeStrings.invoiceDotupcoming = this.cast("invoice.upcoming")
  @scala.inline
  def invoiceDotupdated: typingsJapgolly.stripe.stripeStrings.invoiceDotupdated = this.cast("invoice.updated")
  @scala.inline
  def invoiceDotvoided: typingsJapgolly.stripe.stripeStrings.invoiceDotvoided = this.cast("invoice.voided")
  @scala.inline
  def invoiceitemDotcreated: typingsJapgolly.stripe.stripeStrings.invoiceitemDotcreated = this.cast("invoiceitem.created")
  @scala.inline
  def invoiceitemDotdeleted: typingsJapgolly.stripe.stripeStrings.invoiceitemDotdeleted = this.cast("invoiceitem.deleted")
  @scala.inline
  def invoiceitemDotupdated: typingsJapgolly.stripe.stripeStrings.invoiceitemDotupdated = this.cast("invoiceitem.updated")
  @scala.inline
  def issuing_authorizationDotcreated: typingsJapgolly.stripe.stripeStrings.issuing_authorizationDotcreated = this.cast("issuing_authorization.created")
  @scala.inline
  def issuing_authorizationDotrequest: typingsJapgolly.stripe.stripeStrings.issuing_authorizationDotrequest = this.cast("issuing_authorization.request")
  @scala.inline
  def issuing_authorizationDotupdated: typingsJapgolly.stripe.stripeStrings.issuing_authorizationDotupdated = this.cast("issuing_authorization.updated")
  @scala.inline
  def issuing_cardDotcreated: typingsJapgolly.stripe.stripeStrings.issuing_cardDotcreated = this.cast("issuing_card.created")
  @scala.inline
  def issuing_cardDotupdated: typingsJapgolly.stripe.stripeStrings.issuing_cardDotupdated = this.cast("issuing_card.updated")
  @scala.inline
  def issuing_cardholderDotcreated: typingsJapgolly.stripe.stripeStrings.issuing_cardholderDotcreated = this.cast("issuing_cardholder.created")
  @scala.inline
  def issuing_cardholderDotupdated: typingsJapgolly.stripe.stripeStrings.issuing_cardholderDotupdated = this.cast("issuing_cardholder.updated")
  @scala.inline
  def issuing_disputeDotcreated: typingsJapgolly.stripe.stripeStrings.issuing_disputeDotcreated = this.cast("issuing_dispute.created")
  @scala.inline
  def issuing_disputeDotupdated: typingsJapgolly.stripe.stripeStrings.issuing_disputeDotupdated = this.cast("issuing_dispute.updated")
  @scala.inline
  def issuing_settlementDotcreated: typingsJapgolly.stripe.stripeStrings.issuing_settlementDotcreated = this.cast("issuing_settlement.created")
  @scala.inline
  def issuing_settlementDotupdated: typingsJapgolly.stripe.stripeStrings.issuing_settlementDotupdated = this.cast("issuing_settlement.updated")
  @scala.inline
  def issuing_transactionDotcreated: typingsJapgolly.stripe.stripeStrings.issuing_transactionDotcreated = this.cast("issuing_transaction.created")
  @scala.inline
  def issuing_transactionDotupdated: typingsJapgolly.stripe.stripeStrings.issuing_transactionDotupdated = this.cast("issuing_transaction.updated")
  @scala.inline
  def mandateDotupdated: typingsJapgolly.stripe.stripeStrings.mandateDotupdated = this.cast("mandate.updated")
  @scala.inline
  def orderDotcreated: typingsJapgolly.stripe.stripeStrings.orderDotcreated = this.cast("order.created")
  @scala.inline
  def orderDotpayment_failed: typingsJapgolly.stripe.stripeStrings.orderDotpayment_failed = this.cast("order.payment_failed")
  @scala.inline
  def orderDotpayment_succeeded: typingsJapgolly.stripe.stripeStrings.orderDotpayment_succeeded = this.cast("order.payment_succeeded")
  @scala.inline
  def orderDotupdated: typingsJapgolly.stripe.stripeStrings.orderDotupdated = this.cast("order.updated")
  @scala.inline
  def order_returnDotcreated: typingsJapgolly.stripe.stripeStrings.order_returnDotcreated = this.cast("order_return.created")
  @scala.inline
  def payment_intentDotamount_capturable_updated: typingsJapgolly.stripe.stripeStrings.payment_intentDotamount_capturable_updated = this.cast("payment_intent.amount_capturable_updated")
  @scala.inline
  def payment_intentDotcanceled: typingsJapgolly.stripe.stripeStrings.payment_intentDotcanceled = this.cast("payment_intent.canceled")
  @scala.inline
  def payment_intentDotcreated: typingsJapgolly.stripe.stripeStrings.payment_intentDotcreated = this.cast("payment_intent.created")
  @scala.inline
  def payment_intentDotpayment_failed: typingsJapgolly.stripe.stripeStrings.payment_intentDotpayment_failed = this.cast("payment_intent.payment_failed")
  @scala.inline
  def payment_intentDotsucceeded: typingsJapgolly.stripe.stripeStrings.payment_intentDotsucceeded = this.cast("payment_intent.succeeded")
  @scala.inline
  def payment_methodDotattached: typingsJapgolly.stripe.stripeStrings.payment_methodDotattached = this.cast("payment_method.attached")
  @scala.inline
  def payment_methodDotcard_automatically_updated: typingsJapgolly.stripe.stripeStrings.payment_methodDotcard_automatically_updated = this.cast("payment_method.card_automatically_updated")
  @scala.inline
  def payment_methodDotdetached: typingsJapgolly.stripe.stripeStrings.payment_methodDotdetached = this.cast("payment_method.detached")
  @scala.inline
  def payment_methodDotupdated: typingsJapgolly.stripe.stripeStrings.payment_methodDotupdated = this.cast("payment_method.updated")
  @scala.inline
  def payoutDotcanceled: typingsJapgolly.stripe.stripeStrings.payoutDotcanceled = this.cast("payout.canceled")
  @scala.inline
  def payoutDotcreated: typingsJapgolly.stripe.stripeStrings.payoutDotcreated = this.cast("payout.created")
  @scala.inline
  def payoutDotfailed: typingsJapgolly.stripe.stripeStrings.payoutDotfailed = this.cast("payout.failed")
  @scala.inline
  def payoutDotpaid: typingsJapgolly.stripe.stripeStrings.payoutDotpaid = this.cast("payout.paid")
  @scala.inline
  def payoutDotupdated: typingsJapgolly.stripe.stripeStrings.payoutDotupdated = this.cast("payout.updated")
  @scala.inline
  def personDotcreated: typingsJapgolly.stripe.stripeStrings.personDotcreated = this.cast("person.created")
  @scala.inline
  def personDotdeleted: typingsJapgolly.stripe.stripeStrings.personDotdeleted = this.cast("person.deleted")
  @scala.inline
  def personDotupdated: typingsJapgolly.stripe.stripeStrings.personDotupdated = this.cast("person.updated")
  @scala.inline
  def planDotcreated: typingsJapgolly.stripe.stripeStrings.planDotcreated = this.cast("plan.created")
  @scala.inline
  def planDotdeleted: typingsJapgolly.stripe.stripeStrings.planDotdeleted = this.cast("plan.deleted")
  @scala.inline
  def planDotupdated: typingsJapgolly.stripe.stripeStrings.planDotupdated = this.cast("plan.updated")
  @scala.inline
  def productDotcreated: typingsJapgolly.stripe.stripeStrings.productDotcreated = this.cast("product.created")
  @scala.inline
  def productDotdeleted: typingsJapgolly.stripe.stripeStrings.productDotdeleted = this.cast("product.deleted")
  @scala.inline
  def productDotupdated: typingsJapgolly.stripe.stripeStrings.productDotupdated = this.cast("product.updated")
  @scala.inline
  def radarDotearly_fraud_warningDotcreated: typingsJapgolly.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated = this.cast("radar.early_fraud_warning.created")
  @scala.inline
  def radarDotearly_fraud_warningDotupdated: typingsJapgolly.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated = this.cast("radar.early_fraud_warning.updated")
  @scala.inline
  def recipientDotcreated: typingsJapgolly.stripe.stripeStrings.recipientDotcreated = this.cast("recipient.created")
  @scala.inline
  def recipientDotdeleted: typingsJapgolly.stripe.stripeStrings.recipientDotdeleted = this.cast("recipient.deleted")
  @scala.inline
  def recipientDotupdated: typingsJapgolly.stripe.stripeStrings.recipientDotupdated = this.cast("recipient.updated")
  @scala.inline
  def reportingDotreport_runDotfailed: typingsJapgolly.stripe.stripeStrings.reportingDotreport_runDotfailed = this.cast("reporting.report_run.failed")
  @scala.inline
  def reportingDotreport_runDotsucceeded: typingsJapgolly.stripe.stripeStrings.reportingDotreport_runDotsucceeded = this.cast("reporting.report_run.succeeded")
  @scala.inline
  def reportingDotreport_typeDotupdated: typingsJapgolly.stripe.stripeStrings.reportingDotreport_typeDotupdated = this.cast("reporting.report_type.updated")
  @scala.inline
  def reviewDotclosed: typingsJapgolly.stripe.stripeStrings.reviewDotclosed = this.cast("review.closed")
  @scala.inline
  def reviewDotopened: typingsJapgolly.stripe.stripeStrings.reviewDotopened = this.cast("review.opened")
  @scala.inline
  def setup_intentDotcanceled: typingsJapgolly.stripe.stripeStrings.setup_intentDotcanceled = this.cast("setup_intent.canceled")
  @scala.inline
  def setup_intentDotcreated: typingsJapgolly.stripe.stripeStrings.setup_intentDotcreated = this.cast("setup_intent.created")
  @scala.inline
  def setup_intentDotsetup_failed: typingsJapgolly.stripe.stripeStrings.setup_intentDotsetup_failed = this.cast("setup_intent.setup_failed")
  @scala.inline
  def setup_intentDotsucceeded: typingsJapgolly.stripe.stripeStrings.setup_intentDotsucceeded = this.cast("setup_intent.succeeded")
  @scala.inline
  def sigmaDotscheduled_query_runDotcreated: typingsJapgolly.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated = this.cast("sigma.scheduled_query_run.created")
  @scala.inline
  def skuDotcreated: typingsJapgolly.stripe.stripeStrings.skuDotcreated = this.cast("sku.created")
  @scala.inline
  def skuDotdeleted: typingsJapgolly.stripe.stripeStrings.skuDotdeleted = this.cast("sku.deleted")
  @scala.inline
  def skuDotupdated: typingsJapgolly.stripe.stripeStrings.skuDotupdated = this.cast("sku.updated")
  @scala.inline
  def sourceDotcanceled: typingsJapgolly.stripe.stripeStrings.sourceDotcanceled = this.cast("source.canceled")
  @scala.inline
  def sourceDotchargeable: typingsJapgolly.stripe.stripeStrings.sourceDotchargeable = this.cast("source.chargeable")
  @scala.inline
  def sourceDotfailed: typingsJapgolly.stripe.stripeStrings.sourceDotfailed = this.cast("source.failed")
  @scala.inline
  def sourceDotmandate_notification: typingsJapgolly.stripe.stripeStrings.sourceDotmandate_notification = this.cast("source.mandate_notification")
  @scala.inline
  def sourceDotrefund_attributes_required: typingsJapgolly.stripe.stripeStrings.sourceDotrefund_attributes_required = this.cast("source.refund_attributes_required")
  @scala.inline
  def sourceDottransactionDotcreated: typingsJapgolly.stripe.stripeStrings.sourceDottransactionDotcreated = this.cast("source.transaction.created")
  @scala.inline
  def sourceDottransactionDotupdated: typingsJapgolly.stripe.stripeStrings.sourceDottransactionDotupdated = this.cast("source.transaction.updated")
  @scala.inline
  def subscription_scheduleDotaborted: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotaborted = this.cast("subscription_schedule.aborted")
  @scala.inline
  def subscription_scheduleDotcanceled: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotcanceled = this.cast("subscription_schedule.canceled")
  @scala.inline
  def subscription_scheduleDotcompleted: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotcompleted = this.cast("subscription_schedule.completed")
  @scala.inline
  def subscription_scheduleDotcreated: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotcreated = this.cast("subscription_schedule.created")
  @scala.inline
  def subscription_scheduleDotexpiring: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotexpiring = this.cast("subscription_schedule.expiring")
  @scala.inline
  def subscription_scheduleDotreleased: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotreleased = this.cast("subscription_schedule.released")
  @scala.inline
  def subscription_scheduleDotupdated: typingsJapgolly.stripe.stripeStrings.subscription_scheduleDotupdated = this.cast("subscription_schedule.updated")
  @scala.inline
  def tax_rateDotcreated: typingsJapgolly.stripe.stripeStrings.tax_rateDotcreated = this.cast("tax_rate.created")
  @scala.inline
  def tax_rateDotupdated: typingsJapgolly.stripe.stripeStrings.tax_rateDotupdated = this.cast("tax_rate.updated")
  @scala.inline
  def topupDotcreated: typingsJapgolly.stripe.stripeStrings.topupDotcreated = this.cast("topup.created")
  @scala.inline
  def topupDotfailed: typingsJapgolly.stripe.stripeStrings.topupDotfailed = this.cast("topup.failed")
  @scala.inline
  def topupDotreversed: typingsJapgolly.stripe.stripeStrings.topupDotreversed = this.cast("topup.reversed")
  @scala.inline
  def topupDotsucceeded: typingsJapgolly.stripe.stripeStrings.topupDotsucceeded = this.cast("topup.succeeded")
  @scala.inline
  def transferDotcreated: typingsJapgolly.stripe.stripeStrings.transferDotcreated = this.cast("transfer.created")
  @scala.inline
  def transferDotfailed: typingsJapgolly.stripe.stripeStrings.transferDotfailed = this.cast("transfer.failed")
  @scala.inline
  def transferDotpaid: typingsJapgolly.stripe.stripeStrings.transferDotpaid = this.cast("transfer.paid")
  @scala.inline
  def transferDotreversed: typingsJapgolly.stripe.stripeStrings.transferDotreversed = this.cast("transfer.reversed")
  @scala.inline
  def transferDotupdated: typingsJapgolly.stripe.stripeStrings.transferDotupdated = this.cast("transfer.updated")
}

