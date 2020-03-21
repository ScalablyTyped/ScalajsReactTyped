package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCaptureConfigSummary extends js.Object {
  /**
    * 
    */
  var CaptureStatus: typingsJapgolly.awsSdk.sagemakerMod.CaptureStatus = js.native
  /**
    * 
    */
  var CurrentSamplingPercentage: SamplingPercentage = js.native
  /**
    * 
    */
  var DestinationS3Uri: typingsJapgolly.awsSdk.sagemakerMod.DestinationS3Uri = js.native
  /**
    * 
    */
  var EnableCapture: typingsJapgolly.awsSdk.sagemakerMod.EnableCapture = js.native
  /**
    * 
    */
  var KmsKeyId: typingsJapgolly.awsSdk.sagemakerMod.KmsKeyId = js.native
}

object DataCaptureConfigSummary {
  @scala.inline
  def apply(
    CaptureStatus: CaptureStatus,
    CurrentSamplingPercentage: SamplingPercentage,
    DestinationS3Uri: DestinationS3Uri,
    EnableCapture: EnableCapture,
    KmsKeyId: KmsKeyId
  ): DataCaptureConfigSummary = {
    val __obj = js.Dynamic.literal(CaptureStatus = CaptureStatus.asInstanceOf[js.Any], CurrentSamplingPercentage = CurrentSamplingPercentage.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], EnableCapture = EnableCapture.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataCaptureConfigSummary]
  }
}

