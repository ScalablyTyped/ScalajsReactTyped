package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationUpdate extends StObject {
  
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.BucketARN] = js.undefined
  
  /**
    * The buffering option. If no value is specified, BufferingHints object default values are used.
    */
  var BufferingHints: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.BufferingHints] = js.undefined
  
  /**
    * The CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. The compression formats SNAPPY or ZIP cannot be specified for Amazon Redshift destinations because they are not supported by the Amazon Redshift COPY operation that reads from the S3 bucket.
    */
  var CompressionFormat: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.CompressionFormat] = js.undefined
  
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.EncryptionConfiguration] = js.undefined
  
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see Custom Prefixes for Amazon S3 Objects.
    */
  var ErrorOutputPrefix: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.ErrorOutputPrefix] = js.undefined
  
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can also specify a custom prefix, as described in Custom Prefixes for Amazon S3 Objects.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.Prefix] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.RoleARN] = js.undefined
}
object S3DestinationUpdate {
  
  inline def apply(): S3DestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationUpdate]
  }
  
  extension [Self <: S3DestinationUpdate](x: Self) {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setBucketARNUndefined: Self = StObject.set(x, "BucketARN", js.undefined)
    
    inline def setBufferingHints(value: BufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setCompressionFormat(value: CompressionFormat): Self = StObject.set(x, "CompressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "CompressionFormat", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setErrorOutputPrefix(value: ErrorOutputPrefix): Self = StObject.set(x, "ErrorOutputPrefix", value.asInstanceOf[js.Any])
    
    inline def setErrorOutputPrefixUndefined: Self = StObject.set(x, "ErrorOutputPrefix", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
