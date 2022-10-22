package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAcceleratorAttributesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator that you want to update.
    */
  var AcceleratorArn: GenericString
  
  /**
    * Update whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the Global Accelerator Developer Guide.
    */
  var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants Global Accelerator permission to write to the bucket.
    */
  var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Update the prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true.  If you specify slash (/) for the S3 bucket prefix, the log file bucket folder structure will include a double slash (//), like the following: s3-bucket_name//AWSLogs/aws_account_id
    */
  var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
}
object UpdateAcceleratorAttributesRequest {
  
  inline def apply(AcceleratorArn: GenericString): UpdateAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
  }
  
  extension [Self <: UpdateAcceleratorAttributesRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsEnabled(value: GenericBoolean): Self = StObject.set(x, "FlowLogsEnabled", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsEnabledUndefined: Self = StObject.set(x, "FlowLogsEnabled", js.undefined)
    
    inline def setFlowLogsS3Bucket(value: GenericString): Self = StObject.set(x, "FlowLogsS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsS3BucketUndefined: Self = StObject.set(x, "FlowLogsS3Bucket", js.undefined)
    
    inline def setFlowLogsS3Prefix(value: GenericString): Self = StObject.set(x, "FlowLogsS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsS3PrefixUndefined: Self = StObject.set(x, "FlowLogsS3Prefix", js.undefined)
  }
}
