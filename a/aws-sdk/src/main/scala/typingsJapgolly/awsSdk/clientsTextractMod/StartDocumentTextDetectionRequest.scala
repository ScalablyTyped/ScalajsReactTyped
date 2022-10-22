package typingsJapgolly.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDocumentTextDetectionRequest extends StObject {
  
  /**
    * The idempotent token that's used to identify the start request. If you use the same token with multiple StartDocumentTextDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. For more information, see Calling Amazon Textract Asynchronous Operations.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.ClientRequestToken] = js.undefined
  
  /**
    * The location of the document to be processed.
    */
  var DocumentLocation: typingsJapgolly.awsSdk.clientsTextractMod.DocumentLocation
  
  /**
    * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic. For example, you can use JobTag to identify the type of document that the completion notification corresponds to (such as a tax form or a receipt).
    */
  var JobTag: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.JobTag] = js.undefined
  
  /**
    * The KMS key used to encrypt the inference results. This can be in either Key ID or Key Alias format. When a KMS key is provided, the KMS key will be used for server-side encryption of the objects in the customer bucket. When this parameter is not enabled, the result will be encrypted server side,using SSE-S3.
    */
  var KMSKeyId: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.KMSKeyId] = js.undefined
  
  /**
    * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
    */
  var NotificationChannel: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.NotificationChannel] = js.undefined
  
  /**
    * Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results internally to be accessed with the GetDocumentTextDetection operation.
    */
  var OutputConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsTextractMod.OutputConfig] = js.undefined
}
object StartDocumentTextDetectionRequest {
  
  inline def apply(DocumentLocation: DocumentLocation): StartDocumentTextDetectionRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentTextDetectionRequest]
  }
  
  extension [Self <: StartDocumentTextDetectionRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDocumentLocation(value: DocumentLocation): Self = StObject.set(x, "DocumentLocation", value.asInstanceOf[js.Any])
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
  }
}
