package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.PartialRepudiationData
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typingsJapgolly.mangopay2NodejsSdk.mod.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.mod.Timestamp
import typingsJapgolly.mangopay2NodejsSdk.mod.repudiation.RepudiationData
import typingsJapgolly.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typingsJapgolly.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsJapgolly.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Repudiation")
@js.native
class Repudiation protected ()
  extends EntityBase[RepudiationData]
     with RepudiationData {
  def this(data: PartialRepudiationData) = this()
  /**
    * A user's ID
    */
  /* CompleteClass */
  override var AuthorId: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  /* CompleteClass */
  override var CreditedFunds: MoneyData = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  /* CompleteClass */
  override var CreditedUserId: String = js.native
  /**
    * The ID of the wallet where money will be credited
    */
  /* CompleteClass */
  override var CreditedWalletId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  /* CompleteClass */
  override var DebitedFunds: MoneyData = js.native
  /**
    * The ID of the wallet that was debited
    */
  /* CompleteClass */
  override var DebitedWalletId: String = js.native
  /**
    * When the transaction happened
    */
  /* CompleteClass */
  override var ExecutionDate: Timestamp = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  /* CompleteClass */
  override var Fees: MoneyData = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The initial transaction ID
    */
  /* CompleteClass */
  override var InitialTransactionId: String = js.native
  /**
    * The initial transaction type
    */
  /* CompleteClass */
  override var InitialTransactionType: TransactionType = js.native
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  override var Nature: TransactionNature = js.native
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  @JSName("Nature")
  override var Nature_RepudiationData: REPUDIATION = js.native
  /**
    * Contains info about the reason for refund
    */
  /* CompleteClass */
  override var RefundReason: typingsJapgolly.mangopay2NodejsSdk.mod.refund.RefundReason = js.native
  /**
    * The result code
    */
  /* CompleteClass */
  override var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  override var ResultMessage: String = js.native
  /**
    * The status of the transaction
    */
  /* CompleteClass */
  override var Status: TransactionStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The type of the transaction
    */
  /* CompleteClass */
  override var Type: TransactionType = js.native
}

