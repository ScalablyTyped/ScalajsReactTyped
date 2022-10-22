package typingsJapgolly.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketDestination extends StObject {
  
  /**
    * The account ID of the owner of the S3 Storage Lens metrics export bucket.
    */
  var AccountId: typingsJapgolly.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The Amazon Resource Name (ARN) of the bucket. This property is read-only and follows the following format:  arn:aws:s3:us-east-1:example-account-id:bucket/your-destination-bucket-name  
    */
  var Arn: S3BucketArnString
  
  /**
    * The container for the type encryption of the metrics exports in this bucket.
    */
  var Encryption: js.UndefOr[StorageLensDataExportEncryption] = js.undefined
  
  /**
    * 
    */
  var Format: typingsJapgolly.awsSdk.clientsS3controlMod.Format
  
  /**
    * The schema version of the export file.
    */
  var OutputSchemaVersion: typingsJapgolly.awsSdk.clientsS3controlMod.OutputSchemaVersion
  
  /**
    * The prefix of the destination bucket where the metrics export will be delivered.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.clientsS3controlMod.Prefix] = js.undefined
}
object S3BucketDestination {
  
  inline def apply(
    AccountId: AccountId,
    Arn: S3BucketArnString,
    Format: Format,
    OutputSchemaVersion: OutputSchemaVersion
  ): S3BucketDestination = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketDestination]
  }
  
  extension [Self <: S3BucketDestination](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setArn(value: S3BucketArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: StorageLensDataExportEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemaVersion(value: OutputSchemaVersion): Self = StObject.set(x, "OutputSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
