package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsKycDocumentMod {
  
  object kycDocument {
    
    trait CreateKycDocument extends StObject {
      
      /**
        * Custom data that you can add to this item
        */
      var Tag: js.UndefOr[String] = js.undefined
      
      /**
        * Gives the type of the KYC document
        */
      var Type: KycDocumentType
    }
    object CreateKycDocument {
      
      inline def apply(Type: KycDocumentType): CreateKycDocument = {
        val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateKycDocument]
      }
      
      extension [Self <: CreateKycDocument](x: Self) {
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
        
        inline def setType(value: KycDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * - Documents have to be in "CREATED" Status
      * - You can create as many pages as needed
      *
      * Remember to change Status to "VALIDATION_ASKED" to submit KYC documents
      * The maximum size per page is about 7Mb (or 10Mb when base64encoded). The following formats are accepted for the documents : .pdf, .jpeg, .jpg, .gif and .png. The minimum size is 1Kb.
      */
    trait CreateKycPage extends StObject {
      
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
    object CreateKycPage {
      
      inline def apply(File: String): CreateKycPage = {
        val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateKycPage]
      }
      
      extension [Self <: CreateKycPage](x: Self) {
        
        inline def setFile(value: String): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
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
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_USER_DATA
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNDERAGE_PERSON
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE
    */
    trait KYCDocumentRefusedReasonType extends StObject
    object KYCDocumentRefusedReasonType {
      
      inline def DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA = "DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_ACCOUNT_DATA]
      
      inline def DOCUMENT_DO_NOT_MATCH_USER_DATA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_USER_DATA = "DOCUMENT_DO_NOT_MATCH_USER_DATA".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_DO_NOT_MATCH_USER_DATA]
      
      inline def DOCUMENT_FALSIFIED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED = "DOCUMENT_FALSIFIED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_FALSIFIED]
      
      inline def DOCUMENT_HAS_EXPIRED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED = "DOCUMENT_HAS_EXPIRED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_HAS_EXPIRED]
      
      inline def DOCUMENT_INCOMPLETE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE = "DOCUMENT_INCOMPLETE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_INCOMPLETE]
      
      inline def DOCUMENT_MISSING: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING = "DOCUMENT_MISSING".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_MISSING]
      
      inline def DOCUMENT_NOT_ACCEPTED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED = "DOCUMENT_NOT_ACCEPTED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_NOT_ACCEPTED]
      
      inline def DOCUMENT_UNREADABLE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE = "DOCUMENT_UNREADABLE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DOCUMENT_UNREADABLE]
      
      inline def SPECIFIC_CASE: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE = "SPECIFIC_CASE".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SPECIFIC_CASE]
      
      inline def UNDERAGE_PERSON: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNDERAGE_PERSON = "UNDERAGE_PERSON".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNDERAGE_PERSON]
    }
    
    trait KycDocumentData
      extends StObject
         with EntityBaseData {
      
      /**
        * More information regarding why the document has been rejected
        */
      var Flags: js.Array[String]
      
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
      var RefusedReasonType: KYCDocumentRefusedReasonType
      
      /**
        * The status of this KYC/Dispute document
        */
      var Status: DocumentStatus
      
      /**
        * Gives the type of the KYC document
        */
      var Type: KycDocumentType
      
      /**
        * The object owner's UserId
        */
      var UserId: String
    }
    object KycDocumentData {
      
      inline def apply(
        CreationDate: Double,
        Flags: js.Array[String],
        Id: String,
        ProcessedDate: Timestamp,
        RefusedReasonMessage: String,
        RefusedReasonType: KYCDocumentRefusedReasonType,
        Status: DocumentStatus,
        Tag: String,
        Type: KycDocumentType,
        UserId: String
      ): KycDocumentData = {
        val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
        __obj.asInstanceOf[KycDocumentData]
      }
      
      extension [Self <: KycDocumentData](x: Self) {
        
        inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
        
        inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "Flags", js.Array(value*))
        
        inline def setProcessedDate(value: Timestamp): Self = StObject.set(x, "ProcessedDate", value.asInstanceOf[js.Any])
        
        inline def setRefusedReasonMessage(value: String): Self = StObject.set(x, "RefusedReasonMessage", value.asInstanceOf[js.Any])
        
        inline def setRefusedReasonType(value: KYCDocumentRefusedReasonType): Self = StObject.set(x, "RefusedReasonType", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: DocumentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setType(value: KycDocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
        
        inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF
    */
    trait KycDocumentType extends StObject
    object KycDocumentType {
      
      inline def ADDRESS_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF = "ADDRESS_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ADDRESS_PROOF]
      
      inline def ARTICLES_OF_ASSOCIATION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION = "ARTICLES_OF_ASSOCIATION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ARTICLES_OF_ASSOCIATION]
      
      inline def IDENTITY_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF = "IDENTITY_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IDENTITY_PROOF]
      
      inline def REGISTRATION_PROOF: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF = "REGISTRATION_PROOF".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGISTRATION_PROOF]
      
      inline def SHAREHOLDER_DECLARATION: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION = "SHAREHOLDER_DECLARATION".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SHAREHOLDER_DECLARATION]
    }
    
    trait SubmitKycDocument extends StObject {
      
      var Id: String
      
      /**
        * The status of this KYC/Dispute document
        */
      var Status: VALIDATION_ASKED
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object SubmitKycDocument {
      
      inline def apply(Id: String): SubmitKycDocument = {
        val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = "VALIDATION_ASKED")
        __obj.asInstanceOf[SubmitKycDocument]
      }
      
      extension [Self <: SubmitKycDocument](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: VALIDATION_ASKED): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
  }
}
