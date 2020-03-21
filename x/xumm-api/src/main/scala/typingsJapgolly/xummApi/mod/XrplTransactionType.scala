package typingsJapgolly.xummApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xummApi.xummApiStrings.Payment
  - typingsJapgolly.xummApi.xummApiStrings.OfferCreate
  - typingsJapgolly.xummApi.xummApiStrings.OfferCancel
  - typingsJapgolly.xummApi.xummApiStrings.EscrowFinish
  - typingsJapgolly.xummApi.xummApiStrings.EscrowCreate
  - typingsJapgolly.xummApi.xummApiStrings.EscrowCancel
  - typingsJapgolly.xummApi.xummApiStrings.DepositPreauth
  - typingsJapgolly.xummApi.xummApiStrings.CheckCreate
  - typingsJapgolly.xummApi.xummApiStrings.CheckCash
  - typingsJapgolly.xummApi.xummApiStrings.CheckCancel
  - typingsJapgolly.xummApi.xummApiStrings.AccountSet
  - typingsJapgolly.xummApi.xummApiStrings.PaymentChannelCreate
  - typingsJapgolly.xummApi.xummApiStrings.PaymentChannelFund
  - typingsJapgolly.xummApi.xummApiStrings.SetRegularKey
  - typingsJapgolly.xummApi.xummApiStrings.SignerListSet
  - typingsJapgolly.xummApi.xummApiStrings.TrustSet
  - typingsJapgolly.xummApi.xummApiStrings.EnableAmendment
  - typingsJapgolly.xummApi.xummApiStrings.SetFee
*/
trait XrplTransactionType extends js.Object

object XrplTransactionType {
  @scala.inline
  def AccountSet: typingsJapgolly.xummApi.xummApiStrings.AccountSet = this.cast("AccountSet")
  @scala.inline
  def CheckCancel: typingsJapgolly.xummApi.xummApiStrings.CheckCancel = this.cast("CheckCancel")
  @scala.inline
  def CheckCash: typingsJapgolly.xummApi.xummApiStrings.CheckCash = this.cast("CheckCash")
  @scala.inline
  def CheckCreate: typingsJapgolly.xummApi.xummApiStrings.CheckCreate = this.cast("CheckCreate")
  @scala.inline
  def DepositPreauth: typingsJapgolly.xummApi.xummApiStrings.DepositPreauth = this.cast("DepositPreauth")
  @scala.inline
  def EnableAmendment: typingsJapgolly.xummApi.xummApiStrings.EnableAmendment = this.cast("EnableAmendment")
  @scala.inline
  def EscrowCancel: typingsJapgolly.xummApi.xummApiStrings.EscrowCancel = this.cast("EscrowCancel")
  @scala.inline
  def EscrowCreate: typingsJapgolly.xummApi.xummApiStrings.EscrowCreate = this.cast("EscrowCreate")
  @scala.inline
  def EscrowFinish: typingsJapgolly.xummApi.xummApiStrings.EscrowFinish = this.cast("EscrowFinish")
  @scala.inline
  def OfferCancel: typingsJapgolly.xummApi.xummApiStrings.OfferCancel = this.cast("OfferCancel")
  @scala.inline
  def OfferCreate: typingsJapgolly.xummApi.xummApiStrings.OfferCreate = this.cast("OfferCreate")
  @scala.inline
  def Payment: typingsJapgolly.xummApi.xummApiStrings.Payment = this.cast("Payment")
  @scala.inline
  def PaymentChannelCreate: typingsJapgolly.xummApi.xummApiStrings.PaymentChannelCreate = this.cast("PaymentChannelCreate")
  @scala.inline
  def PaymentChannelFund: typingsJapgolly.xummApi.xummApiStrings.PaymentChannelFund = this.cast("PaymentChannelFund")
  @scala.inline
  def SetFee: typingsJapgolly.xummApi.xummApiStrings.SetFee = this.cast("SetFee")
  @scala.inline
  def SetRegularKey: typingsJapgolly.xummApi.xummApiStrings.SetRegularKey = this.cast("SetRegularKey")
  @scala.inline
  def SignerListSet: typingsJapgolly.xummApi.xummApiStrings.SignerListSet = this.cast("SignerListSet")
  @scala.inline
  def TrustSet: typingsJapgolly.xummApi.xummApiStrings.TrustSet = this.cast("TrustSet")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

