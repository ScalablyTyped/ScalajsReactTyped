package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReason
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsSettlementTransferMod {
  
  object settlementTransfer {
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/settlementTransfer.settlementTransfer.SettlementTransferData, 'Tag', 'AuthorId' | 'DebitedFunds' | 'Fees'> */
    trait CreateSettlementTransfer extends StObject {
      
      var AuthorId: String
      
      var DebitedFunds: MoneyData
      
      var Fees: MoneyData
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateSettlementTransfer {
      
      inline def apply(AuthorId: String, DebitedFunds: MoneyData, Fees: MoneyData): CreateSettlementTransfer = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateSettlementTransfer]
      }
      
      extension [Self <: CreateSettlementTransfer](x: Self) {
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
        
        inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait SettlementTransferData
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
      var Nature_SettlementTransferData: SETTLEMENT
      
      /**
        * Contains info about the reason for refund
        */
      var RefundReason: typingsJapgolly.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReason
      
      /**
        * The ID of the associated repudiation transaction
        */
      var RepudiationId: String
    }
    object SettlementTransferData {
      
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
        RepudiationId: String,
        ResultCode: String,
        ResultMessage: String,
        Status: TransactionStatus,
        Tag: String,
        Type: TransactionType
      ): SettlementTransferData = {
        val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = "SETTLEMENT", RefundReason = RefundReason.asInstanceOf[js.Any], RepudiationId = RepudiationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[SettlementTransferData]
      }
      
      extension [Self <: SettlementTransferData](x: Self) {
        
        inline def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
        
        inline def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
        
        inline def setNature(value: SETTLEMENT): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
        
        inline def setRefundReason(value: RefundReason): Self = StObject.set(x, "RefundReason", value.asInstanceOf[js.Any])
        
        inline def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
      }
    }
  }
}
