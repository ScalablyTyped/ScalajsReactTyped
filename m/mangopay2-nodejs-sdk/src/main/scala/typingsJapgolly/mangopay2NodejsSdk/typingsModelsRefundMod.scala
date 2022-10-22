package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsRefundMod {
  
  object refund {
    
    trait CreatePayInRefund extends StObject {
      
      var AuthorId: String
      
      var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
      
      var Fees: js.UndefOr[MoneyData] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreatePayInRefund {
      
      inline def apply(AuthorId: String): CreatePayInRefund = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreatePayInRefund]
      }
      
      extension [Self <: CreatePayInRefund](x: Self) {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
        
        inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
        
        inline def setFeesUndefined: Self = StObject.set(x, "Fees", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait CreateTransferRefund extends StObject {
      
      var AuthorId: String
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateTransferRefund {
      
      inline def apply(AuthorId: String): CreateTransferRefund = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateTransferRefund]
      }
      
      extension [Self <: CreateTransferRefund](x: Self) {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait RefundData
      extends StObject
         with TransactionData {
      
      /**
        * The initial transaction ID
        */
      var InitialTransactionId: String
      
      /**
        * The initial transaction type
        */
      var InitialTransactionType: TransactionType
      
      /**
        * The nature of the transaction
        */
      @JSName("Nature")
      var Nature_RefundData: REFUND
      
      /**
        * Contains info about the reason for refund
        */
      var RefundReason: typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReason
    }
    object RefundData {
      
      inline def apply(
        AuthorId: String,
        CreationDate: Double,
        CreditedFunds: MoneyData,
        CreditedUserId: String,
        CreditedWalletId: String,
        DebitedFunds: MoneyData,
        DebitedWalletId: String,
        ExecutionDate: Timestamp,
        Fees: MoneyData,
        Id: String,
        InitialTransactionId: String,
        InitialTransactionType: TransactionType,
        RefundReason: RefundReason,
        ResultCode: String,
        ResultMessage: String,
        Status: TransactionStatus,
        Tag: String,
        Type: TransactionType
      ): RefundData = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = "REFUND", RefundReason = RefundReason.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[RefundData]
      }
      
      extension [Self <: RefundData](x: Self) {
        
        inline def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
        
        inline def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
        
        inline def setNature(value: REFUND): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
        
        inline def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
      }
    }
    
    trait RefundReason extends StObject {
      
      var RefundReasonType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReasonType
    }
    object RefundReason {
      
      inline def apply(RefundReasonType: RefundReasonType): RefundReason = {
        val __obj = js.Dynamic.literal(RefundReasonType = RefundReasonType.asInstanceOf[js.Any])
        __obj.asInstanceOf[RefundReason]
      }
      
      extension [Self <: RefundReason](x: Self) {
        
        inline def setRefundReasonType(value: RefundReasonType): Self = StObject.set(x, "RefundReasonType", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
    */
    trait RefundReasonType extends StObject
    object RefundReasonType {
      
      inline def BANKACCOUNT_HAS_BEEN_CLOSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED = "BANKACCOUNT_HAS_BEEN_CLOSED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_HAS_BEEN_CLOSED]
      
      inline def BANKACCOUNT_INCORRECT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT = "BANKACCOUNT_INCORRECT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANKACCOUNT_INCORRECT]
      
      inline def INITIALIZED_BY_CLIENT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT = "INITIALIZED_BY_CLIENT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INITIALIZED_BY_CLIENT]
      
      inline def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
      
      inline def OWNER_DO_NOT_MATCH_BANKACCOUNT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT = "OWNER_DO_NOT_MATCH_BANKACCOUNT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OWNER_DO_NOT_MATCH_BANKACCOUNT]
      
      inline def WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS = "WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WITHDRAWAL_IMPOSSIBLE_ON_SAVINGS_ACCOUNTS]
    }
  }
}
