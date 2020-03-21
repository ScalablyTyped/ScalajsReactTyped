package typingsJapgolly.mangopay2NodejsSdk.mod.event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED
  - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def DISPUTE_ACTION_REQUIRED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_ACTION_REQUIRED = this.cast("DISPUTE_ACTION_REQUIRED")
  @scala.inline
  def DISPUTE_CLOSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CLOSED = this.cast("DISPUTE_CLOSED")
  @scala.inline
  def DISPUTE_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_CREATED = this.cast("DISPUTE_CREATED")
  @scala.inline
  def DISPUTE_DOCUMENT_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_CREATED = this.cast("DISPUTE_DOCUMENT_CREATED")
  @scala.inline
  def DISPUTE_DOCUMENT_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_FAILED = this.cast("DISPUTE_DOCUMENT_FAILED")
  @scala.inline
  def DISPUTE_DOCUMENT_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_SUCCEEDED = this.cast("DISPUTE_DOCUMENT_SUCCEEDED")
  @scala.inline
  def DISPUTE_DOCUMENT_VALIDATION_ASKED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_DOCUMENT_VALIDATION_ASKED = this.cast("DISPUTE_DOCUMENT_VALIDATION_ASKED")
  @scala.inline
  def DISPUTE_FURTHER_ACTION_REQUIRED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_FURTHER_ACTION_REQUIRED = this.cast("DISPUTE_FURTHER_ACTION_REQUIRED")
  @scala.inline
  def DISPUTE_SENT_TO_BANK: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SENT_TO_BANK = this.cast("DISPUTE_SENT_TO_BANK")
  @scala.inline
  def DISPUTE_SUBMITTED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISPUTE_SUBMITTED = this.cast("DISPUTE_SUBMITTED")
  @scala.inline
  def KYC_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_CREATED = this.cast("KYC_CREATED")
  @scala.inline
  def KYC_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_FAILED = this.cast("KYC_FAILED")
  @scala.inline
  def KYC_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_SUCCEEDED = this.cast("KYC_SUCCEEDED")
  @scala.inline
  def KYC_VALIDATION_ASKED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.KYC_VALIDATION_ASKED = this.cast("KYC_VALIDATION_ASKED")
  @scala.inline
  def MANDATE_ACTIVATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_ACTIVATED = this.cast("MANDATE_ACTIVATED")
  @scala.inline
  def MANDATE_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_CREATED = this.cast("MANDATE_CREATED")
  @scala.inline
  def MANDATE_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_FAILED = this.cast("MANDATE_FAILED")
  @scala.inline
  def MANDATE_SUBMITTED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MANDATE_SUBMITTED = this.cast("MANDATE_SUBMITTED")
  @scala.inline
  def PAYIN_NORMAL_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_CREATED = this.cast("PAYIN_NORMAL_CREATED")
  @scala.inline
  def PAYIN_NORMAL_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_FAILED = this.cast("PAYIN_NORMAL_FAILED")
  @scala.inline
  def PAYIN_NORMAL_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_NORMAL_SUCCEEDED = this.cast("PAYIN_NORMAL_SUCCEEDED")
  @scala.inline
  def PAYIN_REFUND_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_CREATED = this.cast("PAYIN_REFUND_CREATED")
  @scala.inline
  def PAYIN_REFUND_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_FAILED = this.cast("PAYIN_REFUND_FAILED")
  @scala.inline
  def PAYIN_REFUND_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REFUND_SUCCEEDED = this.cast("PAYIN_REFUND_SUCCEEDED")
  @scala.inline
  def PAYIN_REPUDIATION_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_CREATED = this.cast("PAYIN_REPUDIATION_CREATED")
  @scala.inline
  def PAYIN_REPUDIATION_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_FAILED = this.cast("PAYIN_REPUDIATION_FAILED")
  @scala.inline
  def PAYIN_REPUDIATION_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN_REPUDIATION_SUCCEEDED = this.cast("PAYIN_REPUDIATION_SUCCEEDED")
  @scala.inline
  def PAYOUT_NORMAL_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_CREATED = this.cast("PAYOUT_NORMAL_CREATED")
  @scala.inline
  def PAYOUT_NORMAL_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_FAILED = this.cast("PAYOUT_NORMAL_FAILED")
  @scala.inline
  def PAYOUT_NORMAL_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_NORMAL_SUCCEEDED = this.cast("PAYOUT_NORMAL_SUCCEEDED")
  @scala.inline
  def PAYOUT_REFUND_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_CREATED = this.cast("PAYOUT_REFUND_CREATED")
  @scala.inline
  def PAYOUT_REFUND_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_FAILED = this.cast("PAYOUT_REFUND_FAILED")
  @scala.inline
  def PAYOUT_REFUND_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT_REFUND_SUCCEEDED = this.cast("PAYOUT_REFUND_SUCCEEDED")
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_CANCELED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_CANCELED = this.cast("PREAUTHORIZATION_PAYMENT_CANCELED")
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_EXPIRED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_EXPIRED = this.cast("PREAUTHORIZATION_PAYMENT_EXPIRED")
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_VALIDATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_VALIDATED = this.cast("PREAUTHORIZATION_PAYMENT_VALIDATED")
  @scala.inline
  def PREAUTHORIZATION_PAYMENT_WAITING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZATION_PAYMENT_WAITING = this.cast("PREAUTHORIZATION_PAYMENT_WAITING")
  @scala.inline
  def TRANSFER_NORMAL_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_CREATED = this.cast("TRANSFER_NORMAL_CREATED")
  @scala.inline
  def TRANSFER_NORMAL_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_FAILED = this.cast("TRANSFER_NORMAL_FAILED")
  @scala.inline
  def TRANSFER_NORMAL_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_NORMAL_SUCCEEDED = this.cast("TRANSFER_NORMAL_SUCCEEDED")
  @scala.inline
  def TRANSFER_REFUND_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_CREATED = this.cast("TRANSFER_REFUND_CREATED")
  @scala.inline
  def TRANSFER_REFUND_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_FAILED = this.cast("TRANSFER_REFUND_FAILED")
  @scala.inline
  def TRANSFER_REFUND_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_REFUND_SUCCEEDED = this.cast("TRANSFER_REFUND_SUCCEEDED")
  @scala.inline
  def TRANSFER_SETTLEMENT_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_CREATED = this.cast("TRANSFER_SETTLEMENT_CREATED")
  @scala.inline
  def TRANSFER_SETTLEMENT_FAILED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_FAILED = this.cast("TRANSFER_SETTLEMENT_FAILED")
  @scala.inline
  def TRANSFER_SETTLEMENT_SUCCEEDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER_SETTLEMENT_SUCCEEDED = this.cast("TRANSFER_SETTLEMENT_SUCCEEDED")
  @scala.inline
  def UBO_DECLARATION_CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_CREATED = this.cast("UBO_DECLARATION_CREATED")
  @scala.inline
  def UBO_DECLARATION_REFUSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_REFUSED = this.cast("UBO_DECLARATION_REFUSED")
  @scala.inline
  def UBO_DECLARATION_VALIDATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATED = this.cast("UBO_DECLARATION_VALIDATED")
  @scala.inline
  def UBO_DECLARATION_VALIDATION_ASKED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UBO_DECLARATION_VALIDATION_ASKED = this.cast("UBO_DECLARATION_VALIDATION_ASKED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

