package typingsJapgolly.stellarSdk.mod

import typingsJapgolly.stellarBase.mod.Operation.AccountMerge_
import typingsJapgolly.stellarBase.mod.Operation.AllowTrust_
import typingsJapgolly.stellarBase.mod.Operation.BumpSequence_
import typingsJapgolly.stellarBase.mod.Operation.ChangeTrust_
import typingsJapgolly.stellarBase.mod.Operation.CreateAccount_
import typingsJapgolly.stellarBase.mod.Operation.CreatePassiveSellOffer_
import typingsJapgolly.stellarBase.mod.Operation.Inflation_
import typingsJapgolly.stellarBase.mod.Operation.ManageBuyOffer_
import typingsJapgolly.stellarBase.mod.Operation.ManageData_
import typingsJapgolly.stellarBase.mod.Operation.ManageSellOffer_
import typingsJapgolly.stellarBase.mod.Operation.PathPaymentStrictReceive_
import typingsJapgolly.stellarBase.mod.Operation.PathPaymentStrictSend_
import typingsJapgolly.stellarBase.mod.Operation.Payment_
import typingsJapgolly.stellarBase.mod.Operation.SetOptions_
import typingsJapgolly.stellarBase.mod.OperationOptions.AccountMerge
import typingsJapgolly.stellarBase.mod.OperationOptions.AllowTrust
import typingsJapgolly.stellarBase.mod.OperationOptions.BumpSequence
import typingsJapgolly.stellarBase.mod.OperationOptions.ChangeTrust
import typingsJapgolly.stellarBase.mod.OperationOptions.CreateAccount
import typingsJapgolly.stellarBase.mod.OperationOptions.CreatePassiveSellOffer
import typingsJapgolly.stellarBase.mod.OperationOptions.Inflation
import typingsJapgolly.stellarBase.mod.OperationOptions.ManageBuyOffer
import typingsJapgolly.stellarBase.mod.OperationOptions.ManageData
import typingsJapgolly.stellarBase.mod.OperationOptions.ManageSellOffer
import typingsJapgolly.stellarBase.mod.OperationOptions.PathPaymentStrictReceive
import typingsJapgolly.stellarBase.mod.OperationOptions.PathPaymentStrictSend
import typingsJapgolly.stellarBase.mod.OperationOptions.Payment
import typingsJapgolly.stellarBase.mod.OperationOptions.SetOptions
import typingsJapgolly.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Operation")
@js.native
object Operation extends js.Object {
  def accountMerge(options: AccountMerge): typingsJapgolly.stellarBase.mod.xdr.Operation[AccountMerge_] = js.native
  def allowTrust(options: AllowTrust): typingsJapgolly.stellarBase.mod.xdr.Operation[AllowTrust_] = js.native
  def bumpSequence(options: BumpSequence): typingsJapgolly.stellarBase.mod.xdr.Operation[BumpSequence_] = js.native
  def changeTrust(options: ChangeTrust): typingsJapgolly.stellarBase.mod.xdr.Operation[ChangeTrust_] = js.native
  def createAccount(options: CreateAccount): typingsJapgolly.stellarBase.mod.xdr.Operation[CreateAccount_] = js.native
  def createPassiveSellOffer(options: CreatePassiveSellOffer): typingsJapgolly.stellarBase.mod.xdr.Operation[CreatePassiveSellOffer_] = js.native
  def fromXDRObject[T /* <: typingsJapgolly.stellarBase.mod.Operation */](xdrOperation: typingsJapgolly.stellarBase.mod.xdr.Operation[T]): T = js.native
  def inflation(options: Inflation): typingsJapgolly.stellarBase.mod.xdr.Operation[Inflation_] = js.native
  def manageBuyOffer(options: ManageBuyOffer): typingsJapgolly.stellarBase.mod.xdr.Operation[ManageBuyOffer_] = js.native
  def manageData(options: ManageData): typingsJapgolly.stellarBase.mod.xdr.Operation[ManageData_] = js.native
  def manageSellOffer(options: ManageSellOffer): typingsJapgolly.stellarBase.mod.xdr.Operation[ManageSellOffer_] = js.native
  def pathPayment(options: PathPaymentStrictReceive): typingsJapgolly.stellarBase.mod.xdr.Operation[PathPaymentStrictReceive_] = js.native
  def pathPaymentStrictReceive(options: PathPaymentStrictReceive): typingsJapgolly.stellarBase.mod.xdr.Operation[PathPaymentStrictReceive_] = js.native
  def pathPaymentStrictSend(options: PathPaymentStrictSend): typingsJapgolly.stellarBase.mod.xdr.Operation[PathPaymentStrictSend_] = js.native
  def payment(options: Payment): typingsJapgolly.stellarBase.mod.xdr.Operation[Payment_] = js.native
  def setOptions[T /* <: SignerOptions */](options: SetOptions[T]): typingsJapgolly.stellarBase.mod.xdr.Operation[SetOptions_[T]] = js.native
}

