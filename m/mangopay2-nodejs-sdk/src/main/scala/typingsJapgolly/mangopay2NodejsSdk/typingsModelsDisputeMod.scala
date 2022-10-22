package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsDisputeMod {
  
  object dispute {
    
    trait DisputeData
      extends StObject
         with EntityBaseData {
      
      /**
        * The deadline by which you must contest the dispute (if you wish to contest it)
        */
      var ContestDeadlineDate: Timestamp
      
      /**
        * The amount you wish to contest
        */
      var ContestedFunds: MoneyData
      
      /**
        * Info about the reason for the dispute
        */
      var DisputeReason: typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeReason
      
      /**
        * The type of dispute
        */
      var DisputeType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeType
      
      /**
        * The amount of funds that were disputed
        */
      var DisputedFunds: MoneyData
      
      /**
        * The initial transaction ID
        */
      var InitialTransactionId: String
      
      /**
        * The initial transaction type
        */
      var InitialTransactionType: TransactionType
      
      /**
        * The ID of the associated repudiation transaction
        */
      var RepudiationId: String
      
      /**
        * The result code
        */
      var ResultCode: String
      
      /**
        * A verbal explanation of the ResultCode
        */
      var ResultMessage: String
      
      /**
        * The status of the dispute
        */
      var Status: DisputeStatus
      
      /**
        * Used to communicate information about the dispute status to you
        */
      var StatusMessage: String
    }
    object DisputeData {
      
      inline def apply(
        ContestDeadlineDate: Timestamp,
        ContestedFunds: MoneyData,
        CreationDate: Double,
        DisputeReason: DisputeReason,
        DisputeType: DisputeType,
        DisputedFunds: MoneyData,
        Id: String,
        InitialTransactionId: String,
        InitialTransactionType: TransactionType,
        RepudiationId: String,
        ResultCode: String,
        ResultMessage: String,
        Status: DisputeStatus,
        StatusMessage: String,
        Tag: String
      ): DisputeData = {
        val __obj = js.Dynamic.literal(ContestDeadlineDate = ContestDeadlineDate.asInstanceOf[js.Any], ContestedFunds = ContestedFunds.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DisputeReason = DisputeReason.asInstanceOf[js.Any], DisputeType = DisputeType.asInstanceOf[js.Any], DisputedFunds = DisputedFunds.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], RepudiationId = RepudiationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusMessage = StatusMessage.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[DisputeData]
      }
      
      extension [Self <: DisputeData](x: Self) {
        
        inline def setContestDeadlineDate(value: Timestamp): Self = StObject.set(x, "ContestDeadlineDate", value.asInstanceOf[js.Any])
        
        inline def setContestedFunds(value: MoneyData): Self = StObject.set(x, "ContestedFunds", value.asInstanceOf[js.Any])
        
        inline def setDisputeReason(value: DisputeReason): Self = StObject.set(x, "DisputeReason", value.asInstanceOf[js.Any])
        
        inline def setDisputeType(value: DisputeType): Self = StObject.set(x, "DisputeType", value.asInstanceOf[js.Any])
        
        inline def setDisputedFunds(value: MoneyData): Self = StObject.set(x, "DisputedFunds", value.asInstanceOf[js.Any])
        
        inline def setInitialTransactionId(value: String): Self = StObject.set(x, "InitialTransactionId", value.asInstanceOf[js.Any])
        
        inline def setInitialTransactionType(value: TransactionType): Self = StObject.set(x, "InitialTransactionType", value.asInstanceOf[js.Any])
        
        inline def setRepudiationId(value: String): Self = StObject.set(x, "RepudiationId", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: DisputeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
      }
    }
    
    trait DisputeReason extends StObject {
      
      var DisputeReasonMessage: String
      
      var DisputeReasonType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeMod.dispute.DisputeReasonType
    }
    object DisputeReason {
      
      inline def apply(DisputeReasonMessage: String, DisputeReasonType: DisputeReasonType): DisputeReason = {
        val __obj = js.Dynamic.literal(DisputeReasonMessage = DisputeReasonMessage.asInstanceOf[js.Any], DisputeReasonType = DisputeReasonType.asInstanceOf[js.Any])
        __obj.asInstanceOf[DisputeReason]
      }
      
      extension [Self <: DisputeReason](x: Self) {
        
        inline def setDisputeReasonMessage(value: String): Self = StObject.set(x, "DisputeReasonMessage", value.asInstanceOf[js.Any])
        
        inline def setDisputeReasonType(value: DisputeReasonType): Self = StObject.set(x, "DisputeReasonType", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED
    */
    trait DisputeReasonType extends StObject
    object DisputeReasonType {
      
      inline def AUTHORISATION_DISPUTED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED = "AUTHORISATION_DISPUTED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AUTHORISATION_DISPUTED]
      
      inline def CANCELED_REOCCURING_TRANSACTION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION = "CANCELED_REOCCURING_TRANSACTION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED_REOCCURING_TRANSACTION]
      
      inline def DUPLICATE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE = "DUPLICATE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DUPLICATE]
      
      inline def FRAUD: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD = "FRAUD".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FRAUD]
      
      inline def LATE_FAILURE_BANKACCOUNT_CLOSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED = "LATE_FAILURE_BANKACCOUNT_CLOSED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_CLOSED]
      
      inline def LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE = "LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCOMPATIBLE]
      
      inline def LATE_FAILURE_BANKACCOUNT_INCORRECT: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT = "LATE_FAILURE_BANKACCOUNT_INCORRECT".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_BANKACCOUNT_INCORRECT]
      
      inline def LATE_FAILURE_CONTACT_USER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER = "LATE_FAILURE_CONTACT_USER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_CONTACT_USER]
      
      inline def LATE_FAILURE_INSUFFICIENT_FUNDS: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS = "LATE_FAILURE_INSUFFICIENT_FUNDS".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LATE_FAILURE_INSUFFICIENT_FUNDS]
      
      inline def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
      
      inline def PRODUCT_NOT_PROVIDED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED = "PRODUCT_NOT_PROVIDED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_NOT_PROVIDED]
      
      inline def PRODUCT_UNACCEPTABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE = "PRODUCT_UNACCEPTABLE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_UNACCEPTABLE]
      
      inline def REFUND_CONVERSION_RATE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE = "REFUND_CONVERSION_RATE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_CONVERSION_RATE]
      
      inline def REFUND_NOT_PROCESSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED = "REFUND_NOT_PROCESSED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_NOT_PROCESSED]
      
      inline def TRANSACTION_NOT_RECOGNIZED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED = "TRANSACTION_NOT_RECOGNIZED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION_NOT_RECOGNIZED]
      
      inline def UNKNOWN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED
    */
    trait DisputeStatus extends StObject
    object DisputeStatus {
      
      inline def CLOSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED = "CLOSED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CLOSED]
      
      inline def CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def PENDING_BANK_ACTION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION = "PENDING_BANK_ACTION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_BANK_ACTION]
      
      inline def PENDING_CLIENT_ACTION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION = "PENDING_CLIENT_ACTION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PENDING_CLIENT_ACTION]
      
      inline def REOPENED_PENDING_CLIENT_ACTION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION = "REOPENED_PENDING_CLIENT_ACTION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REOPENED_PENDING_CLIENT_ACTION]
      
      inline def SUBMITTED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUBMITTED]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL
    */
    trait DisputeType extends StObject
    object DisputeType {
      
      inline def CONTESTABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE = "CONTESTABLE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CONTESTABLE]
      
      inline def NOT_CONTESTABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE = "NOT_CONTESTABLE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NOT_CONTESTABLE]
      
      inline def RETRIEVAL: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL = "RETRIEVAL".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.RETRIEVAL]
    }
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/dispute.dispute.DisputeData, 'ContestedFunds'> */
    trait SubmitDispute extends StObject {
      
      var ContestedFunds: js.UndefOr[MoneyData] = js.undefined
    }
    object SubmitDispute {
      
      inline def apply(): SubmitDispute = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubmitDispute]
      }
      
      extension [Self <: SubmitDispute](x: Self) {
        
        inline def setContestedFunds(value: MoneyData): Self = StObject.set(x, "ContestedFunds", value.asInstanceOf[js.Any])
        
        inline def setContestedFundsUndefined: Self = StObject.set(x, "ContestedFunds", js.undefined)
      }
    }
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/dispute.dispute.DisputeData, 'Tag'> */
    trait UpdateDispute extends StObject {
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object UpdateDispute {
      
      inline def apply(): UpdateDispute = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UpdateDispute]
      }
      
      extension [Self <: UpdateDispute](x: Self) {
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
  }
}
