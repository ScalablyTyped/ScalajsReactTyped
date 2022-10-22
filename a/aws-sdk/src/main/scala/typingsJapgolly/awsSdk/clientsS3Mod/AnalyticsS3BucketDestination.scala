package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsS3BucketDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bucket to which data is exported.
    */
  var Bucket: BucketName
  
  /**
    * The account ID that owns the destination S3 bucket. If no account ID is provided, the owner is not validated before exporting data.   Although this value is optional, we strongly recommend that you set it to help prevent problems if the destination bucket ownership changes.  
    */
  var BucketAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Specifies the file format used when exporting data to Amazon S3.
    */
  var Format: AnalyticsS3ExportFileFormat
  
  /**
    * The prefix to use when exporting data. The prefix is prepended to all results.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Prefix] = js.undefined
}
object AnalyticsS3BucketDestination {
  
  inline def apply(Bucket: BucketName, Format: AnalyticsS3ExportFileFormat): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
  
  extension [Self <: AnalyticsS3BucketDestination](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketAccountId(value: AccountId): Self = StObject.set(x, "BucketAccountId", value.asInstanceOf[js.Any])
    
    inline def setBucketAccountIdUndefined: Self = StObject.set(x, "BucketAccountId", js.undefined)
    
    inline def setFormat(value: AnalyticsS3ExportFileFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
