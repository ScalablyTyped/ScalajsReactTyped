package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.BasePayInData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.PayIn")
@js.native
open class PayIn protected ()
  extends EntityBase[BasePayInData]
     with BasePayInData {
  def this(data: Any) = this()
  
  /**
    * A user's ID
    */
  /* CompleteClass */
  var AuthorId: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  /* CompleteClass */
  var CreditedFunds: MoneyData = js.native
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  /* CompleteClass */
  var CreditedUserId: String = js.native
  
  /**
    * The ID of the wallet where money will be credited
    */
  /* CompleteClass */
  var CreditedWalletId: String = js.native
  
  /**
    * Information about the funds that are being debited
    */
  /* CompleteClass */
  var DebitedFunds: MoneyData = js.native
  
  /**
    * The ID of the wallet that was debited
    */
  /* CompleteClass */
  var DebitedWalletId: String = js.native
  
  /**
    * When the transaction happened
    */
  /* CompleteClass */
  var ExecutionDate: Timestamp = js.native
  
  /**
    * The type of execution for the payin
    */
  /* CompleteClass */
  var ExecutionType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInExecutionType = js.native
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  /* CompleteClass */
  var Fees: MoneyData = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  var Nature: TransactionNature = js.native
  
  /**
    * The type of payin
    */
  /* CompleteClass */
  var PaymentType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.PayInPaymentType = js.native
  
  /**
    * The result code
    */
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /**
    * The status of the transaction
    */
  /* CompleteClass */
  var Status: TransactionStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The type of the transaction
    */
  /* CompleteClass */
  var Type: TransactionType = js.native
}
