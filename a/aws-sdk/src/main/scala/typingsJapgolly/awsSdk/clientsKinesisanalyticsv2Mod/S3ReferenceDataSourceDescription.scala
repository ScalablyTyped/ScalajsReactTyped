package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReferenceDataSourceDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.BucketARN
  
  /**
    * Amazon S3 object key name.
    */
  var FileKey: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.FileKey
  
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.   Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var ReferenceRoleARN: js.UndefOr[RoleARN] = js.undefined
}
object S3ReferenceDataSourceDescription {
  
  inline def apply(BucketARN: BucketARN, FileKey: FileKey): S3ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSourceDescription]
  }
  
  extension [Self <: S3ReferenceDataSourceDescription](x: Self) {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    inline def setReferenceRoleARN(value: RoleARN): Self = StObject.set(x, "ReferenceRoleARN", value.asInstanceOf[js.Any])
    
    inline def setReferenceRoleARNUndefined: Self = StObject.set(x, "ReferenceRoleARN", js.undefined)
  }
}
