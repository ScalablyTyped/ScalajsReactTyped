package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsDisputeDocumentMod {
  
  object disputeDocument {
    
    trait CreateDisputeDocument extends StObject {
      
      var Tag: js.UndefOr[String] = js.undefined
      
      /**
        * Gives the type of the KYC document
        */
      var Type: DisputeDocumentType
    }
    object CreateDisputeDocument {
      
      inline def apply(Type: DisputeDocumentType): CreateDisputeDocument = {
        val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateDisputeDocument]
      }
      
      extension [Self <: CreateDisputeDocument](x: Self) {
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
        
        inline def setType(value: DisputeDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * - Documents have to be in "CREATED" Status
      * - You can create as many pages as needed
      *
      * Remember to change Status to "VALIDATION_ASKED" to submit KYC documents
      * The maximum size per page is about 7Mb (or 10Mb when base64encoded). The following formats are accepted for the documents : .pdf, .jpeg, .jpg, .gif and .png. The minimum size is 1Kb.
      */
    trait CreateDisputeDocumentPage extends StObject {
      
      /**
        * The base64 encoded file which needs to be uploaded
        *
        * You need to fill in only the binary code. Do not send the first part that some converters add into the binary code which is
        * `<img src=" data:image/png;base64..." />`
        *
        * e.g.
        * ```json
        * {
        *   "File": "/9j/4AAQSkZJRgABAQEBLAEsAAD/.../wgARCAAyADIDAREAAhEBAxEB/8QAGwAAAgMBAQEA"
        * }
        * ```
        */
      var File: String
    }
    object CreateDisputeDocumentPage {
      
      inline def apply(File: String): CreateDisputeDocumentPage = {
        val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateDisputeDocumentPage]
      }
      
      extension [Self <: CreateDisputeDocumentPage](x: Self) {
        
        inline def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
      }
    }
    
    trait DisputeDocumentData
      extends StObject
         with EntityBaseData {
      
      /**
        * The Id of a Dispute
        */
      var DisputeId: String
      
      /**
        * The date when the document was processed by MANGOPAY
        */
      var ProcessedDate: Timestamp
      
      /**
        * The message accompanying a refusal
        */
      var RefusedReasonMessage: String
      
      /**
        * The type of reason for refusal
        */
      var RefusedReasonType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsDisputeDocumentMod.disputeDocument.RefusedReasonType
      
      /**
        * The status of this KYC/Dispute document
        */
      var Status: DocumentStatus
      
      /**
        * Gives the type of the KYC document
        */
      var Type: DisputeDocumentType
      
      /**
        * The object owner's UserId
        */
      var UserId: String
    }
    object DisputeDocumentData {
      
      inline def apply(
        CreationDate: Double,
        DisputeId: String,
        Id: String,
        ProcessedDate: Timestamp,
        RefusedReasonMessage: String,
        RefusedReasonType: RefusedReasonType,
        Status: DocumentStatus,
        Tag: String,
        Type: DisputeDocumentType,
        UserId: String
      ): DisputeDocumentData = {
        val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DisputeId = DisputeId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
        __obj.asInstanceOf[DisputeDocumentData]
      }
      
      extension [Self <: DisputeDocumentData](x: Self) {
        
        inline def setDisputeId(value: String): Self = StObject.set(x, "DisputeId", value.asInstanceOf[js.Any])
        
        inline def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
        
        inline def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
        
        inline def setRefusedReasonType(value: RefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setType(value: DisputeDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
        
        inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DELIVERY_PROOF
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVOICE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_PROOF
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_CORRESPONDANCE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_ACCEPTANCE_PROOF
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_REPLACEMENT_PROOF
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
    */
    trait DisputeDocumentType extends StObject
    object DisputeDocumentType {
      
      inline def DELIVERY_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DELIVERY_PROOF = "DELIVERY_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DELIVERY_PROOF]
      
      inline def INVOICE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVOICE = "INVOICE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVOICE]
      
      inline def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
      
      inline def PRODUCT_REPLACEMENT_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_REPLACEMENT_PROOF = "PRODUCT_REPLACEMENT_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PRODUCT_REPLACEMENT_PROOF]
      
      inline def REFUND_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_PROOF = "REFUND_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND_PROOF]
      
      inline def USER_ACCEPTANCE_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_ACCEPTANCE_PROOF = "USER_ACCEPTANCE_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_ACCEPTANCE_PROOF]
      
      inline def USER_CORRESPONDANCE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_CORRESPONDANCE = "USER_CORRESPONDANCE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.USER_CORRESPONDANCE]
    }
    
    trait DocumentPageConsult extends StObject {
      
      /**
        * Time in millis when the page consult will expire.
        */
      var ExpirationDate: Timestamp
      
      /**
        * URL where this document page can be viewed.
        */
      var Url: String
    }
    object DocumentPageConsult {
      
      inline def apply(ExpirationDate: Timestamp, Url: String): DocumentPageConsult = {
        val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
        __obj.asInstanceOf[DocumentPageConsult]
      }
      
      extension [Self <: DocumentPageConsult](x: Self) {
        
        inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OUT_OF_DATE
    */
    trait DocumentStatus extends StObject
    object DocumentStatus {
      
      inline def CREATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = "CREATED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED]
      
      inline def OUT_OF_DATE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OUT_OF_DATE = "OUT_OF_DATE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OUT_OF_DATE]
      
      inline def REFUSED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED = "REFUSED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED]
      
      inline def VALIDATED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = "VALIDATED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED]
      
      inline def VALIDATION_ASKED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED = "VALIDATION_ASKED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
    */
    trait RefusedReasonType extends StObject
    object RefusedReasonType {
      
      inline def DOCUMENT_FALSIFIED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED = "DOCUMENT_FALSIFIED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED]
      
      inline def DOCUMENT_HAS_EXPIRED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED = "DOCUMENT_HAS_EXPIRED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED]
      
      inline def DOCUMENT_INCOMPLETE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE = "DOCUMENT_INCOMPLETE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE]
      
      inline def DOCUMENT_MISSING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING = "DOCUMENT_MISSING".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING]
      
      inline def DOCUMENT_NOT_ACCEPTED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED = "DOCUMENT_NOT_ACCEPTED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED]
      
      inline def DOCUMENT_UNREADABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE = "DOCUMENT_UNREADABLE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE]
      
      inline def OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
      
      inline def SPECIFIC_CASE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE = "SPECIFIC_CASE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE]
    }
    
    trait SubmitDisputeDocument extends StObject {
      
      /**
        * The status of this KYC/Dispute document
        */
      var Status: VALIDATION_ASKED
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object SubmitDisputeDocument {
      
      inline def apply(): SubmitDisputeDocument = {
        val __obj = js.Dynamic.literal(Status = "VALIDATION_ASKED")
        __obj.asInstanceOf[SubmitDisputeDocument]
      }
      
      extension [Self <: SubmitDisputeDocument](x: Self) {
        
        inline def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
  }
}
